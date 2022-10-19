package com.quetionbank;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="Questions")
public class Question {
		@Id
		@GeneratedValue
	private int q_id;
	private String qus;
	@OneToOne (cascade=CascadeType.ALL)			//to map one to one relation in the table
private Answer ans;
	}

