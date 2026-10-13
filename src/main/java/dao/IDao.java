package dao;

/**
 * Interface de persistance.
 * Définit le contrat pour récupérer une valeur numérique.
 */
public interface IDao {

    /**
     * Récupère la valeur depuis la source de données.
     * @return La valeur double récupérée.
     */
    double getValue();
}
