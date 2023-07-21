import java.util.*;
  class treemap {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n,choice=1;

    Map<Integer,Integer> a=new TreeMap<>();
while(choice==1)
{
  System.out.println("Char");
    char c=sc.next().charAt(0);
switch(c)
{
case 'a':
{
    a.put(sc.nextInt(),sc.nextInt());
break;
}
case 'b':
{
n=sc.nextInt();
if(a.containsKey(n))
System.out.println(a.get(n));
else
System.out.println("-1");

break;
}

case 'c':
{
System.out.println("Size of a = "+ a.size());
break;

}
case 'd':
{
n=sc.nextInt();
if(a.containsKey(n))
{
a.remove(n);
}
else
System.out.println("-1");

break;

}

case 'e':
{
 for (Integer key : a.keySet())
 {
            System.out.println("Key: " + key + ", Value: " + a.get(key));
}
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