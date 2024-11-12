package fciencias.Anatidas.Excepciones;

/**
 * Excepción personalizada que se lanza cuando la cantidad de huevos anuales de una oca es inválida.
 * Esta excepción es utilizada para validar que el número de huevos anuales esté dentro de un rango permitido.
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class HuevosInvalidosException extends Exception {

    /**
     * Constructor que recibe un mensaje para la excepción.
     * 
     * @param message el mensaje que describe el motivo de la excepción.
     */
    public HuevosInvalidosException(String message) {
        super(message);  // Llama al constructor de la clase base (Exception)
    }
}
