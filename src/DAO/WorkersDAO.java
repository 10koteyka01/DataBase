package DAO;

import java.util.List;
import java.sql.SQLException;
import model.Workers;

public interface WorkersDAO {
    public Workers create() throws SQLException;
    public Workers read(int ID) throws SQLException;
    public void update(Workers worker);
    public void delete(Workers worker);
    public List<Workers> getAll() throws SQLException;
}
