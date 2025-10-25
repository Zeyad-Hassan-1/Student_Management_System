/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem.database;

import com.mycompany.studentmanagementsystem.Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hazem
 */
public class StudentDatabase {
    private String fileName;
    private ArrayList<Student> database;

    /**
     * 
     * @param fileName
     * @throws FileNotFoundException if couldn't find a file with the given name
     * @throws NullPointerException if couldn't create a Student instance due to invalid line format in the file 
     */
    public StudentDatabase(String fileName) throws FileNotFoundException, NullPointerException
    {
        
        this.fileName = fileName;
        database = new ArrayList<>();
        try
        {
            this.readFromFile();
        }
        catch(FileNotFoundException | NullPointerException e)
        {
            throw e;
        }
    }
    
    public String getFileName() {
        return fileName;
    }
    
    /**
     * 
     * @throws FileNotFoundException if couldn't find a file with the given name
     * @throws NullPointerException if couldn't create a Student instance due to invalid line format in the file
     */
    public final void  readFromFile() throws FileNotFoundException,NullPointerException {
        File file = new File(this.fileName);

        try (Scanner scanner = new Scanner(file)) {
            database.clear();
            while (scanner.hasNext()) {
                Student student = createStudentFrom(scanner.nextLine());
                if (student != null) {
                    database.add(student);
                }
                else
                {
                    throw new NullPointerException("Couldn't read from file:"+this.fileName +", Invalid line format");
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + this.fileName);
        }
    }
    
    public Student createStudentFrom(String line) {
        if(line == null){
            return null;
        }
        String[] fields = line.split(","); 
        /**
         * Note that!!
         * field[0] = (String)studentID; --> to be casted to int
         * field[1] = (String)fullName; 
         * field[2] = (String)age;       --> to be casted to int
         * field[3] = (String)gender;    --> to be casted to int
         * field[4] = (String)department;
         * field[5] = (String)GPA;       --> to be casted to double
         * Total are 6 fields
         */
        if(fields.length != 6){
            return  null;
        }
        try
        {
           return  new Student(Integer.parseInt(fields[0]),fields[1],Integer.parseInt(fields[2]),Integer.parseInt(fields[3]),fields[4],Double.parseDouble(fields[5])); 
        }
        catch(NumberFormatException e)
        {
            return null;
        }
        
    }
    
    public void saveToFile() throws Exception {
        File file = new File(this.fileName);
        try (FileWriter writer = new FileWriter(file)) {
            for (Student student: this.database) {
                writer.write(student.lineRepresentation() + "\n");
            }
        } catch (Exception e) {
            throw new Exception("Error saving to file: " +  this.fileName);
        }
    }
}
