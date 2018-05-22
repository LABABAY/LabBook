package com.libinyu.book.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdmin_nameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameEqualTo(String value) {
            addCriterion("admin_name =", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThan(String value) {
            addCriterion("admin_name >", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThan(String value) {
            addCriterion("admin_name <", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameLike(String value) {
            addCriterion("admin_name like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotLike(String value) {
            addCriterion("admin_name not like", value, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameIn(List<String> values) {
            addCriterion("admin_name in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_nameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "admin_name");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexEqualTo(String value) {
            addCriterion("admin_sex =", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexNotEqualTo(String value) {
            addCriterion("admin_sex <>", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexGreaterThan(String value) {
            addCriterion("admin_sex >", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexGreaterThanOrEqualTo(String value) {
            addCriterion("admin_sex >=", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexLessThan(String value) {
            addCriterion("admin_sex <", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexLessThanOrEqualTo(String value) {
            addCriterion("admin_sex <=", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexLike(String value) {
            addCriterion("admin_sex like", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexNotLike(String value) {
            addCriterion("admin_sex not like", value, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexIn(List<String> values) {
            addCriterion("admin_sex in", values, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexNotIn(List<String> values) {
            addCriterion("admin_sex not in", values, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexBetween(String value1, String value2) {
            addCriterion("admin_sex between", value1, value2, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_sexNotBetween(String value1, String value2) {
            addCriterion("admin_sex not between", value1, value2, "admin_sex");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageIsNull() {
            addCriterion("admin_image is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageIsNotNull() {
            addCriterion("admin_image is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageEqualTo(String value) {
            addCriterion("admin_image =", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageNotEqualTo(String value) {
            addCriterion("admin_image <>", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageGreaterThan(String value) {
            addCriterion("admin_image >", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageGreaterThanOrEqualTo(String value) {
            addCriterion("admin_image >=", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageLessThan(String value) {
            addCriterion("admin_image <", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageLessThanOrEqualTo(String value) {
            addCriterion("admin_image <=", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageLike(String value) {
            addCriterion("admin_image like", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageNotLike(String value) {
            addCriterion("admin_image not like", value, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageIn(List<String> values) {
            addCriterion("admin_image in", values, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageNotIn(List<String> values) {
            addCriterion("admin_image not in", values, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageBetween(String value1, String value2) {
            addCriterion("admin_image between", value1, value2, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_imageNotBetween(String value1, String value2) {
            addCriterion("admin_image not between", value1, value2, "admin_image");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneIsNull() {
            addCriterion("admin_telphone is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneIsNotNull() {
            addCriterion("admin_telphone is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneEqualTo(String value) {
            addCriterion("admin_telphone =", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneNotEqualTo(String value) {
            addCriterion("admin_telphone <>", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneGreaterThan(String value) {
            addCriterion("admin_telphone >", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_telphone >=", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneLessThan(String value) {
            addCriterion("admin_telphone <", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneLessThanOrEqualTo(String value) {
            addCriterion("admin_telphone <=", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneLike(String value) {
            addCriterion("admin_telphone like", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneNotLike(String value) {
            addCriterion("admin_telphone not like", value, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneIn(List<String> values) {
            addCriterion("admin_telphone in", values, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneNotIn(List<String> values) {
            addCriterion("admin_telphone not in", values, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneBetween(String value1, String value2) {
            addCriterion("admin_telphone between", value1, value2, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_telphoneNotBetween(String value1, String value2) {
            addCriterion("admin_telphone not between", value1, value2, "admin_telphone");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailEqualTo(String value) {
            addCriterion("admin_email =", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailGreaterThan(String value) {
            addCriterion("admin_email >", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailLessThan(String value) {
            addCriterion("admin_email <", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailLike(String value) {
            addCriterion("admin_email like", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailNotLike(String value) {
            addCriterion("admin_email not like", value, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailIn(List<String> values) {
            addCriterion("admin_email in", values, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_emailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "admin_email");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountIsNull() {
            addCriterion("admin_account is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountIsNotNull() {
            addCriterion("admin_account is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountEqualTo(String value) {
            addCriterion("admin_account =", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountNotEqualTo(String value) {
            addCriterion("admin_account <>", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountGreaterThan(String value) {
            addCriterion("admin_account >", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_account >=", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountLessThan(String value) {
            addCriterion("admin_account <", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountLessThanOrEqualTo(String value) {
            addCriterion("admin_account <=", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountLike(String value) {
            addCriterion("admin_account like", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountNotLike(String value) {
            addCriterion("admin_account not like", value, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountIn(List<String> values) {
            addCriterion("admin_account in", values, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountNotIn(List<String> values) {
            addCriterion("admin_account not in", values, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountBetween(String value1, String value2) {
            addCriterion("admin_account between", value1, value2, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_accountNotBetween(String value1, String value2) {
            addCriterion("admin_account not between", value1, value2, "admin_account");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordEqualTo(String value) {
            addCriterion("admin_password =", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThan(String value) {
            addCriterion("admin_password >", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThan(String value) {
            addCriterion("admin_password <", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordLike(String value) {
            addCriterion("admin_password like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotLike(String value) {
            addCriterion("admin_password not like", value, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordIn(List<String> values) {
            addCriterion("admin_password in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "admin_password");
            return (Criteria) this;
        }

        public Criteria andAdmin_passwordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "admin_password");
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