package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
List<String> sample = new ArrayList<>();
        List<String> sample1 = new ArrayList<>();
        List<String> sample2 = new ArrayList<>();
        List<String> sample3 = new ArrayList<>();
        List<Integer> sample4 = new ArrayList<>();
        List<Integer> sample5 = new ArrayList<>();
        List<Integer> sample6 = new ArrayList<>();
        List<String> sample7 = new ArrayList<>();
        List<Integer> sample8 = new ArrayList<>();
Scanner scan = new Scanner(System.in);
Patient_info patient = new Patient_info();
        System.out.print("Enter admin username: ");
        String Un = scan.next();
        System.out.print("Enter admin password: ");
        String p = scan.next();
        if(Un.contains("Kate")&p.contains("1234")) {
//Payment_details payment = new Payment_details();
            System.out.print("Number of patients: ");
            int a = scan.nextInt();
            int b = 0;
            while (a > b) {
                System.out.print("Name: ");
                patient.patient_name = scan.next();
                sample.add(patient.patient_name);
                System.out.print("Assign patient username: ");
                patient.patientUsername = scan.next();
                sample1.add(patient.patientUsername);
                System.out.print("Assign patient password: ");
                patient.password = scan.next();
                sample2.add(patient.password);
                System.out.print("Enter patient no.: ");
                patient.patient_no = scan.next();
                sample3.add(patient.patient_no);
                System.out.print("Enter patient height: ");
                patient.patient_height = scan.nextInt();
                sample4.add(patient.patient_height);
                System.out.print("Enter patient weight: ");
                patient.patient_weight = scan.nextInt();
                sample5.add(patient.patient_weight);
                System.out.print("Enter patient age: ");
                patient.age = scan.nextInt();
                sample6.add(patient.age);
                System.out.print("Enter patient gender: ");
                patient.gender = scan.next();
                sample7.add(patient.gender);
                System.out.print("Enter procedure no.: ");
                patient.procedure_no = scan.nextInt();
                sample8.add(patient.procedure_no);
                b++;
            }
            System.out.print("Do you wish to print the list? ");
            String response = scan.next();
            if (response.equals("Yes")) {
                System.out.println("Patient names: "+ sample);
                System.out.println("Patient usernames: "+sample1);
                System.out.println("Patient passwords: "+sample2);
                System.out.println("Patient numbers: "+sample3);
                System.out.println("Patient heights: "+sample4);
                System.out.println("Patient weights: "+sample5);
                System.out.println("Patient ages: "+sample6);
                System.out.println("Patient genders: "+sample7);
                System.out.println("Procedure numbers: "+sample8);
                System.out.println("Thanks for your time");
            }
            if (response.equals("No")) {
                System.out.println("Thanks for your time");
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Welcome!");
        System.out.print("Enter patient username: ");
        patient.patientUsername = scan.next();
        System.out.print("Enter patient password: ");
        patient.password = scan.next();
        if(sample1.contains(patient.patientUsername)&sample2.contains(patient.password)){
            System.out.println("Access granted");
        }
        else{
            System.out.println("Access denied");
        }




    }
}
