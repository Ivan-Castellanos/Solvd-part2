import com.solvd.laba.dao.jdbc.mysql.impo.AnimalDAO;

import java.sql.SQLException;

public class DaoRunner {
    public static void main(String[] args) throws SQLException {
        AnimalDAO animal = new AnimalDAO();
        System.out.println(animal.getEntityById(1));
    }
}
