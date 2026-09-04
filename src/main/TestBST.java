import classes.Patient;
import classes.PatientBST;

public class TestBST {

    public static void main(String[] args) {

        PatientBST bst = new PatientBST();

        // Add patients
        bst.insert(new Patient(1003, "Afqa", 24, "0771234567", "Fever"));
        bst.insert(new Patient(1001, "Samrath", 25, "0712345678", "Headache"));
        bst.insert(new Patient(1005, "Aswer", 58, "0756781234", "Diabetes"));

        // Display patients
        System.out.println("=== Patient Records ===");
        bst.displayInOrder();

        // Search patient
        System.out.println("=== Search Patient 1001 ===");

        Patient found = bst.search(1001);

        if (found != null) {
            found.displayDetails();
        } else {
            System.out.println("Patient not found.");
        }

        // Delete patient
        System.out.println("=== Delete Patient 1003 ===");
        bst.delete(1003);

        System.out.println("=== Patient Records After Deletion ===");
        bst.displayInOrder();
    }
}