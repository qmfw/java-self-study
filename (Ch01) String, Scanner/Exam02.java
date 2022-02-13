import java.util.Scanner;
import java.util.Arrays;

public class Exam02 {
    
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine(); //숫자 + \n 이라서 뒤에 문자 넣을때 영향 주므로
        String[] a = new String[n];
        for (int i=0; i<n; i++) a[i] = sc.nextLine();
        for (int i=0; i<n; i++) System.out.print(a[i]+" ");
        
        System.out.println();
        System.out.println(Arrays.toString(a));
        
    }
 
}
