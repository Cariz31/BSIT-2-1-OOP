import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        PaymentGateway gateway = new PaymentGateway();

        Scanner sc = new Scanner(System.in);

        gateway.add(new GCashPayment( 1001, "Ana", 1500.00, "0917-555-0134"));

        gateway.add(new MayaPayment(1002, "Jerome", 899.50, "jerome@liceo.edu.ph"));

        gateway.add(new CashPayment(1003, "Liza", 250.00 ));

        int choice;

        do {
            System.out.println();
            System.out.println("=== PAYMENT GATEWAY ===");
            System.out.println("1. Process all payments");
            System.out.println("2. Show service fees");
            System.out.println("3. Find payment by ID");
            System.out.println("4. Refund all refundable payments");
            System.out.println("5. Show total collected");
            System.out.println("6. Show payment count");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    gateway.processAll();
                    break;

                case 2:
                    System.out.println("Service fees (the two serviceFee methods):");
                    gateway.showServiceFees();
                    break;

                case 3:
                    System.out.print("Enter payment ID: ");
                    int id = sc.nextInt();

                    Payment payment = gateway.findById(id);

                    if (payment != null) {
                        System.out.println("Payment found:");
                        payment.printReceipt();
                    } else {
                        System.out.println("Payment not found.");
                    }
                    break;

                case 4:
                    System.out.println("Refunding every payment that can be refunded:");
                    gateway.refundAll();
                    break;

                case 5:
                    System.out.printf(
                            "Total collected: PHP %.2f%n",
                            gateway.totalCollected()
                    );
                    break;

                case 6:
                    System.out.println("Payment count: " + gateway.count());
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
