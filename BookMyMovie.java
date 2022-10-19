public class BookMyMovie {

 String movies[];
int noOfTickets;
static int ticketPrice=200;
 static int totalNoOfTickets=600;
int totalTicketPrice;
//static boolean snack;
  int totalNoOfSnack =600;
int noOfSnacks;
static int snacksPrice =50;
int totalSnacksAmount;
static String snackName[];

public BookMyMovie(String movies[],String snackName[],int noOfTickets)
{
	System.out.println("Book Movie Object Created");
	this.movies = movies;
	this.snackName= snackName;
	this.noOfTickets= noOfTickets;
}
public int showTime(int noOfTickets , String movieName, String bookedBy)
{
	int totalTicketPrice = 0;
	 System.out.println("No Of Ticket : " +noOfTickets);
	  System.out.println("Movie Name is : " +movieName);
	   System.out.println("Booked By : " +bookedBy);
	
for(int i=0; i<movies.length;i++)
{
	if(  movieName == movies[i])
	{
		if(noOfTickets < totalNoOfTickets)
		{
			totalTicketPrice = noOfTickets * ticketPrice ;
			totalNoOfTickets = totalNoOfTickets-noOfTickets;
		    System.out.println("Remaining no of tickets are : " +totalNoOfTickets);
			System.out.println("Total amount : " +totalTicketPrice);
		}
		else
		{
			System.out.println("Astella tickets ella bro");
		}
		
	}
	else
	{
		System.out.println("Movie not available");
		//break;
	}
	
}	
	
	return totalTicketPrice;
}


public int snacks(int noOfSnacks,String snackie ,String bookedBy )
{
	int totalSnacksAmount = 0;
	 System.out.println("No Of Snacks : " +noOfSnacks);
	  System.out.println("Snack Name is : " +snackie);
	   System.out.println("Booked By : " +bookedBy);
	   
	for(int j=0; j<snackName.length;j++)
	{
		if (snackie == snackName[j])
		{
		if(noOfSnacks < totalNoOfSnack)
		{
			totalSnacksAmount = noOfSnacks * snacksPrice;
			totalNoOfSnack = totalNoOfSnack-noOfSnacks;
			 System.out.println("Remaining no of Snacks  : " +totalNoOfSnack);
			System.out.println("Total amount : " +totalSnacksAmount);
		}
	else
		{
			System.out.println("ashtond snak illa");
		}
		
		}
		else 
		{
			System.out.println("This item is not available");
		}
	}	
	return totalSnacksAmount;
	}
	
}