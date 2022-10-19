package dto;

import java.util.List;

import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
@Id
@GeneratedValue
private int cid;
private String name;
private String code;
@OneToMany(cascade = CascadeType.ALL)
private List<State> listofstate;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public List<State> getListofstate() {
	return listofstate;
}
public void setListofstate(List<State> listofstate) {
	this.listofstate = listofstate;
}

}
