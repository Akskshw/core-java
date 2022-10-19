package com.quetionbank;

import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
@Table(name="Answer")

public class Answer {
			@Id
		@GeneratedValue
	private int a_id;
	private String ans;
	}

