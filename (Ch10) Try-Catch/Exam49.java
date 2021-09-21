class DivideException extends Exception {
    DivideException(){
        super();
    }
    DivideException(String message){
        super(message);
    }
}
class Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            try {
                throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
            } catch (DivideException e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
}
public class Exam49 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}

/*
DivideException: 0으로 나누는 것은 허용되지 않습니다.
        at Calculator.divide(Main.java:18)
        at Main.main(Main.java:30)
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Calculator.divide(Main.java:23)
        at Main.main(Main.java:30)
*/