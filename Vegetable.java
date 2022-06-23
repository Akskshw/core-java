class Vegetable {
String name;
int price;
public static void main(String a[])
{
Vegetable veg=new Vegetable("BoxofVegetable",560);
System.out.println(veg.name +"  " +veg.price);
}
public Vegetable(){
this.viTamin();
System.out.println("Vegetable Object created");
}
public Vegetable(String name , int price){
this();
this.name=name;
this.price=price;
}
public void viTamin(){

System.out.println("Contains Vitamin A,b,C");
}


}

