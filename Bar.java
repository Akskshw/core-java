class Bar
{
String BarName;
String location;
long contactNo;
String ownerName;
String[] liquor = {"OLD MONK","DSP BLACK","SIGNATURE"};	
String[] liquor1 ={"JACK DANNILS","BAGPAPPER","KING FISHER"};	
public static void main(String a[])
{
Bar bar=new Bar();
bar.BarName="Liquor Mart";
bar.location="Basaveshwar Nagar";
bar.contactNo=8887945654l;
bar.ownerName="GajendraKumar";

System.out.println("Bar name is " +bar.BarName);
System.out.println("Bar located in " +bar.location);
System.out.println("Bar contactNo is " +bar.contactNo);
System.out.println("Bar owner name is " +bar.ownerName);
bar.getLiquor();
System.out.println("---------------------------------------------------");
}
public void getLiquor()
{
for(int i=0;i<liquor.length;i++)
{
System.out.println(liquor[i]);
}
}

}