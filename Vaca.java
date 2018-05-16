
/**
 * Clase que representa una vaca
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Vaca extends Mamifero implements AnimalVacunable
{
    private static final int PESO = 25;
    
    /**
     * Constructor for objects of class Vaca
     */
    public Vaca(int calidadRaza)
    {
        //Invocacion al constructor de la clase padre indicandole la calidad de la raza y el peso
        super(calidadRaza);
        super.setPeso(PESO);
    }
    
    /**
     * Hace a un animal emitir su sonido caracteristico
     */
    @Override
    public void emitirSonidoCaracteristico(){
        System.out.println("Muuuuuuuuuuu");
    }
    
    /**
     * Metodo para vacunar a un animal
     */
    @Override
    public void vacunar(){
        super.incrementaPuntosDeVida(30);
    }
    
}
