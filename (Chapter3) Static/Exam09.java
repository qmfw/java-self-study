public class Exam09 {
    static int i;
     
    static void a() {
        int i = 0;
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}

//0 1 2 3 4