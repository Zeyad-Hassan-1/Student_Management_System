/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem;

import java.util.InputMismatchException;

/**
 *
 * @author Hazem
 */
public class Student {

    public static final int MALE_OPTION = 1;
    public static final int FEMALE_OPTION = 0;

    private int studentId = 0;
    private String fullName;
    private int age = 0;
    private int gender;
    private String department;
    private double GPA = 0.00;

    /**
     *
     * @param studentId
     * @param fullName
     * @param age
     * @param GENDER_OPTION
     * @param department
     * @param GPA
     * @throws InputMismatchException
     */
    public Student(int studentId, String fullName, int age, int GENDER_OPTION, String department, double GPA) throws InputMismatchException {
        this.fullName = fullName;
        this.department = department;

        if (studentId <= 0) {
            throw new InputMismatchException("Invalid Student Id: Please enter positive integer");
        }
        if (age <= 0) {
            throw new InputMismatchException("Invalid Age: Please enter positive integer");
        }
        if (GENDER_OPTION != MALE_OPTION && GENDER_OPTION != FEMALE_OPTION) {
            throw new InputMismatchException("Invalid Gender: Please enter either Student.MALE_OPTION or Student.FEMALE_OPTION");
        }
        if (GPA < 0.00f) {
            throw new InputMismatchException("Invalid GPA: Please enter non-negative decimal number");
        }
        this.studentId = studentId;
        this.age = age;
        this.gender = GENDER_OPTION;
        this.GPA = GPA;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) throws InputMismatchException {
        if (age <= 0) {
            throw new InputMismatchException("Invalid Age: Please enter positive integer");
        }
        this.age = age;
    }

    /**
     * @return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the GPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(double GPA) throws InputMismatchException {
        if (GPA < 0.00f) {
            throw new InputMismatchException("Invalid GPA: Please enter non-negative decimal number");
        }
        this.GPA = GPA;
    }

    public String lineRepresentation() {
        return studentId + "," + fullName + "," + age + "," + ((gender == MALE_OPTION) ? "male" : "female")
                + "," + department + "," + GPA;
    }
}
