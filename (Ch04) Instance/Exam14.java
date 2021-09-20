class Calculator {
    int left, right;
 
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
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

class MultiplicationableCalculator extends Calculator {
    public void multiplication() {
        System.out.println(this.left * this.right);
    }
}

class DivisionableCalculator extends MultiplicationableCalculator {
    public void division() {
        System.out.println(this.left / this.right);
    }
}

public class Exam14 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum(); //30
        c1.avg(); //15
        c1.substract(); //-10
        System.out.println("");
        
        MultiplicationableCalculator c2 = new MultiplicationableCalculator();
        c2.setOprands(10, 20);
        c2.sum(); //30
        c2.avg(); //15
        c2.multiplication(); //200
        System.out.println("");
        
        DivisionableCalculator c3 = new DivisionableCalculator();
        c3.setOprands(10, 20);
        c3.sum(); //30
        c3.avg(); //15
        c3.multiplication(); //200
        c3.division(); //0
    }
 
}
