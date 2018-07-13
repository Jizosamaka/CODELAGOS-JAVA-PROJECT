//This program computes the roots of a quadratic equation using the quadratic formula
import java.util.Scanner;
public class Project{
public static void main (String[] args){
//Declaration of variable types
double x1, x2, SQD;
int a, b, c, D;
//Input the parameters of the equation
Scanner input = new Scanner(System.in);
System.out.println ("Enter the coefficient of the squared term ");
a = input.nextInt();
System.out.println ("Enter the coefficient of the second term ");
b = input.nextInt();
System.out.println ("Enter the constant term ");
c = input.nextInt();
//Compute the discriminant, D
D =(b)^2-4*a*c;
//Compute the root of the discriminant
SQD = (D)^(1/2);
//Text for complex root
if (SQD<0){
	System.out.println ("Complex root");
}
//Compute the roots if not complex
else{
x1 = (SQD-b)/(2*a);
x2 = (-b-SQD)/(2*a);
System.out.println ("The first root is"  +x1);
System.out.println ("The second root is" +x2);
}
}
}