//RuntimeException말고 그냥 Exception시 에러 뜰것, 그땐 try~catch 사용
class DivideException extends RuntimeException {
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
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class Exam48 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}

/*
Exception in thread "main" DivideException: 0으로 나누는 것은 허용되지 않습니다.
        at Calculator.divide(Main.java:17)
        at Main.main(Main.java:26)
*/