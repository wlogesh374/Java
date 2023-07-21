import java.util.*;
import java.io.*;
import java.util.Arrays;

class order
{
public static void main(String args[])
{

int n;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(int i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

Arrays.sort(a);
System.out.println(Arrays.toString(a)); 


/*for(int j:a)
{
  
System.out.println(j); 

}
*/



}}






class order1
{
public static void main(String args[])
{

int c,r,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

r=sc.nextInt();

System.out.println("Array size ");

c=sc.nextInt();

int a[][]=new int[r][c];


System.out.println("Array elements ");


for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
  
a[i][j]=sc.nextInt();  

}
}




for(int k[]:a)
{
  for(int l :k)
{
System.out.print(l+" "); 

}

System.out.print("\n"); 

}




}}









class order2
{
public static void main(String args[])
{

int c,r,i,j;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

r=sc.nextInt();


boolean a[]=new boolean[r];
boolean b[]=new boolean[r];
Arrays.fill(b,true);


for(i=0;i<r;i++)
{
 
a[i]=sc.nextBoolean();  

}



System.out.println(Arrays.equals(a,b));


}}









class Main5
{
public static void main(String args[])
{
    ArrayList<Integer> a=new ArrayList<>();
	 ArrayList<Integer> b=new ArrayList<>();

Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();



for(i=1;i<=n;i++)

{
a.add(sc.nextInt());
}


 
for(i=1;i<=n;i++)


{
b.add(sc.nextInt());
}


System.out.println(a);

a.addAll(b);

	System.out.println(a);
}


}





class string{
public static void main(String args[])
{


Scanner sc=new Scanner(System.in);

System.out.println("Enter the string");
String a=sc.nextLine();
String b=sc.nextLine();

}
}









