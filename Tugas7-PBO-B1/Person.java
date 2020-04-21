public class Person {
private int age;
private String name;
private String personId;
public void setAge(int newValue)
{
age = newValue;
}
public void setName( String newValue)
{
name = newValue;
}
public void setPersonId(String newValue)
{
personId = newValue;
}
public int getAge()
{
return age;
}
public String getName()
{
return name;
}
public String getPersonId()
{
return personId;
}
}
Main.java
public class Main {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
Person ren = new Person();
ren.setAge(22);
ren.setName(“Ren A”);
ren.setPersonId(“113060002?);
System.out.println(“My name is” +ren.getName() +” My age :”+ ren.getAge() +”and My Id”+ren.getPersonId());
}
}