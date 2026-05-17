package com.yearup.dealership;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {

    public void saveContract(Contract contract) {

        try {

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter("src/main/resources/contracts.csv", true));

            if (contract instanceof SalesContract) {

                SalesContract salesContract = (SalesContract) contract;

                writer.write(
                        "SALE|" +
                                salesContract.getDate() + "|" +
                                salesContract.getCustomerName() + "|" +
                                salesContract.getCustomerEmail() + "|" +
                                salesContract.getVehicleSold().getVin() + "|" +
                                salesContract.getVehicleSold().getYear() + "|" +
                                salesContract.getVehicleSold().getMake() + "|" +
                                salesContract.getVehicleSold().getModel() + "|" +
                                salesContract.getVehicleSold().getVehicleType() + "|" +
                                salesContract.getVehicleSold().getColor() + "|" +
                                salesContract.getVehicleSold().getOdometer() + "|" +
                                salesContract.getVehicleSold().getPrice() + "|" +
                                salesContract.getTotalPrice() + "|" +
                                salesContract.getMonthlyPayment()
                );

            } else if (contract instanceof LeaseContract) {

                LeaseContract leaseContract = (LeaseContract) contract;

                writer.write(
                        "LEASE|" +
                                leaseContract.getDate() + "|" +
                                leaseContract.getCustomerName() + "|" +
                                leaseContract.getCustomerEmail() + "|" +
                                leaseContract.getVehicleSold().getVin() + "|" +
                                leaseContract.getVehicleSold().getYear() + "|" +
                                leaseContract.getVehicleSold().getMake() + "|" +
                                leaseContract.getVehicleSold().getModel() + "|" +
                                leaseContract.getVehicleSold().getVehicleType() + "|" +
                                leaseContract.getVehicleSold().getColor() + "|" +
                                leaseContract.getVehicleSold().getOdometer() + "|" +
                                leaseContract.getVehicleSold().getPrice() + "|" +
                                leaseContract.getTotalPrice() + "|" +
                                leaseContract.getMonthlyPayment()
                );
            }

            writer.newLine();
            writer.close();

        } catch (IOException e) {
            System.out.println("Error saving contract.");
        }
    }
}