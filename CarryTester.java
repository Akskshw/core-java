class CarryTester{
public static void main (String a[]){
CarryBag carry=new CarryBag();
carry.setName("CHutiya");
carry.setPrice(2.00);
System.out.println(carry.getName() + " "+ carry.getPrice());
carry.holdingThings();
}
}