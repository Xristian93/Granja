
/**
 * Clase que representa un pato
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Pato extends Ave
{
    private static final int PESO = 2;

    /**
     * Constructor for objects of class Pato
     * 
     * @param modificadoGeneticamente Mediante un boolean se le indica si es modificado o no
     */
    public Pato(boolean modificadoGeneticamente)
    {
        //Invocacion al constructor de la clase padre indicandole si es modificable geneticamente
        super(modificadoGeneticamente);
        setPeso(PESO);
    }

    /**
     * Hace a un animal emitir su sonido caracteristico
     */
    public void emitirSonidoCaracteristico(){
        System.out.println("Cua cua cua cua");
    }
}
