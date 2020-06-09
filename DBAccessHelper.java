package ca.myseneca.model;

public class DBAccessHelper {

	public static void addEmployee (Employe emp);
	public static ArrayList<Employe> getAllEmployees();
	public static ArrayList<Employe> getEmployeesByDepartmentID (int depid);
	public static Employee getEmployeeByID(int empid);
	
	 public static int updateEmployee (Employee emp);
	 public static int deleteEmployeeByID (int empid);

	
	public static int getEmployeeID (String user, String password);
	
	
	public static boolean batchUpdate(String[] SQLs);
	
	
	
	
	
	
}
