import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Enter the elements of the array (with one missing number):");
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextInt();
        }

        
        int sum = (n * (n + 1)) / 2;
        
        
        int arraySum = 0;
        for (int num : a) {
            arraySum += num;
        }
        
        
        int missingNumber = sum - arraySum;
        
        System.out.println("The missing number in the array is: " + missingNumber);
        
        scanner.close();
    }
}
