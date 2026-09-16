import java.util.Scanner;

public class IT26101717Lab7Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);

            
            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();

            
            System.out.print("Enter payment mode (C for Cash, O for Other): ");
            char mode = input.next().charAt(0);

            
            if (mode == 'C' || mode == 'c') {
                double discount = billAmount * 0.05;
                double amountToPay = billAmount - discount;
                System.out.println("Discount = " + discount);
                System.out.println("Amount to be paid = " + amountToPay + "\n");
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applied.");
                System.out.println("Amount to be paid = " + billAmount + "\n");
            } else {
                System.out.println("Payment Mode is Not Valid\n");
            }
        }

        input.close();
    }
}
