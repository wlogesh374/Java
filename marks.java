import java.io.*;
import java.util.*;
public class E
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Maths mark");
  int a=s.nextInt();
  System.out.println("Enter the Physics mark");
  int b=s.nextInt();
  System.out.println("Enter the chemistry mark");
  int c=s.nextInt();
  int d=a+b+c;
  int e=a+b;
  if((a>=65)&&(b>=55)&&(c>=50)&&(d>=180))
  {
  System.out.println("The candidate is eligible for Admission");
  }
 else if((a>=65)&&(b>=55)&&(c>=50)&&(e>=140))
 {
 System.out.println("The candidate is eligible for Admission");
 }
 else
 {
 System.out.println("The candidate is not eligible for Admission");
 }
 }
 }