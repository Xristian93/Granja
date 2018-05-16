
/**
 * Clase que representa un cerdo
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Cerdo extends Mamifero implements AnimalVacunable
{
    private static final int PESO = 15;
    
    /**
     * Constructor for objects of class Cerdo
     */
    public Cerdo(int calidadRaza)
    {
        //Invocacion al constructor de la clase padre indicandole la calidad de la raza y el peso
        super(calidadRaza);
        setPeso(PESO);
    }

    /**
     * Hace a un animal emitir su sonido caracteristico
     */
    @Override
    public void emitirSonidoCaracteristico(){
        System.out.println("Oing oing oing");
    }

    /**
     * Metodo para vacunar a un animal
     */
    @Override
    public void vacunar(){
        incrementaPuntosDeVida(20);
    }
}
