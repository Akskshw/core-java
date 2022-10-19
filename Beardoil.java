class Beardoil{
	int price,quantity;
	 String brandname;
	public static void main(String args[])
{
	Beardoil beard=new Beardoil("Beardo",10,199);
	System.out.println("Brand Name" + "   " +beard.brandname+ "  " + "Quantity in ML" + "  " +beard.quantity + "  " + "Price" + "   " + beard.price);
}
public Beardoil(){
	
  this.usageofoil();
	System.out.println("Object created");
	
	
}
public Beardoil(String brandname,int quantity,int price)
{
	this();
	this.brandname=brandname;
	this.quantity=quantity;
	this.price=price;
	
}

public void usageofoil()
{
	System.out.println("TO grow well");
		
}
}