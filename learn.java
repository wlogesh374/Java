import java.util.Scanner;
class learn
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int a,b,c,d,e,f,g,h;
System.out.println("enter the number 1");
a=scan.nextInt();
System.out.println("enter the number 2");
b=scan.nextInt();
System.out.println("enter the number 3");
c=scan.nextInt();
System.out.println("enter the choice");
d=scan.nextInt();

switch(d)
{
case 1:
e=a*b*c;
System.out.println(e);
break;
case 2:
f=a+b-c;
System.out.println(f);
break;
case 3:
if(a>b&&a>c)
{
System.out.println("a is greater");
}
else if (b>c&&b>a)
{
System.out.println("b is greater");

}
else
{
System.out.println("c is greater");

}
break;
case 4:
h=(a*b)+c;
System.out.println(h);
break;
default:
System.out.println("Enter correct choice");
break;
}
}
}
