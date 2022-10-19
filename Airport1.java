public class Airport1{
	 
	 TerminalDTO[] dtos;
	 int index;
	 
	 public Airport1(int size){
		 dtos = new TerminalDTO[size];
		 System.out.println("Airport constructor is invoked");
	 }
	 
	 public boolean createTerminal(TerminalDTO dto){
		 System.out.println("Creating Terminal");
		 boolean terminalAdd = false;
		 if(dto != null && dto.getAirportName() != null){
			 this.dtos[index++] = dto;                        // 
			 terminalAdd = true;
			 System.out.println("Recorded sucessfully ........");
		}
		 else{
			 System.out.println("something went wroung......check it once ");
		 }
		 return terminalAdd;
	   }
	   
	   public void getTerminalDetails(){
		   System.out.println("inside getTerminalDetails() ");
		   for(int i=0 ; i<dtos.length ; i++){
			   System.out.println(dtos[i].getId() +"/"+ dtos[i].getType() +"/"+ dtos[i].getAirportName() +"/"+ dtos[i].getLocation() +"/"+ dtos[i].getNumOfEntry());
		   }
	   }
	 
 }