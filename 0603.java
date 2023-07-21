import java.util.*;

class mike
{
public static void main(String args[])
{
 char c,x,d;
int i,s,j;
int count =0;

Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String a=sc.nextLine();
int n=a.length();
System.out.println(n);
char ch[]=a.toCharArray();
int b[]=new int[n];
for(i=0;i<n;i++)
{
count=1;
for(j=i+1;j<n;j++)
{
if(ch[i]==ch[j])
{
count++;
}}
b[i]=count;
}}}


//Night class





class p3 {
    public static void sortDesc(char chars[], int counts[]) {
        int n = chars.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (counts[i] < counts[j]) {
                    int temp = counts[i];
                    counts[i] = counts[j];
                    counts[j] = temp;
                    char ch = chars[i];
                    chars[i] = chars[j];
                    chars[j] = ch;
                    j = i;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int d = scan.nextInt();
        int size = str.length();
        String elements = "";
        for (int i = 0; i < size; i++) {
            if (!elements.contains(str.charAt(i) + "")) {
                elements += str.charAt(i);
            }
        }
        char chars[] = elements.toCharArray();
        int counts[] = new int[elements.length()];
        for (int i = 0; i < elements.length(); i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (chars[i] == str.charAt(j))
                    count++;
            }
            counts[i] = count;
        }
        int n = chars.length;
        if(n >= d){
            sortDesc(chars, counts);
            boolean flag = true;
            while (flag) {
                sortDesc(chars, counts);
                for (int i = 0; i < n-1; i++) {
                    if (counts[i] == counts[i + 1]) {
                        if (chars[i] > chars[i + 1]) {
                            int temp = counts[i];
                            counts[i] = counts[i+1];
                            counts[i+1] = temp;
                            char ch = chars[i];
                            chars[i] = chars[i+1];
                            chars[i+1] = ch;
                        }
                    }
                }
                for (int i = 0; i < d; i++) {
                    if (counts[i] == 0) {
                        flag = false;
                        break;
                    }
                    System.out.print(chars[i]);
                    counts[i]--;
                }
            }
        }
        else
            System.out.println(" Cannot be rearranged ");
    }
}

