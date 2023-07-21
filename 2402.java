import java.util.*;

class night
{
public static void main(String args[])
{

int n,i,j,s;
int count=1;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");

n=sc.nextInt();

int a[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt();  

}



int b[]=new int[n];

System.out.println("Array elements B");
for(i=0;i<n;i++)
{

b[i]=sc.nextInt();  

}
int c[]=new int[n];


for(i=0;i<n;i++)
{
if(count==1)
{
s=(a[i]*b[i]);

c[i]=s+a[i];

count++;
}

else if(count==2)
{
s=(a[i]*b[i]);

c[i]=s-a[i];
count++;
}

else if(count==3)
{
s=(a[i]*b[i]);

c[i]=s;
count=1;
}
else
{

}


}

for(i=0;i<n;i++)
{
System.out.print(c[i]+" ");


}
System.out.println(" ");



for(i=0;i<n;i++)
{
if(c[i]<10)
{

System.out.print("S ");

}
else
{

System.out.print("D ");

}

}



int d[]=new int[n];

for(i=0;i<n;i++)
{

d[i]=b[i]%a[i];

}
System.out.println(" ");



for(i=0;i<n;i++)
{

System.out.print(d[i]+" ");

}
System.out.println(" ");


for(i=0;i<n;i++)
{
if(d[i]==0)
System.out.print("N ");

else if(d[i]%2==0)
System.out.print("E ");
else
System.out.print("O ");

}


}
}












class night1
{
public static void main(String args[])
{

int n,i,j,s=0,min,max;
int count=1;
Scanner sc=new Scanner(System.in);
System.out.println("Array size A");

n=sc.nextInt();

int a[]=new int[n];

System.out.println("Array elements A");
for(i=0;i<n;i++)
{

a[i]=sc.nextInt(); 
 
s+=a[i];
}


max=min=a[0];


for(i=0;i<n;i++)
{

if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}




}


System.out.println("Max is "+(s-min));

System.out.println("min is "+(s-max));




}}
