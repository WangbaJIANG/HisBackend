package com.neuedu.his.pojo;

import java.util.List;

public class Employee {
    private Integer id;
    private String realname;
    private String password;
    private Integer registLevelId;
    private  Integer schedulingId;
    private Integer role;
    private Integer delmark;
    private  Integer deptmentId;

    private List<Permit> permitList;

    public List<Permit> getPermitList() {
        return permitList;
    }

    public void setPermitList(List<Permit> permitList) {
        this.permitList = permitList;
    }

    public Integer getDeptmentId() {
        return deptmentId;
    }

    public void setDeptmentId(Integer deptmentId) {
        this.deptmentId = deptmentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRegistLevelId() {
        return registLevelId;
    }

    public void setRegistLevelId(Integer registLevelId) {
        this.registLevelId = registLevelId;
    }

    public Integer getSchedulingId() {
        return schedulingId;
    }

    public void setSchedulingId(Integer schedulingId) {
        this.schedulingId = schedulingId;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getDelmark() {
        return delmark;
    }

    public void setDelmark(Integer delmark) {
        this.delmark = delmark;
    }
}
