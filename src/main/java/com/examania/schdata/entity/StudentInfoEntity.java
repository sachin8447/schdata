package com.examania.schdata.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "student_info", schema = "admin", catalog = "EXAMANIA")
public class StudentInfoEntity {
    private long studentInfoId;
    private String studentGuid;
    private String studentRegistrationNumber;
    private Timestamp studentRegistrationDate;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String mobileNumber;
    private String emailId;
    private String fatherName;
    private Date dateOfBirth;
    private Integer age;
    private String ekycData;
    private boolean isEkycVerified;
    private boolean isBlocked;
    private Timestamp blockedDateTime;
    private String blockedReason;
    private boolean isActive;
    private Timestamp deactiveDateTime;
    private String deactiveReason;
    private String createdBy;
    private Timestamp createdDate;
    private String createdIpAddr;
    private String createdMacAddr;
    private String createdRemarks;
    private String modifiedBy;
    private Timestamp modifiedDate;
    private String modifiedIpAddr;
    private String modifiedMacAddr;
    private String modifiedRemarks;
    private String countryCode;
    private String formDataXml;
    private Object formDataJson;

    @Basic
    @Column(name = "student_info_id", nullable = false)
    public long getStudentInfoId() {
        return studentInfoId;
    }

    public void setStudentInfoId(long studentInfoId) {
        this.studentInfoId = studentInfoId;
    }

    @Id
    @Column(name = "student_guid", nullable = false, length = 36)
    public String getStudentGuid() {
        return studentGuid;
    }

    public void setStudentGuid(String studentGuid) {
        this.studentGuid = studentGuid;
    }

    @Basic
    @Column(name = "student_registration_number", nullable = false, length = -1)
    public String getStudentRegistrationNumber() {
        return studentRegistrationNumber;
    }

    public void setStudentRegistrationNumber(String studentRegistrationNumber) {
        this.studentRegistrationNumber = studentRegistrationNumber;
    }

    @Basic
    @Column(name = "student_registration_date", nullable = false)
    public Timestamp getStudentRegistrationDate() {
        return studentRegistrationDate;
    }

    public void setStudentRegistrationDate(Timestamp studentRegistrationDate) {
        this.studentRegistrationDate = studentRegistrationDate;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = -1)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "middle_name", nullable = true, length = -1)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = -1)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "gender", nullable = false, length = -1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "mobile_number", nullable = false, length = 50)
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Basic
    @Column(name = "email_id", nullable = false, length = -1)
    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Basic
    @Column(name = "father_name", nullable = false, length = -1)
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Basic
    @Column(name = "date_of_birth", nullable = true)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Basic
    @Column(name = "age", nullable = true)
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "ekyc_data", nullable = false, length = -1)
    public String getEkycData() {
        return ekycData;
    }

    public void setEkycData(String ekycData) {
        this.ekycData = ekycData;
    }

    @Basic
    @Column(name = "is_ekyc_verified", nullable = false)
    public boolean isEkycVerified() {
        return isEkycVerified;
    }

    public void setEkycVerified(boolean ekycVerified) {
        isEkycVerified = ekycVerified;
    }

    @Basic
    @Column(name = "is_blocked", nullable = false)
    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Basic
    @Column(name = "blocked_date_time", nullable = true)
    public Timestamp getBlockedDateTime() {
        return blockedDateTime;
    }

    public void setBlockedDateTime(Timestamp blockedDateTime) {
        this.blockedDateTime = blockedDateTime;
    }

    @Basic
    @Column(name = "blocked_reason", nullable = true, length = -1)
    public String getBlockedReason() {
        return blockedReason;
    }

    public void setBlockedReason(String blockedReason) {
        this.blockedReason = blockedReason;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "deactive_date_time", nullable = true)
    public Timestamp getDeactiveDateTime() {
        return deactiveDateTime;
    }

    public void setDeactiveDateTime(Timestamp deactiveDateTime) {
        this.deactiveDateTime = deactiveDateTime;
    }

    @Basic
    @Column(name = "deactive_reason", nullable = true, length = -1)
    public String getDeactiveReason() {
        return deactiveReason;
    }

    public void setDeactiveReason(String deactiveReason) {
        this.deactiveReason = deactiveReason;
    }

    @Basic
    @Column(name = "created_by", nullable = false, length = -1)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_date", nullable = false)
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "created_ip_addr", nullable = false, length = -1)
    public String getCreatedIpAddr() {
        return createdIpAddr;
    }

    public void setCreatedIpAddr(String createdIpAddr) {
        this.createdIpAddr = createdIpAddr;
    }

    @Basic
    @Column(name = "created_mac_addr", nullable = true, length = -1)
    public String getCreatedMacAddr() {
        return createdMacAddr;
    }

    public void setCreatedMacAddr(String createdMacAddr) {
        this.createdMacAddr = createdMacAddr;
    }

    @Basic
    @Column(name = "created_remarks", nullable = true, length = -1)
    public String getCreatedRemarks() {
        return createdRemarks;
    }

    public void setCreatedRemarks(String createdRemarks) {
        this.createdRemarks = createdRemarks;
    }

    @Basic
    @Column(name = "modified_by", nullable = true, length = -1)
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Basic
    @Column(name = "modified_date", nullable = true)
    public Timestamp getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Timestamp modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    @Basic
    @Column(name = "modified_ip_addr", nullable = true, length = -1)
    public String getModifiedIpAddr() {
        return modifiedIpAddr;
    }

    public void setModifiedIpAddr(String modifiedIpAddr) {
        this.modifiedIpAddr = modifiedIpAddr;
    }

    @Basic
    @Column(name = "modified_mac_addr", nullable = true, length = -1)
    public String getModifiedMacAddr() {
        return modifiedMacAddr;
    }

    public void setModifiedMacAddr(String modifiedMacAddr) {
        this.modifiedMacAddr = modifiedMacAddr;
    }

    @Basic
    @Column(name = "modified_remarks", nullable = true, length = -1)
    public String getModifiedRemarks() {
        return modifiedRemarks;
    }

    public void setModifiedRemarks(String modifiedRemarks) {
        this.modifiedRemarks = modifiedRemarks;
    }

    @Basic
    @Column(name = "country_code", nullable = true, length = -1)
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "form_data_xml", nullable = true, length = -1)
    public String getFormDataXml() {
        return formDataXml;
    }

    public void setFormDataXml(String formDataXml) {
        this.formDataXml = formDataXml;
    }

    @Basic
    @Column(name = "form_data_json", nullable = true)
    public Object getFormDataJson() {
        return formDataJson;
    }

    public void setFormDataJson(Object formDataJson) {
        this.formDataJson = formDataJson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentInfoEntity that = (StudentInfoEntity) o;

        if (studentInfoId != that.studentInfoId) return false;
        if (isEkycVerified != that.isEkycVerified) return false;
        if (isBlocked != that.isBlocked) return false;
        if (isActive != that.isActive) return false;
        if (studentGuid != null ? !studentGuid.equals(that.studentGuid) : that.studentGuid != null) return false;
        if (studentRegistrationNumber != null ? !studentRegistrationNumber.equals(that.studentRegistrationNumber) : that.studentRegistrationNumber != null)
            return false;
        if (studentRegistrationDate != null ? !studentRegistrationDate.equals(that.studentRegistrationDate) : that.studentRegistrationDate != null)
            return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (middleName != null ? !middleName.equals(that.middleName) : that.middleName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (gender != null ? !gender.equals(that.gender) : that.gender != null) return false;
        if (mobileNumber != null ? !mobileNumber.equals(that.mobileNumber) : that.mobileNumber != null) return false;
        if (emailId != null ? !emailId.equals(that.emailId) : that.emailId != null) return false;
        if (fatherName != null ? !fatherName.equals(that.fatherName) : that.fatherName != null) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(that.dateOfBirth) : that.dateOfBirth != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (ekycData != null ? !ekycData.equals(that.ekycData) : that.ekycData != null) return false;
        if (blockedDateTime != null ? !blockedDateTime.equals(that.blockedDateTime) : that.blockedDateTime != null)
            return false;
        if (blockedReason != null ? !blockedReason.equals(that.blockedReason) : that.blockedReason != null)
            return false;
        if (deactiveDateTime != null ? !deactiveDateTime.equals(that.deactiveDateTime) : that.deactiveDateTime != null)
            return false;
        if (deactiveReason != null ? !deactiveReason.equals(that.deactiveReason) : that.deactiveReason != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdIpAddr != null ? !createdIpAddr.equals(that.createdIpAddr) : that.createdIpAddr != null)
            return false;
        if (createdMacAddr != null ? !createdMacAddr.equals(that.createdMacAddr) : that.createdMacAddr != null)
            return false;
        if (createdRemarks != null ? !createdRemarks.equals(that.createdRemarks) : that.createdRemarks != null)
            return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;
        if (modifiedIpAddr != null ? !modifiedIpAddr.equals(that.modifiedIpAddr) : that.modifiedIpAddr != null)
            return false;
        if (modifiedMacAddr != null ? !modifiedMacAddr.equals(that.modifiedMacAddr) : that.modifiedMacAddr != null)
            return false;
        if (modifiedRemarks != null ? !modifiedRemarks.equals(that.modifiedRemarks) : that.modifiedRemarks != null)
            return false;
        if (countryCode != null ? !countryCode.equals(that.countryCode) : that.countryCode != null) return false;
        if (formDataXml != null ? !formDataXml.equals(that.formDataXml) : that.formDataXml != null) return false;
        if (formDataJson != null ? !formDataJson.equals(that.formDataJson) : that.formDataJson != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (studentInfoId ^ (studentInfoId >>> 32));
        result = 31 * result + (studentGuid != null ? studentGuid.hashCode() : 0);
        result = 31 * result + (studentRegistrationNumber != null ? studentRegistrationNumber.hashCode() : 0);
        result = 31 * result + (studentRegistrationDate != null ? studentRegistrationDate.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + (emailId != null ? emailId.hashCode() : 0);
        result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (ekycData != null ? ekycData.hashCode() : 0);
        result = 31 * result + (isEkycVerified ? 1 : 0);
        result = 31 * result + (isBlocked ? 1 : 0);
        result = 31 * result + (blockedDateTime != null ? blockedDateTime.hashCode() : 0);
        result = 31 * result + (blockedReason != null ? blockedReason.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (deactiveDateTime != null ? deactiveDateTime.hashCode() : 0);
        result = 31 * result + (deactiveReason != null ? deactiveReason.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdIpAddr != null ? createdIpAddr.hashCode() : 0);
        result = 31 * result + (createdMacAddr != null ? createdMacAddr.hashCode() : 0);
        result = 31 * result + (createdRemarks != null ? createdRemarks.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        result = 31 * result + (modifiedIpAddr != null ? modifiedIpAddr.hashCode() : 0);
        result = 31 * result + (modifiedMacAddr != null ? modifiedMacAddr.hashCode() : 0);
        result = 31 * result + (modifiedRemarks != null ? modifiedRemarks.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (formDataXml != null ? formDataXml.hashCode() : 0);
        result = 31 * result + (formDataJson != null ? formDataJson.hashCode() : 0);
        return result;
    }
}
