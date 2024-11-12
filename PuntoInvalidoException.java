package fciencias.Punto.Excepciones;

/**
 * Excepción personalizada que se lanza cuando un punto tiene coordenadas inválidas.
 * Esta excepción se usa para indicar que las coordenadas de un punto no cumplen
 * con los requisitos esperados (por ejemplo, valores negativos).
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class PuntoInvalidoException extends Exception {

    /**
     * Crea una nueva excepción PuntoInvalidoException con un mensaje de error específico.
     * 
     * @param message el mensaje que describe el error.
     */
    public PuntoInvalidoException(String message) {
        super(message);
    }
}

