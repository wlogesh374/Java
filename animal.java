class animal
{
 void eat()
{
System.out.println("eating...");
}
}

class dog extends animal
{

 void bark()
{
System.out.println("barking...");
}
}

class cat extends animal
{
 void meow()
{
System.out.println("meowing...");
}
}

class babycat extends cat
{
 void baby()
{
System.out.println("cuteness...");
}
}



class testinheritance
{
public static void main (String args[])

{

cat c=new cat();
dog d=new dog();
babycat b=new babycat();
b.eat();
b.meow();
b.baby();
c.meow();
c.eat();
d.bark();
}
}


