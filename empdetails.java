import java.util.Scanner;
class EmployeeDetails
{
Scanner s=new Scanner(System.in);
int n;
EmployeeDetails(int n)
{
n=a;
}
int []id= new int[10];
String []name=new String[10];
float []salary=new float[10];
float []salary=new float[10];
string []desg=new String[10];
void read()
{
for(int i=0;i<n;i++)
{
System.out.println("Enter id of employee "+(i+1));
id[i]=s.nextInt();
s.nextLine();

System.out.println("Enter name of employee "+(i+1));
name[i]=s.nextLine();

System.out.println("Enter salary of employee "+(i+1));
salary[i]=s.nextFloat();
salarycpy[i]=salary();
s.nextLine();

System.out.println("Employee designation "+(i+1));
desg[i]=s.nextLine();
System.out.println("\n");
}

void salary()
{
for(int k=0;k<n;k++)
      {
	float hra,da,pf;
	hra=salary[k]*0.1f;
	da=salary[k]*0.07f;
	pf=salary[k]*0.05;
	salary[k]=salary[k]+hra+da-pf;
	}
}
void bonus()
{
for(int k=0;k<n;k++)
{
	salary[k]=salarycpy[k];
	float hra,da;
	hra=salary[k]*0.1f;
	da=salary[k]*0.07f;
	pf=salary[k]*0.05;
	if(desg[k].equals("manager"))
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.15f);
	}
	else if(desg[k].equals("developer"))
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.1f);
	}
	else
	{
		salary[k]=(salary[k]+hra+da-pf)+(salary[k]*0.05f);
	}
}
}
void display()
{
for(int k=0;k<n;k++)
{
	system.out.println("Employee details :"+(k+1));
	system.out.println("id="+id[k]);
	system.out.println("Name="+name[k]);
	system.out.println("salary="+salary[k]);
	system.out.println("Designation="+desg[k]);
	system.out.println("\n");
}
}
}
class Employee
{
public static void main(string args[])
{
Scanner s=new Scanner(System.in);
system.out.println("enter employee records");
int x=s.nextInt();
EmployeeDetails empd=new EmployeeDetails(x);
empd.read();
empd.salary();
empd.bonus();
empd.display();
}
}