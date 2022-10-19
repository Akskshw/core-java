class Factorial {
public static void main (String a[]){

int factValue = fact (8);
System.out.println(factValue);

}
public static int fact(int factNumber)
{
int f=1;						// //n!/(n-r)! //n!/(n-r)!r!
for(int i=1;i<=factNumber;i++)
{
f=f*i;
}
return f;
}

}