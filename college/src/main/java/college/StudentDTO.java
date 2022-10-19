package college;

import javax.persistence.Entity;
import javax.persistence.*;



@Entity
@Table(name="student")

public class StudentDTO {

	
		@Id
		@GeneratedValue
		private int s_id;
		public int getS_id() {
			return s_id;
		}
		public void setS_id(int s_id) {
			this.s_id = s_id;
		}
		public String getS_name() {
			return s_name;
		}
		public void setS_name(String s_name) {
			this.s_name = s_name;
		}
		public String getS_address() {
			return s_address;
		}
		public void setS_address(String s_address) {
			this.s_address = s_address;
		}
		public CollegeDTO getCollege() {
			return college;
		}
		public void setCollege(CollegeDTO college) {
			this.college = college;
		}
		private String s_name;
		private String s_address;
		@ManyToOne
		private CollegeDTO college;
		
		

	}

