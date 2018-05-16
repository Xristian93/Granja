
/**
 * Clase que representa un animal
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public abstract class Animal
{
    private static final int PUNTOS_DE_VIDA = 100;
    private int puntosDeVida;
    private int peso;
    
    /**
     * Constructor de la clase Animal
     * 
     * @param puntosDeVida Los puntos de vida del animal
     * @param peso El peso del animal
     */
    public Animal()
    {  
        puntosDeVida = PUNTOS_DE_VIDA;
    }
    
    /**
     * Hace comer a un animal
     */
    public abstract void comer();
    
    /**
     * Hace a un animal emitir su sonido caracteristico
     */
    public abstract void emitirSonidoCaracteristico();
    
    /**
     * Retorna los puntos de vida del animal
     */
    public int getPuntosDeVida(){
        return puntosDeVida;
    }
    
    /**
     * Incrementa los puntos de vida del animal
     */
    public void incrementaPuntosDeVida(int nuevaVida){
        puntosDeVida += nuevaVida;
    }
    
    /**
     * Retorna la vida del animal
     */
    public int getPeso(){
        return peso;
    }
    
    /**
     * Incrementa el peso del animal
     */
    public void incrementaPeso(int nuevoPeso){
        peso += nuevoPeso;
    }
    
    /**
     * Modifica el peso del animal
     */
    public void setPeso(int nuevoPeso){
        peso = nuevoPeso;
    }
}
