/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagment.gui.delete;

/**
 *
 * @author HP
 */
public class Validition {
    public static boolean isNotEmpty(String text) {
        return text != null && !text.trim().isEmpty();
    }

    
    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age > 0 && age < 90; 
        } catch (NumberFormatException e) {
            return false;
        }
    }

    
    public static boolean isValidGPA(String gpaStr) {
        try {
            double gpa = Double.parseDouble(gpaStr);
            return gpa >= 0.0 && gpa <= 4.0;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
}
