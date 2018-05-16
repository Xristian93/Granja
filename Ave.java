import java.util.Random;

/**
 * Clase que representa un Ave
 *
 * @author (Cristian de la Fuente)
 * @version (11/05/2018)
 */
public class Ave extends Animal
{
    private boolean modificadoGeneticamente = false;

    /**
     * Constructor for objects of class Ave
     */
    public Ave(boolean modificadoGeneticamente)
    {
        super();
        this.modificadoGeneticamente = modificadoGeneticamente;
    }

    /**
     * Hace a un animal emitir su sonido caracteristico
     */
    @Override
    public void emitirSonidoCaracteristico(){
    }
    
    /**
     * Hace comer a un animal. En caso de que sea un animal modificado genéticamente tiene un 50% de posibilidades
     * de no perder puntos de vida al comer.
     * En caso de que no sea un animal modificado genéticamente se comporta como hasta ahora.
     */
    @Override
    public void comer(){
        if (modificadoGeneticamente){
            //Creacion de un obeto Random
            Random random = new Random();
            //Obtencion de un valor aleatorio para una variable booleana
            boolean value = random.nextBoolean();
            super.incrementaPeso(1);
            //Si la variable es true entra en el bucle y resta vida al animal.
            if (value){
                super.incrementaPuntosDeVida(-10);
            }
        }
        else{
            super.incrementaPeso(1);
            super.incrementaPuntosDeVida(-10);
        }
    }
}
