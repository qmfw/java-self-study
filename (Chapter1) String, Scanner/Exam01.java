import java.util.Scanner;

public class Exam01 {
    
    public static void main(String[] args) {
        
        String aaa="Cut-String";
        System.out.println(aaa.substring(2,5)); //t-S
        System.out.println(aaa.charAt(1));      //u
        System.out.println(aaa.split("-")[0]+aaa.split("-")[1]); //CutString
        
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 (문자 입력시 종료) : ");
        while(sc.hasNextInt()) {
            System.out.println("입력값 : "+(sc.nextInt()*2+1)); 
        }
        sc.close();
        //char는 nextLine으로 받는다
    }
    
}