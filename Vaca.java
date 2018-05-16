
/**
 * Clase que representa una vaca
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Vaca extends Mamifero implements AnimalVacunable
{
    private static final int PESO = 25;
    private static final String SONIDO_CARACTERISTICO = "Muuuuuuuuuuu";
    
    /**
     * Constructor for objects of class Vaca
     */
    public Vaca(int calidadRaza, String sonidoCaracteristico)
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
        incrementaPuntosDeVida(30);
    }
    
}
