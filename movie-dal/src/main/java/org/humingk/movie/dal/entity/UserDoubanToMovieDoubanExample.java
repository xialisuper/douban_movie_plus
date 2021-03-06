package org.humingk.movie.dal.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

/** @author humingk */
@Repository
@Data
@AllArgsConstructor
public class UserDoubanToMovieDoubanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserDoubanToMovieDoubanExample() {
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

    public Criteria start() {
        oredCriteria = new ArrayList<>();
        clear();
        return createCriteria();
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

        public Criteria andIdUserDoubanIsNull() {
            addCriterion("id_user_douban is null");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanIsNotNull() {
            addCriterion("id_user_douban is not null");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanEqualTo(String value) {
            addCriterion("id_user_douban =", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanNotEqualTo(String value) {
            addCriterion("id_user_douban <>", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanGreaterThan(String value) {
            addCriterion("id_user_douban >", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanGreaterThanOrEqualTo(String value) {
            addCriterion("id_user_douban >=", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanLessThan(String value) {
            addCriterion("id_user_douban <", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanLessThanOrEqualTo(String value) {
            addCriterion("id_user_douban <=", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanLike(String value) {
            addCriterion("id_user_douban like", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanNotLike(String value) {
            addCriterion("id_user_douban not like", value, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanIn(List<String> values) {
            addCriterion("id_user_douban in", values, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanNotIn(List<String> values) {
            addCriterion("id_user_douban not in", values, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanBetween(String value1, String value2) {
            addCriterion("id_user_douban between", value1, value2, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdUserDoubanNotBetween(String value1, String value2) {
            addCriterion("id_user_douban not between", value1, value2, "idUserDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanIsNull() {
            addCriterion("id_movie_douban is null");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanIsNotNull() {
            addCriterion("id_movie_douban is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanEqualTo(Long value) {
            addCriterion("id_movie_douban =", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanNotEqualTo(Long value) {
            addCriterion("id_movie_douban <>", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanGreaterThan(Long value) {
            addCriterion("id_movie_douban >", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanGreaterThanOrEqualTo(Long value) {
            addCriterion("id_movie_douban >=", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanLessThan(Long value) {
            addCriterion("id_movie_douban <", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanLessThanOrEqualTo(Long value) {
            addCriterion("id_movie_douban <=", value, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanIn(List<Long> values) {
            addCriterion("id_movie_douban in", values, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanNotIn(List<Long> values) {
            addCriterion("id_movie_douban not in", values, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanBetween(Long value1, Long value2) {
            addCriterion("id_movie_douban between", value1, value2, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andIdMovieDoubanNotBetween(Long value1, Long value2) {
            addCriterion("id_movie_douban not between", value1, value2, "idMovieDouban");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andIsWishIsNull() {
            addCriterion("is_wish is null");
            return (Criteria) this;
        }

        public Criteria andIsWishIsNotNull() {
            addCriterion("is_wish is not null");
            return (Criteria) this;
        }

        public Criteria andIsWishEqualTo(Byte value) {
            addCriterion("is_wish =", value, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishNotEqualTo(Byte value) {
            addCriterion("is_wish <>", value, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishGreaterThan(Byte value) {
            addCriterion("is_wish >", value, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_wish >=", value, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishLessThan(Byte value) {
            addCriterion("is_wish <", value, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishLessThanOrEqualTo(Byte value) {
            addCriterion("is_wish <=", value, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishIn(List<Byte> values) {
            addCriterion("is_wish in", values, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishNotIn(List<Byte> values) {
            addCriterion("is_wish not in", values, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishBetween(Byte value1, Byte value2) {
            addCriterion("is_wish between", value1, value2, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsWishNotBetween(Byte value1, Byte value2) {
            addCriterion("is_wish not between", value1, value2, "isWish");
            return (Criteria) this;
        }

        public Criteria andIsSeenIsNull() {
            addCriterion("is_seen is null");
            return (Criteria) this;
        }

        public Criteria andIsSeenIsNotNull() {
            addCriterion("is_seen is not null");
            return (Criteria) this;
        }

        public Criteria andIsSeenEqualTo(Byte value) {
            addCriterion("is_seen =", value, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenNotEqualTo(Byte value) {
            addCriterion("is_seen <>", value, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenGreaterThan(Byte value) {
            addCriterion("is_seen >", value, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_seen >=", value, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenLessThan(Byte value) {
            addCriterion("is_seen <", value, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenLessThanOrEqualTo(Byte value) {
            addCriterion("is_seen <=", value, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenIn(List<Byte> values) {
            addCriterion("is_seen in", values, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenNotIn(List<Byte> values) {
            addCriterion("is_seen not in", values, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenBetween(Byte value1, Byte value2) {
            addCriterion("is_seen between", value1, value2, "isSeen");
            return (Criteria) this;
        }

        public Criteria andIsSeenNotBetween(Byte value1, Byte value2) {
            addCriterion("is_seen not between", value1, value2, "isSeen");
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