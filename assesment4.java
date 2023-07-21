import java.util.*;
     import java.io.*;
import java.util.Arrays;


class prob1
{
public static void main(String args[])
{
int n,m;
int i,min;
int j;
int count=0;
int count1=0;
Scanner s=new Scanner(System.in);

System.out.println("ENter the size of array");

n=s.nextInt();
int a[]=new int[n];

for(i=0;i<n;i++)
{

a[i]=s.nextInt();

}

min=a[0];

for(i=0;i<n;i++)
{

if(min>a[i])
{
min=a[i];
}

}

for(i=0;i<n;i++)
{

if(a[i]==min)
{

}
else
{

while(a[i]>min)
{
count++;
a[i]--;
}
}

}

System.out.print("Changes "+count);

}}










class prob2 {




public static void main (String[] args) {
		
	int m, w, n, k;
	Scanner s=new Scanner(System.in);

     System.out.println("Enter the no of men");
     m=s.nextInt();
      System.out.println("ENter the no of woman");
     w=s.nextInt();
    System.out.println("ENter the no of workers");
     n=s.nextInt();
    System.out.println("ENter the min number of male");
     k=s.nextInt();





	System.out.println("The no of ways are"+ ways(m, w, n, k));
	}



static int ways(int m, int w, int n, int k)
{

	int ans = 0;
	while (m >= k) {
		ans += ncr(m, k) * ncr(w, n - k);
		k += 1;
	}

	return ans;
}


static int ncr(int n, int r)
{
	int ncr = fact(n) / (fact(r) * fact(n - r));
	return ncr;
}

static int fact(int n)
{
	int fact = 1;
	for (int i = 2; i <= n; i++)
		fact *= i;
	return fact;
}


	
}













class prob5{




public static void main (String[] args) {
		
	int n,i;
	Scanner s=new Scanner(System.in);

     System.out.println("Enter the size of array");
     n=s.nextInt();

int a[]=new int[n];
     System.out.println("Enter the elements of array");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}


    int count=0;
Arrays.sort(a);





 System.out.println("sorted array");
for(i=0;i<n;i++)
{
 System.out.println(a[i]);

}




    for( i=0; i<n-1; i++)
    {
        if(a[i]==a[i+1])
        {
            count++;
            i++;
        }
    }
    




     System.out.println("Enter the count is "+count);



}}







class prob4
{
public static void main(String args[])
{

int n,i,j;
int d=0;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");
int count=0;
n=sc.nextInt();

int a[]=new int[n];
int b[]=new int[n];
int c[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt();  

}


System.out.println("Array size B");



System.out.println("Array elements B");
for(i=0;i<n;i++)
{

b[i]=sc.nextInt();  

}


for(i=0;i<n;i++)
{

count=count+a[i]-b[i];
c[i]=count;
}
 

Arrays.sort(c);



System.out.println("max no of guest is "+c[n-1]);



}
}








class prob3
{



public static void main(String args[])
	{
		
		int n = 16;
	      int m=1;
			int i, j, k = 0;
		for (i = 0; i <=n; i++)
		{
             if(i<=7*m)
         {
            if((m*7)%2!=0)
           {
            for(j=1;j<i;j++)
           {
            System.out.print(" ");
          }
          
           System.out.println(i+1);
            for(j=i;j<14;j++)
           {
            System.out.print(" ");
          }
          
           System.out.println(14-i);


      }


      if(i>14)
     {





           
}










			

		}
	











}}
























