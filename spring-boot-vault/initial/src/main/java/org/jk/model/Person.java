package org.jk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "PERSON")
public class Person {
	
	@Id
	@Column(name = "person_id")
	private Long id;
	@Column(name = "person_name")
	private String name;
	@Column(name = "person_role")
	private String role;

}
