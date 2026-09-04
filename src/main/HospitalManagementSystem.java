import classes.Patient;
import classes.PatientBST;
import classes.PatientQueue;
import classes.TreatmentStack;
import classes.PatientVisitHistory;
import classes.Visit;

import java.util.Scanner;

public class HospitalManagementSystem {

    static Scanner scanner = new Scanner(System.in);

    static PatientBST patientBST = new PatientBST();
    static PatientQueue emergencyQueue = new PatientQueue();
    static TreatmentStack treatmentStack = new TreatmentStack();
    static PatientVisitHistory visitHistory = new PatientVisitHistory();

    public static void main(String[] args) {

        addSampleData();

        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println(" MINI HOSPITAL EMERGENCY SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Display Patient Records");
            System.out.println("2. Search Patient");
            System.out.println("3. Delete Patient");
            System.out.println("4. Add Patient to Emergency Queue");
            System.out.println("5. Serve Next Emergency Patient");
            System.out.println("6. Display Emergency Queue");
            System.out.println("7. Add Treatment Record");
            System.out.println("8. Remove Latest Treatment");
            System.out.println("9. Display Treatment History");
            System.out.println("10. Add Patient Visit");
            System.out.println("11. Search Patient Visit");
            System.out.println("12. Remove Patient Visit");
            System.out.println("13. Display Visit History");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    patientBST.displayInOrder();
                    break;

                case 2:
                    searchPatient();
                    break;

                case 3:
                    deletePatient();
                    break;

                case 4:
                    addToQueue();
                    break;

                case 5:
                    servePatient();
                    break;

                case 6:
                    emergencyQueue.displayQueue();
                    break;

                case 7:
                    addTreatment();
                    break;

                case 8:
                    removeTreatment();
                    break;

                case 9:
                    treatmentStack.displayStack();
                    break;

                case 10:
                    addVisit();
                    break;

                case 11:
                    searchVisit();
                    break;

                case 12:
                    removeVisit();
                    break;

                case 13:
                    visitHistory.displayHistory();
                    break;

                case 0:
                    System.out.println("Thank you for using the system.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }

    static void addSampleData() {

        Patient afqa = new Patient(
                1001, "Afqa", 24, "0771234567", "Fever"
        );

        Patient samrath = new Patient(
                1003, "Samrath", 25, "0712345678", "Headache"
        );

        Patient aswer = new Patient(
                1005, "Aswer", 58, "0756781234", "Diabetes"
        );

        patientBST.insert(afqa);
        patientBST.insert(samrath);
        patientBST.insert(aswer);

        emergencyQueue.enqueue(afqa);
        emergencyQueue.enqueue(samrath);
        emergencyQueue.enqueue(aswer);

        treatmentStack.push(
                "Afqa - Fever - Paracetamol treatment completed"
        );

        treatmentStack.push(
                "Samrath - Headache - Pain relief treatment completed"
        );

        treatmentStack.push(
                "Aswer - Diabetes - Insulin treatment completed"
        );

        visitHistory.addVisit(new Visit(
                1,
                "2026-08-20",
                "Dr. Perera",
                "Fever",
                "Paracetamol"
        ));

        visitHistory.addVisit(new Visit(
                2,
                "2026-08-25",
                "Dr. Silva",
                "Headache",
                "Pain relief tablets"
        ));

        visitHistory.addVisit(new Visit(
                3,
                "2026-09-01",
                "Dr. Fernando",
                "Diabetes",
                "Insulin"
        ));
    }

    static void searchPatient() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();

        Patient patient = patientBST.search(id);

        if (patient != null) {
            patient.displayDetails();
        } else {
            System.out.println("Patient not found.");
        }
    }

    static void deletePatient() {

        System.out.print("Enter Patient ID to delete: ");
        int id = scanner.nextInt();

        patientBST.delete(id);

        System.out.println("Patient deletion operation completed.");
    }

    static void addToQueue() {

        System.out.print("Enter Patient ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Medical Condition: ");
        String condition = scanner.nextLine();

        Patient patient = new Patient(
                id, name, age, contact, condition
        );

        emergencyQueue.enqueue(patient);
    }

    static void servePatient() {

        Patient patient = emergencyQueue.dequeue();

        if (patient != null) {
            System.out.println("Next patient to be served:");
            patient.displayDetails();
        }
    }

    static void addTreatment() {

        System.out.print("Enter treatment record: ");
        String treatment = scanner.nextLine();

        treatmentStack.push(treatment);
    }

    static void removeTreatment() {

        String treatment = treatmentStack.pop();

        if (treatment != null) {
            System.out.println("Removed treatment: " + treatment);
        }
    }

    static void addVisit() {

        System.out.print("Enter Visit ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Visit Date: ");
        String date = scanner.nextLine();

        System.out.print("Enter Doctor Name: ");
        String doctor = scanner.nextLine();

        System.out.print("Enter Diagnosis: ");
        String diagnosis = scanner.nextLine();

        System.out.print("Enter Treatment: ");
        String treatment = scanner.nextLine();

        Visit visit = new Visit(
                id, date, doctor, diagnosis, treatment
        );

        visitHistory.addVisit(visit);

        System.out.println("Visit added successfully.");
    }

    static void searchVisit() {

        System.out.print("Enter Visit ID: ");
        int id = scanner.nextInt();

        Visit visit = visitHistory.searchVisit(id);

        if (visit != null) {
            visit.displayDetails();
        } else {
            System.out.println("Visit not found.");
        }
    }

    static void removeVisit() {

        System.out.print("Enter Visit ID to remove: ");
        int id = scanner.nextInt();

        boolean removed = visitHistory.removeVisit(id);

        if (removed) {
            System.out.println("Visit removed successfully.");
        } else {
            System.out.println("Visit not found.");
        }
    }
}