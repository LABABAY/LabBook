package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeacherExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeacherExample() {
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

        public Criteria andTeacher_nameIsNull() {
            addCriterion("teacher_name is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIsNotNull() {
            addCriterion("teacher_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameEqualTo(String value) {
            addCriterion("teacher_name =", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotEqualTo(String value) {
            addCriterion("teacher_name <>", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameGreaterThan(String value) {
            addCriterion("teacher_name >", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_name >=", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLessThan(String value) {
            addCriterion("teacher_name <", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLessThanOrEqualTo(String value) {
            addCriterion("teacher_name <=", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameLike(String value) {
            addCriterion("teacher_name like", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotLike(String value) {
            addCriterion("teacher_name not like", value, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameIn(List<String> values) {
            addCriterion("teacher_name in", values, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotIn(List<String> values) {
            addCriterion("teacher_name not in", values, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameBetween(String value1, String value2) {
            addCriterion("teacher_name between", value1, value2, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_nameNotBetween(String value1, String value2) {
            addCriterion("teacher_name not between", value1, value2, "teacher_name");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexIsNull() {
            addCriterion("teacher_sex is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexIsNotNull() {
            addCriterion("teacher_sex is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexEqualTo(String value) {
            addCriterion("teacher_sex =", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexNotEqualTo(String value) {
            addCriterion("teacher_sex <>", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexGreaterThan(String value) {
            addCriterion("teacher_sex >", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_sex >=", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexLessThan(String value) {
            addCriterion("teacher_sex <", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexLessThanOrEqualTo(String value) {
            addCriterion("teacher_sex <=", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexLike(String value) {
            addCriterion("teacher_sex like", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexNotLike(String value) {
            addCriterion("teacher_sex not like", value, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexIn(List<String> values) {
            addCriterion("teacher_sex in", values, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexNotIn(List<String> values) {
            addCriterion("teacher_sex not in", values, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexBetween(String value1, String value2) {
            addCriterion("teacher_sex between", value1, value2, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_sexNotBetween(String value1, String value2) {
            addCriterion("teacher_sex not between", value1, value2, "teacher_sex");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleIsNull() {
            addCriterion("teacher_title is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleIsNotNull() {
            addCriterion("teacher_title is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleEqualTo(String value) {
            addCriterion("teacher_title =", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleNotEqualTo(String value) {
            addCriterion("teacher_title <>", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleGreaterThan(String value) {
            addCriterion("teacher_title >", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_title >=", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleLessThan(String value) {
            addCriterion("teacher_title <", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleLessThanOrEqualTo(String value) {
            addCriterion("teacher_title <=", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleLike(String value) {
            addCriterion("teacher_title like", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleNotLike(String value) {
            addCriterion("teacher_title not like", value, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleIn(List<String> values) {
            addCriterion("teacher_title in", values, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleNotIn(List<String> values) {
            addCriterion("teacher_title not in", values, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleBetween(String value1, String value2) {
            addCriterion("teacher_title between", value1, value2, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_titleNotBetween(String value1, String value2) {
            addCriterion("teacher_title not between", value1, value2, "teacher_title");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageIsNull() {
            addCriterion("teacher_image is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageIsNotNull() {
            addCriterion("teacher_image is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageEqualTo(String value) {
            addCriterion("teacher_image =", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageNotEqualTo(String value) {
            addCriterion("teacher_image <>", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageGreaterThan(String value) {
            addCriterion("teacher_image >", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_image >=", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageLessThan(String value) {
            addCriterion("teacher_image <", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageLessThanOrEqualTo(String value) {
            addCriterion("teacher_image <=", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageLike(String value) {
            addCriterion("teacher_image like", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageNotLike(String value) {
            addCriterion("teacher_image not like", value, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageIn(List<String> values) {
            addCriterion("teacher_image in", values, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageNotIn(List<String> values) {
            addCriterion("teacher_image not in", values, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageBetween(String value1, String value2) {
            addCriterion("teacher_image between", value1, value2, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_imageNotBetween(String value1, String value2) {
            addCriterion("teacher_image not between", value1, value2, "teacher_image");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneIsNull() {
            addCriterion("teacher_telphone is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneIsNotNull() {
            addCriterion("teacher_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneEqualTo(String value) {
            addCriterion("teacher_telphone =", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneNotEqualTo(String value) {
            addCriterion("teacher_telphone <>", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneGreaterThan(String value) {
            addCriterion("teacher_telphone >", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_telphone >=", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneLessThan(String value) {
            addCriterion("teacher_telphone <", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneLessThanOrEqualTo(String value) {
            addCriterion("teacher_telphone <=", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneLike(String value) {
            addCriterion("teacher_telphone like", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneNotLike(String value) {
            addCriterion("teacher_telphone not like", value, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneIn(List<String> values) {
            addCriterion("teacher_telphone in", values, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneNotIn(List<String> values) {
            addCriterion("teacher_telphone not in", values, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneBetween(String value1, String value2) {
            addCriterion("teacher_telphone between", value1, value2, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_telphoneNotBetween(String value1, String value2) {
            addCriterion("teacher_telphone not between", value1, value2, "teacher_telphone");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailIsNull() {
            addCriterion("teacher_email is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailIsNotNull() {
            addCriterion("teacher_email is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailEqualTo(String value) {
            addCriterion("teacher_email =", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailNotEqualTo(String value) {
            addCriterion("teacher_email <>", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailGreaterThan(String value) {
            addCriterion("teacher_email >", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_email >=", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailLessThan(String value) {
            addCriterion("teacher_email <", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailLessThanOrEqualTo(String value) {
            addCriterion("teacher_email <=", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailLike(String value) {
            addCriterion("teacher_email like", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailNotLike(String value) {
            addCriterion("teacher_email not like", value, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailIn(List<String> values) {
            addCriterion("teacher_email in", values, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailNotIn(List<String> values) {
            addCriterion("teacher_email not in", values, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailBetween(String value1, String value2) {
            addCriterion("teacher_email between", value1, value2, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_emailNotBetween(String value1, String value2) {
            addCriterion("teacher_email not between", value1, value2, "teacher_email");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionIsNull() {
            addCriterion("teacher_introduction is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionIsNotNull() {
            addCriterion("teacher_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionEqualTo(String value) {
            addCriterion("teacher_introduction =", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionNotEqualTo(String value) {
            addCriterion("teacher_introduction <>", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionGreaterThan(String value) {
            addCriterion("teacher_introduction >", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_introduction >=", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionLessThan(String value) {
            addCriterion("teacher_introduction <", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionLessThanOrEqualTo(String value) {
            addCriterion("teacher_introduction <=", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionLike(String value) {
            addCriterion("teacher_introduction like", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionNotLike(String value) {
            addCriterion("teacher_introduction not like", value, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionIn(List<String> values) {
            addCriterion("teacher_introduction in", values, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionNotIn(List<String> values) {
            addCriterion("teacher_introduction not in", values, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionBetween(String value1, String value2) {
            addCriterion("teacher_introduction between", value1, value2, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_introductionNotBetween(String value1, String value2) {
            addCriterion("teacher_introduction not between", value1, value2, "teacher_introduction");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountIsNull() {
            addCriterion("teacher_account is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountIsNotNull() {
            addCriterion("teacher_account is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountEqualTo(String value) {
            addCriterion("teacher_account =", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotEqualTo(String value) {
            addCriterion("teacher_account <>", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountGreaterThan(String value) {
            addCriterion("teacher_account >", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_account >=", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountLessThan(String value) {
            addCriterion("teacher_account <", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountLessThanOrEqualTo(String value) {
            addCriterion("teacher_account <=", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountLike(String value) {
            addCriterion("teacher_account like", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotLike(String value) {
            addCriterion("teacher_account not like", value, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountIn(List<String> values) {
            addCriterion("teacher_account in", values, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotIn(List<String> values) {
            addCriterion("teacher_account not in", values, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountBetween(String value1, String value2) {
            addCriterion("teacher_account between", value1, value2, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_accountNotBetween(String value1, String value2) {
            addCriterion("teacher_account not between", value1, value2, "teacher_account");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordIsNull() {
            addCriterion("teacher_password is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordIsNotNull() {
            addCriterion("teacher_password is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordEqualTo(String value) {
            addCriterion("teacher_password =", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordNotEqualTo(String value) {
            addCriterion("teacher_password <>", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordGreaterThan(String value) {
            addCriterion("teacher_password >", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("teacher_password >=", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordLessThan(String value) {
            addCriterion("teacher_password <", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordLessThanOrEqualTo(String value) {
            addCriterion("teacher_password <=", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordLike(String value) {
            addCriterion("teacher_password like", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordNotLike(String value) {
            addCriterion("teacher_password not like", value, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordIn(List<String> values) {
            addCriterion("teacher_password in", values, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordNotIn(List<String> values) {
            addCriterion("teacher_password not in", values, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordBetween(String value1, String value2) {
            addCriterion("teacher_password between", value1, value2, "teacher_password");
            return (Criteria) this;
        }

        public Criteria andTeacher_passwordNotBetween(String value1, String value2) {
            addCriterion("teacher_password not between", value1, value2, "teacher_password");
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