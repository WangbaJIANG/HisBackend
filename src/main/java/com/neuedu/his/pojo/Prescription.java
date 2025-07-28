package com.neuedu.his.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Prescription implements Serializable {




    private Integer id;

    /**
     * 挂号id
     */
    private Integer registerId;

    /**
     * 药品id
     */
    private Integer drugId;

    /**
     * 用法用量和频次
     */
    private String drugUsage;

    /**
     * 数量
     */
    private Integer drugNumber;

    /**
     * 开立时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX", timezone = "GMT+8")
    private LocalDateTime creationTime;

    /**
     * 状态(已开立、已缴费、已发药、已退药、已退费)
     */
    private String drugState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getDrugId() {
        return drugId;
    }

    public void setDrugId(Integer drugId) {
        this.drugId = drugId;
    }

    public String getDrugUsage() {
        return drugUsage;
    }

    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getDrugState() {
        return drugState;
    }

    public void setDrugState(String drugState) {
        this.drugState = drugState;
    }

    @Override
    public String toString() {
        return "Prescription{" +
            "id = " + id +
            ", registerId = " + registerId +
            ", drugId = " + drugId +
            ", drugUsage = " + drugUsage +
            ", drugNumber = " + drugNumber +
            ", creationTime = " + creationTime +
            ", drugState = " + drugState +
        "}";
    }
}
