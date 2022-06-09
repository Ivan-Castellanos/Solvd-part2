import com.solvd.laba.dao.jdbc.mysql.impo.*;

import java.sql.SQLException;

public class DaoRunner {
    public static void main(String[] args) throws SQLException {
        AnimalDAO animal = new AnimalDAO();
        animal.getEntityById(1);
        animal.viewTable();
        animal.removeEntity(1);

        BuildingDAO building = new BuildingDAO();
        building.getEntityById(1);
        building.viewTable();
        building.removeEntity(1);

        BreedDAO breed = new BreedDAO();
        breed.getEntityById(1);
        breed.viewTable();
        breed.removeEntity(1);

        CityDAO city = new CityDAO();
        city.getEntityById(1);
        city.viewTable();
        city.removeEntity(1);

        ItemDAO item = new ItemDAO();
        item.getEntityById(1);
        item.viewTable();
        item.removeEntity(1);

        MeatCutsDAO meatc = new MeatCutsDAO();
        meatc.getEntityById(1);
        meatc.viewTable();
        meatc.removeEntity(1);
    }
}
