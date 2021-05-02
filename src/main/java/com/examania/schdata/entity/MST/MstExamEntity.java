package com.examania.schdata.entity.MST;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mst_exam", schema = "scdata", catalog = "EXAMANIA")
public class MstExamEntity {
    private long examId;
    private String examGuid;
    private String examCode;
    private String examNameEn;
    private String examNameHi;
    private String examNameRl;
    private String examDescription;
    private String createdBy;
    private Timestamp createdDate;
    private Timestamp startDateTime;
    private Timestamp endDateTime;
    private Timestamp startNoticeDateTime;
    private Timestamp endNoticeDateTime;
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
    @Column(name = "exam_id", nullable = false)
    public long getExamId() {
        return examId;
    }

    public void setExamId(long examId) {
        this.examId = examId;
    }

    @Id
    @Column(name = "exam_guid", nullable = false, length = 36)
    public String getExamGuid() {
        return examGuid;
    }

    public void setExamGuid(String examGuid) {
        this.examGuid = examGuid;
    }

    @Basic
    @Column(name = "exam_code", nullable = false, length = 100)
    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    @Basic
    @Column(name = "exam_name_en", nullable = false, length = -1)
    public String getExamNameEn() {
        return examNameEn;
    }

    public void setExamNameEn(String examNameEn) {
        this.examNameEn = examNameEn;
    }

    @Basic
    @Column(name = "exam_name_hi", nullable = true, length = -1)
    public String getExamNameHi() {
        return examNameHi;
    }

    public void setExamNameHi(String examNameHi) {
        this.examNameHi = examNameHi;
    }

    @Basic
    @Column(name = "exam_name_rl", nullable = true, length = -1)
    public String getExamNameRl() {
        return examNameRl;
    }

    public void setExamNameRl(String examNameRl) {
        this.examNameRl = examNameRl;
    }

    @Basic
    @Column(name = "exam_description", nullable = true, length = -1)
    public String getExamDescription() {
        return examDescription;
    }

    public void setExamDescription(String examDescription) {
        this.examDescription = examDescription;
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
    @Column(name = "start_date_time", nullable = false)
    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    @Basic
    @Column(name = "end_date_time", nullable = false)
    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Basic
    @Column(name = "start_notice_date_time", nullable = false)
    public Timestamp getStartNoticeDateTime() {
        return startNoticeDateTime;
    }

    public void setStartNoticeDateTime(Timestamp startNoticeDateTime) {
        this.startNoticeDateTime = startNoticeDateTime;
    }

    @Basic
    @Column(name = "end_notice_date_time", nullable = false)
    public Timestamp getEndNoticeDateTime() {
        return endNoticeDateTime;
    }

    public void setEndNoticeDateTime(Timestamp endNoticeDateTime) {
        this.endNoticeDateTime = endNoticeDateTime;
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

        MstExamEntity that = (MstExamEntity) o;

        if (examId != that.examId) return false;
        if (isActive != that.isActive) return false;
        if (examGuid != null ? !examGuid.equals(that.examGuid) : that.examGuid != null) return false;
        if (examCode != null ? !examCode.equals(that.examCode) : that.examCode != null) return false;
        if (examNameEn != null ? !examNameEn.equals(that.examNameEn) : that.examNameEn != null) return false;
        if (examNameHi != null ? !examNameHi.equals(that.examNameHi) : that.examNameHi != null) return false;
        if (examNameRl != null ? !examNameRl.equals(that.examNameRl) : that.examNameRl != null) return false;
        if (examDescription != null ? !examDescription.equals(that.examDescription) : that.examDescription != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (startDateTime != null ? !startDateTime.equals(that.startDateTime) : that.startDateTime != null)
            return false;
        if (endDateTime != null ? !endDateTime.equals(that.endDateTime) : that.endDateTime != null) return false;
        if (startNoticeDateTime != null ? !startNoticeDateTime.equals(that.startNoticeDateTime) : that.startNoticeDateTime != null)
            return false;
        if (endNoticeDateTime != null ? !endNoticeDateTime.equals(that.endNoticeDateTime) : that.endNoticeDateTime != null)
            return false;
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
        int result = (int) (examId ^ (examId >>> 32));
        result = 31 * result + (examGuid != null ? examGuid.hashCode() : 0);
        result = 31 * result + (examCode != null ? examCode.hashCode() : 0);
        result = 31 * result + (examNameEn != null ? examNameEn.hashCode() : 0);
        result = 31 * result + (examNameHi != null ? examNameHi.hashCode() : 0);
        result = 31 * result + (examNameRl != null ? examNameRl.hashCode() : 0);
        result = 31 * result + (examDescription != null ? examDescription.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (startDateTime != null ? startDateTime.hashCode() : 0);
        result = 31 * result + (endDateTime != null ? endDateTime.hashCode() : 0);
        result = 31 * result + (startNoticeDateTime != null ? startNoticeDateTime.hashCode() : 0);
        result = 31 * result + (endNoticeDateTime != null ? endNoticeDateTime.hashCode() : 0);
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
