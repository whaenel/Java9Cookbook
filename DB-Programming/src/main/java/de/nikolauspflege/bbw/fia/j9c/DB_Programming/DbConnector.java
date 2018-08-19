package de.nikolauspflege.bbw.fia.j9c.DB_Programming;

import java.sql.Connection;
import java.sql.SQLException;

import org.mariadb.jdbc.MariaDbPoolDataSource;

public class DbConnector {
	
	private static Connection getDbConnection() throws SQLException{
		MariaDbPoolDataSource source = new MariaDbPoolDataSource();
		  source.setServerName("localhost");
		  source.setDatabaseName("cookbook");
		  source.setMinPoolSize(3); 
		  source.setMaxPoolSize(10);
		  source.setLoginTimeout(10);
		  try {
		    return source.getConnection();
		  }
		  catch(Exception ex) {
		    ex.printStackTrace();
		    return null;
		  }
		}

}
