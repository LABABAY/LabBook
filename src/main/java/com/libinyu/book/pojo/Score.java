package com.libinyu.book.pojo;

public class Score {
    private Integer score_id;

    private String score_regular;

    private String score_experiment;

    private String score_total;

    public Integer getScore_id() {
        return score_id;
    }

    public void setScore_id(Integer score_id) {
        this.score_id = score_id;
    }

    public String getScore_regular() {
        return score_regular;
    }

    public void setScore_regular(String score_regular) {
        this.score_regular = score_regular == null ? null : score_regular.trim();
    }

    public String getScore_experiment() {
        return score_experiment;
    }

    public void setScore_experiment(String score_experiment) {
        this.score_experiment = score_experiment == null ? null : score_experiment.trim();
    }

    public String getScore_total() {
        return score_total;
    }

    public void setScore_total(String score_total) {
        this.score_total = score_total == null ? null : score_total.trim();
    }
}