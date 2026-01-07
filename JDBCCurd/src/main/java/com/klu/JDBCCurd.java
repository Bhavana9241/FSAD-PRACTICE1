package com.klu;
import java.sql.*;

public class JDBCCurd {

	public static void main(String[] args) {
		String url="jdbc:mysql:localhost:3306/fsad3";
		String usr="root";
		String pwd="Bhavana@9908";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,usr,pwd);
		System.out.println("Connection established");
		Statement st=con.createStatement();
		String createDept="create table if not exista Dept("+"dept_id int primary key auto increment,"+"dept_name varchar(20)"+")";
		st.execute(createDept);
		System.out.println("Department table created");
		st.execute("create table if not exists Emp(emp_id int primary key auto_increment, emp_name varchar(50), sal double, dept_id int foreign key(dept_id) references dept(dept_id)");
		System.out.println("Employee table created");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}