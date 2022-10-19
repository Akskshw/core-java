package dao;

public class Hospitaldto {
		private int ptid;
		private String name;
		private String address;
		private String contactno;
		private String referredby;
		private String consulting;
		private String roomno;
		private String alternatecontact;
		
		public int getId() {
			return ptid;
		}
		public void setId(int ptid) {
			this.ptid = ptid;
		}
		public String getPaitentName() {
			return name;
		}
		public void setPaitentName(String name) {
			this.name = name;
		}
	
		public String getRoomno() {
			return roomno;
		}
		public void setRoomNo(String roomno) {
			this.roomno = roomno;
		}
		public String getPaitentPhone() {
			return contactno;
		}
		public void setPaitentPhone(String contactno) {
			this.contactno = contactno;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getDoctorName() {
			return referredby;
		}
		public void setDoctorName(String referredby) {
			this.referredby = referredby;
		}
		public String getHosiptalName() {
			return consulting;
		}
		public void setHosiptalName(String consulting) {
			this.consulting = consulting;
		}
		public String getHosiptalAddress() {
			return alternatecontact;
		}
		public void setHosiptalAddress(String alternatecontact) {
			this.alternatecontact = alternatecontact;
		}
		
}

