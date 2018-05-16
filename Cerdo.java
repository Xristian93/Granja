
/**
 * Clase que representa un cerdo
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Cerdo extends Mamifero implements AnimalVacunable
{
    private static final int PESO = 15;
    private static final String SONIDO_CARACTERISTICO = "Oing oing oing";
    
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo(int calidadRaza, String sonidoCaracteristico)
    {
        //Invocacion al constructor de la clase padre indicandole la calidad de la raza y el peso
        super(calidadRaza, sonidoCaracteristico);
        setPeso(PESO);
    }

    /**
     * Metodo para vacunar a un animal
     */
    @Override
    public void vacunar(){
        incrementaPuntosDeVida(20);
    }
}
