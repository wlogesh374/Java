import java.util.*;
 class ARRAYLISTSWAP {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int i;

String temp;
int p1,p2;
		ArrayList<String> arr1=new ArrayList<String>();
		System.out.println("Enter  the no elements to add in arr");
		int n=sc.nextInt();
      for(i=0;i<=n;i++)
	 arr1.add(sc.nextLine());
System.out.println("Given List");
for(i=1;i<=n;i++)
{
	System.out.print(arr1.get(i)+" ");


}
		System.out.println("Enter  the pos of elements to swap");
          p1=sc.nextInt();
          p2=sc.nextInt();

      temp=arr1.get(p1);
      arr1.set(p1,arr1.get(p2));
arr1.set(p2,temp);
System.out.println("Swapped List");

for(i=1;i<=n;i++)
{
	System.out.print(arr1.get(i)+" ");


}

	}


}