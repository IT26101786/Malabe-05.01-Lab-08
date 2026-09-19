import java.util.Scanner;

public class IT26101786Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;
        String grade;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Student " + i);
            System.out.print("Enter marks: ");

            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

            average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

    }
}