package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScoreExample() {
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

        public Criteria andScore_idIsNull() {
            addCriterion("score_id is null");
            return (Criteria) this;
        }

        public Criteria andScore_idIsNotNull() {
            addCriterion("score_id is not null");
            return (Criteria) this;
        }

        public Criteria andScore_idEqualTo(Integer value) {
            addCriterion("score_id =", value, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idNotEqualTo(Integer value) {
            addCriterion("score_id <>", value, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idGreaterThan(Integer value) {
            addCriterion("score_id >", value, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("score_id >=", value, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idLessThan(Integer value) {
            addCriterion("score_id <", value, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idLessThanOrEqualTo(Integer value) {
            addCriterion("score_id <=", value, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idIn(List<Integer> values) {
            addCriterion("score_id in", values, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idNotIn(List<Integer> values) {
            addCriterion("score_id not in", values, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idBetween(Integer value1, Integer value2) {
            addCriterion("score_id between", value1, value2, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_idNotBetween(Integer value1, Integer value2) {
            addCriterion("score_id not between", value1, value2, "score_id");
            return (Criteria) this;
        }

        public Criteria andScore_regularIsNull() {
            addCriterion("score_regular is null");
            return (Criteria) this;
        }

        public Criteria andScore_regularIsNotNull() {
            addCriterion("score_regular is not null");
            return (Criteria) this;
        }

        public Criteria andScore_regularEqualTo(String value) {
            addCriterion("score_regular =", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularNotEqualTo(String value) {
            addCriterion("score_regular <>", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularGreaterThan(String value) {
            addCriterion("score_regular >", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularGreaterThanOrEqualTo(String value) {
            addCriterion("score_regular >=", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularLessThan(String value) {
            addCriterion("score_regular <", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularLessThanOrEqualTo(String value) {
            addCriterion("score_regular <=", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularLike(String value) {
            addCriterion("score_regular like", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularNotLike(String value) {
            addCriterion("score_regular not like", value, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularIn(List<String> values) {
            addCriterion("score_regular in", values, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularNotIn(List<String> values) {
            addCriterion("score_regular not in", values, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularBetween(String value1, String value2) {
            addCriterion("score_regular between", value1, value2, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_regularNotBetween(String value1, String value2) {
            addCriterion("score_regular not between", value1, value2, "score_regular");
            return (Criteria) this;
        }

        public Criteria andScore_experimentIsNull() {
            addCriterion("score_experiment is null");
            return (Criteria) this;
        }

        public Criteria andScore_experimentIsNotNull() {
            addCriterion("score_experiment is not null");
            return (Criteria) this;
        }

        public Criteria andScore_experimentEqualTo(String value) {
            addCriterion("score_experiment =", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentNotEqualTo(String value) {
            addCriterion("score_experiment <>", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentGreaterThan(String value) {
            addCriterion("score_experiment >", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentGreaterThanOrEqualTo(String value) {
            addCriterion("score_experiment >=", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentLessThan(String value) {
            addCriterion("score_experiment <", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentLessThanOrEqualTo(String value) {
            addCriterion("score_experiment <=", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentLike(String value) {
            addCriterion("score_experiment like", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentNotLike(String value) {
            addCriterion("score_experiment not like", value, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentIn(List<String> values) {
            addCriterion("score_experiment in", values, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentNotIn(List<String> values) {
            addCriterion("score_experiment not in", values, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentBetween(String value1, String value2) {
            addCriterion("score_experiment between", value1, value2, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_experimentNotBetween(String value1, String value2) {
            addCriterion("score_experiment not between", value1, value2, "score_experiment");
            return (Criteria) this;
        }

        public Criteria andScore_totalIsNull() {
            addCriterion("score_total is null");
            return (Criteria) this;
        }

        public Criteria andScore_totalIsNotNull() {
            addCriterion("score_total is not null");
            return (Criteria) this;
        }

        public Criteria andScore_totalEqualTo(String value) {
            addCriterion("score_total =", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalNotEqualTo(String value) {
            addCriterion("score_total <>", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalGreaterThan(String value) {
            addCriterion("score_total >", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalGreaterThanOrEqualTo(String value) {
            addCriterion("score_total >=", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalLessThan(String value) {
            addCriterion("score_total <", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalLessThanOrEqualTo(String value) {
            addCriterion("score_total <=", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalLike(String value) {
            addCriterion("score_total like", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalNotLike(String value) {
            addCriterion("score_total not like", value, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalIn(List<String> values) {
            addCriterion("score_total in", values, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalNotIn(List<String> values) {
            addCriterion("score_total not in", values, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalBetween(String value1, String value2) {
            addCriterion("score_total between", value1, value2, "score_total");
            return (Criteria) this;
        }

        public Criteria andScore_totalNotBetween(String value1, String value2) {
            addCriterion("score_total not between", value1, value2, "score_total");
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