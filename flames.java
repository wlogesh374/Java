class flames {
 public static void main(String[] args) {
  String a = "HARI";
  String b = "LOSHI";


int c1,c2,d1,d2;
int i,j;
c1=a.length();
c2=b.length();
d1=c1;
d2=c2;
for(i=0;i<c1;i++)
{

char c=a.charAt(i);

for(j=0;j<c2;j++)
{

if(b.charAt(j)==c)

{
d2--;
d1--;
break;

}


}


}


System.out.println(d2);
System.out.println(d1);

char c[]={'F','L','A','M','E','S'};





}}