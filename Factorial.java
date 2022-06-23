class Factorial {
public static void main (String a[]){

int factValue = fact (8);
System.out.println(factValue);

}
public static int fact(int factNumber)
{
int f=1;
for(int i=1;i<=factNumber;i++)
{
f=f*i;
}
return f;
}

}