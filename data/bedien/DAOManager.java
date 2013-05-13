package data.bedien;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAOManager {
	private static final String USERNAME = "root";
	private static final String PASSWORD = null;
	private static final String DBREF = "jdbc:mysql://localhost:3306/bedienen";
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public DAOManager() {
		
	}
	
	/**
	 * Start de verbinding op
	 */
	protected void startConnection(){
		try{
			this.conn = this.getConnection();
		}catch(ClassNotFoundException | SQLException e){
			//e.printStackTrace();
		}
	}
	
	/**
	 * Sluit de verbinding af
	 */
	protected void closeConnection(){
		if (rs!=null){
	        try {
	            rs.close();
	        }catch (SQLException e){
	        	//e.printStackTrace();
	        }
	    }
	    if (ps!=null) {
	        try{
	            ps.close();
	        }catch (SQLException e){ 
	        	//e.printStackTrace();
	        }
	    }
	    if (conn!=null){
	        try{
	            conn.close();
	        }catch (SQLException e){ 
	        	//e.printStackTrace();
	        }
	    }
	}
	
	/**
     * Voert een SQL Select query uit.
     * @return					Een resultset
     */
	protected ResultSet execSelectQuery(String query) throws SQLException{
		ps = conn.prepareStatement(query);
		rs = ps.executeQuery();
		return rs;
	}
    
    /**
     * Geeft een verbinding met de database terug 
     * @return					De verbinding
     */
    private Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DBREF, USERNAME, PASSWORD);
        return conn;
    }
}
