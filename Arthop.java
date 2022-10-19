class Operators
{

public static void main(String a[])
{
int addi=add(14,15);
int subs=sub(47,33);
double divs=div(80,44);
float multip=multi(46,77);
System.out.println(addi);
System.out.println(subs);
System.out.println(multip);
System.out.println(divs);

public static int add(int a,int b)
{
return a+b;
}
public static int sub(int c ,int d)
{
 return c-d;
}

public static int multi(int e, int f)
{
return e*f;	
}
public static int div(int g, int h)
{
return g/h;	
}

}