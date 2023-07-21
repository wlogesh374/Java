import java.util.*;
class main{
    public static void main(String args[]){
        ArrayList<Integer> arrlst = new ArrayList<>();
        ArrayList<Integer> arrlst1 = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
         int cho=1;
        while(cho==1)
       {

  System.out.println("1.Add\n2.Remove\n3.Size\n4.Sort\n5.display\n6.exit\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
 switch(n)
{
            case 1:
{
                System.out.println("Enter the number of element to add:");
                int x = sc.nextInt();
                while(x-->0){
                    System.out.println("Enter the number to add:");
                    int z = sc.nextInt();
                    al.add(x);
                }
                break;
            }
            case 2:{
                System.out.println("Enter the position of element to remove:");
                int y = sc.nextInt();
                al.remove(y);
                break;
            }
            case 3:{
                System.out.println("The size of the arraylist is:" + al.size());
                break;
            }
            case 4:{
                System.out.println("The sorted Arraylist is:");
                al.sort(Comparator.naturalOrder());
               
                break;
            }
            case 5:{
                System.out.println(al);
                break;
            }
             case 6:
        {
             cho=0;
break;
         }
            default:{
                System.out.println("Enter a valid option");
                break; 
            }
        }}}
}