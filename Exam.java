class Exam{
HallTicket hallticket; //Has A relation//non static
static String universityName ="VTU"; //static
int fees;
public Exam(int fees){
System.out.println("Exam constructor is called");
this.fees=fees;
}
public boolean allow(HallTicket hallticket)
{
boolean isAllowed=false;
if(this.fees>=1400)
{
if (hallticket !=null )
{
	isAllowed=true;
	System.out.println("ALL THE BEST FOR YOUR EXAM");
	this.hallticket=hallticket;
	this.hallticket.displayDeatails();
	
}
	else{
		System.out.println("hallticket is Required");
}}
	else
	{
		System.out.println("Please pay the fees");
	}
	return isAllowed;
	
}
}