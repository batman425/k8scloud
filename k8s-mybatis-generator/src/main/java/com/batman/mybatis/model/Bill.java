package com.batman.mybatis.model;

import com.baomidou.mybatisplus.enums.IdType;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import java.io.Serializable;

/**
 * <p>
 * 账单表
 * </p>
 *
 * @author yux123
 * @since 2019-06-28
 */
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 文件ID
     */
    @TableField("file_id")
    private Integer fileId;
    /**
     * 申请ID
     */
    @TableField("claim_id")
    private Integer claimId;
    /**
     * 序列号
     */
    @TableField("serial_no")
    private String serialNo;
    /**
     * 账单对应案件中的序号
     */
    @TableField("claim_serial_no")
    private String claimSerialNo;
    /**
     * 账单号
     */
    @TableField("bill_no")
    private String billNo;
    /**
     * 账单类型
     */
    @TableField("bill_type")
    private Integer billType;
    /**
     * 是否急诊(Y,N)
     */
    @TableField("mergency_type")
    private String mergencyType;
    /**
     * 是否康复(Y,N)
     */
    @TableField("health_type")
    private String healthType;
    /**
     * 是否特需(Y,N)
     */
    @TableField("vip_type")
    private String vipType;
    /**
     * 就诊日期
     */
    @TableField("treatment_date")
    private Date treatmentDate;
    /**
     * 入院日期
     */
    @TableField("in_hospital_date")
    private Date inHospitalDate;
    /**
     * 出院日期
     */
    @TableField("out_hospital_date")
    private Date outHospitalDate;
    /**
     * 医院编码
     */
    @TableField("hospital_code")
    private String hospitalCode;
    /**
     * 医院名称
     */
    @TableField("hospital_name")
    private String hospitalName;
    /**
     * 科室代码
     */
    @TableField("hospital_dept")
    private Integer hospitalDept;
    /**
     * 科室名称
     */
    @TableField("hospital_dept_name")
    private String hospitalDeptName;
    /**
     * 匹配后的标准代码
     */
    @TableField("match_hospital_code")
    private String matchHospitalCode;
    /**
     * 匹配后的便准名称
     */
    @TableField("match_hospital_name")
    private String matchHospitalName;
    /**
     * 医院匹配状态(1待自动匹配,2待人工匹配,99匹配完成)
     */
    @TableField("match_hospital_status")
    private Integer matchHospitalStatus;
    /**
     * 原疾病代码
     */
    @TableField("diagnose_code")
    private String diagnoseCode;
    /**
     * 原疾病名称
     */
    @TableField("diagnose_name")
    private String diagnoseName;
    /**
     * 疾病匹配代码
     */
    @TableField("match_diagnose_code")
    private String matchDiagnoseCode;
    /**
     * 疾病匹配名称
     */
    @TableField("match_diagnose_name")
    private String matchDiagnoseName;
    /**
     * 诊断匹配状态(1未完成（缺省）,99匹配完成)
     */
    @TableField("match_diagnose_status")
    private Integer matchDiagnoseStatus;
    /**
     * 发票金额
     */
    @TableField("bill_amount")
    private BigDecimal billAmount;
    /**
     * 账单状态
     */
    @TableField("bill_status")
    private Integer billStatus;
    /**
     * 社保支付金额
     */
    @TableField("social_pay_amount")
    private BigDecimal socialPayAmount;
    /**
     * 分类自付金额
     */
    @TableField("class_pay_amount")
    private BigDecimal classPayAmount;
    /**
     * 自费金额
     */
    @TableField("own_pay_amount")
    private BigDecimal ownPayAmount;
    /**
     * 第三方支付金额
     */
    @TableField("third_party_pay_amount")
    private BigDecimal thirdPartyPayAmount;
    /**
     * 他方支付(N 无，Y 有)
     */
    @TableField("is_third_party_pay")
    private String isThirdPartyPay;
    /**
     * 统筹基金支付
     */
    @TableField("fund_pay_amount")
    private BigDecimal fundPayAmount;
    /**
     * 大额互助资金支付（住院）
     */
    @TableField("large_fund_hos_pay_amount")
    private BigDecimal largeFundHosPayAmount;
    /**
     * 统筹基金年度内累计支付
     */
    @TableField("fund_year_total_pay_amount")
    private BigDecimal fundYearTotalPayAmount;
    /**
     * 大额互助资金支付（门诊）-本次支付
     */
    @TableField("large_fund_out_curr_pay_amount")
    private BigDecimal largeFundOutCurrPayAmount;
    /**
     * 大额互助资金支付（门诊）-年度累计
     */
    @TableField("large_fund_out_year_pay_amount")
    private BigDecimal largeFundOutYearPayAmount;
    /**
     * 发票姓名
     */
    @TableField("bill_user_name")
    private String billUserName;
    /**
     * 影像序号
     */
    @TableField("image_file_no")
    private String imageFileNo;
    /**
     * 影像ID
     */
    @TableField("image_file_id")
    private Integer imageFileId;
    /**
     * 账单转人工原因
     */
    @TableField("reason_notes")
    private String reasonNotes;
    /**
     * 备注
     */
    private String remark;
    /**
     * 逻辑删除标志(0否，1逻辑删除)
     */
    @TableField("delete_flag")
    private String deleteFlag;
    /**
     * 创建者
     */
    @TableField("create_operator")
    private Integer createOperator;
    /**
     * 创建时间
     */
    @TableField("create_time")
    private Date createTime;
    /**
     * 修改者
     */
    @TableField("update_operator")
    private Integer updateOperator;
    /**
     * 修改时间
     */
    @TableField("update_time")
    private Date updateTime;
    /**
     * 人工扣费描述
     */
    @TableField("artificial_describe")
    private String artificialDescribe;
    /**
     * 附加支付
     */
    @TableField("extra_pay_amount")
    private BigDecimal extraPayAmount;
    /**
     * 个人账户支付
     */
    @TableField("personal_pay_amount")
    private BigDecimal personalPayAmount;
    /**
     * 起付线
     */
    private BigDecimal deductible;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getClaimId() {
        return claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getClaimSerialNo() {
        return claimSerialNo;
    }

    public void setClaimSerialNo(String claimSerialNo) {
        this.claimSerialNo = claimSerialNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getMergencyType() {
        return mergencyType;
    }

    public void setMergencyType(String mergencyType) {
        this.mergencyType = mergencyType;
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public Date getInHospitalDate() {
        return inHospitalDate;
    }

    public void setInHospitalDate(Date inHospitalDate) {
        this.inHospitalDate = inHospitalDate;
    }

    public Date getOutHospitalDate() {
        return outHospitalDate;
    }

    public void setOutHospitalDate(Date outHospitalDate) {
        this.outHospitalDate = outHospitalDate;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Integer getHospitalDept() {
        return hospitalDept;
    }

    public void setHospitalDept(Integer hospitalDept) {
        this.hospitalDept = hospitalDept;
    }

    public String getHospitalDeptName() {
        return hospitalDeptName;
    }

    public void setHospitalDeptName(String hospitalDeptName) {
        this.hospitalDeptName = hospitalDeptName;
    }

    public String getMatchHospitalCode() {
        return matchHospitalCode;
    }

    public void setMatchHospitalCode(String matchHospitalCode) {
        this.matchHospitalCode = matchHospitalCode;
    }

    public String getMatchHospitalName() {
        return matchHospitalName;
    }

    public void setMatchHospitalName(String matchHospitalName) {
        this.matchHospitalName = matchHospitalName;
    }

    public Integer getMatchHospitalStatus() {
        return matchHospitalStatus;
    }

    public void setMatchHospitalStatus(Integer matchHospitalStatus) {
        this.matchHospitalStatus = matchHospitalStatus;
    }

    public String getDiagnoseCode() {
        return diagnoseCode;
    }

    public void setDiagnoseCode(String diagnoseCode) {
        this.diagnoseCode = diagnoseCode;
    }

    public String getDiagnoseName() {
        return diagnoseName;
    }

    public void setDiagnoseName(String diagnoseName) {
        this.diagnoseName = diagnoseName;
    }

    public String getMatchDiagnoseCode() {
        return matchDiagnoseCode;
    }

    public void setMatchDiagnoseCode(String matchDiagnoseCode) {
        this.matchDiagnoseCode = matchDiagnoseCode;
    }

    public String getMatchDiagnoseName() {
        return matchDiagnoseName;
    }

    public void setMatchDiagnoseName(String matchDiagnoseName) {
        this.matchDiagnoseName = matchDiagnoseName;
    }

    public Integer getMatchDiagnoseStatus() {
        return matchDiagnoseStatus;
    }

    public void setMatchDiagnoseStatus(Integer matchDiagnoseStatus) {
        this.matchDiagnoseStatus = matchDiagnoseStatus;
    }

    public BigDecimal getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(BigDecimal billAmount) {
        this.billAmount = billAmount;
    }

    public Integer getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(Integer billStatus) {
        this.billStatus = billStatus;
    }

    public BigDecimal getSocialPayAmount() {
        return socialPayAmount;
    }

    public void setSocialPayAmount(BigDecimal socialPayAmount) {
        this.socialPayAmount = socialPayAmount;
    }

    public BigDecimal getClassPayAmount() {
        return classPayAmount;
    }

    public void setClassPayAmount(BigDecimal classPayAmount) {
        this.classPayAmount = classPayAmount;
    }

    public BigDecimal getOwnPayAmount() {
        return ownPayAmount;
    }

    public void setOwnPayAmount(BigDecimal ownPayAmount) {
        this.ownPayAmount = ownPayAmount;
    }

    public BigDecimal getThirdPartyPayAmount() {
        return thirdPartyPayAmount;
    }

    public void setThirdPartyPayAmount(BigDecimal thirdPartyPayAmount) {
        this.thirdPartyPayAmount = thirdPartyPayAmount;
    }

    public String getIsThirdPartyPay() {
        return isThirdPartyPay;
    }

    public void setIsThirdPartyPay(String isThirdPartyPay) {
        this.isThirdPartyPay = isThirdPartyPay;
    }

    public BigDecimal getFundPayAmount() {
        return fundPayAmount;
    }

    public void setFundPayAmount(BigDecimal fundPayAmount) {
        this.fundPayAmount = fundPayAmount;
    }

    public BigDecimal getLargeFundHosPayAmount() {
        return largeFundHosPayAmount;
    }

    public void setLargeFundHosPayAmount(BigDecimal largeFundHosPayAmount) {
        this.largeFundHosPayAmount = largeFundHosPayAmount;
    }

    public BigDecimal getFundYearTotalPayAmount() {
        return fundYearTotalPayAmount;
    }

    public void setFundYearTotalPayAmount(BigDecimal fundYearTotalPayAmount) {
        this.fundYearTotalPayAmount = fundYearTotalPayAmount;
    }

    public BigDecimal getLargeFundOutCurrPayAmount() {
        return largeFundOutCurrPayAmount;
    }

    public void setLargeFundOutCurrPayAmount(BigDecimal largeFundOutCurrPayAmount) {
        this.largeFundOutCurrPayAmount = largeFundOutCurrPayAmount;
    }

    public BigDecimal getLargeFundOutYearPayAmount() {
        return largeFundOutYearPayAmount;
    }

    public void setLargeFundOutYearPayAmount(BigDecimal largeFundOutYearPayAmount) {
        this.largeFundOutYearPayAmount = largeFundOutYearPayAmount;
    }

    public String getBillUserName() {
        return billUserName;
    }

    public void setBillUserName(String billUserName) {
        this.billUserName = billUserName;
    }

    public String getImageFileNo() {
        return imageFileNo;
    }

    public void setImageFileNo(String imageFileNo) {
        this.imageFileNo = imageFileNo;
    }

    public Integer getImageFileId() {
        return imageFileId;
    }

    public void setImageFileId(Integer imageFileId) {
        this.imageFileId = imageFileId;
    }

    public String getReasonNotes() {
        return reasonNotes;
    }

    public void setReasonNotes(String reasonNotes) {
        this.reasonNotes = reasonNotes;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getCreateOperator() {
        return createOperator;
    }

    public void setCreateOperator(Integer createOperator) {
        this.createOperator = createOperator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateOperator() {
        return updateOperator;
    }

    public void setUpdateOperator(Integer updateOperator) {
        this.updateOperator = updateOperator;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getArtificialDescribe() {
        return artificialDescribe;
    }

    public void setArtificialDescribe(String artificialDescribe) {
        this.artificialDescribe = artificialDescribe;
    }

    public BigDecimal getExtraPayAmount() {
        return extraPayAmount;
    }

    public void setExtraPayAmount(BigDecimal extraPayAmount) {
        this.extraPayAmount = extraPayAmount;
    }

    public BigDecimal getPersonalPayAmount() {
        return personalPayAmount;
    }

    public void setPersonalPayAmount(BigDecimal personalPayAmount) {
        this.personalPayAmount = personalPayAmount;
    }

    public BigDecimal getDeductible() {
        return deductible;
    }

    public void setDeductible(BigDecimal deductible) {
        this.deductible = deductible;
    }

    @Override
    public String toString() {
        return "Bill{" +
        "id=" + id +
        ", fileId=" + fileId +
        ", claimId=" + claimId +
        ", serialNo=" + serialNo +
        ", claimSerialNo=" + claimSerialNo +
        ", billNo=" + billNo +
        ", billType=" + billType +
        ", mergencyType=" + mergencyType +
        ", healthType=" + healthType +
        ", vipType=" + vipType +
        ", treatmentDate=" + treatmentDate +
        ", inHospitalDate=" + inHospitalDate +
        ", outHospitalDate=" + outHospitalDate +
        ", hospitalCode=" + hospitalCode +
        ", hospitalName=" + hospitalName +
        ", hospitalDept=" + hospitalDept +
        ", hospitalDeptName=" + hospitalDeptName +
        ", matchHospitalCode=" + matchHospitalCode +
        ", matchHospitalName=" + matchHospitalName +
        ", matchHospitalStatus=" + matchHospitalStatus +
        ", diagnoseCode=" + diagnoseCode +
        ", diagnoseName=" + diagnoseName +
        ", matchDiagnoseCode=" + matchDiagnoseCode +
        ", matchDiagnoseName=" + matchDiagnoseName +
        ", matchDiagnoseStatus=" + matchDiagnoseStatus +
        ", billAmount=" + billAmount +
        ", billStatus=" + billStatus +
        ", socialPayAmount=" + socialPayAmount +
        ", classPayAmount=" + classPayAmount +
        ", ownPayAmount=" + ownPayAmount +
        ", thirdPartyPayAmount=" + thirdPartyPayAmount +
        ", isThirdPartyPay=" + isThirdPartyPay +
        ", fundPayAmount=" + fundPayAmount +
        ", largeFundHosPayAmount=" + largeFundHosPayAmount +
        ", fundYearTotalPayAmount=" + fundYearTotalPayAmount +
        ", largeFundOutCurrPayAmount=" + largeFundOutCurrPayAmount +
        ", largeFundOutYearPayAmount=" + largeFundOutYearPayAmount +
        ", billUserName=" + billUserName +
        ", imageFileNo=" + imageFileNo +
        ", imageFileId=" + imageFileId +
        ", reasonNotes=" + reasonNotes +
        ", remark=" + remark +
        ", deleteFlag=" + deleteFlag +
        ", createOperator=" + createOperator +
        ", createTime=" + createTime +
        ", updateOperator=" + updateOperator +
        ", updateTime=" + updateTime +
        ", artificialDescribe=" + artificialDescribe +
        ", extraPayAmount=" + extraPayAmount +
        ", personalPayAmount=" + personalPayAmount +
        ", deductible=" + deductible +
        "}";
    }
}
