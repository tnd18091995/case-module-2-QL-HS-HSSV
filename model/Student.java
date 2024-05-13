package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Student extends School implements Ranking, Serializable {
    private double score;
    private static final double GOOD_POINT = 7;
    private static final double NORMAL_POINT = 5;

    public Student() {
    }
    public Student(int id, String name, LocalDate dateOfBirth, String phoneNumber, String address, String gender, String email, double score) {
        super(id, name, dateOfBirth, phoneNumber, address, gender, email);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String Rank() {
        if(getScore() >= GOOD_POINT){
            return "GOOD";
        } else if (getScore()>= NORMAL_POINT) {
            return "NORMAL";
        } else {
            return "BAD";
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", Address='" + getAddress() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", email='" + getEmail() + '\'' +
                "score=" + score + '\'' +
                "rank=" + Rank()+
                '}';
    }
}
