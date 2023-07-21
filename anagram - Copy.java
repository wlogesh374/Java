import java.io.*;
import java.util.*;

class string
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n,m,i,count=0;
System.out.println("Enter the string1");
String a=sc.nextLine();

System.out.println("Enter the string2");
String b=sc.nextLine();
n=a.length();
m=b.length();


if(n==m)
{

for(i=0;i<n;i++)
{
if(a.charAt(i)!=b.charAt(i))
count++;

}

}
else
{
System.out.println("The string are differnt length");
}


System.out.println(count);




}}