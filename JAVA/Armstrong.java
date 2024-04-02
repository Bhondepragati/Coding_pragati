import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int temp = n;
        int c = 0;
        
        
        while (temp != 0) {
            c++;
            temp = temp / 10;
        }
        
        temp = n; 
        int sum = 0;
        
       
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, c);
            temp = temp / 10;
        }
        
       
        if (sum == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        
        scanner.close();
    }
}
