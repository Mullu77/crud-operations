package in.ashokit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserAccount {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String fullNme;
	private String Email;
	private long mobileNo;
	private String gender;
	private LocalDate dob;
	private Long ssn;
	private String activesw ="y";
	
    @CreationTimestamp
	private LocalDate createdDate;
    //auto generation
    @UpdateTimestamp
	private LocalDate updatedDate;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getActivesw() {
		return activesw;
	}
	public void setActivesw(String activesw) {
		this.activesw = activesw;
	}
	public LocalDate getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "UserAccounts [userId=" + userId + ", fullName=" + fullName + ", Email=" + Email + ", mobileNo="
				+ mobileNo + ", gender=" + gender + ", dob=" + dob + ", ssn=" + ssn + ", activesw=" + activesw
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
    
   
	
	

}
