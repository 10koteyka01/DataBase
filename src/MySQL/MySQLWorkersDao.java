package MySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Workers;

public class MySQLWorkersDao implements DAO.WorkersDAO {
    private final Connection connection;
    public MySQLWorkersDao(Connection connection){
        this.connection = connection;
    }

    @Override
    public Workers create() {
        return null;
    }

    @Override
    public Workers read(int ID) throws SQLException{
        String sql = "SELECT * FROM chrmz.workers where ID_Workers = ?;";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setInt(1, ID);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        
        Workers worker = new Workers();
        
        worker.setId(rs.getInt("ID_Workers"));
        worker.setFamily(rs.getString("Family"));
        worker.setName(rs.getString("Name"));
        worker.setPatronymic(rs.getString("Patronymic"));
        worker.setTelephone(rs.getString("Telephone"));
        worker.setStatus(rs.getString("Status"));
        
        return worker;
    }

    @Override
    public void update(Workers worker) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Workers worker) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Workers> getAll() throws SQLException {
      String sql = "SELECT * FROM chrmz.workers;";  
      PreparedStatement stmt = connection.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();
      List<Workers> list = new ArrayList<>();
      while(rs.next()){
        Workers worker = new Workers();
        
        worker.setId(rs.getInt("ID_Workers"));
        worker.setFamily(rs.getString("Family"));
        worker.setName(rs.getString("Name"));
        worker.setPatronymic(rs.getString("Patronymic"));
        worker.setTelephone(rs.getString("Telephone"));
        worker.setStatus(rs.getString("Status"));
        list.add(worker);
        }
      return list;
    }
}
