import java.io.*;
import java.util.Scanner;

public class evenodd

{
    public static void main (String args[])
    {
        int num;
        Scanner s= new Scanner(System.in);
System.out.println("ENTER THE NUM");
        num=s.nextInt();
        if(num%2==0)
        System.out.println(num+ "is even");
        else
        System.out.println(num+ "is odd");
        
    }
}