class Fruits {

int price;
String name;
public static void main(String a[])
{
Fruits f=new Fruits("Mango",789);
System.out.println(f.name+" "+f.price);
}
public Fruits (String name, int price)
{
Fruits f=new Fruits("Kiwi",897);//for test
this.name=name;
this.price=price;

}

}