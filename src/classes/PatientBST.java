package classes;

public class PatientBST {

    private PatientNode root;

    // Insert a new patient
    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private PatientNode insertRecursive(PatientNode current, Patient patient) {

        if (current == null) {
            return new PatientNode(patient);
        }

        if (patient.patientId < current.patient.patientId) {
            current.left = insertRecursive(current.left, patient);
        } 
        else if (patient.patientId > current.patient.patientId) {
            current.right = insertRecursive(current.right, patient);
        }

        return current;
    }

    // Search patient by Patient ID
    public Patient search(int patientId) {
        PatientNode result = searchRecursive(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private PatientNode searchRecursive(PatientNode current, int patientId) {

        if (current == null || current.patient.patientId == patientId) {
            return current;
        }

        if (patientId < current.patient.patientId) {
            return searchRecursive(current.left, patientId);
        }

        return searchRecursive(current.right, patientId);
    }

    // Display patients in ascending Patient ID
    public void displayInOrder() {
        if (root == null) {
            System.out.println("No patient records found.");
            return;
        }

        inOrderRecursive(root);
    }

    private void inOrderRecursive(PatientNode current) {

        if (current != null) {
            inOrderRecursive(current.left);

            current.patient.displayDetails();
            System.out.println("----------------------");

            inOrderRecursive(current.right);
        }
    }

    // Delete patient by Patient ID
    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private PatientNode deleteRecursive(PatientNode current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId < current.patient.patientId) {
            current.left = deleteRecursive(current.left, patientId);
        } 
        else if (patientId > current.patient.patientId) {
            current.right = deleteRecursive(current.right, patientId);
        } 
        else {

            // No child
            if (current.left == null && current.right == null) {
                return null;
            }

            // Only right child
            if (current.left == null) {
                return current.right;
            }

            
            if (current.right == null) {
                return current.left;
            }

            
            PatientNode successor = findMinimum(current.right);
            current.patient = successor.patient;
            current.right = deleteRecursive(
                current.right,
                successor.patient.patientId
            );
        }

        return current;
    }

    private PatientNode findMinimum(PatientNode current) {

        while (current.left != null) {
            current = current.left;
        }

        return current;
    }
}