package sample.models;

import java.util.Calendar;

public class Operations {
    private int id;
    private Calendar calendar;
    private Users user;
    private double sum;

    public Operations(Calendar calendar, Users user, double sum) {
        this.id = id;
        this.calendar = calendar.getInstance();
        this.user = user;
        this.sum = sum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}