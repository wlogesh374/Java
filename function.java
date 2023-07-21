import java.util.Scanner;
class oddeven
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a,b;
System.out.println("Enter the number1 ");
a=scan.nextInt();


answer(a);


}


static void answer(int a)


{


if(a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("Odd");
}
}
}


