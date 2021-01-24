package assignment;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import bean.Employee;
import bean.SortbyId;
import bean.SortbyName;
import bean.SortbySalary;

 class Assign {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch,size;
	int id;		
	String name;
	int salary;	
	System.out.println("Enter the number of employee you have");	
	size=sc.nextInt();	
	ArrayList<Employee>e=new ArrayList<Employee>();
	for(int i=0;i<size;i++)	
	{		
		System.out.println("Enter the id's");
		id=sc.nextInt();		
		System.out.println("Enter the name");		
		sc.nextLine();		
		name=sc.nextLine();
		System.out.println("Enter the salary");	
		salary=sc.nextInt();	
		e.add(new Employee(id,name,salary));
	}
		System.out.println("Enter your option:");	
		System.out.println("sort id");
		System.out.println("sort name");
		System.out.println("sort salary");
		ch=sc.nextInt();
		switch (ch)
		{  	
		case 1:		
		Collections.sort(e, new SortbyId());		
		System.out.println("\nSorted by id");
		for (int i=0; i<e.size(); i++)		
                System.out.println(e.get(i));
	        break;		
		case 2:		
		Collections.sort(e, new SortbyName());			
	        System.out.println("\nSorted by name");		
	        for (int i=0; i<e.size(); i++)	
	        System.out.println(e.get(i));		
	        break;		
		case 3:		
		Collections.sort(e, new SortbySalary());		
	        System.out.println("\nSorted by salary");	
	        for (int i=0; i<e.size(); i++)		  
	        System.out.println(e.get(i));	
	        break;		
		default:	
		System.out.println("Invalid  option:");		
		break;			
   		}			
	}
 }



package bean;
public class Employee {
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
private int id;
private String name;
private int salary;  
public Employee(int id, String name, int salary) {

	this.id= id;
	this.name = name;
	this.salary = salary;
	}
	public int getId() {
	return id;
	}
public void setId(int id) {
	this.id = id;}public String getName()
 {
	return name;
 }
public void setName(String name)
 {
	this.name = name;
 }
public float getSalary()
 {
	return salary;
 }
public void setSalary(int salary)
 {
	this.salary = salary;
 }


@Overridepublic
 String toString()
 {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
 } 
} 



package bean;
import java.util.*;        //import bean.Employee;
public class SortbyId implements Comparator<Employee>	{
	    	    public int compare(Employee x, Employee y)
	    {
	        return x.getId() - y.getId();
	    }
	}



package bean;
import java.util.*;         //import bean.Employee;
public class SortbyName implements Comparator<Employee>{
       public int compare(Employee x, Employee y)
    {
        return x.getName().compareTo(y.getName());
    }
}


package bean;
import java.util.*;	 //import bean.Employee;
public class SortbySalary implementss
Comparator<Employee>
{
	public int compare(Employee x,Employee y)
	{
	return (int) (x.getSalary() - y.getSalar());
	}
}