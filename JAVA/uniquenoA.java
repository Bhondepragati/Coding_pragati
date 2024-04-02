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

        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : a) {
            uniqueSet.add(num);
        }
        
        System.out.println("Unique numbers in the array:");
        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
        
    }
}
