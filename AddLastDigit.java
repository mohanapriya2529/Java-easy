import java.util.*;
class AddLastDigit{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter two numbers:");
int a=s.nextInt();
int b=s.nextInt();
a%=10;
b%=10;
System.out.print("Sum of the given number's last digit is "+ (a+b));
}
}