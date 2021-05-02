package com.examania.schdata.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "user_role_group", schema = "admin", catalog = "EXAMANIA")
public class UserRoleGroupEntity {
    private long userRoleGroupId;
    private String userRoleGroupGuid;
    private String userRoleGroupName;
    private String userRoleGroupCode;
    private String userRoleGroupDescription;
    private Timestamp fromDate;
    private Timestamp toDate;
    private boolean isActive;
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

    @Basic
    @Column(name = "user_role_group_id", nullable = false)
    public long getUserRoleGroupId() {
        return userRoleGroupId;
    }

    public void setUserRoleGroupId(long userRoleGroupId) {
        this.userRoleGroupId = userRoleGroupId;
    }

    @Id
    @Column(name = "user_role_group_guid", nullable = false, length = 36)
    public String getUserRoleGroupGuid() {
        return userRoleGroupGuid;
    }

    public void setUserRoleGroupGuid(String userRoleGroupGuid) {
        this.userRoleGroupGuid = userRoleGroupGuid;
    }

    @Basic
    @Column(name = "user_role_group_name", nullable = true, length = -1)
    public String getUserRoleGroupName() {
        return userRoleGroupName;
    }

    public void setUserRoleGroupName(String userRoleGroupName) {
        this.userRoleGroupName = userRoleGroupName;
    }

    @Basic
    @Column(name = "user_role_group_code", nullable = false, length = 50)
    public String getUserRoleGroupCode() {
        return userRoleGroupCode;
    }

    public void setUserRoleGroupCode(String userRoleGroupCode) {
        this.userRoleGroupCode = userRoleGroupCode;
    }

    @Basic
    @Column(name = "user_role_group_description", nullable = true, length = -1)
    public String getUserRoleGroupDescription() {
        return userRoleGroupDescription;
    }

    public void setUserRoleGroupDescription(String userRoleGroupDescription) {
        this.userRoleGroupDescription = userRoleGroupDescription;
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
    @Column(name = "is_active", nullable = false)
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Basic
    @Column(name = "created_by", nullable = true, length = 36)
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
    @Column(name = "created_ip_addr", nullable = true, length = 85)
    public String getCreatedIpAddr() {
        return createdIpAddr;
    }

    public void setCreatedIpAddr(String createdIpAddr) {
        this.createdIpAddr = createdIpAddr;
    }

    @Basic
    @Column(name = "created_mac_addr", nullable = true, length = 60)
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
    @Column(name = "modified_by", nullable = true, length = 36)
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
    @Column(name = "modified_ip_addr", nullable = true, length = 85)
    public String getModifiedIpAddr() {
        return modifiedIpAddr;
    }

    public void setModifiedIpAddr(String modifiedIpAddr) {
        this.modifiedIpAddr = modifiedIpAddr;
    }

    @Basic
    @Column(name = "modified_mac_addr", nullable = true, length = 60)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserRoleGroupEntity that = (UserRoleGroupEntity) o;

        if (userRoleGroupId != that.userRoleGroupId) return false;
        if (isActive != that.isActive) return false;
        if (userRoleGroupGuid != null ? !userRoleGroupGuid.equals(that.userRoleGroupGuid) : that.userRoleGroupGuid != null)
            return false;
        if (userRoleGroupName != null ? !userRoleGroupName.equals(that.userRoleGroupName) : that.userRoleGroupName != null)
            return false;
        if (userRoleGroupCode != null ? !userRoleGroupCode.equals(that.userRoleGroupCode) : that.userRoleGroupCode != null)
            return false;
        if (userRoleGroupDescription != null ? !userRoleGroupDescription.equals(that.userRoleGroupDescription) : that.userRoleGroupDescription != null)
            return false;
        if (fromDate != null ? !fromDate.equals(that.fromDate) : that.fromDate != null) return false;
        if (toDate != null ? !toDate.equals(that.toDate) : that.toDate != null) return false;
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (userRoleGroupId ^ (userRoleGroupId >>> 32));
        result = 31 * result + (userRoleGroupGuid != null ? userRoleGroupGuid.hashCode() : 0);
        result = 31 * result + (userRoleGroupName != null ? userRoleGroupName.hashCode() : 0);
        result = 31 * result + (userRoleGroupCode != null ? userRoleGroupCode.hashCode() : 0);
        result = 31 * result + (userRoleGroupDescription != null ? userRoleGroupDescription.hashCode() : 0);
        result = 31 * result + (fromDate != null ? fromDate.hashCode() : 0);
        result = 31 * result + (toDate != null ? toDate.hashCode() : 0);
        result = 31 * result + (isActive ? 1 : 0);
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
        return result;
    }
}
