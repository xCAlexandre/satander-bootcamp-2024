package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_school_info")
public class SchoolInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    private Long id;
    private String grade;
    private String className;
    private String schoolYear;
    private String studentId;
    private String enrollmentDate;


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @Override
    public String toString() {
        return "SchoolInfo{" +
                "grade='" + grade + '\'' +
                ", className='" + className + '\'' +
                ", schoolYear='" + schoolYear + '\'' +
                ", studentId='" + studentId + '\'' +
                ", enrollmentDate='" + enrollmentDate + '\'' +
                '}';
    }


}
