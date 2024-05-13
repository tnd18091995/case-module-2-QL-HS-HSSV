package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Teacher extends School implements Ranking, Serializable {
    private int workDay;
    private static final int GOOD_WORKDAY = 20;
    private static final int NORMAL_WORKDAY = 15;
    public Teacher() {
    }
    public Teacher(int id, String name, LocalDate dateOfBirth, String phoneNumber, String address, String gender, String email, int workDay) {
        super(id, name, dateOfBirth, phoneNumber, address, gender, email);
        this.workDay = workDay;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", email='" + getEmail() + '\'' +
                "workDay=" + workDay+ '\'' +
                "rank=" + Rank()+
                '}';
    }

    @Override
    public String Rank(){
        if(getWorkDay() >= GOOD_WORKDAY){
            return "GOOD";
        } else if (getWorkDay()>= NORMAL_WORKDAY) {
            return "NORMAL";
        }else {
            return "BAD";
        }
    }
}
