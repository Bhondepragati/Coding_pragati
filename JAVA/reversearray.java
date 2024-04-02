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

        int start = 0;
        int end = a.length - 1;
        int c;
        
        while (start < end) {
            c = a[start];
            a[start] = a[end];
            a[end] = c;
            start++;
            end--;
        }
        
        System.out.println("Reversed array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        
    }
}
