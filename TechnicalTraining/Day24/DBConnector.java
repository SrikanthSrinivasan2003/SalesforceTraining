import java.sql.*;
public class DBUtil 
{
	private static Connection cn;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="srikanth2003";
	private static final String DB_URL ="jdbc:mysql://localhost:3306/test";
	
	public static Connection getConnection()
	{
		try {
			Class.forName(DB_DRIVER_CLASS);// to load database driver
			System.out.println("Driver loaded successfully....");// connect to database
			cn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			System.out.println("Connection established successfully....");

		} catch (ClassNotFoundException e) {
			System.out.println("Error....." + e.getMessage());
			// e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error....." + e.getMessage());
		}
		return cn;

	}
}
public class Executer {

	public static void main(String[] args) {
		StatementInterfaceDemo.showEmp();
//		System.out.println("----------------------------------------------");
	System.out.println(StatementInterfaceDemo.updateEmpName(5, "Neha"));
//		StatementInterfaceDemo.updateEmpSalary(5, 65000);
//		System.out.println("-------------After Updating Name and Salary------------");
//		StatementInterfaceDemo.showEmp();
		StatementInterfaceDemo.deleteEmp(5);
//		StatementInterfaceDemo.deleteEmp(101);
//		StatementInterfaceDemo.deleteEmp(102);
//		System.out.println("-----------After Deleting --------------------");
		StatementInterfaceDemo.showEmp();

	}

}
import java.sql.*;
public class PreparedStatementDemo {

}

import java.sql.*;
public class StatementInterfaceDemo 
{
static Connection cn;
static Statement st;

static
{
	cn=DBUtil.getConnection();
	try {
		st=cn.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
}

//creation
public static int addEmployee(int empId, String empName, double empSalary)
{
	int n=0;
	String query="INSERT INTO emp VALUES(" + empId + ",'" + empName + "'," + empSalary + ")";
	try {
		n=st.executeUpdate(query);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return n;
}
//validating emp
public static int validateEmp(int empId) {
	int n = 0;
	try {
		String query = "SELECT count(*) FROM emp where id=" + empId;
		ResultSet rs = st.executeQuery(query);//
		if (rs.next()) //columns
		{
			if (rs.getInt(1) != 0)
				n = 1;
		}

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return n;
}
//deletion
public static boolean deleteEmp(int empId) {
	boolean status = false;

	try {

		int n = validateEmp(empId);//10(n=1)
		if (n == 1) 
		{
			String query = "DELETE FROM emp WHERE id=" + empId;
			st.executeUpdate(query);//make changes
			status = true;//able to delete
		}

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return status;//false
}
//updation
public static boolean updateEmpName(int empId, String empName) {
	boolean status = false;
	try {

		if (validateEmp(empId) == 1) {
			String query = "UPDATE emp set name='" + empName + "' WHERE id=" + empId;
			st.executeUpdate(query);
			status = true;
		} else

			System.out.println("No such Employee Record.....");

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return status;//false
}
public static boolean updateEmpSalary(int empId, double salary) {
	boolean status = false;
	try {

		if (validateEmp(empId) == 1) {
			String query = "UPDATE emp SET salary=" + salary + " WHERE id=" + empId;
			st.executeUpdate(query);
			status = true;
		} else
			System.out.println("No such Employee Record.....");

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
	return status;
}
public static void showEmp() {
	try {

		String query = "SELECT * FROM emp";
		ResultSet rs = st.executeQuery(query);

		/*
		 * System.out.println(rs.next());
		 * System.out.println("----------------------------");
		 * System.out.println("::::"+rs.getInt(1));
		 */

		if (rs.next()) //check the row
		{
			while (rs.next()) //check column
			{

				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));
			}
		} else
			System.out.println("No Employee Records.....");
//rs.close();

	} catch (SQLException e) {

		System.out.println("Error...." + e.getMessage());
	}
}
public void closeConnection() {
	try {
		st.close();
		cn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
