package com.neuedu.his.pojo.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseChargeVo {
    private Integer id;
    private String techName;
    private String techPrice;
    private String techType;
    private Date creationTime;
    private  String drugFormat;
    private Integer drugNumber;


    @Override
    public String toString() {
        return "ExpenseChargeVo{" +
                "techName='" + techName + '\'' +
                ", techPrice='" + techPrice + '\'' +
                ", techType='" + techType + '\'' +
                ", creationTime=" + creationTime +
                ", drugFormat='" + drugFormat + '\'' +
                ", drugNumber=" + drugNumber +
                ", id=" + id +
                ", expenseChargeVoList=" + expenseChargeVoList +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private List<ExpenseChargeVo>expenseChargeVoList=new ArrayList<>();

    public List<ExpenseChargeVo> getExpenseChargeVoList() {
        return expenseChargeVoList;
    }

    public void setExpenseChargeVoList(List<ExpenseChargeVo> expenseChargeVoList) {
        this.expenseChargeVoList = expenseChargeVoList;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getTechPrice() {
        return techPrice;
    }

    public void setTechPrice(String techPrice) {
        this.techPrice = techPrice;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getDrugFormat() {
        return drugFormat;
    }

    public void setDrugFormat(String drugFormat) {
        this.drugFormat = drugFormat;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }
}
