package com.neuedu.his.pojo;

import java.util.List;

public class Permit {
    private Integer id;
    private String permitPath;
    private String permitName;
    private String permitIcon;
    private Integer permitParent;
    private  Integer relmark;
    private List<Permit> children;

    public List<Permit> getChildren() {
        return children;
    }

    public void setChildren(List<Permit> children) {
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermitPath() {
        return permitPath;
    }

    public void setPermitPath(String permitPath) {
        this.permitPath = permitPath;
    }

    public String getPermitName() {
        return permitName;
    }

    public void setPermitName(String permitName) {
        this.permitName = permitName;
    }

    public String getPermitIcon() {
        return permitIcon;
    }

    public void setPermitIcon(String permitIcon) {
        this.permitIcon = permitIcon;
    }

    public Integer getPermitParent() {
        return permitParent;
    }

    public void setPermitParent(Integer permitParent) {
        this.permitParent = permitParent;
    }

    public Integer getRelmark() {
        return relmark;
    }

    public void setRelmark(Integer relmark) {
        this.relmark = relmark;
    }
}
