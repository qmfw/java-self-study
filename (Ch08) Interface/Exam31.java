// Final <Variable> Example

class Calculator {
    static final double PI = 3.14;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class Exam31 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);   //3.14
        //Calculator.PI = 10;
 
    }
 
}

/*
class A{
    final void b(){}
}
class B extends A{
    void b(){}
} => 에러!!!

final class C{
    final void b(){}
}
class D extends C{}
=> 에러!!!*/
