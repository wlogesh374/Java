import java .io.*;
import java .util.*;
class fibanocci
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the numberof terms: ");
int n= sc.nextInt();
int n1=0,n2=1,n3;
int i,sum=0 ;
System.out.println(n1);
System.out.println(n2);


for(i=3;i<=n;i++)
{
n3=n1+n2;
n1=n2;
n2=n3;


System.out.println(n3);
}
}

}
