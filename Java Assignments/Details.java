									//Assignment-2
import java.util.Scanner;				
class Details {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details you want to store:");
		int n=sc.nextInt();
		int []id=new int [n];
		String []name=new String[n];
		float []salary=new float[n];
		String[]desg=new String[n];
	
		for(int i=0;i<n;i++) {
		System.out.println("enter id for employee"+(i+1));
		id[i]=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter name for employee"+(i+1));
		name[i]=sc.nextLine();
		
		System.out.println("enter salary for employee"+(i+1));
		salary[i]=sc.nextFloat();
		sc.nextLine();
		
		System.out.println("enter id for employee"+(i+1));
		id[i]=sc.nextInt();
		sc.nextLine();
		
		System.out.println("enter desg for employee"+(i+1));
		desg[i]=sc.nextLine();
	        System.out.println("\n");
	    	}
		for(int m=0;m<n;m++)
		 {
			float hra,da,pf;
			hra=salary[m]*0.1f;
			da=salary[m]*0.07f;
		        pf=salary[m]*0.05f;
		        if(desg[m].equals("developer")) 
			{
		    	 salary[m]=(salary[m]+hra+da-pf)+(salary[m]*0.1f);
		    	 System.out.println("\n");
		    	 System.out.println("details of employee: " +(m+m));
		    	 System.out.println("id="+id[m]);
		    	 System.out.println("name="+name[m]);
		    	 System.out.println("salary="+salary[m]);
		    	 System.out.println("desg="+desg[m]);
		    	 }
		    	 else if (desg[m].equals("manager")) 
			 {
		    	 salary[m]=(salary[m]+hra+da-pf)+(salary[m]*0.15f);
		    	 System.out.println("\n");
		    	 System.out.println("details of employee: " +(m+m));
		    	 System.out.println("id="+id[m]);
		    	 System.out.println("name="+name[m]);
		    	 System.out.println("salary="+salary[m]);
		    	 System.out.println("desg="+desg[m]);
		  	 }
		     	 else {
		    	 salary[m]=(salary[m]+hra+da-pf)+(salary[m]*0.05f);
		    	 System.out.println("\n");
		    	 System.out.println("details of employee: " +(m+m));
		    	 System.out.println("id="+id[m]);
		    	 System.out.println("name="+name[m]);
		    	 System.out.println("salary="+salary[m]);
		    	 System.out.println("desg="+desg[m]);
		    	 }
		
		}
	}
	

}
