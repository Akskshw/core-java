class MovieHub{
static String movies[] = { "Charlie 777","VIkram","bb2","pratviraj","KGF2"};
public static void main(String a[])
{
String value=getMovie("Charlie 777");
System.out.println("come will watch movie " +value);
}
public static String getMovie(String movie) 
{
	String movieName=null;
for(int i=0;i<movies.length;i++)
{
if(movies[i] == movie )
{
movieName = movies[i];
}
else
{
	System.out.println(movie + "is not available in the list");
}
}
return movieName;
}

}