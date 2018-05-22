package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookExample() {
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

        public Criteria andTeacher_idIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_idEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_idIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_idEqualTo(Integer value) {
            addCriterion("admin_id =", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idLessThan(Integer value) {
            addCriterion("admin_id <", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idIn(List<Integer> values) {
            addCriterion("admin_id in", values, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "admin_id");
            return (Criteria) this;
        }

        public Criteria andAdmin_idNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "admin_id");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleIsNull() {
            addCriterion("book_project_title is null");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleIsNotNull() {
            addCriterion("book_project_title is not null");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleEqualTo(String value) {
            addCriterion("book_project_title =", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleNotEqualTo(String value) {
            addCriterion("book_project_title <>", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleGreaterThan(String value) {
            addCriterion("book_project_title >", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleGreaterThanOrEqualTo(String value) {
            addCriterion("book_project_title >=", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleLessThan(String value) {
            addCriterion("book_project_title <", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleLessThanOrEqualTo(String value) {
            addCriterion("book_project_title <=", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleLike(String value) {
            addCriterion("book_project_title like", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleNotLike(String value) {
            addCriterion("book_project_title not like", value, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleIn(List<String> values) {
            addCriterion("book_project_title in", values, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleNotIn(List<String> values) {
            addCriterion("book_project_title not in", values, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleBetween(String value1, String value2) {
            addCriterion("book_project_title between", value1, value2, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_titleNotBetween(String value1, String value2) {
            addCriterion("book_project_title not between", value1, value2, "book_project_title");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailIsNull() {
            addCriterion("book_project_detail is null");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailIsNotNull() {
            addCriterion("book_project_detail is not null");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailEqualTo(String value) {
            addCriterion("book_project_detail =", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailNotEqualTo(String value) {
            addCriterion("book_project_detail <>", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailGreaterThan(String value) {
            addCriterion("book_project_detail >", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailGreaterThanOrEqualTo(String value) {
            addCriterion("book_project_detail >=", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailLessThan(String value) {
            addCriterion("book_project_detail <", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailLessThanOrEqualTo(String value) {
            addCriterion("book_project_detail <=", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailLike(String value) {
            addCriterion("book_project_detail like", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailNotLike(String value) {
            addCriterion("book_project_detail not like", value, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailIn(List<String> values) {
            addCriterion("book_project_detail in", values, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailNotIn(List<String> values) {
            addCriterion("book_project_detail not in", values, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailBetween(String value1, String value2) {
            addCriterion("book_project_detail between", value1, value2, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_project_detailNotBetween(String value1, String value2) {
            addCriterion("book_project_detail not between", value1, value2, "book_project_detail");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateIsNull() {
            addCriterion("book_experiment_date is null");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateIsNotNull() {
            addCriterion("book_experiment_date is not null");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateEqualTo(Date value) {
            addCriterion("book_experiment_date =", value, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateNotEqualTo(Date value) {
            addCriterion("book_experiment_date <>", value, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateGreaterThan(Date value) {
            addCriterion("book_experiment_date >", value, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("book_experiment_date >=", value, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateLessThan(Date value) {
            addCriterion("book_experiment_date <", value, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateLessThanOrEqualTo(Date value) {
            addCriterion("book_experiment_date <=", value, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateIn(List<Date> values) {
            addCriterion("book_experiment_date in", values, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateNotIn(List<Date> values) {
            addCriterion("book_experiment_date not in", values, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateBetween(Date value1, Date value2) {
            addCriterion("book_experiment_date between", value1, value2, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_experiment_dateNotBetween(Date value1, Date value2) {
            addCriterion("book_experiment_date not between", value1, value2, "book_experiment_date");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberIsNull() {
            addCriterion("book_human_number is null");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberIsNotNull() {
            addCriterion("book_human_number is not null");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberEqualTo(String value) {
            addCriterion("book_human_number =", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberNotEqualTo(String value) {
            addCriterion("book_human_number <>", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberGreaterThan(String value) {
            addCriterion("book_human_number >", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberGreaterThanOrEqualTo(String value) {
            addCriterion("book_human_number >=", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberLessThan(String value) {
            addCriterion("book_human_number <", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberLessThanOrEqualTo(String value) {
            addCriterion("book_human_number <=", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberLike(String value) {
            addCriterion("book_human_number like", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberNotLike(String value) {
            addCriterion("book_human_number not like", value, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberIn(List<String> values) {
            addCriterion("book_human_number in", values, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberNotIn(List<String> values) {
            addCriterion("book_human_number not in", values, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberBetween(String value1, String value2) {
            addCriterion("book_human_number between", value1, value2, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_human_numberNotBetween(String value1, String value2) {
            addCriterion("book_human_number not between", value1, value2, "book_human_number");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyIsNull() {
            addCriterion("book_teacher_verify is null");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyIsNotNull() {
            addCriterion("book_teacher_verify is not null");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyEqualTo(String value) {
            addCriterion("book_teacher_verify =", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyNotEqualTo(String value) {
            addCriterion("book_teacher_verify <>", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyGreaterThan(String value) {
            addCriterion("book_teacher_verify >", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyGreaterThanOrEqualTo(String value) {
            addCriterion("book_teacher_verify >=", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyLessThan(String value) {
            addCriterion("book_teacher_verify <", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyLessThanOrEqualTo(String value) {
            addCriterion("book_teacher_verify <=", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyLike(String value) {
            addCriterion("book_teacher_verify like", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyNotLike(String value) {
            addCriterion("book_teacher_verify not like", value, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyIn(List<String> values) {
            addCriterion("book_teacher_verify in", values, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyNotIn(List<String> values) {
            addCriterion("book_teacher_verify not in", values, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyBetween(String value1, String value2) {
            addCriterion("book_teacher_verify between", value1, value2, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_teacher_verifyNotBetween(String value1, String value2) {
            addCriterion("book_teacher_verify not between", value1, value2, "book_teacher_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyIsNull() {
            addCriterion("book_admin_verify is null");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyIsNotNull() {
            addCriterion("book_admin_verify is not null");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyEqualTo(String value) {
            addCriterion("book_admin_verify =", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyNotEqualTo(String value) {
            addCriterion("book_admin_verify <>", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyGreaterThan(String value) {
            addCriterion("book_admin_verify >", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyGreaterThanOrEqualTo(String value) {
            addCriterion("book_admin_verify >=", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyLessThan(String value) {
            addCriterion("book_admin_verify <", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyLessThanOrEqualTo(String value) {
            addCriterion("book_admin_verify <=", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyLike(String value) {
            addCriterion("book_admin_verify like", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyNotLike(String value) {
            addCriterion("book_admin_verify not like", value, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyIn(List<String> values) {
            addCriterion("book_admin_verify in", values, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyNotIn(List<String> values) {
            addCriterion("book_admin_verify not in", values, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyBetween(String value1, String value2) {
            addCriterion("book_admin_verify between", value1, value2, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_admin_verifyNotBetween(String value1, String value2) {
            addCriterion("book_admin_verify not between", value1, value2, "book_admin_verify");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreIsNull() {
            addCriterion("book_report_score is null");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreIsNotNull() {
            addCriterion("book_report_score is not null");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreEqualTo(String value) {
            addCriterion("book_report_score =", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreNotEqualTo(String value) {
            addCriterion("book_report_score <>", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreGreaterThan(String value) {
            addCriterion("book_report_score >", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreGreaterThanOrEqualTo(String value) {
            addCriterion("book_report_score >=", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreLessThan(String value) {
            addCriterion("book_report_score <", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreLessThanOrEqualTo(String value) {
            addCriterion("book_report_score <=", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreLike(String value) {
            addCriterion("book_report_score like", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreNotLike(String value) {
            addCriterion("book_report_score not like", value, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreIn(List<String> values) {
            addCriterion("book_report_score in", values, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreNotIn(List<String> values) {
            addCriterion("book_report_score not in", values, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreBetween(String value1, String value2) {
            addCriterion("book_report_score between", value1, value2, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_report_scoreNotBetween(String value1, String value2) {
            addCriterion("book_report_score not between", value1, value2, "book_report_score");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordIsNull() {
            addCriterion("book_enter_password is null");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordIsNotNull() {
            addCriterion("book_enter_password is not null");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordEqualTo(String value) {
            addCriterion("book_enter_password =", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordNotEqualTo(String value) {
            addCriterion("book_enter_password <>", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordGreaterThan(String value) {
            addCriterion("book_enter_password >", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("book_enter_password >=", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordLessThan(String value) {
            addCriterion("book_enter_password <", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordLessThanOrEqualTo(String value) {
            addCriterion("book_enter_password <=", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordLike(String value) {
            addCriterion("book_enter_password like", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordNotLike(String value) {
            addCriterion("book_enter_password not like", value, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordIn(List<String> values) {
            addCriterion("book_enter_password in", values, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordNotIn(List<String> values) {
            addCriterion("book_enter_password not in", values, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordBetween(String value1, String value2) {
            addCriterion("book_enter_password between", value1, value2, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_passwordNotBetween(String value1, String value2) {
            addCriterion("book_enter_password not between", value1, value2, "book_enter_password");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateIsNull() {
            addCriterion("book_enter_date is null");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateIsNotNull() {
            addCriterion("book_enter_date is not null");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateEqualTo(Date value) {
            addCriterion("book_enter_date =", value, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateNotEqualTo(Date value) {
            addCriterion("book_enter_date <>", value, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateGreaterThan(Date value) {
            addCriterion("book_enter_date >", value, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("book_enter_date >=", value, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateLessThan(Date value) {
            addCriterion("book_enter_date <", value, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateLessThanOrEqualTo(Date value) {
            addCriterion("book_enter_date <=", value, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateIn(List<Date> values) {
            addCriterion("book_enter_date in", values, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateNotIn(List<Date> values) {
            addCriterion("book_enter_date not in", values, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateBetween(Date value1, Date value2) {
            addCriterion("book_enter_date between", value1, value2, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_enter_dateNotBetween(Date value1, Date value2) {
            addCriterion("book_enter_date not between", value1, value2, "book_enter_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateIsNull() {
            addCriterion("book_leave_date is null");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateIsNotNull() {
            addCriterion("book_leave_date is not null");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateEqualTo(Date value) {
            addCriterion("book_leave_date =", value, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateNotEqualTo(Date value) {
            addCriterion("book_leave_date <>", value, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateGreaterThan(Date value) {
            addCriterion("book_leave_date >", value, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("book_leave_date >=", value, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateLessThan(Date value) {
            addCriterion("book_leave_date <", value, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateLessThanOrEqualTo(Date value) {
            addCriterion("book_leave_date <=", value, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateIn(List<Date> values) {
            addCriterion("book_leave_date in", values, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateNotIn(List<Date> values) {
            addCriterion("book_leave_date not in", values, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateBetween(Date value1, Date value2) {
            addCriterion("book_leave_date between", value1, value2, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_leave_dateNotBetween(Date value1, Date value2) {
            addCriterion("book_leave_date not between", value1, value2, "book_leave_date");
            return (Criteria) this;
        }

        public Criteria andBook_confirmIsNull() {
            addCriterion("book_confirm is null");
            return (Criteria) this;
        }

        public Criteria andBook_confirmIsNotNull() {
            addCriterion("book_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andBook_confirmEqualTo(Boolean value) {
            addCriterion("book_confirm =", value, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmNotEqualTo(Boolean value) {
            addCriterion("book_confirm <>", value, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmGreaterThan(Boolean value) {
            addCriterion("book_confirm >", value, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmGreaterThanOrEqualTo(Boolean value) {
            addCriterion("book_confirm >=", value, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmLessThan(Boolean value) {
            addCriterion("book_confirm <", value, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmLessThanOrEqualTo(Boolean value) {
            addCriterion("book_confirm <=", value, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmIn(List<Boolean> values) {
            addCriterion("book_confirm in", values, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmNotIn(List<Boolean> values) {
            addCriterion("book_confirm not in", values, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmBetween(Boolean value1, Boolean value2) {
            addCriterion("book_confirm between", value1, value2, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_confirmNotBetween(Boolean value1, Boolean value2) {
            addCriterion("book_confirm not between", value1, value2, "book_confirm");
            return (Criteria) this;
        }

        public Criteria andBook_statusIsNull() {
            addCriterion("book_status is null");
            return (Criteria) this;
        }

        public Criteria andBook_statusIsNotNull() {
            addCriterion("book_status is not null");
            return (Criteria) this;
        }

        public Criteria andBook_statusEqualTo(String value) {
            addCriterion("book_status =", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusNotEqualTo(String value) {
            addCriterion("book_status <>", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusGreaterThan(String value) {
            addCriterion("book_status >", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusGreaterThanOrEqualTo(String value) {
            addCriterion("book_status >=", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusLessThan(String value) {
            addCriterion("book_status <", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusLessThanOrEqualTo(String value) {
            addCriterion("book_status <=", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusLike(String value) {
            addCriterion("book_status like", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusNotLike(String value) {
            addCriterion("book_status not like", value, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusIn(List<String> values) {
            addCriterion("book_status in", values, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusNotIn(List<String> values) {
            addCriterion("book_status not in", values, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusBetween(String value1, String value2) {
            addCriterion("book_status between", value1, value2, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_statusNotBetween(String value1, String value2) {
            addCriterion("book_status not between", value1, value2, "book_status");
            return (Criteria) this;
        }

        public Criteria andBook_guideIsNull() {
            addCriterion("book_guide is null");
            return (Criteria) this;
        }

        public Criteria andBook_guideIsNotNull() {
            addCriterion("book_guide is not null");
            return (Criteria) this;
        }

        public Criteria andBook_guideEqualTo(String value) {
            addCriterion("book_guide =", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideNotEqualTo(String value) {
            addCriterion("book_guide <>", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideGreaterThan(String value) {
            addCriterion("book_guide >", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideGreaterThanOrEqualTo(String value) {
            addCriterion("book_guide >=", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideLessThan(String value) {
            addCriterion("book_guide <", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideLessThanOrEqualTo(String value) {
            addCriterion("book_guide <=", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideLike(String value) {
            addCriterion("book_guide like", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideNotLike(String value) {
            addCriterion("book_guide not like", value, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideIn(List<String> values) {
            addCriterion("book_guide in", values, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideNotIn(List<String> values) {
            addCriterion("book_guide not in", values, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideBetween(String value1, String value2) {
            addCriterion("book_guide between", value1, value2, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_guideNotBetween(String value1, String value2) {
            addCriterion("book_guide not between", value1, value2, "book_guide");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskIsNull() {
            addCriterion("book_report_task is null");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskIsNotNull() {
            addCriterion("book_report_task is not null");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskEqualTo(String value) {
            addCriterion("book_report_task =", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskNotEqualTo(String value) {
            addCriterion("book_report_task <>", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskGreaterThan(String value) {
            addCriterion("book_report_task >", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskGreaterThanOrEqualTo(String value) {
            addCriterion("book_report_task >=", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskLessThan(String value) {
            addCriterion("book_report_task <", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskLessThanOrEqualTo(String value) {
            addCriterion("book_report_task <=", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskLike(String value) {
            addCriterion("book_report_task like", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskNotLike(String value) {
            addCriterion("book_report_task not like", value, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskIn(List<String> values) {
            addCriterion("book_report_task in", values, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskNotIn(List<String> values) {
            addCriterion("book_report_task not in", values, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskBetween(String value1, String value2) {
            addCriterion("book_report_task between", value1, value2, "book_report_task");
            return (Criteria) this;
        }

        public Criteria andBook_report_taskNotBetween(String value1, String value2) {
            addCriterion("book_report_task not between", value1, value2, "book_report_task");
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