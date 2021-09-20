class Calculator {
    int left, right;
     
    public Calculator(){
         
    }
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
    // 위에 public Calculator 두개로 장난질 안쳐도 결과 같음
    
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class Exam16 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum(); //30
        c1.avg(); //15
        c1.substract(); //-10
    }
}
