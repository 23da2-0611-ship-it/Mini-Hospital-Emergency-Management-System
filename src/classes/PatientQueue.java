package classes;

import java.util.LinkedList;

public class PatientQueue {

    private LinkedList<Patient> queue;

    public PatientQueue() {
        queue = new LinkedList<>();
    }

    // Add patient to the queue
    public void enqueue(Patient patient) {
        queue.addLast(patient);
        System.out.println("Patient added to emergency queue.");
    }

    // Remove the next patient
    public Patient dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        return queue.removeFirst();
    }

    // Display waiting patients
    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("No patients are waiting.");
            return;
        }

        System.out.println("=== Emergency Patient Queue ===");

        for (Patient patient : queue) {
            patient.displayDetails();
            System.out.println("----------------------");
        }
    }

    // Check whether queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}