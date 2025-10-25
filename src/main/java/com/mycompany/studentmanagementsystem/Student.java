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
    
    
    private int studentID = 0;
    private String fullName;
    private int age = 0;
    private int gender;
    private String department;
    private float GPA =0.00f;

    public Student(int studentID, String fullName, int age, int GENDER_OPTION, String department, float GPA) throws InputMismatchException {
        this.fullName = fullName;
        this.department = department;
        
        
        if(studentID<=0)
        {
            throw new InputMismatchException("Invalid Student ID: Please enter positive integer"); 
        }
        if(age<=0)
        {
            throw new InputMismatchException("Invalid Age: Please enter positive integer");
        }
        if(GENDER_OPTION!=MALE_OPTION&&GENDER_OPTION!=FEMALE_OPTION)
        {
            throw new InputMismatchException("Invalid Gender: Please enter either Student.MALE_OPTION or Student.FEMALE_OPTION");
        }
        if(GPA<0.00f)
        {
            throw new InputMismatchException("Invalid GPA: Please enter non-negative decimal number");
        }
        this.studentID = studentID;
        this.age = age;
        this.gender = GENDER_OPTION;
        this.GPA = GPA;
    }

    /**
     * @return the studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(int studentID) throws InputMismatchException{
        if(studentID<=0)
        {
            throw new InputMismatchException("Invalid Student ID: Please enter positive integer"); 
            
        }
        this.studentID = studentID;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        if(age<=0)
        {
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
     * @param GENDER_OPTION either Student.MALE_OPTION or Student.FEMALE_OPTION to set
     */
    public void setGender(int GENDER_OPTION)throws InputMismatchException {
        if(GENDER_OPTION!=MALE_OPTION&&GENDER_OPTION!=FEMALE_OPTION)
        {
            throw new InputMismatchException("Invalid Gender: Please enter either Student.MALE_OPTION or Student.FEMALE_OPTION");
        }
        this.gender = GENDER_OPTION;
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
    public float getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(float GPA) throws InputMismatchException {
        if(GPA<0.00f)
        {
            throw new InputMismatchException("Invalid GPA: Please enter non-negative decimal number");
        }
        this.GPA = GPA;
    }
    
    public String lineRepresentation()
    {
        return studentID + "," + fullName + "," + age + "," + ((gender==MALE_OPTION)?"male":"female")
                + "," + department + "," + GPA;
    }
}
