

interface Calculator
{
   double add(double a,double b);
}

class BasicCalculator implements Calculator{
    @Override
    public double add(double a, double b) {
        return a+b;
    }
}

public class TestCalculator {
    public static void main(String []args){
        Calculator cu = new BasicCalculator();
        double num1 = 10.0;
        double num2 = 20.0;
        System.out.println(cu.add(num1,num2));
     }
}
