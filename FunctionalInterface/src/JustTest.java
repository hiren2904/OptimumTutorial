interface Calcul{
    double add(double a,double b);
}

public class JustTest {
    public static void main(String []args){

        double num1 = 10.0;
        double num2 = 20.0;
        Calcul cal = (a,b ) ->a+b;
          System.out.println(cal.add(num1,num2));
    }
}
