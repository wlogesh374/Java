import java .util.*;

class armstrong
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
System.out.print("Enter the number: ");
int n= sc.nextInt();
int i,d,rem,result=0 ;
for(i=1;i<=n;i++)
{

d=i;
  while(i>0)
  {
      rem=i%10;
      i=i/10;
      result=result + (rem * rem* rem);
      
  }
  if(result==d)
  {
     System.out.println(result);
  }

}
  
}
}