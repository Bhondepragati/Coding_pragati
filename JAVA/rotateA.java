import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        
        int firstElement = a[0];
        
        
        for (int i = 0; i < n - 1; i++) {
            a[i] = a[i + 1];
        }
        
       
        a[n - 1] = firstElement;
        
        System.out.println("Array rotated left by one position:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        
       
    }
}
