interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{
    public void x(){}
    public void z(){}   
}

interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class B implements I4{
    public void x(){}
    public void z(){}   
}

/* 인터페이스의 멤버는 반드시 public
interface I5{
    private void x();
}*/