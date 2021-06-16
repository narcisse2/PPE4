package medecine.mvc.java.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import medecine.mvc.java.model.Departement;
import medecine.mvc.java.model.Medecine;
import medecine.mvc.java.util.DBConnectionUtil;


public class DepartementDAO {
	
    List<Departement> get();
	
	Departement get(int id);
	
	
}
