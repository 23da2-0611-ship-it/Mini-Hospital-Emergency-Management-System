package classes;

public class PatientVisitHistory {

    private VisitNode head;

    public PatientVisitHistory() {
        head = null;
    }

    // Add a new visit
    public void addVisit(Visit visit) {

        VisitNode newNode = new VisitNode(visit);

        if (head == null) {
            head = newNode;
            return;
        }

        VisitNode current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Remove a visit by Visit ID
    public boolean removeVisit(int visitId) {

        if (head == null) {
            return false;
        }

        if (head.visit.visitId == visitId) {
            head = head.next;
            return true;
        }

        VisitNode current = head;

        while (current.next != null) {

            if (current.next.visit.visitId == visitId) {
                current.next = current.next.next;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Search a visit by Visit ID
    public Visit searchVisit(int visitId) {

        VisitNode current = head;

        while (current != null) {

            if (current.visit.visitId == visitId) {
                return current.visit;
            }

            current = current.next;
        }

        return null;
    }

    // Display all visit history
    public void displayHistory() {

        if (head == null) {
            System.out.println("No visit history found.");
            return;
        }

        System.out.println("=== Patient Visit History ===");

        VisitNode current = head;

        while (current != null) {

            current.visit.displayDetails();
            System.out.println("----------------------");

            current = current.next;
        }
    }
}