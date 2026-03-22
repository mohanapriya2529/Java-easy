import java.util.*;
class CountDigit{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter a number : ");
int n=s.nextInt();
int c=0;
int l=String.valueOf(n).length();
for(int i=0;i<l;i++){
n/=n;
c++;
}
System.out.print("Count = "+c);
}}