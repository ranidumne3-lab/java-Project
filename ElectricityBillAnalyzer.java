import java.util.Scanner;

public class ElectricityBillAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ELECTRICITY BILL ANALYZER =====");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units <= 100) {
            bill = units * 3;
        } else if (units <= 200) {
            bill = (100 * 3) + (units - 100) * 5;
        } else {
            bill = (100 * 3) + (100 * 5)
                   + (units - 200) * 7;
        }

        System.out.println("\n===== ELECTRICITY BILL =====");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: Rs. " + bill);

        sc.close();
    }
}
