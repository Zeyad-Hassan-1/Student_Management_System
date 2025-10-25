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
import java.util.InputMismatchException;
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
     * @throws NullPointerException if couldn't create a Student instance due to
     * invalid line format in the file
     */
    public StudentDatabase(String fileName) throws FileNotFoundException, NullPointerException {

        this.fileName = fileName;
        database = new ArrayList<>();
        try {
            this.readFromFile();
        } catch (FileNotFoundException | NullPointerException e) {
            throw e;
        }
    }

    public String getFileName() {
        return fileName;
    }

    private int getMaxId()
    {
        if(database.isEmpty())
            return 0;
        
        int max = database.get(0).getStudentId();
        for(Student student:database)
        {
            int currentId = student.getStudentId();
            if(currentId>max)
            {
                max = currentId;
            }
        }
        return max;
    }
    
    /**
     * THIS METHOD MUST BE CALLED BEFORE EVERY LOADING ANY PANEL or DOING MULTIPLE OPERATIONS IN SAME PANEL ON DATABASE
     * 
     * @throws FileNotFoundException if couldn't find a file with the given name
     * @throws NullPointerException if couldn't create a Student instance due to
     *         invalid line format in the file
     * @throws InputMismatchException 
     */
    public final void readFromFile() throws FileNotFoundException, NullPointerException, InputMismatchException {
        File file = new File(this.fileName);

        try (Scanner scanner = new Scanner(file)) {
            database.clear();
            while (scanner.hasNext()) {
                Student student = createStudentFrom(scanner.nextLine());
                if (student != null) {
                    database.add(student);
                } else {
                    throw new NullPointerException("Couldn't read from file:" + this.fileName + ", Invalid line format");
                }
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + this.fileName);
        }
        catch (InputMismatchException e)
        {
            throw e;
        }
    }

    /**
     *  
     *
     * Note that!! 
     * field[0] = (String)studentId; --> to be casted to int
     * field[1] = (String)fullName;
     * field[2] = (String)age; --> to be casted to int
     * field[3] = (String)gender; --> to be casted to int 
     * field[4] = (String)department; 
     * field[5] = (String)GPA; --> to be casted to double
     * Total are 6 fields
     * 
     * @param line
     * @return a Student object from a comma-separated line of text or null if the line is invalid or cannot be parsed 
     * @throws InputMismatchException
     * @throws NumberFormatException
     */
    public Student createStudentFrom(String line) throws NumberFormatException,InputMismatchException {
        if (line == null) {
            return null;
        }
        String[] fields = line.split(",");
        if (fields.length != 6) {
            return null;
        }
        try {
            return new Student(Integer.parseInt(fields[0]), fields[1], Integer.parseInt(fields[2]), Integer.parseInt(fields[3]), fields[4], Double.parseDouble(fields[5]));
        } catch (NumberFormatException | InputMismatchException e) {
            throw e;
        }
    }

    /**
     * THIS METHOD MUST BE CALLED BEFORE EXITING ANY OPERATION ON THE DATABASE
     *
     * @throws Exception in case of save to file error
     */
    public void saveToFile() throws Exception {
        File file = new File(this.fileName);
        try (FileWriter writer = new FileWriter(file)) {
            for (Student student : this.database) {
                writer.write(student.lineRepresentation() + "\n");
            }
        } catch (Exception e) {
            throw new Exception("Error saving to file: " + this.fileName);
        }
    }

    /**
     * 
     * @return ArrayList<Student> representing the database
     */
    public ArrayList<Student> returnAllStudents() {
        return this.database;
    }

    /**
    * Searches for a student in the database by their unique student ID.
    *
    * @param studentId the unique identifier of the student to search for
    * @return Student object with the specified ID, or null if not found
    */
    public Student searchStudent(int studentId) {
        if(this.database.isEmpty())
            return null;
        
        for (Student student : this.database) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }
    
    /**
     * 
     * @param fullName
     * @return Arraylist<Student> targets which has a list of all names that start with the argument fullName
     *         or empty list in case of no matches
     */
    public ArrayList<Student> searchStudent(String fullName)
    {
        if(this.database.isEmpty())
            return null;
        
        ArrayList<Student> targets = new ArrayList<Student>();
        for(Student student : this.database)
        {
            if(student.getFullName().startsWith(fullName));
            targets.add(student);
        }
        return targets;
    }
    
    /**
     * 
     * @param studentId
     * @param fullName
     * @param age
     * @param GENDER_OPTION
     * @param department
     * @param GPA
     * @throws InputMismatchException in case of any violation to standard Student parameters format or pre-existing ID
     */
    public void addStudent(int studentId, String fullName, int age, int GENDER_OPTION, String department, double GPA) throws InputMismatchException
    {
        try
        {
           Student student = new Student(studentId,fullName,age,GENDER_OPTION,department,GPA);
            addStudent(student);
        }
        catch(InputMismatchException e)
        {
            throw e;
        }
    }
    
    /**
     * 
     * @param fullName
     * @param age
     * @param GENDER_OPTION
     * @param department
     * @param GPA
     * @throws InputMismatchException in case of any violation to standard Student parameters format
     */
    public void addStudent(String fullName, int age, int GENDER_OPTION, String department, double GPA) throws InputMismatchException
    {
        try
        {
           addStudent(getMaxId()+1,fullName,age,GENDER_OPTION,department,GPA);
        }
        catch(InputMismatchException e)
        {
            throw e;
        }
    }
    
    /**
     * 
     * @param student
     * @throws InputMismatchException in case of any violation to standard Student parameters format or pre-existing ID
     */
    public void addStudent(Student student) throws InputMismatchException
    {
        if(searchStudent(student.getStudentId())!=null)
        {
            throw new InputMismatchException("Error: "+student.getStudentId()+" Already Exists!");
        }
        database.add(student);
    }
    
    /**
     * 
     * @param studentId
     * @return true in case of successful deletion, false otherwise
     */
    public boolean deleteStudentById(int studentId)
    {
        Student target = searchStudent(studentId);
        if(target==null)
        {
            return false;
        }
        
        database.remove(target);
        return true;
    }
    
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
    public void editStudentById(int studentId, int age, String department, double GPA) throws InputMismatchException
    {
        Student target = searchStudent(studentId);
        if(target==null)
        {
            throw new InputMismatchException("Error: "+studentId+" Doesn't Exist!");
        }
        try
        {
            target.setAge(age);
            target.setDepartment(department);
            target.setGPA(GPA);
        }
        catch(InputMismatchException e)
        {
            throw e;
        }
    }
    
    /**
     * 
     * @param studentId
     * @param age
     * @throws InputMismatchException 
     */
    public void editStudentById(int studentId,int age) throws InputMismatchException
    {
      Student target = searchStudent(studentId);
        if(target==null)
        {
            throw new InputMismatchException("Error: "+studentId+" Doesn't Exist!");
        }
        try
        {
            target.setAge(age);
        }
        catch(InputMismatchException e)
        {
            throw e;
        }  
    }
    
    /**
     * 
     * @param studentId
     * @param GPA
     * @throws InputMismatchException 
     */
    public void editStudentById(int studentId,double GPA) throws InputMismatchException
    {
      Student target = searchStudent(studentId);
        if(target==null)
        {
            throw new InputMismatchException("Error: "+studentId+" Doesn't Exist!");
        }
        try
        {
            target.setGPA(GPA);
        }
        catch(InputMismatchException e)
        {
            throw e;
        }  
    }
    
    /**
     * 
     * @param studentId
     * @param department
     * @throws InputMismatchException 
     */
    public void editStudentById(int studentId,String department) throws InputMismatchException
    {
      Student target = searchStudent(studentId);
        if(target==null)
        {
            throw new InputMismatchException("Error: "+studentId+" Doesn't Exist!");
        }
        try
        {
            target.setDepartment(department);
        }
        catch(InputMismatchException e)
        {
            throw e;
        }  
    }
    
    
}
