
/**
 * Clase que representa un pollo
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Pollo extends Ave implements AnimalVacunable
{
    private static final int PESO = 1;
    private static final String SONIDO_CARACTERISTICO = "Pio pio pio pio";
    
    /**
     * Constructor for objects of class Pollo
     * 
     * @param modificadoGeneticamente Mediante un boolean se le indica si es modificado o no
     */
    public Pollo(boolean modificadoGeneticamente, String sonidoCaracteristico)
    {
        //Invocacion al constructor de la clase padre indicandole si es modificable geneticamente
        super(modificadoGeneticamente, sonidoCaracteristico);
        setPeso(PESO);
    }
    
    /**
     * Metodo para vacunar a un animal
     */
    @Override
    public void vacunar(){
        incrementaPuntosDeVida(10);
    }
}
