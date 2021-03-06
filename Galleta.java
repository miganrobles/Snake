import java.awt.Color;
import java.util.Random;

/**
 * Write a description of class Galleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galleta
{
    // instance variables - replace the example below with your own
    private int posicionX;
    private int posicionY;
    private int anchoLienzo;
    private int altoLienzo;
    public static final int DIAMETRO_GALLETA = 10;
    public static final Color COLOR_GALLETA = Color.RED;

    /**
     * Constructor for objects of class Galleta
     */
    public Galleta(int altoLienzo, int anchoLienzo)
    {
        this.altoLienzo = altoLienzo;
        this.anchoLienzo = anchoLienzo;
        Random aleatorio = new Random();
        int margenLienzo = Snake.MARGEN_LIENZO;
        posicionX = aleatorio.nextInt(anchoLienzo - (2 * margenLienzo)) + margenLienzo - (DIAMETRO_GALLETA / 2);
        posicionY = aleatorio.nextInt(anchoLienzo - (2 * margenLienzo)) + margenLienzo - (DIAMETRO_GALLETA / 2);
    }

    /**
     * Dibuja la galleta sobre el lienzo que le pasamos
     */
    public void dibujar(Canvas lienzo)
    {
        lienzo.setForegroundColor(COLOR_GALLETA);
        lienzo.fillCircle(posicionX, posicionY, DIAMETRO_GALLETA);
    }

    /**
     * Borra la galleta del lienzo
     */
    public void borrar(Canvas lienzo)
    {
        lienzo.eraseCircle(posicionX, posicionY, DIAMETRO_GALLETA);
    }

    /**
     * Devuelve el punto mas a la izquierda de la galleta en el eje X
     */
    public int getPosicionInicialX()
    {
        return posicionX;
    }

    /**
     * Devuelve el punto mas alto de la galleta en el eje Y
     */
    public int getPosicionInicialY()
    {
        return posicionY;
    }
    
    /**
     * Devuelve el punto mas a la derecha de la galleta en el eje X
     */
    public int getPosicionFinalX()
    {
        return posicionX + DIAMETRO_GALLETA;
    }

    /**
     * Devuelve el punto mas bajo de la galleta en el eje Y
     */
    public int getPosicionFinalY()
    {
        return posicionY + DIAMETRO_GALLETA;
    }
}
