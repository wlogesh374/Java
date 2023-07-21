import java.util.*;
class playeradd
{
int a;
Double b;
String s;
}
class  testplayer
{
public static void main(String args[])
{
playeradd p = new playeradd();

playeradd p1 = new playeradd();


p.a=1;
p1.a=3;
p.s="dharwesh";
p.b=98.0;




System.out.println("position in ipl :" + (p.a +p1.a));

System.out.println("name of the player :" + p.s);
System.out.println("name of the player :" + p.b);



}
}