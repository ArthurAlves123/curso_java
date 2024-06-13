import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.CarRental;
import entities.Vehicle;
import services.BrasilTaxService;
import services.RentalService;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 

        try{
        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo: ");
        Vehicle vehicle = new Vehicle(sc.nextLine());
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt01);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt01);

        CarRental carRental = new CarRental(start, finish, vehicle);

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println();
        System.out.println("FATURA:");
        System.out.printf("Pagamento básico: %.2f%n", carRental.getInvoice().getBasidPayment());
        System.out.printf("Imposto: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Pagamento total %.2f%n", carRental.getInvoice().getTotalPayment());

        }
        catch (DateTimeException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
        
    }
}
