class Fruits1 {

int price;
String name;
public static void main(String a[])
{
Fruits1 f=new Fruits1("Mango",789);
System.out.println(f.name+" "+f.price);
}

public Fruits1(){
	
this.pNutrition();
System.out.println("Fruits Object is created");
}
public Fruits1(String name, int price)
{
	this();
this.name=name;
this.price=price;

}
public  void pNutrition()
{
	
System.out.println("Good for health");
	
}



}