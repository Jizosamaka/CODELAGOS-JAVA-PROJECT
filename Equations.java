//Tis program accepts the parameters of a set of simultaneus equation with two unknowns and solve the equation
import java.util.Scanner;
public class Equations{
public static void main(String[] args){
double a,b,c,d,e,f,x,y;
Scanner input = new Scanner(System.in);
System.out.println("enter the parameters");
a=input.nextDouble(); 
b=input.nextDouble(); 
c=input.nextDouble(); 
d=input.nextDouble(); 
e=input.nextDouble(); 
f=input.nextDouble(); 
x=(e*d-b*f)/(a*d-b*c);
y=(a*f-e*c)/(a*d-b*c);
System.out.println("The vakue of X that satisfy the equation is " +x);
System.out.println("The vakue of Y that satisfy the equation is " +y);
}
}
