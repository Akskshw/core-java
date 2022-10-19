package dto;

import javax.persistence.*;

@Entity
@Table(name="player")
public class Player {
	@Id
	@GeneratedValue
	private  int pid;
	private String name;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	private int age;
	@OneToOne(cascade=CascadeType.ALL) 
	private Country country;
	private long salary;
	@OneToOne (cascade =CascadeType.ALL)
	private Team team;
	
	

}
