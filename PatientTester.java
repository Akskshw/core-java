class PatientTester{

   public static void main(String a[]){
     
	 PatientDTO patient = new PatientDTO();
	 patient.setId(1);
	 patient.setName("Raja");
	 patient.setGender(Gender.male);
	 patient.setContactNo(8745962135l);
	 patient.setAddress("Vijayanagar");
	 System.out.println(patient);
	 /*patient.setId(2);
	 int uniqueCode = patient.hashCode();
	 System.out.println("the patient unique code is "+ uniqueCode);*/
	 
	 PatientDTO patient1 = new PatientDTO();
	 patient1.setId(2);
	 patient1.setName("Rani");
	 patient1.setGender(Gender.female);
	 patient1.setContactNo(95874635128l);
	 patient1.setAddress("Jayanagar");
	 System.out.println(patient1);
	/* patient1.setId(2);
	 int uniqueCode1 = patient1.hashCode();
	 System.out.println("the patient unique code is "+ uniqueCode1);*/
   
   }
 }