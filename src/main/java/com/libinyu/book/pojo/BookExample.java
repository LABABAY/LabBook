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

        public Criteria andScidIsNull() {
            addCriterion("scid is null");
            return (Criteria) this;
        }

        public Criteria andScidIsNotNull() {
            addCriterion("scid is not null");
            return (Criteria) this;
        }

        public Criteria andScidEqualTo(Integer value) {
            addCriterion("scid =", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotEqualTo(Integer value) {
            addCriterion("scid <>", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThan(Integer value) {
            addCriterion("scid >", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scid >=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThan(Integer value) {
            addCriterion("scid <", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidLessThanOrEqualTo(Integer value) {
            addCriterion("scid <=", value, "scid");
            return (Criteria) this;
        }

        public Criteria andScidIn(List<Integer> values) {
            addCriterion("scid in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotIn(List<Integer> values) {
            addCriterion("scid not in", values, "scid");
            return (Criteria) this;
        }

        public Criteria andScidBetween(Integer value1, Integer value2) {
            addCriterion("scid between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andScidNotBetween(Integer value1, Integer value2) {
            addCriterion("scid not between", value1, value2, "scid");
            return (Criteria) this;
        }

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNull() {
            addCriterion("people is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIsNotNull() {
            addCriterion("people is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleEqualTo(String value) {
            addCriterion("people =", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotEqualTo(String value) {
            addCriterion("people <>", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThan(String value) {
            addCriterion("people >", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleGreaterThanOrEqualTo(String value) {
            addCriterion("people >=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThan(String value) {
            addCriterion("people <", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLessThanOrEqualTo(String value) {
            addCriterion("people <=", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleLike(String value) {
            addCriterion("people like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotLike(String value) {
            addCriterion("people not like", value, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleIn(List<String> values) {
            addCriterion("people in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotIn(List<String> values) {
            addCriterion("people not in", values, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleBetween(String value1, String value2) {
            addCriterion("people between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andPeopleNotBetween(String value1, String value2) {
            addCriterion("people not between", value1, value2, "people");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyIsNull() {
            addCriterion("teacherverify is null");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyIsNotNull() {
            addCriterion("teacherverify is not null");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyEqualTo(String value) {
            addCriterion("teacherverify =", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyNotEqualTo(String value) {
            addCriterion("teacherverify <>", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyGreaterThan(String value) {
            addCriterion("teacherverify >", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyGreaterThanOrEqualTo(String value) {
            addCriterion("teacherverify >=", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyLessThan(String value) {
            addCriterion("teacherverify <", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyLessThanOrEqualTo(String value) {
            addCriterion("teacherverify <=", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyLike(String value) {
            addCriterion("teacherverify like", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyNotLike(String value) {
            addCriterion("teacherverify not like", value, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyIn(List<String> values) {
            addCriterion("teacherverify in", values, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyNotIn(List<String> values) {
            addCriterion("teacherverify not in", values, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyBetween(String value1, String value2) {
            addCriterion("teacherverify between", value1, value2, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andTeacherverifyNotBetween(String value1, String value2) {
            addCriterion("teacherverify not between", value1, value2, "teacherverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyIsNull() {
            addCriterion("adminverify is null");
            return (Criteria) this;
        }

        public Criteria andAdminverifyIsNotNull() {
            addCriterion("adminverify is not null");
            return (Criteria) this;
        }

        public Criteria andAdminverifyEqualTo(String value) {
            addCriterion("adminverify =", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyNotEqualTo(String value) {
            addCriterion("adminverify <>", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyGreaterThan(String value) {
            addCriterion("adminverify >", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyGreaterThanOrEqualTo(String value) {
            addCriterion("adminverify >=", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyLessThan(String value) {
            addCriterion("adminverify <", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyLessThanOrEqualTo(String value) {
            addCriterion("adminverify <=", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyLike(String value) {
            addCriterion("adminverify like", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyNotLike(String value) {
            addCriterion("adminverify not like", value, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyIn(List<String> values) {
            addCriterion("adminverify in", values, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyNotIn(List<String> values) {
            addCriterion("adminverify not in", values, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyBetween(String value1, String value2) {
            addCriterion("adminverify between", value1, value2, "adminverify");
            return (Criteria) this;
        }

        public Criteria andAdminverifyNotBetween(String value1, String value2) {
            addCriterion("adminverify not between", value1, value2, "adminverify");
            return (Criteria) this;
        }

        public Criteria andReportscoreIsNull() {
            addCriterion("reportscore is null");
            return (Criteria) this;
        }

        public Criteria andReportscoreIsNotNull() {
            addCriterion("reportscore is not null");
            return (Criteria) this;
        }

        public Criteria andReportscoreEqualTo(String value) {
            addCriterion("reportscore =", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreNotEqualTo(String value) {
            addCriterion("reportscore <>", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreGreaterThan(String value) {
            addCriterion("reportscore >", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreGreaterThanOrEqualTo(String value) {
            addCriterion("reportscore >=", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreLessThan(String value) {
            addCriterion("reportscore <", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreLessThanOrEqualTo(String value) {
            addCriterion("reportscore <=", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreLike(String value) {
            addCriterion("reportscore like", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreNotLike(String value) {
            addCriterion("reportscore not like", value, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreIn(List<String> values) {
            addCriterion("reportscore in", values, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreNotIn(List<String> values) {
            addCriterion("reportscore not in", values, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreBetween(String value1, String value2) {
            addCriterion("reportscore between", value1, value2, "reportscore");
            return (Criteria) this;
        }

        public Criteria andReportscoreNotBetween(String value1, String value2) {
            addCriterion("reportscore not between", value1, value2, "reportscore");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNull() {
            addCriterion("enterdate is null");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNotNull() {
            addCriterion("enterdate is not null");
            return (Criteria) this;
        }

        public Criteria andEnterdateEqualTo(Date value) {
            addCriterion("enterdate =", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotEqualTo(Date value) {
            addCriterion("enterdate <>", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThan(Date value) {
            addCriterion("enterdate >", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("enterdate >=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThan(Date value) {
            addCriterion("enterdate <", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThanOrEqualTo(Date value) {
            addCriterion("enterdate <=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateIn(List<Date> values) {
            addCriterion("enterdate in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotIn(List<Date> values) {
            addCriterion("enterdate not in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateBetween(Date value1, Date value2) {
            addCriterion("enterdate between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotBetween(Date value1, Date value2) {
            addCriterion("enterdate not between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNull() {
            addCriterion("leavedate is null");
            return (Criteria) this;
        }

        public Criteria andLeavedateIsNotNull() {
            addCriterion("leavedate is not null");
            return (Criteria) this;
        }

        public Criteria andLeavedateEqualTo(Date value) {
            addCriterion("leavedate =", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotEqualTo(Date value) {
            addCriterion("leavedate <>", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThan(Date value) {
            addCriterion("leavedate >", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateGreaterThanOrEqualTo(Date value) {
            addCriterion("leavedate >=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThan(Date value) {
            addCriterion("leavedate <", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateLessThanOrEqualTo(Date value) {
            addCriterion("leavedate <=", value, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateIn(List<Date> values) {
            addCriterion("leavedate in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotIn(List<Date> values) {
            addCriterion("leavedate not in", values, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateBetween(Date value1, Date value2) {
            addCriterion("leavedate between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andLeavedateNotBetween(Date value1, Date value2) {
            addCriterion("leavedate not between", value1, value2, "leavedate");
            return (Criteria) this;
        }

        public Criteria andConfirmIsNull() {
            addCriterion("confirm is null");
            return (Criteria) this;
        }

        public Criteria andConfirmIsNotNull() {
            addCriterion("confirm is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmEqualTo(String value) {
            addCriterion("confirm =", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotEqualTo(String value) {
            addCriterion("confirm <>", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmGreaterThan(String value) {
            addCriterion("confirm >", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("confirm >=", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLessThan(String value) {
            addCriterion("confirm <", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLessThanOrEqualTo(String value) {
            addCriterion("confirm <=", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLike(String value) {
            addCriterion("confirm like", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotLike(String value) {
            addCriterion("confirm not like", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmIn(List<String> values) {
            addCriterion("confirm in", values, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotIn(List<String> values) {
            addCriterion("confirm not in", values, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmBetween(String value1, String value2) {
            addCriterion("confirm between", value1, value2, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotBetween(String value1, String value2) {
            addCriterion("confirm not between", value1, value2, "confirm");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andGuideIsNull() {
            addCriterion("guide is null");
            return (Criteria) this;
        }

        public Criteria andGuideIsNotNull() {
            addCriterion("guide is not null");
            return (Criteria) this;
        }

        public Criteria andGuideEqualTo(String value) {
            addCriterion("guide =", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotEqualTo(String value) {
            addCriterion("guide <>", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideGreaterThan(String value) {
            addCriterion("guide >", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideGreaterThanOrEqualTo(String value) {
            addCriterion("guide >=", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideLessThan(String value) {
            addCriterion("guide <", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideLessThanOrEqualTo(String value) {
            addCriterion("guide <=", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideLike(String value) {
            addCriterion("guide like", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotLike(String value) {
            addCriterion("guide not like", value, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideIn(List<String> values) {
            addCriterion("guide in", values, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotIn(List<String> values) {
            addCriterion("guide not in", values, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideBetween(String value1, String value2) {
            addCriterion("guide between", value1, value2, "guide");
            return (Criteria) this;
        }

        public Criteria andGuideNotBetween(String value1, String value2) {
            addCriterion("guide not between", value1, value2, "guide");
            return (Criteria) this;
        }

        public Criteria andReportIsNull() {
            addCriterion("report is null");
            return (Criteria) this;
        }

        public Criteria andReportIsNotNull() {
            addCriterion("report is not null");
            return (Criteria) this;
        }

        public Criteria andReportEqualTo(String value) {
            addCriterion("report =", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotEqualTo(String value) {
            addCriterion("report <>", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThan(String value) {
            addCriterion("report >", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportGreaterThanOrEqualTo(String value) {
            addCriterion("report >=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThan(String value) {
            addCriterion("report <", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLessThanOrEqualTo(String value) {
            addCriterion("report <=", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportLike(String value) {
            addCriterion("report like", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotLike(String value) {
            addCriterion("report not like", value, "report");
            return (Criteria) this;
        }

        public Criteria andReportIn(List<String> values) {
            addCriterion("report in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotIn(List<String> values) {
            addCriterion("report not in", values, "report");
            return (Criteria) this;
        }

        public Criteria andReportBetween(String value1, String value2) {
            addCriterion("report between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andReportNotBetween(String value1, String value2) {
            addCriterion("report not between", value1, value2, "report");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andBooklabIsNull() {
            addCriterion("booklab is null");
            return (Criteria) this;
        }

        public Criteria andBooklabIsNotNull() {
            addCriterion("booklab is not null");
            return (Criteria) this;
        }

        public Criteria andBooklabEqualTo(String value) {
            addCriterion("booklab =", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabNotEqualTo(String value) {
            addCriterion("booklab <>", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabGreaterThan(String value) {
            addCriterion("booklab >", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabGreaterThanOrEqualTo(String value) {
            addCriterion("booklab >=", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabLessThan(String value) {
            addCriterion("booklab <", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabLessThanOrEqualTo(String value) {
            addCriterion("booklab <=", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabLike(String value) {
            addCriterion("booklab like", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabNotLike(String value) {
            addCriterion("booklab not like", value, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabIn(List<String> values) {
            addCriterion("booklab in", values, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabNotIn(List<String> values) {
            addCriterion("booklab not in", values, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabBetween(String value1, String value2) {
            addCriterion("booklab between", value1, value2, "booklab");
            return (Criteria) this;
        }

        public Criteria andBooklabNotBetween(String value1, String value2) {
            addCriterion("booklab not between", value1, value2, "booklab");
            return (Criteria) this;
        }

        public Criteria andBookteaIsNull() {
            addCriterion("booktea is null");
            return (Criteria) this;
        }

        public Criteria andBookteaIsNotNull() {
            addCriterion("booktea is not null");
            return (Criteria) this;
        }

        public Criteria andBookteaEqualTo(String value) {
            addCriterion("booktea =", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaNotEqualTo(String value) {
            addCriterion("booktea <>", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaGreaterThan(String value) {
            addCriterion("booktea >", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaGreaterThanOrEqualTo(String value) {
            addCriterion("booktea >=", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaLessThan(String value) {
            addCriterion("booktea <", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaLessThanOrEqualTo(String value) {
            addCriterion("booktea <=", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaLike(String value) {
            addCriterion("booktea like", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaNotLike(String value) {
            addCriterion("booktea not like", value, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaIn(List<String> values) {
            addCriterion("booktea in", values, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaNotIn(List<String> values) {
            addCriterion("booktea not in", values, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaBetween(String value1, String value2) {
            addCriterion("booktea between", value1, value2, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookteaNotBetween(String value1, String value2) {
            addCriterion("booktea not between", value1, value2, "booktea");
            return (Criteria) this;
        }

        public Criteria andBookdeviceIsNull() {
            addCriterion("bookdevice is null");
            return (Criteria) this;
        }

        public Criteria andBookdeviceIsNotNull() {
            addCriterion("bookdevice is not null");
            return (Criteria) this;
        }

        public Criteria andBookdeviceEqualTo(String value) {
            addCriterion("bookdevice =", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceNotEqualTo(String value) {
            addCriterion("bookdevice <>", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceGreaterThan(String value) {
            addCriterion("bookdevice >", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceGreaterThanOrEqualTo(String value) {
            addCriterion("bookdevice >=", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceLessThan(String value) {
            addCriterion("bookdevice <", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceLessThanOrEqualTo(String value) {
            addCriterion("bookdevice <=", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceLike(String value) {
            addCriterion("bookdevice like", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceNotLike(String value) {
            addCriterion("bookdevice not like", value, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceIn(List<String> values) {
            addCriterion("bookdevice in", values, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceNotIn(List<String> values) {
            addCriterion("bookdevice not in", values, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceBetween(String value1, String value2) {
            addCriterion("bookdevice between", value1, value2, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andBookdeviceNotBetween(String value1, String value2) {
            addCriterion("bookdevice not between", value1, value2, "bookdevice");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andBookstudentIsNull() {
            addCriterion("bookstudent is null");
            return (Criteria) this;
        }

        public Criteria andBookstudentIsNotNull() {
            addCriterion("bookstudent is not null");
            return (Criteria) this;
        }

        public Criteria andBookstudentEqualTo(String value) {
            addCriterion("bookstudent =", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentNotEqualTo(String value) {
            addCriterion("bookstudent <>", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentGreaterThan(String value) {
            addCriterion("bookstudent >", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentGreaterThanOrEqualTo(String value) {
            addCriterion("bookstudent >=", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentLessThan(String value) {
            addCriterion("bookstudent <", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentLessThanOrEqualTo(String value) {
            addCriterion("bookstudent <=", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentLike(String value) {
            addCriterion("bookstudent like", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentNotLike(String value) {
            addCriterion("bookstudent not like", value, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentIn(List<String> values) {
            addCriterion("bookstudent in", values, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentNotIn(List<String> values) {
            addCriterion("bookstudent not in", values, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentBetween(String value1, String value2) {
            addCriterion("bookstudent between", value1, value2, "bookstudent");
            return (Criteria) this;
        }

        public Criteria andBookstudentNotBetween(String value1, String value2) {
            addCriterion("bookstudent not between", value1, value2, "bookstudent");
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