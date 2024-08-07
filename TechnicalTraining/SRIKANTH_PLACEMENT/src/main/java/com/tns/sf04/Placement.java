package com.tns.sf04;
import jakarta.persistence.*;


@Entity
@Table(name="placement_details")
public class Placement {
	@Id
	private Integer id;
	private String name;
	private String date;
	private String qualification;
	private Integer year;
	
	public Placement() {
		
	}
	
	public Placement(Integer id, String name, String date, String qualification, Integer year) {
		this.id = id;
		this.name = name;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", date=" + date + ", qualification=" + qualification
				+ ", year=" + year + "]";
	}
	
	
}
