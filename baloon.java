
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        int i,j,k,g,p,n,c1=0,c2=0,a,b,temp,sum;
        //Scanner
        Scanner s = new Scanner(System.in);
        //enter no of test case
        int t = s.nextInt();  
        for(i=1;i<=t;i++)
        {
            c1=0;
            c2=0;
           
            //green
        g = s.nextInt();
        //purple ballooon  
        p = s.nextInt();  
        if(i%2==0)
        {
            temp=g;
            g=p;
            p=temp;
        
        }
        //no of participants
        n = s.nextInt();  

        for(j=1;j<=n;j++)
        {
        a= s.nextInt();  
        b= s.nextInt();  
        if(a==1)
        c1+=g;
        if(b==1)
        c2+=p;

        }
        sum=0;
        sum=c1+c2;

        System.out.println(sum);   
           

        }


    }
}
