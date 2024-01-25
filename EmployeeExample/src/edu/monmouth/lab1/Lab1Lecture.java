
package edu.monmouth.lab1;
import java.util.*;

import edu.monmouth.employee.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Lab1Lecture {

	public static void main(String[] args) throws FileNotFoundException {
		System.err.println("1. String written to error console");
        System.err.println("2. Another String written to error console");
 
        PrintStream printStream = new PrintStream("ErrorFile.txt.");
        System.setErr(printStream);
 
        System.err.println("1. Write error to a file");
        System.err.print("2. Write another error to a file");
        System.err.printf("\n3. Exceptions will be written to file as an error");
		Employee employee1=new SalaryEmployee(10000);
		Employee employee2=new SalaryEmployee(20000);
		Employee employee3=new SalesEmployee(1000);
		Employee employee4=new SalesEmployee(2000);
		Employee employee5=new PieceEmployee(100);
		Employee employee6=new PieceEmployee(200);
        ((PieceEmployee) employee5).setPiecesMade(80);
        ((PieceEmployee) employee6).setPiecesMade(100);
		LinkedList<Employee> empList = new LinkedList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);
        empList.add(employee6);
        
        ListIterator<Employee> listIterator = empList.listIterator();  
        while(listIterator.hasNext())   
        {  
        	System.out.println(listIterator.next().toString());  
        } 
        empList.remove(employee2);
       /* for(int elementsInList=0;elementsInList<empList.size();elementsInList++)
        {
        	System.out.println(empList);
        }*/
        while(listIterator.hasNext())   
        {  
        	System.out.println(listIterator.next().toString());  
        } 
        Employee[] emp=empList.toArray(new Employee[empList.size()]);
        System.out.println("Array Elements:");
        for (int i = 0; i < emp.length; i++)
        {
           System.out.println(emp[i]);
        }
	}

}
