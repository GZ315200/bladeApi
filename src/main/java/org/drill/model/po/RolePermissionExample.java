package org.drill.model.po;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RolePermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RolePermissionExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdIsNull() {
            addCriterion("tx_role_id is null");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdIsNotNull() {
            addCriterion("tx_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdEqualTo(String value) {
            addCriterion("tx_role_id =", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdNotEqualTo(String value) {
            addCriterion("tx_role_id <>", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdGreaterThan(String value) {
            addCriterion("tx_role_id >", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("tx_role_id >=", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdLessThan(String value) {
            addCriterion("tx_role_id <", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdLessThanOrEqualTo(String value) {
            addCriterion("tx_role_id <=", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdLike(String value) {
            addCriterion("tx_role_id like", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdNotLike(String value) {
            addCriterion("tx_role_id not like", value, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdIn(List<String> values) {
            addCriterion("tx_role_id in", values, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdNotIn(List<String> values) {
            addCriterion("tx_role_id not in", values, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdBetween(String value1, String value2) {
            addCriterion("tx_role_id between", value1, value2, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxRoleIdNotBetween(String value1, String value2) {
            addCriterion("tx_role_id not between", value1, value2, "txRoleId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdIsNull() {
            addCriterion("tx_permission_id is null");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdIsNotNull() {
            addCriterion("tx_permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdEqualTo(String value) {
            addCriterion("tx_permission_id =", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdNotEqualTo(String value) {
            addCriterion("tx_permission_id <>", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdGreaterThan(String value) {
            addCriterion("tx_permission_id >", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("tx_permission_id >=", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdLessThan(String value) {
            addCriterion("tx_permission_id <", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdLessThanOrEqualTo(String value) {
            addCriterion("tx_permission_id <=", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdLike(String value) {
            addCriterion("tx_permission_id like", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdNotLike(String value) {
            addCriterion("tx_permission_id not like", value, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdIn(List<String> values) {
            addCriterion("tx_permission_id in", values, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdNotIn(List<String> values) {
            addCriterion("tx_permission_id not in", values, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdBetween(String value1, String value2) {
            addCriterion("tx_permission_id between", value1, value2, "txPermissionId");
            return (Criteria) this;
        }

        public Criteria andTxPermissionIdNotBetween(String value1, String value2) {
            addCriterion("tx_permission_id not between", value1, value2, "txPermissionId");
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