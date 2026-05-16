
package com.yearup.dealership;

public class LeaseContract extends Contract {

    private double expectedEndingValue;
    private double leaseFee;
    public LeaseContract(String date, String customerName, String customerEmail,
                         Vehicle vehicleSold) {

        super(date, customerName, customerEmail, vehicleSold);
    }@Override
    public double getTotalPrice() {

        double price = getVehicleSold().getPrice();

        expectedEndingValue = price * 0.5;
        leaseFee = price * 0.07;

        return price + leaseFee;
    }
    @Override
    public double getMonthlyPayment() {

        double leasePrice = getTotalPrice() - expectedEndingValue;

        double monthlyInterestRate = 0.04 / 12;
        int months = 36;

        return (leasePrice * monthlyInterestRate) /
                (1 - Math.pow(1 + monthlyInterestRate, -months));
    }public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }
}