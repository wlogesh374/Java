import java.util.*;
class com
{
public static void main(String args[])
{double b,c,d,e;


Scanner s=new Scanner(System.in);
System.out.println("eneter the no of computers");
int n= s.nextInt();
System.out.println("eneter the no of switch");
int k= s.nextInt();

  b=Math.pow(2,n);
c=b-1;
d=k%(c+1);
if(d==c)
{System.out.println("yes");}
else
{
System.out.println("no");
}

}
}