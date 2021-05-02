package com.examania.schdata.entity.ADMIN;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_role_detail", schema = "admin", catalog = "EXAMANIA")
public class UserRoleDetailEntity {
    private long userRoleId;
    private String userRoleDetailGuid;
    private String userGuid;
    private String userRoleGroupGuid;
    private boolean isDefaultRole;
    private Timestamp fromDate;
    private Timestamp toDate;
    private boolean isRecordActive;
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

    @Basic
    @Column(name = "user_role_id", nullable = false)
    public long getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(long userRoleId) {
        this.userRoleId = userRoleId;
    }

    @Id
    @Column(name = "user_role_detail_guid", nullable = false, length = 36)
    public String getUserRoleDetailGuid() {
        return userRoleDetailGuid;
    }

    public void setUserRoleDetailGuid(String userRoleDetailGuid) {
        this.userRoleDetailGuid = userRoleDetailGuid;
    }

    @Basic
    @Column(name = "user_guid", nullable = false, length = 36)
    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Basic
    @Column(name = "user_role_group_guid", nullable = false, length = 36)
    public String getUserRoleGroupGuid() {
        return userRoleGroupGuid;
    }

    public void setUserRoleGroupGuid(String userRoleGroupGuid) {
        this.userRoleGroupGuid = userRoleGroupGuid;
    }

    @Basic
    @Column(name = "is_default_role", nullable = false)
    public boolean isDefaultRole() {
        return isDefaultRole;
    }

    public void setDefaultRole(boolean defaultRole) {
        isDefaultRole = defaultRole;
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
    @Column(name = "is_record_active", nullable = false)
    public boolean isRecordActive() {
        return isRecordActive;
    }

    public void setRecordActive(boolean recordActive) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoleDetailEntity that = (UserRoleDetailEntity) o;

        if (userRoleId != that.userRoleId) return false;
        if (isDefaultRole != that.isDefaultRole) return false;
        if (isRecordActive != that.isRecordActive) return false;
        if (isModified != that.isModified) return false;
        if (userRoleDetailGuid != null ? !userRoleDetailGuid.equals(that.userRoleDetailGuid) : that.userRoleDetailGuid != null)
            return false;
        if (userGuid != null ? !userGuid.equals(that.userGuid) : that.userGuid != null) return false;
        if (userRoleGroupGuid != null ? !userRoleGroupGuid.equals(that.userRoleGroupGuid) : that.userRoleGroupGuid != null)
            return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userRoleId ^ (userRoleId >>> 32));
        result = 31 * result + (userRoleDetailGuid != null ? userRoleDetailGuid.hashCode() : 0);
        result = 31 * result + (userGuid != null ? userGuid.hashCode() : 0);
        result = 31 * result + (userRoleGroupGuid != null ? userRoleGroupGuid.hashCode() : 0);
        result = 31 * result + (isDefaultRole ? 1 : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (isRecordActive ? 1 : 0);
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
        return result;
    }
}
