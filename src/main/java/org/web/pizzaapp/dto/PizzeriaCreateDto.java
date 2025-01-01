package org.web.pizzaapp.dto;

public class PizzeriaCreateDto {

    private String title;
    private String city;
    private String address;
    private String workTime;

    public PizzeriaCreateDto() {
    }

    public PizzeriaCreateDto(String title, String city, String address, String workTime) {
        this.title = title;
        this.city = city;
        this.address = address;
        this.workTime = workTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }
}
