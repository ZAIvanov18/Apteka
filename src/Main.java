import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose;


        System.out.println("1. Insert data");
        System.out.println("2. Print data");
        System.out.println("3. Print data with price below 10lv");
        System.out.println("4. Print data with price above 15lv");
        System.out.println("5. Print data with expiration date");
        System.out.print("Choose: "); choose = scanner.nextInt();

        Pharmacy pharmacy1 = new Pharmacy("ashvaganda", 10, 3, LocalDate.now());
        Pharmacy pharmacy2 = new Pharmacy("nurofen", 4, 99, LocalDate.now());
        Pharmacy pharmacy3 = new Pharmacy("stromba", 7, 58, LocalDate.now());

        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        pharmacies.add(pharmacy1);
        pharmacies.add(pharmacy2);
        pharmacies.add(pharmacy3);

        switch (choose) {
            case 1: insertData(pharmacies);
                break;
            case 2: printAllData(pharmacies);
                break;
            case 3:  printAllMedicinesWithPriceHigherThan15(pharmacies);
                break;
            case 4:  printAllMedicinesWithLowerPriceThan10(pharmacies);
                break;
            case 5:  printPharmaciesWithExpirationDate(pharmacies);
                break;
            default:
                System.out.println("Invalid option!");

        }
    }

    public static void insertData(ArrayList<Pharmacy> pharmacies) {
        Scanner scanner = new Scanner(System.in);
        Pharmacy pharmacy = new Pharmacy();

        String name;
        double price;
        int quantity;

        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine(); pharmacy.name = name;
        System.out.println();
        System.out.print("Price: "); price = scanner.nextDouble(); pharmacy.price = price;
        System.out.println();
        System.out.print("Quantity: "); quantity = scanner.nextInt(); pharmacy.quantity = quantity;
        pharmacy.expirationDate = LocalDate.now();
        pharmacies.add(pharmacy);
    }

    public static void printAllData(ArrayList<Pharmacy> pharmacies) {
        for (Pharmacy p : pharmacies) {
            System.out.println(p.toString());
        }
    }



    public static void printAllMedicinesWithPriceHigherThan15(ArrayList<Pharmacy> pharmacies) {

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        for (Pharmacy p : pharmacies) {
            if(p.price > 15) {
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.name);
        }
    }

    public static void printAllMedicinesWithLowerPriceThan10(ArrayList<Pharmacy> pharmacies){
        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();
        for(Pharmacy p : pharmacies){
            if(p.price < 10){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }

    public static void printPharmaciesWithExpirationDate(ArrayList<Pharmacy> pharmacies){

        ArrayList<Pharmacy> newPharmacies = new ArrayList<>();

        LocalDate date = LocalDate.of(2033, 12, 12);

        for(Pharmacy p : pharmacies){
            if(p.expirationDate.equals(date)){
                newPharmacies.add(p);
            }
        }

        for (Pharmacy p : newPharmacies) {
            System.out.println(p.toString());
        }
    }


}