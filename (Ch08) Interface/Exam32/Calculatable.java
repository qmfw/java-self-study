public interface Calculatable {
    public void setOprands(int first, int second, int third) ;
    public int sum(); 
    public int avg();
} 

//interface 사용시 implements 사용
//지금 예제에선 Calculatable 안에 아무것도 작성 안해도 정상실행