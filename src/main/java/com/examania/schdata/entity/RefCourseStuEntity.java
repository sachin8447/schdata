package com.examania.schdata.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ref_course_stu", schema = "scdata", catalog = "EXAMANIA")
public class RefCourseStuEntity {
    private long refCourseStuId;
    private String refCourseStuGuid;
    private String studentGuid;
    private String courseGuid;
    private String createdBy;
    private Timestamp createdDate;
    private String createdIpAddr;
    private String createdMacAddr;
    private String createdRemarks;
    private String createdUri;
    private String modifiedBy;
    private Timestamp modifiedDate;
    private String modifiedIpAddr;
    private String modifiedMacAddr;
    private String modifiedRemarks;
    private String modifiedUri;
    private boolean isActive;

    @Basic
    @Column(name = "ref_course_stu_id", nullable = false)
    public long getRefCourseStuId() {
        return refCourseStuId;
    }

    public void setRefCourseStuId(long refCourseStuId) {
        this.refCourseStuId = refCourseStuId;
    }

    @Id
    @Column(name = "ref_course_stu_guid", nullable = false, length = 36)
    public String getRefCourseStuGuid() {
        return refCourseStuGuid;
    }

    public void setRefCourseStuGuid(String refCourseStuGuid) {
        this.refCourseStuGuid = refCourseStuGuid;
    }

    @Basic
    @Column(name = "student_guid", nullable = false, length = 36)
    public String getStudentGuid() {
        return studentGuid;
    }

    public void setStudentGuid(String studentGuid) {
        this.studentGuid = studentGuid;
    }

    @Basic
    @Column(name = "course_guid", nullable = false, length = 36)
    public String getCourseGuid() {
        return courseGuid;
    }

    public void setCourseGuid(String courseGuid) {
        this.courseGuid = courseGuid;
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
    @Column(name = "created_uri", nullable = true, length = -1)
    public String getCreatedUri() {
        return createdUri;
    }

    public void setCreatedUri(String createdUri) {
        this.createdUri = createdUri;
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
    @Column(name = "modified_uri", nullable = true, length = -1)
    public String getModifiedUri() {
        return modifiedUri;
    }

    public void setModifiedUri(String modifiedUri) {
        this.modifiedUri = modifiedUri;
    }

    @Basic
    @Column(name = "is_active", nullable = false)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefCourseStuEntity that = (RefCourseStuEntity) o;

        if (refCourseStuId != that.refCourseStuId) return false;
        if (isActive != that.isActive) return false;
        if (refCourseStuGuid != null ? !refCourseStuGuid.equals(that.refCourseStuGuid) : that.refCourseStuGuid != null)
            return false;
        if (studentGuid != null ? !studentGuid.equals(that.studentGuid) : that.studentGuid != null) return false;
        if (courseGuid != null ? !courseGuid.equals(that.courseGuid) : that.courseGuid != null) return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createdIpAddr != null ? !createdIpAddr.equals(that.createdIpAddr) : that.createdIpAddr != null)
            return false;
        if (createdMacAddr != null ? !createdMacAddr.equals(that.createdMacAddr) : that.createdMacAddr != null)
            return false;
        if (createdRemarks != null ? !createdRemarks.equals(that.createdRemarks) : that.createdRemarks != null)
            return false;
        if (createdUri != null ? !createdUri.equals(that.createdUri) : that.createdUri != null) return false;
        if (modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null) return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;
        if (modifiedIpAddr != null ? !modifiedIpAddr.equals(that.modifiedIpAddr) : that.modifiedIpAddr != null)
            return false;
        if (modifiedMacAddr != null ? !modifiedMacAddr.equals(that.modifiedMacAddr) : that.modifiedMacAddr != null)
            return false;
        if (modifiedRemarks != null ? !modifiedRemarks.equals(that.modifiedRemarks) : that.modifiedRemarks != null)
            return false;
        if (modifiedUri != null ? !modifiedUri.equals(that.modifiedUri) : that.modifiedUri != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (refCourseStuId ^ (refCourseStuId >>> 32));
        result = 31 * result + (refCourseStuGuid != null ? refCourseStuGuid.hashCode() : 0);
        result = 31 * result + (studentGuid != null ? studentGuid.hashCode() : 0);
        result = 31 * result + (courseGuid != null ? courseGuid.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createdIpAddr != null ? createdIpAddr.hashCode() : 0);
        result = 31 * result + (createdMacAddr != null ? createdMacAddr.hashCode() : 0);
        result = 31 * result + (createdRemarks != null ? createdRemarks.hashCode() : 0);
        result = 31 * result + (createdUri != null ? createdUri.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        result = 31 * result + (modifiedIpAddr != null ? modifiedIpAddr.hashCode() : 0);
        result = 31 * result + (modifiedMacAddr != null ? modifiedMacAddr.hashCode() : 0);
        result = 31 * result + (modifiedRemarks != null ? modifiedRemarks.hashCode() : 0);
        result = 31 * result + (modifiedUri != null ? modifiedUri.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
