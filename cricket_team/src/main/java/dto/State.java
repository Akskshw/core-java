package dto;

import javax.persistence.*;

@Entity
@Table(name="state")
public class State {
@Id
@GeneratedValue
private int sid;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
private String name;

}
