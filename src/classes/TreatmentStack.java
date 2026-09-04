package classes;

import java.util.Stack;

public class TreatmentStack {

    private Stack<String> treatmentStack;

    public TreatmentStack() {
        treatmentStack = new Stack<>();
    }

    // Add completed treatment
    public void push(String treatment) {
        treatmentStack.push(treatment);
        System.out.println("Treatment record added.");
    }

    // Remove most recent treatment
    public String pop() {

        if (treatmentStack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return null;
        }

        return treatmentStack.pop();
    }

    // Display treatment history
    public void displayStack() {

        if (treatmentStack.isEmpty()) {
            System.out.println("No treatment records found.");
            return;
        }

        System.out.println("=== Treatment History ===");

        for (int i = treatmentStack.size() - 1; i >= 0; i--) {
            System.out.println(treatmentStack.get(i));
        }
    }

    // Check whether stack is empty
    public boolean isEmpty() {
        return treatmentStack.isEmpty();
    }
}