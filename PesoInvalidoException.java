package fciencias.Anatidas.Excepciones;

/**
 * Excepción personalizada que se lanza cuando se asigna un peso inválido.
 * Esta excepción se utiliza para indicar que un peso no cumple con los requisitos esperados
 * (por ejemplo, un valor fuera del rango permitido).
 * 
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class PesoInvalidoException extends Exception {

    /**
     * Crea una nueva excepción PesoInvalidoException con un mensaje de error específico.
     * 
     * @param message el mensaje que describe el error de peso inválido.
     */
    public PesoInvalidoException(String message) {
        super(message);
    }
}
