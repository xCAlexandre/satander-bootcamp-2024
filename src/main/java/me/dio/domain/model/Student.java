package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_student")
    private Long id;

    @OneToOne
    private PersonalInfo personalInfo;

    @OneToOne
    private SchoolInfo schoolInfo;

    @OneToOne
    private Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", personalInfo=" + personalInfo +
                ", schoolInfo=" + schoolInfo +
                ", address=" + address +
                '}';
    }
}
