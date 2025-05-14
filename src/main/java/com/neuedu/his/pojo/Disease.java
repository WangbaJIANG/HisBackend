package com.neuedu.his.pojo;

public class Disease {
    private Integer id;
    private String diseaseName;
    private String diseaseCode;
    private String diseaseICD;
    private String diseaseCategory;

    @Override
    public String toString() {
        return "Disease{" +
                "id=" + id +
                ", diseaseName='" + diseaseName + '\'' +
                ", diseaseCode='" + diseaseCode + '\'' +
                ", diseaseICD='" + diseaseICD + '\'' +
                ", diseaseCategory='" + diseaseCategory + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDiseaseICD() {
        return diseaseICD;
    }

    public void setDiseaseICD(String diseaseICD) {
        this.diseaseICD = diseaseICD;
    }

    public String getDiseaseCategory() {
        return diseaseCategory;
    }

    public void setDiseaseCategory(String diseaseCategory) {
        this.diseaseCategory = diseaseCategory;
    }
}
