import java.util.Scanner;

public class IT26101717Lab7Q1B {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            
			
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();

           
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            System.out.println("Average is : " + average);

           if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is : Distinction\n");
            } else if (average >= 50 && average <= 74) {
                System.out.println("Overall Grade is : Credit\n");
            } else if (average >= 0 && average <= 49) {
                System.out.println("Overall Grade is : Fail\n");
            } else {
                System.out.println("Invalid marks entered.\n");
            }
        }

        }
     }
