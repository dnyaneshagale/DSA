import java.util.*;
import java.math.*;


public class Inheritance{

    public static class Sum{
        int sum(int a , int b){
            int s = a +b;
            return s;
        }        
    }
    
    public static class Calculator extends Sum{
        int diff(int a, int b){
            int diff = a -b;
            return diff;
        }
    }
    
    public static class AdvCalculator extends Calculator{
        int mul(int a, int b){
            int mul = a * b;
            return mul;
        }
    } 

    public static class UpdatedAdvCalculator extends AdvCalculator{
        void div(int a, int b){
            int divi = a / b;
            if ((a%b)==0) {
                
                System.out.println("\n Quotient = "+ divi);
            }else{
                System.out.println("Quotient = "+ divi + "\n\tRemainder = " + (a%b));
            }

        //  void double
        }
    }

    public static class Sahil extends UpdatedAdvCalculator{
        double power(double a, double b){
            return Math.pow(a, b);
        }
    }

    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = scn.nextInt();
        System.out.println("\nEnter b : ");
        int b = scn.nextInt();

        // System.out.println("Sum : ");
        // Sum sum = new Sum();
        // System.out.println("a + b = "+ sum.sum(a, b));

        // System.out.println("\nCalculator : ");
        // Calculator calc = new Calculator();
        // System.out.println("a - b = " + calc.diff(a, b));

        // System.out.println("\nAdvance Calculator : ");
        // AdvCalculator advc = new AdvCalculator();
        // System.out.println("a x b = " + advc.mul(a, b));

        // System.out.println("\nUpdated Advance Calculator : ");


        System.out.println("\n\nSahil inherited all the other classes : \n" );
        Sahil ss = new Sahil();
        int sum = ss.sum(a, b);
        int diff = ss.diff(a, b);
        int mul = ss.mul(a, b);

        

        // float div = ss.div(a, b);
        // int divi = (int) div;

        double pow = ss.power(a, b);
        int power = (int) pow;


        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a x b = " + mul);
        System.out.print("a / b = ");
        ss.div(a, b);

        System.out.println("a ^ b = " + power );

    }
}