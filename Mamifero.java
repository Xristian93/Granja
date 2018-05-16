
/**
 * Clase que representa un Mamifero
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Mamifero extends Animal
{
    private static final int INCREMENTO_PESO = 2;
    private int calidadRaza;

    /**
     * Constructor for objects of class Mamifero
     */
    public Mamifero(int calidadRaza)
    {
        //Invocacion al constructor de la clase padre indicandole los puntos de vida y el peso
        super();
        this.calidadRaza = calidadRaza;
        if (calidadRaza >= 0 && calidadRaza <=10){
            this.calidadRaza = calidadRaza;
        }
    }

    /**
     * Hace comer a un animal
     */
    @Override
    public void comer(){
        setPuntosDeVida(getPuntosDeVida()-10);
        incrementaPeso(INCREMENTO_PESO);
        if (calidadRaza >= 5){
            setPuntosDeVida(getPuntosDeVida()-(10-calidadRaza));
        }
    }
    
    /**
     * Hace a un animal emitir su sonido caracteristico
     */
    @Override
    public void emitirSonidoCaracteristico(){
    }
}
