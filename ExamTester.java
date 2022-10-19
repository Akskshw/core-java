class ExamTester
{
public static void main(String a[])
{
Exam exam =new Exam(1400);
HallTicket hallticket = new HallTicket("20134233443","0679","Baba","Udupi","Maths");
exam.allow(hallticket);
}

}