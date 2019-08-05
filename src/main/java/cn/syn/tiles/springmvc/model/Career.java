package cn.syn.tiles.springmvc.model;

import java.io.Serializable;

public class Career implements Serializable {
    private Long id;

    private String img;

    private String developmentDirection;

    private String careerName;

    private String description;

    private Integer limitCondition;

    private Integer difficulty;

    private Integer periodOne;

    private Integer periodTwo;

    private Long prospects;

    private Integer salaryOne;

    private Integer salaryTwo;

    private Integer salaryThree;


    private Integer editorId;

    private Long createAt;

    private Long updateAt;

    private String hint;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getDevelopmentDirection() {
        return developmentDirection;
    }

    public void setDevelopmentDirection(String developmentDirection) {
        this.developmentDirection = developmentDirection == null ? null : developmentDirection.trim();
    }

    public String getCareerName() {
        return careerName;
    }

    public void setCareerName(String careerName) {
        this.careerName = careerName == null ? null : careerName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getLimitCondition() {
        return limitCondition;
    }

    public void setLimitCondition(Integer limitCondition) {
        this.limitCondition = limitCondition;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getPeriodOne() {
        return periodOne;
    }

    public void setPeriodOne(Integer periodOne) {
        this.periodOne = periodOne;
    }

    public Integer getPeriodTwo() {
        return periodTwo;
    }

    public void setPeriodTwo(Integer periodTwo) {
        this.periodTwo = periodTwo;
    }

    public Long getProspects() {
        return prospects;
    }

    public void setProspects(Long prospects) {
        this.prospects = prospects;
    }

    public Integer getSalaryOne() {
        return salaryOne;
    }

    public void setSalaryOne(Integer salaryOne) {
        this.salaryOne = salaryOne;
    }

    public Integer getSalaryTwo() {
        return salaryTwo;
    }

    public void setSalaryTwo(Integer salaryTwo) {
        this.salaryTwo = salaryTwo;
    }

    public Integer getSalaryThree() {
        return salaryThree;
    }

    public void setSalaryThree(Integer salaryThree) {
        this.salaryThree = salaryThree;
    }

//    public Integer getStatus() {
//        return status;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }

    public Integer getEditorId() {
        return editorId;
    }

    public void setEditorId(Integer editorId) {
        this.editorId = editorId;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint == null ? null : hint.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Career other = (Career) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getDevelopmentDirection() == null ? other.getDevelopmentDirection() == null : this.getDevelopmentDirection().equals(other.getDevelopmentDirection()))
            && (this.getCareerName() == null ? other.getCareerName() == null : this.getCareerName().equals(other.getCareerName()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getLimitCondition() == null ? other.getLimitCondition() == null : this.getLimitCondition().equals(other.getLimitCondition()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getPeriodOne() == null ? other.getPeriodOne() == null : this.getPeriodOne().equals(other.getPeriodOne()))
            && (this.getPeriodTwo() == null ? other.getPeriodTwo() == null : this.getPeriodTwo().equals(other.getPeriodTwo()))
            && (this.getProspects() == null ? other.getProspects() == null : this.getProspects().equals(other.getProspects()))
            && (this.getSalaryOne() == null ? other.getSalaryOne() == null : this.getSalaryOne().equals(other.getSalaryOne()))
            && (this.getSalaryTwo() == null ? other.getSalaryTwo() == null : this.getSalaryTwo().equals(other.getSalaryTwo()))
            && (this.getSalaryThree() == null ? other.getSalaryThree() == null : this.getSalaryThree().equals(other.getSalaryThree()))
//            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getEditorId() == null ? other.getEditorId() == null : this.getEditorId().equals(other.getEditorId()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getUpdateAt() == null ? other.getUpdateAt() == null : this.getUpdateAt().equals(other.getUpdateAt()))
            && (this.getHint() == null ? other.getHint() == null : this.getHint().equals(other.getHint()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getDevelopmentDirection() == null) ? 0 : getDevelopmentDirection().hashCode());
        result = prime * result + ((getCareerName() == null) ? 0 : getCareerName().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getLimitCondition() == null) ? 0 : getLimitCondition().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getPeriodOne() == null) ? 0 : getPeriodOne().hashCode());
        result = prime * result + ((getPeriodTwo() == null) ? 0 : getPeriodTwo().hashCode());
        result = prime * result + ((getProspects() == null) ? 0 : getProspects().hashCode());
        result = prime * result + ((getSalaryOne() == null) ? 0 : getSalaryOne().hashCode());
        result = prime * result + ((getSalaryTwo() == null) ? 0 : getSalaryTwo().hashCode());
        result = prime * result + ((getSalaryThree() == null) ? 0 : getSalaryThree().hashCode());
//        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getEditorId() == null) ? 0 : getEditorId().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getUpdateAt() == null) ? 0 : getUpdateAt().hashCode());
        result = prime * result + ((getHint() == null) ? 0 : getHint().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", img=").append(img);
        sb.append(", developmentDirection=").append(developmentDirection);
        sb.append(", careerName=").append(careerName);
        sb.append(", description=").append(description);
        sb.append(", limitCondition=").append(limitCondition);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", periodOne=").append(periodOne);
        sb.append(", periodTwo=").append(periodTwo);
        sb.append(", prospects=").append(prospects);
        sb.append(", salaryOne=").append(salaryOne);
        sb.append(", salaryTwo=").append(salaryTwo);
        sb.append(", salaryThree=").append(salaryThree);
        sb.append(", editorId=").append(editorId);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", hint=").append(hint);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}