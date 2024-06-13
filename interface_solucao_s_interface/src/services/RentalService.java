package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private TaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;
        double basidPayment;

        if (hours <= 12) {
            basidPayment = pricePerHour * Math.ceil(hours);
        } else {
            basidPayment = pricePerDay * Math.ceil(hours / 24);
        }

        double tax = taxService.tax(basidPayment);

        carRental.setInvoice(new Invoice(basidPayment, tax));
    }
}
