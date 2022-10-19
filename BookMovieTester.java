public class BookMovieTester {

static String movies[]	= {"Om","Upendra","Gaalipata","Paramatma","A","Mungarumale"};
static String  snackName[] ={"Popcorn","VadaPav","Pizza","Samosa"};
public static void main(String a[])
{
	
BookMyMovie bookMyShow = new BookMyMovie(movies,snackName,600);
bookMyShow.showTime(2,"Galipata","Drushya");
bookMyShow.snacks(2,"VadaPav","Drushya");
}
	
	
}