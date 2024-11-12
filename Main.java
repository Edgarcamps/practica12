package fciencias;

import fciencias.Anatidas.*;
import fciencias.Punto.*;
import fciencias.Anatidas.Excepciones.PesoInvalidoException;
import fciencias.Anatidas.Excepciones.HuevosInvalidosException;
import fciencias.Punto.Excepciones.PuntoInvalidoException;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de objetos de cada tipo (Pato, Oca, Punto)
        Pato pato1 = crearPato("Pato1", "Macho", 1.2);
        Pato pato2 = crearPato("Pato2", "Hembra", 2.5);
        
        Oca oca1 = crearOca("Oca1", "Hembra", 3.0, 20);
        Oca oca2 = crearOca("Oca2", "Macho", 4.5, 15);
        
        Punto punto1 = crearPunto(3.0, 4.0);
        Punto punto2 = crearPunto(1.0, 2.0);

        // Arreglos para cada tipo de objeto
        Pato[] patos = {pato1, pato2};
        Oca[] ocas = {oca1, oca2};
        Punto[] puntos = {punto1, punto2};

        // Mostrar información de los patos antes de ordenar
        System.out.println("Patos antes de ordenar:");
        mostrarInformacion(patos);
        
        // Ordenar los patos por peso
        OrdenamientoGenerico.ordenar(patos, new PatoComparator());
        
        // Mostrar información de los patos después de ordenar
        System.out.println("Patos después de ordenar:");
        mostrarInformacion(patos);

        // Mostrar información de las ocas antes de ordenar
        System.out.println("Ocas antes de ordenar:");
        mostrarInformacion(ocas);
        
        // Ordenar las ocas por cantidad de huevos
        OrdenamientoGenerico.ordenar(ocas, new OcaComparator());
        
        // Mostrar información de las ocas después de ordenar
        System.out.println("Ocas después de ordenar:");
        mostrarInformacion(ocas);

        // Mostrar información de los puntos antes de ordenar
        System.out.println("Puntos antes de ordenar:");
        mostrarInformacion(puntos);
        
        // Ordenar los puntos por distancia al origen
        OrdenamientoGenerico.ordenar(puntos, new PuntoComparator());
        
        // Mostrar información de los puntos después de ordenar
        System.out.println("Puntos después de ordenar:");
        mostrarInformacion(puntos);
    }

    // Método para crear un Pato
    private static Pato crearPato(String nombre, String sexo, double peso) {
        try {
            return new Pato(nombre, sexo, peso);
        } catch (PesoInvalidoException e) {
            System.out.println("Error al crear el pato: " + e.getMessage());
            return null;
        }
    }

    // Método para crear una Oca
    private static Oca crearOca(String nombre, String sexo, double peso, int huevosAnuales) {
        try {
            return new Oca(nombre, sexo, peso, huevosAnuales);
        } catch (HuevosInvalidosException e) {
            System.out.println("Error al crear la oca: " + e.getMessage());
            return null;
        }
    }

    // Método para crear un Punto
    private static Punto crearPunto(double x, double y) {
        try {
            return new Punto(x, y);
        } catch (PuntoInvalidoException e) {
            System.out.println("Error al crear el punto: " + e.getMessage());
            return null;
        }
    }

    // Método para mostrar la información de los objetos de tipo Pato, Oca o Punto
    private static void mostrarInformacion(Object[] objetos) {
        for (Object obj : objetos) {
            if (obj != null) {
                if (obj instanceof Pato) {
                    ((Pato) obj).mostrarInfo();
                } else if (obj instanceof Oca) {
                    ((Oca) obj).mostrarInfo();
                } else if (obj instanceof Punto) {
                    ((Punto) obj).mostrarInfo();
                }
            }
        }
    }
}
