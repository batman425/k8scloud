package com.batman.k8smybatis.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ThirdPartyExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    private Integer limit;

    private Integer offset;

    public ThirdPartyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeIsNull() {
            addCriterion("third_party_code is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeIsNotNull() {
            addCriterion("third_party_code is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeEqualTo(String value) {
            addCriterion("third_party_code =", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeNotEqualTo(String value) {
            addCriterion("third_party_code <>", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeGreaterThan(String value) {
            addCriterion("third_party_code >", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_code >=", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeLessThan(String value) {
            addCriterion("third_party_code <", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeLessThanOrEqualTo(String value) {
            addCriterion("third_party_code <=", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeLike(String value) {
            addCriterion("third_party_code like", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeNotLike(String value) {
            addCriterion("third_party_code not like", value, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeIn(List<String> values) {
            addCriterion("third_party_code in", values, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeNotIn(List<String> values) {
            addCriterion("third_party_code not in", values, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeBetween(String value1, String value2) {
            addCriterion("third_party_code between", value1, value2, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyCodeNotBetween(String value1, String value2) {
            addCriterion("third_party_code not between", value1, value2, "thirdPartyCode");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameIsNull() {
            addCriterion("third_party_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameIsNotNull() {
            addCriterion("third_party_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameEqualTo(String value) {
            addCriterion("third_party_name =", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotEqualTo(String value) {
            addCriterion("third_party_name <>", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameGreaterThan(String value) {
            addCriterion("third_party_name >", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameGreaterThanOrEqualTo(String value) {
            addCriterion("third_party_name >=", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameLessThan(String value) {
            addCriterion("third_party_name <", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameLessThanOrEqualTo(String value) {
            addCriterion("third_party_name <=", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameLike(String value) {
            addCriterion("third_party_name like", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotLike(String value) {
            addCriterion("third_party_name not like", value, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameIn(List<String> values) {
            addCriterion("third_party_name in", values, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotIn(List<String> values) {
            addCriterion("third_party_name not in", values, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameBetween(String value1, String value2) {
            addCriterion("third_party_name between", value1, value2, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyNameNotBetween(String value1, String value2) {
            addCriterion("third_party_name not between", value1, value2, "thirdPartyName");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeIsNull() {
            addCriterion("third_party_type is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeIsNotNull() {
            addCriterion("third_party_type is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeEqualTo(Integer value) {
            addCriterion("third_party_type =", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotEqualTo(Integer value) {
            addCriterion("third_party_type <>", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeGreaterThan(Integer value) {
            addCriterion("third_party_type >", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_party_type >=", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeLessThan(Integer value) {
            addCriterion("third_party_type <", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("third_party_type <=", value, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeIn(List<Integer> values) {
            addCriterion("third_party_type in", values, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotIn(List<Integer> values) {
            addCriterion("third_party_type not in", values, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeBetween(Integer value1, Integer value2) {
            addCriterion("third_party_type between", value1, value2, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andThirdPartyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("third_party_type not between", value1, value2, "thirdPartyType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNull() {
            addCriterion("create_operator is null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIsNotNull() {
            addCriterion("create_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorEqualTo(Integer value) {
            addCriterion("create_operator =", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotEqualTo(Integer value) {
            addCriterion("create_operator <>", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThan(Integer value) {
            addCriterion("create_operator >", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_operator >=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThan(Integer value) {
            addCriterion("create_operator <", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("create_operator <=", value, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorIn(List<Integer> values) {
            addCriterion("create_operator in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotIn(List<Integer> values) {
            addCriterion("create_operator not in", values, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorBetween(Integer value1, Integer value2) {
            addCriterion("create_operator between", value1, value2, "createOperator");
            return (Criteria) this;
        }

        public Criteria andCreateOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("create_operator not between", value1, value2, "createOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIsNull() {
            addCriterion("update_operator is null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIsNotNull() {
            addCriterion("update_operator is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorEqualTo(Integer value) {
            addCriterion("update_operator =", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotEqualTo(Integer value) {
            addCriterion("update_operator <>", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorGreaterThan(Integer value) {
            addCriterion("update_operator >", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_operator >=", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorLessThan(Integer value) {
            addCriterion("update_operator <", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("update_operator <=", value, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorIn(List<Integer> values) {
            addCriterion("update_operator in", values, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotIn(List<Integer> values) {
            addCriterion("update_operator not in", values, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorBetween(Integer value1, Integer value2) {
            addCriterion("update_operator between", value1, value2, "updateOperator");
            return (Criteria) this;
        }

        public Criteria andUpdateOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("update_operator not between", value1, value2, "updateOperator");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}