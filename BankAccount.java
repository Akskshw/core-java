 class BankAcctount{
 double amount;
 void deposite(double amt)
 {
 amount=amount+amt;
 System.out.println("amount to be deposite"+"  "+amt); 
 }
 void withDraw(double amt)
 {
 amount=amount-amt;
 System.out.println("amount to be withdraw"+"  "+amt);
 }
 double getTotalamount()
 {
	System.out.println("Total amount"+" "+amount);
	return amount;
 }
 public void  transaction(double amount,BankAcctount other)
 {
	 withDraw(amount);
	 other.deposite(amount);
 }
 }