package com.neuedu.his.pojo;

public class Scheduling {

    private Integer id;
    private String ruleName;
    private String weekRule;
    private Integer delmark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public String getWeekRule() {
        return weekRule;
    }

    public void setWeekRule(String weekRule) {
        this.weekRule = weekRule;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}
