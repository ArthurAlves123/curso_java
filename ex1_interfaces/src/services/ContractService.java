package services;

import entities.Contract;
import entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){
        double installmentBaseValue = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            contract.getInstallments().add(new Installment(contract.getDate().plusMonths(i), (installmentBaseValue) + onlinePaymentService.interest(installmentBaseValue, i) + onlinePaymentService.paymentFee(installmentBaseValue + onlinePaymentService.interest(installmentBaseValue, i))));
        }
    }
}
