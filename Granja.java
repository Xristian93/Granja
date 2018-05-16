
/**
 * Una granja de animales
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Granja
{

    /**
     * Constructor de la clase Granja
     */
    public Granja()
    {  
    }

    /**
     * Metodo para alimentar a un animal
     *
     * @param  animal El animal a alimentar
     */
    public void alimentar(Animal animal)
    {
        animal.comer();
    }
    
    /**
     * Metodo para vacunar a un animal
     *
     * @param  animal El animal a vacunar
     */
    public void vacunar(AnimalVacunable animal)
    {
        animal.vacunar();
    }
    
    /**
     * Metodo para hacer que un animal emita su sonido caracteristico
     *
     * @param  animal El animal que quieres que emita el sonido
     */
    public void hacerEmitirSonidoCaracteristico(Animal animal)
    {
        animal.emitirSonidoCaracteristico();
    }
}
