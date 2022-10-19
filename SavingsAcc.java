class SavingsAcc extends BankAcctount{
double interestRate;
public SavingsAcc(double interestRate)
{
this.interestRate=interestRate;
}
public double periodicinterest()
{
	double interest= getTotalamount()*interestRate/100;
	System.out.println("Intrest is "+"  "+interest);
	deposite(interest);
	return interest;
}
}