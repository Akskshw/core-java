class Permutaion {
public static void main (String a[]){

int npr = fact(5)/ fact(5-2);
System.out.println(npr);

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