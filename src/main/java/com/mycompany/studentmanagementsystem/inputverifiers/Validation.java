/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.inputverifiers;

/**
 *
 * @author Hazem
 */
public class Validation {
    public static boolean isEmpty(String value) {
        return (value == null || value.trim().isEmpty());
    }
    
    /**
     * 
     * @param value
     * @return 0: is not Alphabetic,
     *         -1: null String,
     *          1: is Alphabetic
     */
    public static int isAlphabetic(String value) {
        if(isEmpty(value))
        {
            return -1;
        }
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || c == ' ')) {
                return 0;
            }
        }
        return 1;
    }
    
    public static boolean isPositiveInt(int value) {
        return value >= 0;
    }
    public static boolean isPositiveFloat(float value) {
        return value >= 0.0;
    }

    public static boolean isPositiveInt(String str) {
        if(isInt(str))
        {
            return Integer.parseInt(str)>=0;
        }
        return false;
    }
    
    public static boolean isPositiveFloat(String str) {
        if(isFloat(str))
        {
            return Double.parseDouble(str)>=0.0;
        }
        return false;
    }
    
    public static boolean isInt(String str) {
        if(isEmpty(str))
        {
            return false;
        }
        try
        {
            Integer.parseInt(str);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    
    public static boolean isFloat(String str) {
        if(isEmpty(str))
        {
            return false;
        }
        try
        {
            Double.parseDouble(str);
            return true;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    
    public static boolean isGPA(double GPA)
    {
        return GPA>=0.00&&GPA<=4.00;
    }
    
    public static boolean isAge(int age)
    {
        return isPositiveInt(age);
    }
    
    public static boolean isGPA(String GPA)
    {
        if(!isFloat(GPA))
        {
            return false;
        }
        return isGPA(Double.parseDouble(GPA));
    }
    
    public static boolean isAge(String age)
    {
        if(!isInt(age))
        {
            return false;
        }
        return isAge(Integer.parseInt(age));
    }
}
