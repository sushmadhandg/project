package training.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Education")
public class Education {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int EducationId;
	private String qualification;
	private Date passingyear;
	private int CollegeName;
	public int getEducationId() {
		return EducationId;
	}
	public void setEducationId(int educationId) {
		EducationId = educationId;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public Date getPassingyear() {
		return passingyear;
	}
	public void setPassingyear(Date passingyear) {
		this.passingyear = passingyear;
	}
	public int getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(int collegeName) {
		CollegeName = collegeName;
	}
	
	
	

}
