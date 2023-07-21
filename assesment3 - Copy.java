import java.util.*;

class target
{
public static void main(String args[])
{

int n,i,t,k=0,flag=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}
System.out.println("Target= ");
t=sc.nextInt();

for(i=0;i<n;i++)
{
  
if(a[i]==t)
{
k=i;
flag=1;
break;
}  
else
flag=0;

}


if (flag==1)
System.out.println(k);
else
System.out.println("-1");


}
}





class permu
{
public static void main(String args[])
{

int n,i,t,k=0,flag=0,flag1=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Array size ");

n=sc.nextInt();

int a[]=new int[n];


System.out.println("Array elements ");


for(i=0;i<n;i++)
{
  
a[i]=sc.nextInt();  

}

for(i=0;i<n-1;i++)
{
if(a[i]<a[i+1])
{
flag=1;
}
else
{
flag=0;
break;
}

}


for(i=0;i<n-1;i++)
{

if(a[i]>a[i+1])
{
flag1=1;
}
else
{
flag1=0;
break;
}

}
if(flag==1)

{

temp=a[n-1];
a[n-1]=a[n-2];
a[n-2]=temp;

for(i=0;i<n;i++)
{
  
System.out.print(a[i]+" "); 

}

}

if(flag1==1)

{

temp=a[n-1];
a[n-1]=a[0];
a[0]=temp;

for(i=0;i<n;i++)
{
  
System.out.print(a[i]+" "); 

}



}}







class pattern
{

public static void main(String args[])
{

int n,i,j,m,m1;
Scanner sc=new Scanner(System.in);
System.out.println("size ");

n=sc.nextInt();


for(i=1;i<=n;i++)
{

if(i==1||i==n)
{
for(j=1;j<=4;i++)
{
System.out.print(" ");

}

for(j=1;j<=4;i++)
{
System.out.print("#");

}

}

else if(i==2||i==3||i==n-1||i==n-2)
{
if(i%2==0)
{
m=2;
m1=2;
}

else
{
m=1;
m1=3;
}

for(j=1;j<=m;j++)
{
System.out.print(" ");
}

System.out.print("**");

for(j=1;j<=m1;j++)
{
System.out.print("  ");
}

System.out.print("**");


}

else
{

System.out.print("##");

}


}


}
}
}
