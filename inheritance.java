class main
{

public static void main(String args[])
{

rect c=new rect();
cir d=new cir();
 System.out.println(d.cir(10,5));
System.out.println(d.calc(10,5));



}}



abstract class Shape
{

 abstract int calc(int l,int b);


}


class rect extends Shape
{
 int calc(int l,int b)
{

return l* b;
}

}




class cir extends rect
{
 int cir(int l,int b)
{

return 2*(l+b);
}

}