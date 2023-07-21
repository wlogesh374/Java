import java.util.*;
  class hashset {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,choice=1;
    LinkedHashSet<Integer> a =new LinkedHashSet<Integer>();
while(choice==1)
{
  System.out.println("Char");
    char c=sc.next().charAt(0);
switch(c)
{
case 'a':
{

    a.add(sc.nextInt());
break;
}
case 'b':
{
System.out.println("List "+a);
break;
}
case 'c':
{
n=sc.nextInt();
if(a.contains(n))
{
a.remove(n);
}
else
System.out.println("-1");

break;

}
case 'd':
{
if(a.contains(sc.nextInt()))
System.out.println("1");
else
System.out.println("-1");

break;
}

case 'e':
{
System.out.println("Size of a = "+ a.size());
break;
}
case 'f':
{

System.out.println("List "+a);
break;
}

case 'x':
{
choice=0;
break;
}
default:
{}


}


}


}

}
