import java.util.*;

class prob4
{
public static void main(String args[])
{
int n,i;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of masses");

n=sc.nextInt();

int m[]=new int[n];


System.out.println("Enter mass ");


for(i=0;i<n;i++)
{
  
m[i]=sc.nextInt();  

}



int fuel=0;
for(i=0;i<n;i++)
{
  
m[i]/=3;
m[i]-=2;  
 fuel+=m[i];
}





System.out.println("The Fuel required is "+fuel);


}
}
