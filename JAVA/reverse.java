import java.util.Scanner;

 class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();
        int reverse = 0;
        
        int originalNumber = number;
        
        while(number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        
        System.out.println("The reverse of the given number " + originalNumber + " is: " + reverse);
        scanner.close();
    }
}
