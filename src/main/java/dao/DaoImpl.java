package dao;

/**
 * Implémentation concrète de l'interface IDao.
 * Simule une récupération de données depuis une source externe.
 */
public class DaoImpl implements IDao {

    @Override
    public double getValue() {
        // Simule une requête vers une base de données ou un service distant
        System.out.println("[DAO] Récupération de la valeur depuis la source de données...");
        return 100.0;
    }
}
