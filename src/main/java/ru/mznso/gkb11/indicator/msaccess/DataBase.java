package ru.mznso.gkb11.indicator.msaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	private Connection connection;
	private Statement statement;
//	private String pathDataBase = "/home/admin01/eclipse-workspace/indicator/resources/";
	private String pathDataBase = "/mnt/stat/S/Васюк/work_/";
//	private String dataBaseFileName = "dogovor.mdb";
	private String dataBaseFileName = "services.accdb";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DataBase dataBase = new DataBase();
		dataBase.init();
		System.out.println(dataBase.getTestString());
	}

	public void init() throws ClassNotFoundException, SQLException {
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		connection = DriverManager
				.getConnection("jdbc:ucanaccess://" + pathDataBase + dataBaseFileName + ";memory=true");
		statement = connection.createStatement();
	}

	public ResultSet getResultSet(String sql) throws SQLException {
		ResultSet resultSet = statement.executeQuery(sql);
		return resultSet;
	}

	public String getTestString() throws SQLException {
		String sql = "SELECT * FROM Subdiv";
		ResultSet resultSet = getResultSet(sql);
		resultSet.next();
		return resultSet.getString("F1");
	}
}
