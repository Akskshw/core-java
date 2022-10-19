import java.util.Scanner;

public class Airport1Tester{
	
	public static void main (String []a){
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Number of Terminals..... : " );
		int size = scan.nextInt();
		
		Airport1 air = new Airport1(size);
		for(int i=0 ; i<size ; i++){
			System.out.print("Enter ID Num.....: " );
			int id = scan.nextInt();
			System.out.print("Airport Type.... : ");
			String type = scan.next();
			System.out.print("Airport Name..... : " );
			String airportName = scan.next();
			System.out.print("Location.... : " );
			String location = scan.next();
			System.out.print("Number of Entrys.... : " );
			int numOfEntry = scan.nextInt();
			
			TerminalDTO dto = new TerminalDTO();
			            dto.setId(id);
						dto.setType(type);
						dto.setAirportName(airportName);
						dto.setLocation(location);
						dto.setNumOfEntry(numOfEntry);
						
					    air.createTerminal(dto);
		}
		                air.getTerminalDetails();
	}
}