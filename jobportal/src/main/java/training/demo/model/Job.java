package training.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Job {
	@Id
	private String JobId;
	private String JobName;
	private Date OfferStart;
	private Date Offerend;
	private long Salaryrange;
	private String JobDescription;
	@OneToOne(cascade=CascadeType.MERGE)
	public String getJobId() {
		return JobId;
	}
	public void setJobId(String jobId) {
		JobId = jobId;
	}
	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public Date getOfferStart() {
		return OfferStart;
	}
	public void setOfferStart(Date offerStart) {
		OfferStart = offerStart;
	}
	public Date getOfferend() {
		return Offerend;
	}
	public void setOfferend(Date offerend) {
		Offerend = offerend;
	}
	public long getSalaryrange() {
		return Salaryrange;
	}
	public void setSalaryrange(long salaryrange) {
		Salaryrange = salaryrange;
	}
	public String getJobDescription() {
		return JobDescription;
	}
	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}
	
	
	
	

}
