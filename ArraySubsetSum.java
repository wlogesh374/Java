package divum;
import java.util.*;
public class ArraySubsetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int i,j;
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the array elements");
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
sc.close();

int set1=0,set2=0;

for(i=0;i<n;i++)
{       boolean r=true; 

	for(j=i+1;j<n;j++)
	{
		if(a[i]==a[j])
		{
			r=false;
			a[i]=a[j]=0;
			break;
		}
	}
		if(r)
		{
		if(a[i]>0)
		  set1+=a[i];
			else
				set2+=a[i];
		}
	
}
System.out.println("Maximun Difference "+(set1-set2));

	
	}

}
