import java.util.*;

class p1
{
public static void main(String args[])
{

int a,i,j,n;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");

a=sc.nextInt();
int b[]={2000,500,200,100,50,20,10,5,2,1};
n=b.length;


while(a>0)
{


for(i=0;i<n;i++)
{
  
if(b[i]<=a)
{
a-=b[i];
System.out.print(b[i]+" ");
break;
} }
}
}}