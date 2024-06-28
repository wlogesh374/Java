import java.util.Scanner;
class loki
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a,b;
System.out.println("Enter the number1 ");
a=scan.nextInt();
System.out.println("Enter the number2 ");
b=scan.nextInt();

answer(a,b);


}


static void answer(int a,int b)


{

int c,rem,sum=0;

c=a*b;
System.out.println("The answer is");
System.out.println(c);

while(c>0)
{
rem=c%10;
c=c/10;
sum=sum+rem;
}
System.out.println("The sum of digits is");
System.out.println(sum);

}
}


