import java.util.*;

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

        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : a) {
            uniqueElements.add(num);
        }
        
        System.out.println("Array with duplicates removed:");
        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
        
       
    }
}
