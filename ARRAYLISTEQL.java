import java.util.*;
public class ARRAYLISTEQL {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int i;
		ArrayList<String> arr1=new ArrayList<String>();
		ArrayList<String> arr2=new ArrayList<String>();
		System.out.println("Enter  the no elements to add in arr1");
		int n=s.nextInt();
      for(i=0;i<=n;i++)
	 arr1.add(s.nextLine());
System.out.println("Enter  the no elements to add in arr2");
		int m=s.nextInt();
      for(i=0;i<=m;i++)
	 arr2.add(s.nextLine());
if(arr1.equals(arr2)==true)
{

System.out.println("Array List are equal");

}
else
System.out.println("Array List are not equal");

	}

}



