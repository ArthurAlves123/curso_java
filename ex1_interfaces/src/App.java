import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PayPalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        System.out.print("Entre com o número de parcelas: ");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);

        ContractService contractService = new ContractService(new PayPalService());
        contractService.processContract(contract, months);

        System.out.println();
        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(fmt.format(installment.getDueDate()) + " - " + String.format("%.2f", installment.getAmount()));
        }
        sc.close();
    }
}
