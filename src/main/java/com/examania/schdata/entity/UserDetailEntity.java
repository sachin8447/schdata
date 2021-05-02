package com.examania.schdata.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_detail", schema = "admin", catalog = "EXAMANIA")
public class UserDetailEntity {
    private long userId;
    private String userGuid;
    private String loginId;
    private String pwd;
    private String ldapUniqueId;
    private boolean isBlocked;
    private Timestamp fromDate;
    private Timestamp toDate;
    private Boolean isRecordActive;
    private String createdByGuid;
    private Timestamp createdDate;
    private String createrIp;
    private String createrMacId;
    private String createrRemarks;
    private String modifiedByGuid;
    private Timestamp modifiedDate;
    private boolean isModified;
    private String modifierIp;
    private String modifierMacId;
    private String modiferRemarks;
    private String salt;

    @Basic
    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "user_guid", nullable = false, length = 36)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "login_id", nullable = true, length = -1)
    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Basic
    @Column(name = "pwd", nullable = true, length = -1)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "ldap_unique_id", nullable = true, length = -1)
    public String getLdapUniqueId() {
        return ldapUniqueId;
    }

    public void setLdapUniqueId(String ldapUniqueId) {
        this.ldapUniqueId = ldapUniqueId;
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
    @Column(name = "from_date", nullable = false)
    public Timestamp getFromDate() {
        return fromDate;
    }

    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    @Basic
    @Column(name = "to_date", nullable = true)
    public Timestamp getToDate() {
        return toDate;
    }

    public void setToDate(Timestamp toDate) {
        this.toDate = toDate;
    }

    @Basic
    @Column(name = "is_record_active", nullable = true)
    public Boolean getRecordActive() {
        return isRecordActive;
    }

    public void setRecordActive(Boolean recordActive) {
        isRecordActive = recordActive;
    }

    @Basic
    @Column(name = "created_by_guid", nullable = true, length = 36)
    public String getCreatedByGuid() {
        return createdByGuid;
    }

    public void setCreatedByGuid(String createdByGuid) {
        this.createdByGuid = createdByGuid;
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
    @Column(name = "creater_ip", nullable = true, length = 85)
    public String getCreaterIp() {
        return createrIp;
    }

    public void setCreaterIp(String createrIp) {
        this.createrIp = createrIp;
    }

    @Basic
    @Column(name = "creater_mac_id", nullable = true, length = 60)
    public String getCreaterMacId() {
        return createrMacId;
    }

    public void setCreaterMacId(String createrMacId) {
        this.createrMacId = createrMacId;
    }

    @Basic
    @Column(name = "creater_remarks", nullable = true, length = -1)
    public String getCreaterRemarks() {
        return createrRemarks;
    }

    public void setCreaterRemarks(String createrRemarks) {
        this.createrRemarks = createrRemarks;
    }

    @Basic
    @Column(name = "modified_by_guid", nullable = true, length = 36)
    public String getModifiedByGuid() {
        return modifiedByGuid;
    }

    public void setModifiedByGuid(String modifiedByGuid) {
        this.modifiedByGuid = modifiedByGuid;
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
    @Column(name = "is_modified", nullable = false)
    public boolean isModified() {
        return isModified;
    }

    public void setModified(boolean modified) {
        isModified = modified;
    }

    @Basic
    @Column(name = "modifier_ip", nullable = true, length = 85)
    public String getModifierIp() {
        return modifierIp;
    }

    public void setModifierIp(String modifierIp) {
        this.modifierIp = modifierIp;
    }

    @Basic
    @Column(name = "modifier_mac_id", nullable = true, length = 60)
    public String getModifierMacId() {
        return modifierMacId;
    }

    public void setModifierMacId(String modifierMacId) {
        this.modifierMacId = modifierMacId;
    }

    @Basic
    @Column(name = "modifer_remarks", nullable = true, length = -1)
    public String getModiferRemarks() {
        return modiferRemarks;
    }

    public void setModiferRemarks(String modiferRemarks) {
        this.modiferRemarks = modiferRemarks;
    }

    @Basic
    @Column(name = "salt", nullable = true, length = -1)
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserDetailEntity that = (UserDetailEntity) o;

        if (userId != that.userId) return false;
        if (isBlocked != that.isBlocked) return false;
        if (isModified != that.isModified) return false;
        if (userGuid != null ? !userGuid.equals(that.userGuid) : that.userGuid != null) return false;
        if (loginId != null ? !loginId.equals(that.loginId) : that.loginId != null) return false;
        if (pwd != null ? !pwd.equals(that.pwd) : that.pwd != null) return false;
        if (ldapUniqueId != null ? !ldapUniqueId.equals(that.ldapUniqueId) : that.ldapUniqueId != null) return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
        if (isRecordActive != null ? !isRecordActive.equals(that.isRecordActive) : that.isRecordActive != null)
            return false;
        if (createdByGuid != null ? !createdByGuid.equals(that.createdByGuid) : that.createdByGuid != null)
            return false;
        if (createdDate != null ? !createdDate.equals(that.createdDate) : that.createdDate != null) return false;
        if (createrIp != null ? !createrIp.equals(that.createrIp) : that.createrIp != null) return false;
        if (createrMacId != null ? !createrMacId.equals(that.createrMacId) : that.createrMacId != null) return false;
        if (createrRemarks != null ? !createrRemarks.equals(that.createrRemarks) : that.createrRemarks != null)
            return false;
        if (modifiedByGuid != null ? !modifiedByGuid.equals(that.modifiedByGuid) : that.modifiedByGuid != null)
            return false;
        if (modifiedDate != null ? !modifiedDate.equals(that.modifiedDate) : that.modifiedDate != null) return false;
        if (modifierIp != null ? !modifierIp.equals(that.modifierIp) : that.modifierIp != null) return false;
        if (modifierMacId != null ? !modifierMacId.equals(that.modifierMacId) : that.modifierMacId != null)
            return false;
        if (modiferRemarks != null ? !modiferRemarks.equals(that.modiferRemarks) : that.modiferRemarks != null)
            return false;
        if (salt != null ? !salt.equals(that.salt) : that.salt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userId ^ (userId >>> 32));
        result = 31 * result + (userGuid != null ? userGuid.hashCode() : 0);
        result = 31 * result + (loginId != null ? loginId.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (ldapUniqueId != null ? ldapUniqueId.hashCode() : 0);
        result = 31 * result + (isBlocked ? 1 : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (isRecordActive != null ? isRecordActive.hashCode() : 0);
        result = 31 * result + (createdByGuid != null ? createdByGuid.hashCode() : 0);
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (createrIp != null ? createrIp.hashCode() : 0);
        result = 31 * result + (createrMacId != null ? createrMacId.hashCode() : 0);
        result = 31 * result + (createrRemarks != null ? createrRemarks.hashCode() : 0);
        result = 31 * result + (modifiedByGuid != null ? modifiedByGuid.hashCode() : 0);
        result = 31 * result + (modifiedDate != null ? modifiedDate.hashCode() : 0);
        result = 31 * result + (isModified ? 1 : 0);
        result = 31 * result + (modifierIp != null ? modifierIp.hashCode() : 0);
        result = 31 * result + (modifierMacId != null ? modifierMacId.hashCode() : 0);
        result = 31 * result + (modiferRemarks != null ? modiferRemarks.hashCode() : 0);
        result = 31 * result + (salt != null ? salt.hashCode() : 0);
        return result;
    }
}
