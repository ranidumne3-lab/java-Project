import java.util.Scanner;

public class TravelExpenseAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Trip ID: ");
        String tripId = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Travel Days: ");
        int days = sc.nextInt();

        System.out.print("Enter Travel Expense: ");
        double travel = sc.nextDouble();

        System.out.print("Enter Accommodation Expense: ");
        double accommodation = sc.nextDouble();

        System.out.print("Enter Food Expense: ");
        double food = sc.nextDouble();

        double total = travel + accommodation + food;
        double average = total / days;

        System.out.println("\n===== TRAVEL EXPENSE REPORT =====");
        System.out.println("Trip ID: " + tripId);
        System.out.println("Destination: " + destination);
        System.out.println("Total Expense: Rs. " + total);
        System.out.println("Average Per Day: Rs. " + average);

        if (total <= 25000) {
            System.out.println("Budget Status: Within Budget");
        } else {
            System.out.println("Budget Status: Exceeded");
        }

        sc.close();
    }
}
