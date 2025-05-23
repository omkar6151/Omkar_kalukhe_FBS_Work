package Demo;

public class Assignment01 {
	
	//que01
	public float Temperature(float C) {
		float F;

	    F = (C * 9/5) + 32; 
	    return F;

	}
	
	//que02
	public float area(float len, float wid) {
	    
	    float area;
	    area = len * wid;
	    

	    return area;    
	}

	public float perimeter(float len, float wid){
	    float perimeter;
	    perimeter = 2 * (len + wid);
	    return perimeter;
	}
	
	//que03
	int totalSum(int number) {
	    int r1,r2,r3,x ,sum;
	  

	    r1 = number % 10;
	    x = number / 10;
	    r2 = x % 10;
	    r3 = x / 10;

	    sum = r1 + r2 + r3;

	    return sum;

	}
	
	void evenOdd(int number) {
	    

	    if(number%2==0) {
	        System.out.println("the number is even");
	    }
	    else {
	    	System.out.println("the number is odd");
	    }
	    
	}
	
	void totalSalary(float basic_sal) {
	    double da, ta, hra, total_salary;

	    
	    

	 
	    if (basic_sal <= 5000) {
	        da = (10.0 / 100) * basic_sal;   
	        ta = (20.0 / 100) * basic_sal;   
	        hra = (25.0 / 100) * basic_sal;  
	    } else {
	        da = (15.0 / 100) * basic_sal;   
	        ta = (25.0 / 100) * basic_sal;   
	        hra = (30.0 / 100) * basic_sal;  
	    }

	    
	    total_salary = basic_sal + da + ta + hra;

	    
	    System.out.println("Total Salary " + total_salary);

	}
	
	void marriage(int maleAge, int femaleAge){
		   

	    if(maleAge >=21) {
	        System.out.println("Eligible for marriage\n");
	    }
	    else {
	    	System.out.println("\nnot eligible for marriage");
	    }

	    if(femaleAge >=18) {
	    	System.out.println("\nEligible for marriage\n");
	    }
	    else {
	    	System.out.println("\nnot eligible for marriage");
	    }
	}
	
}
