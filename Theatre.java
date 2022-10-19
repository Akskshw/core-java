class Theatre {
 String name;
 String address;
 long contactNumber;
 String ownerName;
 String []runningMoives={"charlie","vikram"};
public static void main(String a[])
{
Theatre theatre= new Theatre();
theatre.name="Veeresh";
theatre.address="Magadi Road";
theatre.contactNumber=9591838364L;
theatre.ownerName="Subray";

System.out.println("Theatre Name "+ theatre.name);
System.out.println("Theatre address "+theatre.address);
System.out.println("Theatre contactNumber "+theatre.contactNumber);
System.out.println("Theatre ownerName "+theatre.ownerName);
System.out.println("The running movies are ==");
theatre.getRunningMovie();

}
public void  getRunningMovie()
{
for(int i=0;i<runningMoives.length;i++)
{
	System.out.println(runningMoives[i]);
}
	
}
}