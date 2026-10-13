package metier;

/**
 * Interface métier.
 * Définit le contrat pour effectuer un calcul basé sur des données.
 */
public interface IMetier {

    /**
     * Effectue le calcul métier.
     * @return Le résultat du calcul.
     */
    double calcul();
}
