/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.frontend;

import com.mycompany.studentmanagementsystem.inputverifiers.Validation;

/**
 *
 * @author Hazem
 */
public class Student {

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        if(Validation.isEmpty(fullName))
        {
            throw new IllegalArgumentException("Invalid Name field");
        }
        this.fullName = fullName;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        if(Validation.isEmpty(gender))
        {
            throw new IllegalArgumentException("Invalid Gender field");
        }
        this.gender = gender;
    }

    private int studentId = 0;
    private String fullName;
    private int age = 0;
    private String gender;
    private String department;
    private double GPA = 0.00;
    
    private void validateArguments(int studentId, String fullName, int age, String gender, String department, double GPA) throws IllegalArgumentException
    {
        if (!Validation.isGPA(GPA)) {
            throw new IllegalArgumentException("Invalid GPA: Please enter non-negative decimal number");
        } 
        if(Validation.isEmpty(fullName))
        {
            throw new IllegalArgumentException("Invalid Name field");
        }
        if(Validation.isEmpty(department))
        {
            throw new IllegalArgumentException("Invalid Department field");
        }
        if(Validation.isEmpty(gender)||(!(gender.equals("male") || gender.equals("female"))))
        {
            throw new IllegalArgumentException("Invalid Gender field");
        }
        if (!Validation.isPositiveInt(studentId)) {
            throw new IllegalArgumentException("Invalid Student Id: Please enter positive integer");
        }
        if(!Validation.isAge(age))
        {
            throw new IllegalArgumentException("Invalid Age: Please enter positive integer");
        }
    }
    
    /**
     *
     * @param studentId
     * @param fullName
     * @param age
     * @param gender
     * @param department
     * @param GPA
     * @throws IllegalArgumentException
     */
    public Student(int studentId, String fullName, int age, String gender, String department, double GPA) throws IllegalArgumentException {
        
        validateArguments(studentId, fullName, age, gender, department, GPA);
        this.fullName = fullName.trim();
        this.department = department.trim().toUpperCase();
        this.studentId = studentId;
        this.age = age;
        this.gender = gender.trim().toLowerCase();
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
    public void setAge(int age) throws IllegalArgumentException {
        if(!Validation.isAge(age))
        {
            throw new IllegalArgumentException("Invalid Age: Please enter positive integer");
        }
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
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
        if(Validation.isEmpty(department))
        {
            throw new IllegalArgumentException("Invalid Department field");
        }
        this.department = department.trim().toUpperCase();
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
    public void setGPA(double GPA) throws IllegalArgumentException {
        if (!Validation.isGPA(GPA)) {
            throw new IllegalArgumentException("Invalid GPA: Please enter non-negative decimal number");
        }
        this.GPA = GPA;
    }

    public String lineRepresentation() {
        return studentId + "," + getFullName() + "," + age + "," + getGender() + "," + department + "," + GPA;
    }
}
