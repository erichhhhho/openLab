package com.lab.Bean;


import java.util.Date;

/**
 * @Project：${project_name}
 * @File：${type_name}
 * @Author：何唯 （Erichhhhho）
 * @Date：12:41 2017/7/1
 * @Description：
 */
public class Appointment {

    private String id;
    private Date day;
    private String period;
    private String user;
    private String location;

    public Appointment(String id, Date day, String period, String user, String location) {
        this.id = id;
        this.day = day;
        this.period = period;
        this.user = user;
        this.location = location;
    }

    public Appointment() {
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
