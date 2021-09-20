class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    public int avg() {
        return super.avg();
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class Exam21 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum(); //실행 결과는 30입니다.
        System.out.println("실행 결과는" + c1.avg()); //실행 결과는15
        c1.substract(); //-10
    }
}
