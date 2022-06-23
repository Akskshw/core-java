class Gutka {
String name;
int price;

public static void main(String args[])
{
Gutka gutka=new Gutka("VIMAL",10);
System.out.println(gutka.name + "  "+ gutka.price);
}
public Gutka(){
this.keSari();
System.out.println("Object Created");
}

public Gutka(String name,int price)
{
this();
this.name=name;
this.price=price;
}
public void keSari()
{
System.out.println("Bolo Zubaan Kesari");

}

}