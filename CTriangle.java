package JAVA
class CTriangle extends Cshape{
  double sideA , sideB , sideC;
  public CTriangle (double a , double b , double c){
    sideA=a;
    sideB=b;
    sideC=c;
}
  public static void main(string[]args){
    CTriangle triangle = new Triangle(3 , 4 , 5);
    triangle.color="紅色";
    system.out.print("color=" + triangle.color + "");
    system.out.print("area=" + 0.5*trinagle.sideA * triangle.sideB);
}
}
