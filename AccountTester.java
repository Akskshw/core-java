class AccountTesterDTO{
public static void main(String a[])
{
SavingsAcc sa=new SavingsAcc(0.23);
sa.deposite(500);
sa.deposite(5000);
sa.withDraw(1000);
double amount= sa.getTotalamount();
SavingsAcc other=new SavingsAcc(0.3);
other.transaction(1000,other);
double balanceAmount=other.getTotalamount();
System.out.println("Balance Amount Is"+"  "+balanceAmount);
}}