class  HallTicket {
String rollno;
String subjectcode;
String candidateName;
String examcenter;
String subjectName;
public HallTicket(String rollno,String subjectcode,String candidateName,String examcenter,String subjectName){
this.rollno=rollno;
this.subjectcode=subjectcode;
this.candidateName=candidateName;
this.examcenter=examcenter;
this.subjectName=subjectName;
}
public void displayDeatails()
{
	System.out.println("roll no is"+" "+this.rollno);
	System.out.println("subjectcode is"+"   "+this.subjectcode);
	System.out.println("Subject name  is"+ "  "+this.subjectName);
	System.out.println("candidateName is"+ "  " +this.candidateName);
	System.out.println("examcenter is"+ " "+ this.examcenter);
}

}