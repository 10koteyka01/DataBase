package MySQL;

import DAO.DAOFactory;
import DAO.WorkersDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLDaoFactory implements DAOFactory{
    private String url = "jdbc:mysql://localhost:3306/chrmz?zeroDateTimeBehavior=convertToNull";
    private String user = "root";
    private String password = "root";
    private String driver = "com.mysql.jdbc.Driver";
    
    @Override
    public Connection getConnection() throws SQLException{
        return (Connection) DriverManager.getConnection(url, user, password);
    }
    @Override
    public WorkersDAO getWorkersDao(Connection connection){
        return new MySQLWorkersDao(connection);
    }
    public MySQLDaoFactory(){
        try{
            Class.forName(driver);
        }
        catch(ClassNotFoundException e){
            System.err.println(e);
        }
    }

    
}
