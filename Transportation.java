class Transportation {
int id;
static String name ="DHCL";
static int noofBranches =26;

String loction;
long contactNo;
public Transportation (int tid,String loc,long cNo) {
System.out.println("Transportation object is created");
id=tid;
loction=loc;
contactNo=cNo;
}
public static  void main (String a[])
{
Transportation trans=new Transportation(11,"DASARAHALLI",353567656L);
System.out.println(Transportation.name +" "+ Transportation.noofBranches);
System.out.println(trans.id +" "+trans.loction+" "+trans.contactNo);

Transportation trans1=new Transportation (12,"Rajaji Nagar",987564945L);
System.out.println(Transportation.name +" "+ Transportation.noofBranches);
System.out.println(trans1.id +" "+trans1.loction+" "+trans1.contactNo);

}

}
