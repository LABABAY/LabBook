package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LabExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andLab_nameIsNull() {
            addCriterion("lab_name is null");
            return (Criteria) this;
        }

        public Criteria andLab_nameIsNotNull() {
            addCriterion("lab_name is not null");
            return (Criteria) this;
        }

        public Criteria andLab_nameEqualTo(String value) {
            addCriterion("lab_name =", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameNotEqualTo(String value) {
            addCriterion("lab_name <>", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameGreaterThan(String value) {
            addCriterion("lab_name >", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameGreaterThanOrEqualTo(String value) {
            addCriterion("lab_name >=", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameLessThan(String value) {
            addCriterion("lab_name <", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameLessThanOrEqualTo(String value) {
            addCriterion("lab_name <=", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameLike(String value) {
            addCriterion("lab_name like", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameNotLike(String value) {
            addCriterion("lab_name not like", value, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameIn(List<String> values) {
            addCriterion("lab_name in", values, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameNotIn(List<String> values) {
            addCriterion("lab_name not in", values, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameBetween(String value1, String value2) {
            addCriterion("lab_name between", value1, value2, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_nameNotBetween(String value1, String value2) {
            addCriterion("lab_name not between", value1, value2, "lab_name");
            return (Criteria) this;
        }

        public Criteria andLab_numberIsNull() {
            addCriterion("lab_number is null");
            return (Criteria) this;
        }

        public Criteria andLab_numberIsNotNull() {
            addCriterion("lab_number is not null");
            return (Criteria) this;
        }

        public Criteria andLab_numberEqualTo(String value) {
            addCriterion("lab_number =", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberNotEqualTo(String value) {
            addCriterion("lab_number <>", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberGreaterThan(String value) {
            addCriterion("lab_number >", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberGreaterThanOrEqualTo(String value) {
            addCriterion("lab_number >=", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberLessThan(String value) {
            addCriterion("lab_number <", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberLessThanOrEqualTo(String value) {
            addCriterion("lab_number <=", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberLike(String value) {
            addCriterion("lab_number like", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberNotLike(String value) {
            addCriterion("lab_number not like", value, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberIn(List<String> values) {
            addCriterion("lab_number in", values, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberNotIn(List<String> values) {
            addCriterion("lab_number not in", values, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberBetween(String value1, String value2) {
            addCriterion("lab_number between", value1, value2, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_numberNotBetween(String value1, String value2) {
            addCriterion("lab_number not between", value1, value2, "lab_number");
            return (Criteria) this;
        }

        public Criteria andLab_openIsNull() {
            addCriterion("lab_open is null");
            return (Criteria) this;
        }

        public Criteria andLab_openIsNotNull() {
            addCriterion("lab_open is not null");
            return (Criteria) this;
        }

        public Criteria andLab_openEqualTo(Boolean value) {
            addCriterion("lab_open =", value, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openNotEqualTo(Boolean value) {
            addCriterion("lab_open <>", value, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openGreaterThan(Boolean value) {
            addCriterion("lab_open >", value, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lab_open >=", value, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openLessThan(Boolean value) {
            addCriterion("lab_open <", value, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openLessThanOrEqualTo(Boolean value) {
            addCriterion("lab_open <=", value, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openIn(List<Boolean> values) {
            addCriterion("lab_open in", values, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openNotIn(List<Boolean> values) {
            addCriterion("lab_open not in", values, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openBetween(Boolean value1, Boolean value2) {
            addCriterion("lab_open between", value1, value2, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_openNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lab_open not between", value1, value2, "lab_open");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeIsNull() {
            addCriterion("lab_open_time is null");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeIsNotNull() {
            addCriterion("lab_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeEqualTo(Date value) {
            addCriterionForJDBCTime("lab_open_time =", value, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeNotEqualTo(Date value) {
            addCriterionForJDBCTime("lab_open_time <>", value, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeGreaterThan(Date value) {
            addCriterionForJDBCTime("lab_open_time >", value, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lab_open_time >=", value, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeLessThan(Date value) {
            addCriterionForJDBCTime("lab_open_time <", value, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("lab_open_time <=", value, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeIn(List<Date> values) {
            addCriterionForJDBCTime("lab_open_time in", values, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeNotIn(List<Date> values) {
            addCriterionForJDBCTime("lab_open_time not in", values, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lab_open_time between", value1, value2, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_open_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("lab_open_time not between", value1, value2, "lab_open_time");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberIsNull() {
            addCriterion("lab_device_number is null");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberIsNotNull() {
            addCriterion("lab_device_number is not null");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberEqualTo(String value) {
            addCriterion("lab_device_number =", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberNotEqualTo(String value) {
            addCriterion("lab_device_number <>", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberGreaterThan(String value) {
            addCriterion("lab_device_number >", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberGreaterThanOrEqualTo(String value) {
            addCriterion("lab_device_number >=", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberLessThan(String value) {
            addCriterion("lab_device_number <", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberLessThanOrEqualTo(String value) {
            addCriterion("lab_device_number <=", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberLike(String value) {
            addCriterion("lab_device_number like", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberNotLike(String value) {
            addCriterion("lab_device_number not like", value, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberIn(List<String> values) {
            addCriterion("lab_device_number in", values, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberNotIn(List<String> values) {
            addCriterion("lab_device_number not in", values, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberBetween(String value1, String value2) {
            addCriterion("lab_device_number between", value1, value2, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_device_numberNotBetween(String value1, String value2) {
            addCriterion("lab_device_number not between", value1, value2, "lab_device_number");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainIsNull() {
            addCriterion("lab_seat_remain is null");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainIsNotNull() {
            addCriterion("lab_seat_remain is not null");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainEqualTo(String value) {
            addCriterion("lab_seat_remain =", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainNotEqualTo(String value) {
            addCriterion("lab_seat_remain <>", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainGreaterThan(String value) {
            addCriterion("lab_seat_remain >", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainGreaterThanOrEqualTo(String value) {
            addCriterion("lab_seat_remain >=", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainLessThan(String value) {
            addCriterion("lab_seat_remain <", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainLessThanOrEqualTo(String value) {
            addCriterion("lab_seat_remain <=", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainLike(String value) {
            addCriterion("lab_seat_remain like", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainNotLike(String value) {
            addCriterion("lab_seat_remain not like", value, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainIn(List<String> values) {
            addCriterion("lab_seat_remain in", values, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainNotIn(List<String> values) {
            addCriterion("lab_seat_remain not in", values, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainBetween(String value1, String value2) {
            addCriterion("lab_seat_remain between", value1, value2, "lab_seat_remain");
            return (Criteria) this;
        }

        public Criteria andLab_seat_remainNotBetween(String value1, String value2) {
            addCriterion("lab_seat_remain not between", value1, value2, "lab_seat_remain");
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