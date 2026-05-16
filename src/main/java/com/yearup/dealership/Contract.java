package com.yearup.dealership;

public class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSold;

    public String getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public Contract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;

    }
    public double getTotalPrice() {
        return 0;
    }

    public double getMonthlyPayment() {
        return 0;
    }
}
