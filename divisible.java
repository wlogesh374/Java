import java.io.*;
import java.util.*;


class divisible
{
public static void main(String args[])
{
int a,b,c,i,count=0;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the starting number: ");
a=sc.nextInt();
System.out.println("Enter the ending number: ");
b=sc.nextInt();

System.out.println("Enter the divisor number: ");

c=sc.nextInt();
if(c==0)
{
System.out.println("divisor is Invalid");
}
if(c>0)
{
for(i=a;i<=b;i++)
{
  if(i%c==0)
{

count++;
}


}
System.out.println("Count is "+count);

}

}
}
