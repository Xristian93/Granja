
/**
 * Clase que representa un pato
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Pato extends Ave
{
    private static final int PESO = 2;
    private static final String SONIDO_CARACTERISTICO = "Cua cua cua cua";

    /**
     * Constructor for objects of class Pato
     * 
     * @param modificadoGeneticamente Mediante un boolean se le indica si es modificado o no
     */
    public Pato(boolean modificadoGeneticamente, String sonidoCaracteristico)
    {
        //Invocacion al constructor de la clase padre indicandole si es modificable geneticamente
        super(modificadoGeneticamente, sonidoCaracteristico);
        setPeso(PESO);
    }
}
