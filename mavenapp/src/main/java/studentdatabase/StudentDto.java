package studentdatabase;

public class StudentDto {

		private int studentid;
		private String name;
		private String address;
		private String contactno;
		private String collegeName;
		private String collegeAddress;
		private String clgContact;
	
		
		public int getId() {
			return studentid;
		}
		public void setId(int studentid) {
			this.studentid = studentid;
		}
		public String getStudentName() {
			return name;
		}
		public void setStudentName(String name) {
			this.name = name;
		}
	
		public String getAdress() {
			return address;
		}
		public void setAdress(String address) {
			this.address = address;
		}
		public String getStudentPhone() {
			return contactno;
		}
		public void setStudentPhone(String contactno) {
			this.contactno = contactno;
		}
		public String getcollegeName() {
			return collegeName;
		}
		public void setcollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public String getcollegeAddress() {
			return collegeAddress;
		}
		public void setcollegeAddress(String collegeAddress) {
			this.collegeAddress = collegeAddress;
		}
		public String getclgContact() {
			return clgContact;
		}
		public void setclgContact(String clgContact) {
			this.clgContact = clgContact;
		}
		
}

