import java.util.*;
class mul
{
public static void main(String args[])
{
int n,m;
int i;
int j;
int count=0;
int count1=0;
System.out.print("no of rows");
System.out.print("no of col");

Scanner s=new Scanner(System.in);
n=s.nextInt();
m=s.nextInt();

int a[][]=new int[n][m];
int b[][]=new int[n][m];
int c[][]=new int[n][m];

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}



for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=a[j][i];
}
}



System.out.println("the given matrix is ");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");

}
System.out.println(" ");

}






System.out.println("the transpose matrix is");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(b[i][j]+" ");

}
System.out.println(" ");

}




for(i=0;i<n;i++)
{

for(j=0;j<m;j++)
{
c[i][j]=0;

for(int k=0;k<n;k++)
{

c[i][j]+=a[i][k]*b[k][j];
}

}



}




System.out.println("the multiplied matrix is");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(c[i][j]+" ");

}
System.out.println(" ");

}



//PROBLEM2



System.out.println("Enter the choice 0 or 1");
int x=s.nextInt();
System.out.println("Clockwise");

if(x==0)
{

for(i=0;i<n;i++)
{
for(j=m-1;j>=0;j--)
{

System.out.print(a[j][i]+" ");

}


System.out.println(" ");

}

}


else if(x==1)
{

for(i=n-1;i>=0;i--)
{
for(j=0;j<n;j++)
{

System.out.print(a[j][i]+" ");

}


System.out.println(" ");
}


}







}}


















