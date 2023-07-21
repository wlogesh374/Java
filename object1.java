import java.util.*;


class Student
{
int rollno;
String name;


void 	InsertRecord(int r,String n)
{
rollno=r;
name=n;

}
void displayInformation()
{
System.out.println(rollno+" "+name);
}
}
class TestStudent5
{
public static void main(String args[])
{

Student s1=new Student();
Student s2=new Student();

s1.InsertRecord(111,"karan");
s2.InsertRecord(222,"aryan");
}
}