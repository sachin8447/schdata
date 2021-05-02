package com.examania.schdata.entity.MST;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "mst_question", schema = "scdata", catalog = "EXAMANIA")
public class MstQuestionEntity {
    private long questionId;
    private String questionGuid;
    private String questionCode;
    private String questionDescriptionEn;
    private String questionDescriptionHi;
    private String questionDescriptionRl;
    private String answerDescriptionEn;
    private String answerDescriptionHi;
    private String answerDescriptionRl;
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
    @Column(name = "question_id", nullable = false)
    public long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(long questionId) {
        this.questionId = questionId;
    }

    @Id
    @Column(name = "question_guid", nullable = false, length = 36)
    public String getQuestionGuid() {
        return questionGuid;
    }

    public void setQuestionGuid(String questionGuid) {
        this.questionGuid = questionGuid;
    }

    @Basic
    @Column(name = "question_code", nullable = false, length = 100)
    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    @Basic
    @Column(name = "question_description_en", nullable = false, length = -1)
    public String getQuestionDescriptionEn() {
        return questionDescriptionEn;
    }

    public void setQuestionDescriptionEn(String questionDescriptionEn) {
        this.questionDescriptionEn = questionDescriptionEn;
    }

    @Basic
    @Column(name = "question_description_hi", nullable = true, length = -1)
    public String getQuestionDescriptionHi() {
        return questionDescriptionHi;
    }

    public void setQuestionDescriptionHi(String questionDescriptionHi) {
        this.questionDescriptionHi = questionDescriptionHi;
    }

    @Basic
    @Column(name = "question_description_rl", nullable = true, length = -1)
    public String getQuestionDescriptionRl() {
        return questionDescriptionRl;
    }

    public void setQuestionDescriptionRl(String questionDescriptionRl) {
        this.questionDescriptionRl = questionDescriptionRl;
    }

    @Basic
    @Column(name = "answer_description_en", nullable = true, length = -1)
    public String getAnswerDescriptionEn() {
        return answerDescriptionEn;
    }

    public void setAnswerDescriptionEn(String answerDescriptionEn) {
        this.answerDescriptionEn = answerDescriptionEn;
    }

    @Basic
    @Column(name = "answer_description_hi", nullable = true, length = -1)
    public String getAnswerDescriptionHi() {
        return answerDescriptionHi;
    }

    public void setAnswerDescriptionHi(String answerDescriptionHi) {
        this.answerDescriptionHi = answerDescriptionHi;
    }

    @Basic
    @Column(name = "answer_description_rl", nullable = true, length = -1)
    public String getAnswerDescriptionRl() {
        return answerDescriptionRl;
    }

    public void setAnswerDescriptionRl(String answerDescriptionRl) {
        this.answerDescriptionRl = answerDescriptionRl;
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

        MstQuestionEntity that = (MstQuestionEntity) o;

        if (questionId != that.questionId) return false;
        if (isActive != that.isActive) return false;
        if (questionGuid != null ? !questionGuid.equals(that.questionGuid) : that.questionGuid != null) return false;
        if (questionCode != null ? !questionCode.equals(that.questionCode) : that.questionCode != null) return false;
        if (questionDescriptionEn != null ? !questionDescriptionEn.equals(that.questionDescriptionEn) : that.questionDescriptionEn != null)
            return false;
        if (questionDescriptionHi != null ? !questionDescriptionHi.equals(that.questionDescriptionHi) : that.questionDescriptionHi != null)
            return false;
        if (questionDescriptionRl != null ? !questionDescriptionRl.equals(that.questionDescriptionRl) : that.questionDescriptionRl != null)
            return false;
        if (answerDescriptionEn != null ? !answerDescriptionEn.equals(that.answerDescriptionEn) : that.answerDescriptionEn != null)
            return false;
        if (answerDescriptionHi != null ? !answerDescriptionHi.equals(that.answerDescriptionHi) : that.answerDescriptionHi != null)
            return false;
        if (answerDescriptionRl != null ? !answerDescriptionRl.equals(that.answerDescriptionRl) : that.answerDescriptionRl != null)
            return false;
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
        int result = (int) (questionId ^ (questionId >>> 32));
        result = 31 * result + (questionGuid != null ? questionGuid.hashCode() : 0);
        result = 31 * result + (questionCode != null ? questionCode.hashCode() : 0);
        result = 31 * result + (questionDescriptionEn != null ? questionDescriptionEn.hashCode() : 0);
        result = 31 * result + (questionDescriptionHi != null ? questionDescriptionHi.hashCode() : 0);
        result = 31 * result + (questionDescriptionRl != null ? questionDescriptionRl.hashCode() : 0);
        result = 31 * result + (answerDescriptionEn != null ? answerDescriptionEn.hashCode() : 0);
        result = 31 * result + (answerDescriptionHi != null ? answerDescriptionHi.hashCode() : 0);
        result = 31 * result + (answerDescriptionRl != null ? answerDescriptionRl.hashCode() : 0);
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
