class ShowRoom {
int showRoomid;
static String name ="WOODLAND";
static int noofBranches =56;

String loction;
long contactNo;
public ShowRoom () {
System.out.println("ShowRoom object is created");
}
public static  void main (String a[])
{
ShowRoom show=new ShowRoom();
show.showRoomid=1;
																//show.name="WOODLAND";
																//show.noofBranches=56;
show.loction="Vijaynagar";
show.contactNo=35353656L;
System.out.println(ShowRoom.name +" "+ ShowRoom.noofBranches);
System.out.println(show.showRoomid +" "+show.loction+" "+show.contactNo);

ShowRoom show1=new ShowRoom();
show1.showRoomid=1;
show1.name="WOODLAND";
show1.noofBranches=56;
show1.loction="RR Nagar";
show1.contactNo=38358656L;
System.out.println(ShowRoom.name +" "+ ShowRoom.noofBranches);
System.out.println(show1.showRoomid +" "+show1.loction+" "+show1.contactNo);

}

}
