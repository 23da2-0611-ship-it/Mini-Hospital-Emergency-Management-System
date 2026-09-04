import classes.Patient;
import classes.PatientQueue;

public class TestQueue {

    public static void main(String[] args) {

        PatientQueue queue = new PatientQueue();

        Patient afqa = new Patient(
                1001, "Afqa", 24, "0771234567", "Fever"
        );

        Patient samrath = new Patient(
                1003, "Samrath", 25, "0712345678", "Headache"
        );

        Patient aswer = new Patient(
                1005, "Aswer", 58, "0756781234", "Diabetes"
        );

        // Enqueue patients
        System.out.println("=== Adding Patients ===");
        queue.enqueue(afqa);
        queue.enqueue(samrath);
        queue.enqueue(aswer);

        // Display queue
        queue.displayQueue();

        // Dequeue first patient
        System.out.println("=== Dequeue Next Patient ===");

        Patient nextPatient = queue.dequeue();

        if (nextPatient != null) {
            nextPatient.displayDetails();
        }

        // Display queue after dequeue
        System.out.println("=== Queue After Dequeue ===");
        queue.displayQueue();
    }
}