package com.yearup.dealership;

public class SalesContract extends Contract {

    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;
    private boolean finance;
    public SalesContract(String date, String customerName, String customerEmail,
                         Vehicle vehicleSold, boolean finance) {

        super(date, customerName, customerEmail, vehicleSold);

        this.finance = finance;
    }
    @Override
    public double getTotalPrice() {

        double price = getVehicleSold().getPrice();

        salesTaxAmount = price * 0.05;
        recordingFee = 100;

        if (price < 10000) {
            processingFee = 295;
        } else {
            processingFee = 495;
        }

        return price + salesTaxAmount + recordingFee + processingFee;
    }
    @Override
    public double getMonthlyPayment() {

        if (!finance) {
            return 0;
        }

        double totalPrice = getTotalPrice();

        if (getVehicleSold().getPrice() >= 10000) {

            double monthlyInterestRate = 0.0425 / 12;
            int months = 48;

            return (totalPrice * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -months));

        } else {

            double monthlyInterestRate = 0.0525 / 12;
            int months = 24;

            return (totalPrice * monthlyInterestRate) /
                    (1 - Math.pow(1 + monthlyInterestRate, -months));
        }
    }
    public boolean isFinance() {
        return finance;
    }
}