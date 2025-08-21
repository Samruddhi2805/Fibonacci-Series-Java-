import java.util.* ;
public class fibo
{
public static void main(String args[])
{
int a=0,b=1,c,i,n;
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number= ");
n=scan.nextInt();

for(i=0;i<n-2;i++)
{
c=a+b;
System.out.print(c);
a=b;
b=c;
}
System.out.println("Fibonacci number is= " + n);
}
}