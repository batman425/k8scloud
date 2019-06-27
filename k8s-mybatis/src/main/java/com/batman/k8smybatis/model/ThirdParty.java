package com.batman.k8smybatis.model;

import java.io.Serializable;
import java.util.Date;

/**
 * create by :src  2019/6/25
 *
 * @mbg.generated
 */
public class ThirdParty implements Serializable {
    private Integer id;

    /**
     * 编号
     *
     * @mbg.generated
     */
    private String thirdPartyCode;

    /**
     * 名称
     *
     * @mbg.generated
     */
    private String thirdPartyName;

    /**
     * 类型(1保险公司，2外包公司)
     *
     * @mbg.generated
     */
    private Integer thirdPartyType;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * 创建者
     *
     * @mbg.generated
     */
    private Integer createOperator;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * 修改者
     *
     * @mbg.generated
     */
    private Integer updateOperator;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThirdPartyCode() {
        return thirdPartyCode;
    }

    public void setThirdPartyCode(String thirdPartyCode) {
        this.thirdPartyCode = thirdPartyCode;
    }

    public String getThirdPartyName() {
        return thirdPartyName;
    }

    public void setThirdPartyName(String thirdPartyName) {
        this.thirdPartyName = thirdPartyName;
    }

    public Integer getThirdPartyType() {
        return thirdPartyType;
    }

    public void setThirdPartyType(Integer thirdPartyType) {
        this.thirdPartyType = thirdPartyType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(Integer createOperator) {
        this.createOperator = createOperator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(Integer updateOperator) {
        this.updateOperator = updateOperator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", thirdPartyCode=").append(thirdPartyCode);
        sb.append(", thirdPartyName=").append(thirdPartyName);
        sb.append(", thirdPartyType=").append(thirdPartyType);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", createOperator=").append(createOperator);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateOperator=").append(updateOperator);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ThirdParty other = (ThirdParty) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getThirdPartyCode() == null ? other.getThirdPartyCode() == null : this.getThirdPartyCode().equals(other.getThirdPartyCode()))
            && (this.getThirdPartyName() == null ? other.getThirdPartyName() == null : this.getThirdPartyName().equals(other.getThirdPartyName()))
            && (this.getThirdPartyType() == null ? other.getThirdPartyType() == null : this.getThirdPartyType().equals(other.getThirdPartyType()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateOperator() == null ? other.getCreateOperator() == null : this.getCreateOperator().equals(other.getCreateOperator()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateOperator() == null ? other.getUpdateOperator() == null : this.getUpdateOperator().equals(other.getUpdateOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getThirdPartyCode() == null) ? 0 : getThirdPartyCode().hashCode());
        result = prime * result + ((getThirdPartyName() == null) ? 0 : getThirdPartyName().hashCode());
        result = prime * result + ((getThirdPartyType() == null) ? 0 : getThirdPartyType().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateOperator() == null) ? 0 : getCreateOperator().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateOperator() == null) ? 0 : getUpdateOperator().hashCode());
        return result;
    }
}