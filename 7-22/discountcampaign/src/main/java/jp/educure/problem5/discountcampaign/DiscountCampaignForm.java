package jp.educure.problem5.discountcampaign;

import java.time.LocalDate;

public class DiscountCampaignForm {

    private String name;
    private String type;
    private Integer value;
    private LocalDate startDate;
    private LocalDate endDate;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue(){
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public LocalDate getStartDate(){
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate(){
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}