package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private PersonalInfo personalInfo;

    @OneToOne(cascade = CascadeType.ALL)
    private SchoolInfo schoolInfo;


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public PersonalInfo getPersonalInfo() {
        return personalInfo;
    }

    public void setPersonalInfo(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
    }

    public SchoolInfo getSchoolInfo() {
        return schoolInfo;
    }

    public void setSchoolInfo(SchoolInfo schoolInfo) {
        this.schoolInfo = schoolInfo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", personalInfo=" + personalInfo +
                ", schoolInfo=" + schoolInfo +
                '}';
    }
}
