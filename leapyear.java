import java.io.*;
import java.util.Scanner;
 class Leap
{
public static void main(String args[])
{
 int year;
 Scanner k= new Scanner(System.in);
 System.out.println("enter a year : ");
 year=k.nextInt();
 
if(year%400==0)
{
System.out.println(year+ "is leap");
}
else if(year%4==0)
{
System.out.println(year+ "is leap");
}
else

System.out.println(year+ "is non-leap");
}
}