package Services;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.Admin;

public class AdminServices implements IAdminServices {
	public AdminServices(){
		
	}
	@Override
	public ArrayList<Admin> login() throws SQLException {
		SQLConnect sqlConnect = new SQLConnect();
		Connection con = sqlConnect.connDB();
		Statement statement = null;
		ResultSet resultSet = null;
		ArrayList<Admin> adminList = new ArrayList();
		Admin admin;
		try{
			statement = con.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM tblAdmin");
			System.out.println("tablodan adminler �ekiliyor");
			while(resultSet.next()){
				admin = new Admin(resultSet.getString("userName"), resultSet.getString("password"));
				adminList.add(admin);
				System.out.println("adminler olu�turuldu");
			}
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			statement.close();
			resultSet.close();
			con.close();
			return adminList;
		}
	}
	
}
