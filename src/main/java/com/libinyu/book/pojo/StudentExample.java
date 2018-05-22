package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudent_idIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudent_idIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_idEqualTo(Integer value) {
            addCriterion("student_id =", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idGreaterThan(Integer value) {
            addCriterion("student_id >", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLessThan(Integer value) {
            addCriterion("student_id <", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idIn(List<Integer> values) {
            addCriterion("student_id in", values, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "student_id");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutIsNull() {
            addCriterion("student_accout is null");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutIsNotNull() {
            addCriterion("student_accout is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutEqualTo(String value) {
            addCriterion("student_accout =", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutNotEqualTo(String value) {
            addCriterion("student_accout <>", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutGreaterThan(String value) {
            addCriterion("student_accout >", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutGreaterThanOrEqualTo(String value) {
            addCriterion("student_accout >=", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutLessThan(String value) {
            addCriterion("student_accout <", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutLessThanOrEqualTo(String value) {
            addCriterion("student_accout <=", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutLike(String value) {
            addCriterion("student_accout like", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutNotLike(String value) {
            addCriterion("student_accout not like", value, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutIn(List<String> values) {
            addCriterion("student_accout in", values, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutNotIn(List<String> values) {
            addCriterion("student_accout not in", values, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutBetween(String value1, String value2) {
            addCriterion("student_accout between", value1, value2, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_accoutNotBetween(String value1, String value2) {
            addCriterion("student_accout not between", value1, value2, "student_accout");
            return (Criteria) this;
        }

        public Criteria andStudent_nameIsNull() {
            addCriterion("student_name is null");
            return (Criteria) this;
        }

        public Criteria andStudent_nameIsNotNull() {
            addCriterion("student_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_nameEqualTo(String value) {
            addCriterion("student_name =", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotEqualTo(String value) {
            addCriterion("student_name <>", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameGreaterThan(String value) {
            addCriterion("student_name >", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameGreaterThanOrEqualTo(String value) {
            addCriterion("student_name >=", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameLessThan(String value) {
            addCriterion("student_name <", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameLessThanOrEqualTo(String value) {
            addCriterion("student_name <=", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameLike(String value) {
            addCriterion("student_name like", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotLike(String value) {
            addCriterion("student_name not like", value, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameIn(List<String> values) {
            addCriterion("student_name in", values, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotIn(List<String> values) {
            addCriterion("student_name not in", values, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameBetween(String value1, String value2) {
            addCriterion("student_name between", value1, value2, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_nameNotBetween(String value1, String value2) {
            addCriterion("student_name not between", value1, value2, "student_name");
            return (Criteria) this;
        }

        public Criteria andStudent_sexIsNull() {
            addCriterion("student_sex is null");
            return (Criteria) this;
        }

        public Criteria andStudent_sexIsNotNull() {
            addCriterion("student_sex is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_sexEqualTo(String value) {
            addCriterion("student_sex =", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexNotEqualTo(String value) {
            addCriterion("student_sex <>", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexGreaterThan(String value) {
            addCriterion("student_sex >", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexGreaterThanOrEqualTo(String value) {
            addCriterion("student_sex >=", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexLessThan(String value) {
            addCriterion("student_sex <", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexLessThanOrEqualTo(String value) {
            addCriterion("student_sex <=", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexLike(String value) {
            addCriterion("student_sex like", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexNotLike(String value) {
            addCriterion("student_sex not like", value, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexIn(List<String> values) {
            addCriterion("student_sex in", values, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexNotIn(List<String> values) {
            addCriterion("student_sex not in", values, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexBetween(String value1, String value2) {
            addCriterion("student_sex between", value1, value2, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_sexNotBetween(String value1, String value2) {
            addCriterion("student_sex not between", value1, value2, "student_sex");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeIsNull() {
            addCriterion("student_grade is null");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeIsNotNull() {
            addCriterion("student_grade is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeEqualTo(String value) {
            addCriterion("student_grade =", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeNotEqualTo(String value) {
            addCriterion("student_grade <>", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeGreaterThan(String value) {
            addCriterion("student_grade >", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeGreaterThanOrEqualTo(String value) {
            addCriterion("student_grade >=", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeLessThan(String value) {
            addCriterion("student_grade <", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeLessThanOrEqualTo(String value) {
            addCriterion("student_grade <=", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeLike(String value) {
            addCriterion("student_grade like", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeNotLike(String value) {
            addCriterion("student_grade not like", value, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeIn(List<String> values) {
            addCriterion("student_grade in", values, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeNotIn(List<String> values) {
            addCriterion("student_grade not in", values, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeBetween(String value1, String value2) {
            addCriterion("student_grade between", value1, value2, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_gradeNotBetween(String value1, String value2) {
            addCriterion("student_grade not between", value1, value2, "student_grade");
            return (Criteria) this;
        }

        public Criteria andStudent_imageIsNull() {
            addCriterion("student_image is null");
            return (Criteria) this;
        }

        public Criteria andStudent_imageIsNotNull() {
            addCriterion("student_image is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_imageEqualTo(String value) {
            addCriterion("student_image =", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageNotEqualTo(String value) {
            addCriterion("student_image <>", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageGreaterThan(String value) {
            addCriterion("student_image >", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageGreaterThanOrEqualTo(String value) {
            addCriterion("student_image >=", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageLessThan(String value) {
            addCriterion("student_image <", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageLessThanOrEqualTo(String value) {
            addCriterion("student_image <=", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageLike(String value) {
            addCriterion("student_image like", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageNotLike(String value) {
            addCriterion("student_image not like", value, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageIn(List<String> values) {
            addCriterion("student_image in", values, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageNotIn(List<String> values) {
            addCriterion("student_image not in", values, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageBetween(String value1, String value2) {
            addCriterion("student_image between", value1, value2, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_imageNotBetween(String value1, String value2) {
            addCriterion("student_image not between", value1, value2, "student_image");
            return (Criteria) this;
        }

        public Criteria andStudent_emailIsNull() {
            addCriterion("student_email is null");
            return (Criteria) this;
        }

        public Criteria andStudent_emailIsNotNull() {
            addCriterion("student_email is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_emailEqualTo(String value) {
            addCriterion("student_email =", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailNotEqualTo(String value) {
            addCriterion("student_email <>", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailGreaterThan(String value) {
            addCriterion("student_email >", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailGreaterThanOrEqualTo(String value) {
            addCriterion("student_email >=", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailLessThan(String value) {
            addCriterion("student_email <", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailLessThanOrEqualTo(String value) {
            addCriterion("student_email <=", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailLike(String value) {
            addCriterion("student_email like", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailNotLike(String value) {
            addCriterion("student_email not like", value, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailIn(List<String> values) {
            addCriterion("student_email in", values, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailNotIn(List<String> values) {
            addCriterion("student_email not in", values, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailBetween(String value1, String value2) {
            addCriterion("student_email between", value1, value2, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_emailNotBetween(String value1, String value2) {
            addCriterion("student_email not between", value1, value2, "student_email");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneIsNull() {
            addCriterion("student_telphone is null");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneIsNotNull() {
            addCriterion("student_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneEqualTo(String value) {
            addCriterion("student_telphone =", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneNotEqualTo(String value) {
            addCriterion("student_telphone <>", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneGreaterThan(String value) {
            addCriterion("student_telphone >", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneGreaterThanOrEqualTo(String value) {
            addCriterion("student_telphone >=", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneLessThan(String value) {
            addCriterion("student_telphone <", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneLessThanOrEqualTo(String value) {
            addCriterion("student_telphone <=", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneLike(String value) {
            addCriterion("student_telphone like", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneNotLike(String value) {
            addCriterion("student_telphone not like", value, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneIn(List<String> values) {
            addCriterion("student_telphone in", values, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneNotIn(List<String> values) {
            addCriterion("student_telphone not in", values, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneBetween(String value1, String value2) {
            addCriterion("student_telphone between", value1, value2, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_telphoneNotBetween(String value1, String value2) {
            addCriterion("student_telphone not between", value1, value2, "student_telphone");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordIsNull() {
            addCriterion("student_password is null");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordIsNotNull() {
            addCriterion("student_password is not null");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordEqualTo(String value) {
            addCriterion("student_password =", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordNotEqualTo(String value) {
            addCriterion("student_password <>", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordGreaterThan(String value) {
            addCriterion("student_password >", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("student_password >=", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordLessThan(String value) {
            addCriterion("student_password <", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordLessThanOrEqualTo(String value) {
            addCriterion("student_password <=", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordLike(String value) {
            addCriterion("student_password like", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordNotLike(String value) {
            addCriterion("student_password not like", value, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordIn(List<String> values) {
            addCriterion("student_password in", values, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordNotIn(List<String> values) {
            addCriterion("student_password not in", values, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordBetween(String value1, String value2) {
            addCriterion("student_password between", value1, value2, "student_password");
            return (Criteria) this;
        }

        public Criteria andStudent_passwordNotBetween(String value1, String value2) {
            addCriterion("student_password not between", value1, value2, "student_password");
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