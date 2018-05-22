package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeviceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andDevice_idIsNull() {
            addCriterion("device_id is null");
            return (Criteria) this;
        }

        public Criteria andDevice_idIsNotNull() {
            addCriterion("device_id is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_idEqualTo(Integer value) {
            addCriterion("device_id =", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotEqualTo(Integer value) {
            addCriterion("device_id <>", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idGreaterThan(Integer value) {
            addCriterion("device_id >", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_id >=", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idLessThan(Integer value) {
            addCriterion("device_id <", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idLessThanOrEqualTo(Integer value) {
            addCriterion("device_id <=", value, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idIn(List<Integer> values) {
            addCriterion("device_id in", values, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotIn(List<Integer> values) {
            addCriterion("device_id not in", values, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idBetween(Integer value1, Integer value2) {
            addCriterion("device_id between", value1, value2, "device_id");
            return (Criteria) this;
        }

        public Criteria andDevice_idNotBetween(Integer value1, Integer value2) {
            addCriterion("device_id not between", value1, value2, "device_id");
            return (Criteria) this;
        }

        public Criteria andLab_idIsNull() {
            addCriterion("lab_id is null");
            return (Criteria) this;
        }

        public Criteria andLab_idIsNotNull() {
            addCriterion("lab_id is not null");
            return (Criteria) this;
        }

        public Criteria andLab_idEqualTo(Integer value) {
            addCriterion("lab_id =", value, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idNotEqualTo(Integer value) {
            addCriterion("lab_id <>", value, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idGreaterThan(Integer value) {
            addCriterion("lab_id >", value, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("lab_id >=", value, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idLessThan(Integer value) {
            addCriterion("lab_id <", value, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idLessThanOrEqualTo(Integer value) {
            addCriterion("lab_id <=", value, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idIn(List<Integer> values) {
            addCriterion("lab_id in", values, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idNotIn(List<Integer> values) {
            addCriterion("lab_id not in", values, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idBetween(Integer value1, Integer value2) {
            addCriterion("lab_id between", value1, value2, "lab_id");
            return (Criteria) this;
        }

        public Criteria andLab_idNotBetween(Integer value1, Integer value2) {
            addCriterion("lab_id not between", value1, value2, "lab_id");
            return (Criteria) this;
        }

        public Criteria andDevice_nameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDevice_nameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_nameEqualTo(String value) {
            addCriterion("device_name =", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameGreaterThan(String value) {
            addCriterion("device_name >", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameLessThan(String value) {
            addCriterion("device_name <", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameLike(String value) {
            addCriterion("device_name like", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotLike(String value) {
            addCriterion("device_name not like", value, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameIn(List<String> values) {
            addCriterion("device_name in", values, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_nameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "device_name");
            return (Criteria) this;
        }

        public Criteria andDevice_statusIsNull() {
            addCriterion("device_status is null");
            return (Criteria) this;
        }

        public Criteria andDevice_statusIsNotNull() {
            addCriterion("device_status is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_statusEqualTo(String value) {
            addCriterion("device_status =", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusNotEqualTo(String value) {
            addCriterion("device_status <>", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusGreaterThan(String value) {
            addCriterion("device_status >", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusGreaterThanOrEqualTo(String value) {
            addCriterion("device_status >=", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusLessThan(String value) {
            addCriterion("device_status <", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusLessThanOrEqualTo(String value) {
            addCriterion("device_status <=", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusLike(String value) {
            addCriterion("device_status like", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusNotLike(String value) {
            addCriterion("device_status not like", value, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusIn(List<String> values) {
            addCriterion("device_status in", values, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusNotIn(List<String> values) {
            addCriterion("device_status not in", values, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusBetween(String value1, String value2) {
            addCriterion("device_status between", value1, value2, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_statusNotBetween(String value1, String value2) {
            addCriterion("device_status not between", value1, value2, "device_status");
            return (Criteria) this;
        }

        public Criteria andDevice_priceIsNull() {
            addCriterion("device_price is null");
            return (Criteria) this;
        }

        public Criteria andDevice_priceIsNotNull() {
            addCriterion("device_price is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_priceEqualTo(String value) {
            addCriterion("device_price =", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceNotEqualTo(String value) {
            addCriterion("device_price <>", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceGreaterThan(String value) {
            addCriterion("device_price >", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceGreaterThanOrEqualTo(String value) {
            addCriterion("device_price >=", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceLessThan(String value) {
            addCriterion("device_price <", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceLessThanOrEqualTo(String value) {
            addCriterion("device_price <=", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceLike(String value) {
            addCriterion("device_price like", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceNotLike(String value) {
            addCriterion("device_price not like", value, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceIn(List<String> values) {
            addCriterion("device_price in", values, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceNotIn(List<String> values) {
            addCriterion("device_price not in", values, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceBetween(String value1, String value2) {
            addCriterion("device_price between", value1, value2, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_priceNotBetween(String value1, String value2) {
            addCriterion("device_price not between", value1, value2, "device_price");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateIsNull() {
            addCriterion("device_purchase_date is null");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateIsNotNull() {
            addCriterion("device_purchase_date is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateEqualTo(Date value) {
            addCriterion("device_purchase_date =", value, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateNotEqualTo(Date value) {
            addCriterion("device_purchase_date <>", value, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateGreaterThan(Date value) {
            addCriterion("device_purchase_date >", value, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("device_purchase_date >=", value, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateLessThan(Date value) {
            addCriterion("device_purchase_date <", value, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateLessThanOrEqualTo(Date value) {
            addCriterion("device_purchase_date <=", value, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateIn(List<Date> values) {
            addCriterion("device_purchase_date in", values, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateNotIn(List<Date> values) {
            addCriterion("device_purchase_date not in", values, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateBetween(Date value1, Date value2) {
            addCriterion("device_purchase_date between", value1, value2, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_purchase_dateNotBetween(Date value1, Date value2) {
            addCriterion("device_purchase_date not between", value1, value2, "device_purchase_date");
            return (Criteria) this;
        }

        public Criteria andDevice_openIsNull() {
            addCriterion("device_open is null");
            return (Criteria) this;
        }

        public Criteria andDevice_openIsNotNull() {
            addCriterion("device_open is not null");
            return (Criteria) this;
        }

        public Criteria andDevice_openEqualTo(Boolean value) {
            addCriterion("device_open =", value, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openNotEqualTo(Boolean value) {
            addCriterion("device_open <>", value, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openGreaterThan(Boolean value) {
            addCriterion("device_open >", value, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openGreaterThanOrEqualTo(Boolean value) {
            addCriterion("device_open >=", value, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openLessThan(Boolean value) {
            addCriterion("device_open <", value, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openLessThanOrEqualTo(Boolean value) {
            addCriterion("device_open <=", value, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openIn(List<Boolean> values) {
            addCriterion("device_open in", values, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openNotIn(List<Boolean> values) {
            addCriterion("device_open not in", values, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openBetween(Boolean value1, Boolean value2) {
            addCriterion("device_open between", value1, value2, "device_open");
            return (Criteria) this;
        }

        public Criteria andDevice_openNotBetween(Boolean value1, Boolean value2) {
            addCriterion("device_open not between", value1, value2, "device_open");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
    }
}