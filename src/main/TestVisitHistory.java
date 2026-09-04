import classes.PatientVisitHistory;
import classes.Visit;

public class TestVisitHistory {

    public static void main(String[] args) {

        PatientVisitHistory history = new PatientVisitHistory();

        // Add patient visits
        Visit visit1 = new Visit(
                1,
                "2026-08-20",
                "Dr. Perera",
                "Fever",
                "Paracetamol"
        );

        Visit visit2 = new Visit(
                2,
                "2026-08-25",
                "Dr. Silva",
                "Headache",
                "Pain relief tablets"
        );

        Visit visit3 = new Visit(
                3,
                "2026-09-01",
                "Dr. Fernando",
                "Diabetes",
                "Insulin"
        );

        // Add visits to linked list
        history.addVisit(visit1);
        history.addVisit(visit2);
        history.addVisit(visit3);

        // Display visit history
        history.displayHistory();

        // Search visit
        System.out.println("=== Search Visit 2 ===");

        Visit found = history.searchVisit(2);

        if (found != null) {
            found.displayDetails();
        } else {
            System.out.println("Visit not found.");
        }

        // Remove visit
        System.out.println("=== Remove Visit 2 ===");

        boolean removed = history.removeVisit(2);

        if (removed) {
            System.out.println("Visit removed successfully.");
        } else {
            System.out.println("Visit not found.");
        }

        // Display history after removal
        System.out.println("=== Visit History After Removal ===");
        history.displayHistory();
    }
}