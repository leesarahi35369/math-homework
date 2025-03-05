  package MathHomework;

public class MathOperations {
     public static void main(String[] args) {
         System.out.println("Welcome to the Math Homework Assignment Program");
         System.out.println();
         int userNumber = getUserInput();
         int result = 0;

         if (userNumber > 0) {
             result = add(userNumber);
         } else if (userNumber < 0) {
             result = subtract(userNumber);
         } else {
             System.out.println("Invalid input, please enter a positive or negative number");
         }
         System.out.println();
         System.out.println("The sum is: " + result);
     }

    public static int getUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return Integer.parseInt(scan.nextLine());
    }

    public static int add(int num) {
        return (num + 10);
    }

    public static int subtract(int num) {
        return (num - 10);
    }
}