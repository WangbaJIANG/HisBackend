package com.neuedu.his.pojo;

public class MedicalRecord {
    private Integer id;
    private Integer registerId;
    private  String readme;
    private String present;
    private String presentTreat;
    private  String history;
    private  String allergy;
    private  String physique;
    private  String proposal;
    private String diagnosis;
    private  String cure;
    private  String careful;

    private  Integer[] diseaseIds;

    public Integer[] getDiseaseIds() {
        return diseaseIds;
    }

    public void setDiseaseIds(Integer[] diseaseIds) {
        this.diseaseIds = diseaseIds;
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "id=" + id +
                ", registerId=" + registerId +
                ", readme='" + readme + '\'' +
                ", present='" + present + '\'' +
                ", presentTreat='" + presentTreat + '\'' +
                ", history='" + history + '\'' +
                ", allergy='" + allergy + '\'' +
                ", physique='" + physique + '\'' +
                ", proposal='" + proposal + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", cure='" + cure + '\'' +
                ", careful='" + careful + '\'' +
                '}';
    }

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

    public String getReadme() {
        return readme;
    }

    public void setReadme(String readme) {
        this.readme = readme;
    }

    public String getPresent() {
        return present;
    }

    public void setPresent(String present) {
        this.present = present;
    }

    public String getPresentTreat() {
        return presentTreat;
    }

    public void setPresentTreat(String presentTreat) {
        this.presentTreat = presentTreat;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getPhysique() {
        return physique;
    }

    public void setPhysique(String physique) {
        this.physique = physique;
    }

    public String getProposal() {
        return proposal;
    }

    public void setProposal(String proposal) {
        this.proposal = proposal;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCure() {
        return cure;
    }

    public void setCure(String cure) {
        this.cure = cure;
    }

    public String getCareful() {
        return careful;
    }

    public void setCareful(String careful) {
        this.careful = careful;
    }
}
