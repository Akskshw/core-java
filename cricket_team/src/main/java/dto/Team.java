package dto;

import javax.persistence.*;

@Entity
@Table(name="team")
public class Team {
@Id
@GeneratedValue
private int tid;
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
private String tname;
}
