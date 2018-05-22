package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.List;

public class DataRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataRecordExample() {
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

        public Criteria andData_record_idIsNull() {
            addCriterion("data_record_id is null");
            return (Criteria) this;
        }

        public Criteria andData_record_idIsNotNull() {
            addCriterion("data_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andData_record_idEqualTo(Integer value) {
            addCriterion("data_record_id =", value, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idNotEqualTo(Integer value) {
            addCriterion("data_record_id <>", value, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idGreaterThan(Integer value) {
            addCriterion("data_record_id >", value, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_record_id >=", value, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idLessThan(Integer value) {
            addCriterion("data_record_id <", value, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idLessThanOrEqualTo(Integer value) {
            addCriterion("data_record_id <=", value, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idIn(List<Integer> values) {
            addCriterion("data_record_id in", values, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idNotIn(List<Integer> values) {
            addCriterion("data_record_id not in", values, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idBetween(Integer value1, Integer value2) {
            addCriterion("data_record_id between", value1, value2, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andData_record_idNotBetween(Integer value1, Integer value2) {
            addCriterion("data_record_id not between", value1, value2, "data_record_id");
            return (Criteria) this;
        }

        public Criteria andBook_idIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBook_idIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBook_idEqualTo(Integer value) {
            addCriterion("book_id =", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idGreaterThan(Integer value) {
            addCriterion("book_id >", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idLessThan(Integer value) {
            addCriterion("book_id <", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idIn(List<Integer> values) {
            addCriterion("book_id in", values, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "book_id");
            return (Criteria) this;
        }

        public Criteria andBook_idNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "book_id");
            return (Criteria) this;
        }

        public Criteria andData_record_itemIsNull() {
            addCriterion("data_record_item is null");
            return (Criteria) this;
        }

        public Criteria andData_record_itemIsNotNull() {
            addCriterion("data_record_item is not null");
            return (Criteria) this;
        }

        public Criteria andData_record_itemEqualTo(String value) {
            addCriterion("data_record_item =", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemNotEqualTo(String value) {
            addCriterion("data_record_item <>", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemGreaterThan(String value) {
            addCriterion("data_record_item >", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemGreaterThanOrEqualTo(String value) {
            addCriterion("data_record_item >=", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemLessThan(String value) {
            addCriterion("data_record_item <", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemLessThanOrEqualTo(String value) {
            addCriterion("data_record_item <=", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemLike(String value) {
            addCriterion("data_record_item like", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemNotLike(String value) {
            addCriterion("data_record_item not like", value, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemIn(List<String> values) {
            addCriterion("data_record_item in", values, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemNotIn(List<String> values) {
            addCriterion("data_record_item not in", values, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemBetween(String value1, String value2) {
            addCriterion("data_record_item between", value1, value2, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_itemNotBetween(String value1, String value2) {
            addCriterion("data_record_item not between", value1, value2, "data_record_item");
            return (Criteria) this;
        }

        public Criteria andData_record_valueIsNull() {
            addCriterion("data_record_value is null");
            return (Criteria) this;
        }

        public Criteria andData_record_valueIsNotNull() {
            addCriterion("data_record_value is not null");
            return (Criteria) this;
        }

        public Criteria andData_record_valueEqualTo(String value) {
            addCriterion("data_record_value =", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueNotEqualTo(String value) {
            addCriterion("data_record_value <>", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueGreaterThan(String value) {
            addCriterion("data_record_value >", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueGreaterThanOrEqualTo(String value) {
            addCriterion("data_record_value >=", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueLessThan(String value) {
            addCriterion("data_record_value <", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueLessThanOrEqualTo(String value) {
            addCriterion("data_record_value <=", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueLike(String value) {
            addCriterion("data_record_value like", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueNotLike(String value) {
            addCriterion("data_record_value not like", value, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueIn(List<String> values) {
            addCriterion("data_record_value in", values, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueNotIn(List<String> values) {
            addCriterion("data_record_value not in", values, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueBetween(String value1, String value2) {
            addCriterion("data_record_value between", value1, value2, "data_record_value");
            return (Criteria) this;
        }

        public Criteria andData_record_valueNotBetween(String value1, String value2) {
            addCriterion("data_record_value not between", value1, value2, "data_record_value");
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