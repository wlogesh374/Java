
import java.util.*;


class adj
{
public static void main(String args[])
{
int n,m;
int i;
int j,temp;
System.out.println("no of rows of arr");

Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.println("no of col array ");
m=s.nextInt();

int a[][]=new int[n][m];


System.out.println("enter the elements of array1 are");


for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=s.nextInt();
}
}



System.out.println(" the elements of array 1are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println(" ");

}
temp=a[0][0];
a[0][0]=a[1][1];
a[1][1]=temp;

a[0][1]=-a[0][1];
a[1][0]=-a[1][0];




System.out.println(" the adj of array 1are");

for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+"  ");
}
System.out.println(" ");

}









}
}
