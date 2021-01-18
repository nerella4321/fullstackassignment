import java.util.Scanner;
class Student
{
int id;
String name;
int age;
int []marks=new int[4];
char g;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("enter student details:");
System.out.println("enter id:");
id=sc.nextInt();
sc.nextLine();
System.out.println("enter name:");
name=sc.nextLine();
System.out.println("enter marks of Physics, Chemistry, Maths, Biology");
for(int i=0;i<marks.length;i++)
{
	marks[i]=sc.nextInt();
}
}
void calgrade()
{
	int total=0,avg;
	for(int i=0;i<marks.length;i++)
		{
		total=total+marks[i];
		}
		avg=total/4;
	    if(avg>90)
		g='A';
	      else if(avg>80)
		    g='A';
	      else if(avg>70)
		    g='B';
	      else if(avg>55)
		    g='C';
	      else
		    g='D';
}
void display()
{
	System.out.println("id="+id);
	System.out.println("name="+name);
	System.out.println("age="+age);
	System.out.println("Grade="+g);
}
}
class StudentTest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many student details you want to");
		int n=sc.nextInt();
		Student std[]=new Student[n];
		for(int i=0;i<n;i++)
		{
		std[i]=new Student();
		std[i].read();
		}
		for(int i=0;i<n;i++)
		{
		std[i]=new Student();
		std[i].read();
		}
		for(int i=0;i<n;i++)
		{
		std[i].calgrade();
		}
		for(int i=0;i<n;i++)
		{
		std[i].display();
		}
	}
}


