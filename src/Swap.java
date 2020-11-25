class Employee 
{ 
    int empID,empAge;
    String empName;
	public Employee(int empID, int empAge, String empName) {
		super();
		this.empID = empID;
		this.empAge = empAge;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empAge=" + empAge + ", empName=" + empName + "]";
	}
     
} 
public class Swap {
	
	public static void swap(Employee e1, Employee e2) 
    { 
//		Employee temp = e1; 
//        e1 = e2; 
//        e2 = temp;
		
		e1.empID=e1.empID+e2.empID;
		e2.empID=e1.empID-e2.empID;
		e1.empID=e1.empID-e2.empID;
		
		e1.empAge=e1.empAge+e2.empAge;
		e2.empAge=e1.empAge-e2.empAge;
		e1.empAge=e1.empAge-e2.empAge;
		
		e1.empName=e1.empName+e2.empName;
		e2.empName=e1.empName.substring(0, e1.empName.length()-e2.empName.length());
		e1.empName=e1.empName.substring(e2.empName.length());
		
        System.out.println("After Swapping");
        System.out.println(e1);
	    System.out.println(e2);
    }
	
	public static void main(String args[]) {
	
		Employee e1 = new Employee(1,20,"A"); 
		Employee e2 = new Employee(2,21,"B"); 
		System.out.println("Before Swapping");
		System.out.println(e1);
	    System.out.println(e2);
	    
	    swap(e1, e2);
	    
	}
	
	
	

}

//class Employee 
//{ 
//    int empID,empAge;
//    String empName;
//	public Employee(int empID, int empAge, String empName) {
//		super();
//		this.empID = empID;
//		this.empAge = empAge;
//		this.empName = empName;
//	}
//	public void setEmpID(int empID) {this.empID = empID;}
//	public void setEmpName(String empName) {this.empName = empName;}
//	public void setEmpAge(int empAge) {this.empAge = empAge;}
//
////Get methods
//
//	public int getEmpID() {return empID;}
//	public String getEmpName() {return empName;}
//	public int getEmpAge() {return empAge;}
//	@Override
//	public String toString() {
//		return "Employee [empID=" + empID + ", empAge=" + empAge + ", empName=" + empName + "]";
//	}
//     
//} 
//public class Swap {
//	
//	public static void swap(Employee e1, Employee e2) 
//    { 
//	int empId = e1.getEmpID();
//		e1.setEmpID(e2.getEmpID());
//		e2.setEmpID(empId);
//		
//	 String empName = e1.getEmpName();
//		e1.setEmpName(e2.getEmpName());
//		e2.setEmpName(empName);
//		
//		int empAge = e1.getEmpAge();
//		e1.setEmpAge(e2.getEmpAge());
//		e2.setEmpAge(empAge);
//    }
//	
//	public static void main(String args[]) {
//	
//		Employee e1 = new Employee(1,20,"A"); 
//		Employee e2 = new Employee(2,21,"B"); 
//	    swap(e1, e2);
//	    
//	}
//	
//
//}
