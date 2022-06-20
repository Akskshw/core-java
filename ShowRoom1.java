class ShowRoom1 {
int showRoomid;
static String name ="WOODLAND";
static int noofBranches =56;
String loction;
long contactNo;
public ShowRoom1 (int showRoomid,String loction,long contactNo) {
System.out.println("ShowRoom object is created");
this.showRoomid=showRoomid;
this.loction=loction;
this.contactNo=contactNo;
}
public static  void main (String a[])
{
ShowRoom1 show=new ShowRoom1(1,"Vijaynagar",35353656L,"WOODLAND");
//System.out.println(ShowRoom1.name +" "+ ShowRoom1.noofBranches);
System.out.println(show.showRoomid +" "+show.loction+" "+show.contactNo+" "+show.name);

ShowRoom1 show1=new ShowRoom1 (2,"RR NAGAR",38358656L,"WOODLAND");
//System.out.println(ShowRoom1.name +" "+ ShowRoom1.noofBranches);
System.out.println(show1.showRoomid +" "+show1.loction+" "+show1.contactNo+" "+show1.name);

}

}
