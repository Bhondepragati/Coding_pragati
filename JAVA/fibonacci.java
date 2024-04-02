import java.util.Scanner;

class Example2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int count = sc.nextInt();
        
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series: " + n1 + " " + n2);

        for (int i = 2; i < count; ++i) {
            int nextTerm = n1 + n2;
            System.out.print(" " + nextTerm);
            n1 = n2;
            n2 = nextTerm;
        }
       
    }
}