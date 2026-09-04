import classes.TreatmentStack;

public class TestStack {

    public static void main(String[] args) {

        TreatmentStack stack = new TreatmentStack();

        // Add completed treatments
        System.out.println("=== Adding Treatment Records ===");

        stack.push("Afqa - Fever - Paracetamol treatment completed");
        stack.push("Samrath - Headache - Pain relief treatment completed");
        stack.push("Aswer - Diabetes - Insulin treatment completed");

        // Display treatment history
        stack.displayStack();

        // Pop most recent treatment
        System.out.println("=== Remove Most Recent Treatment ===");

        String removedTreatment = stack.pop();

        if (removedTreatment != null) {
            System.out.println("Removed: " + removedTreatment);
        }

        // Display stack after pop
        System.out.println("=== Treatment History After Pop ===");
        stack.displayStack();
    }
}