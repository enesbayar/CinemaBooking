package Services;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.Admin;

public interface IAdminServices {
	public ArrayList<Admin> login() throws SQLException;
}
