package medecine.mvc.java.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import medecine.mvc.java.model.Departement;
import medecine.mvc.java.model.Medecine;
import medecine.mvc.java.util.DBConnectionUtil;

public class DepartementDAOImpl implements DepartementDAO {

	Connection connection = null;
	ResultSet resultSet = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;
	
	
	
	public List<Departement> get(){
		
		List<Departement> list = null;
		Departement departement = null;
		try {
			
			list = new ArrayList<Departement>();
			String sql = "SELECT departement FROM medecin";
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				departement= new Departement();
				departement.setId(resultSet.getInt("departement"));
				
				list.add(departement);
			}
		}catch(SQLException m) {
			m.printStackTrace();
		}
		return list;

	}
	
	public Departement get(int id) {
		Departement departement = null;
		try {
			departement = new Departement();
			String sql = "SELECT departement FROM medecin where departement="+id;
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				departement.setId(resultSet.getInt("departement"));
				
			
			}
		}catch(SQLException m) {
			m.printStackTrace();
		}
		return departement;
	}

	

}
