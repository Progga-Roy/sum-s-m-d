import java.util.Scanner;
public class mathAll {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter first number = ");
        int a = input.nextInt();
        System.out.print("Enter second number = ");
        int b = input.nextInt();
        math myMath = new math();
        myMath.addition(a,b);
        myMath.subtraction(a,b);
        myMath.multiplication(a,b);
        myMath.division(a,b);
    }
}

