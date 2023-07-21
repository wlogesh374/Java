import java.util.*;
 class bag {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the no of lines");
		n=sc.nextInt();
		//char c[]=new char[n];
		int d[]=new int[n];
		int note[]=new int[n];
		int coin[]=new int[n];
              char c[]= sc.next().toCharArray();

		for(i=0;i<n;i++)
		{
			//System.out.println("n or c");
               //c[] = sc.next().toCharArray();
			//System.out.println("amt");
			d[i]=sc.nextInt();
		}
int j=0,k=0;
		for(i=0;i<n;i++)
		{
			if(c[i]=='n')
			{
				note[j]=d[i];
				j++;
			}
			if(c[i]=='c')
			{
				coin[k]=d[i];
				k++;
			}
		}
		
		System.out.println("note");
		for(i=0;i<j;i++)
		{
			System.out.println(note[i]);
			

		}
		System.out.println("coin");
		for(i=0;i<k;i++)
		{
			System.out.println(coin[i]);
			
		}	
	}
}