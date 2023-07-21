import java.io.*;


class bool
{

public static void main(String args[])
{

boolean bool1=false;
boolean bool2 = true;
String s1= new Boolean(bool1).toString();
String s2= new Boolean(bool2).toString();



System.out.println(s1);
System.out.println(s2);



}}





class Demo13 {

 public static void main(String[] args) {

int val = 100;

System.out.println("Integer: "+val);

boolean bool = (val ==100);

System.out.println("Converted to Bool: "+bool);



}

}




 class Demo14{

 public static void main(String[] args) {



String str ="false";

boolean bool = Boolean.parseBoolean (str); 


System.out.println (bool);


}}





class Demo16 {


public static void main(String[] args) {

boolean val = false; 


Boolean res = Boolean.valueOf (val);



System.out.println(res);


}

}



class Demo15 {


public static void main(String[] args) {



String str ="true"; 

Boolean bool = Boolean.valueOf(str);

System.out.println (bool);
}

}





 class Demo17 {

 public static void main(String[] args) {



boolean bool = true;

System.out.println("Boolean Value: "+bool);

int val= (bool) ? 1 : 0; 


System.out.println("Integer value: "+val);

}
}





 class Demo18

{
 public static void main(String args[]) {

int val = 150;

String myStr = Integer.toString (val); 
 System.out.println("String: "+myStr);

}}










 class Demo19

{

public static void main(String[] args) {

String str = "456";

System.out.println (Integer.parseInt(str));

}
}














