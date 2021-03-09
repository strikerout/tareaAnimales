package polimorfismoArrayList;

import java.util.ArrayList;

public class main {

    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {

        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        SeleccionFutbol iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        SeleccionFutbol raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //concentración

        System.out.println("Todos los integrantes comienzan una concentración, (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante :integrantes) {
            System.out.println(integrante.getNombre()+" "+integrante.getAppellidos()+" -> ");
            integrante.concentrarse();
        }
        System.out.println("\n");
        //viaje

        System.out.println("Todos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
        for (SeleccionFutbol integrante:integrantes) {
            System.out.println(integrante.getNombre()+" "+integrante.getAppellidos()+" -> ");
            integrante.viajar();
        }
        System.out.println("\n");
        //planificar entrenamiento

        System.out.println("Planificar Entrenamiento: Solo el entrenador tiene el método para planificar un entrenamiento:");
        System.out.print(delBosque.getNombre() + " " + delBosque.getAppellidos() + " -> ");
        ((Entrenador) delBosque).planificarEntrenamiento();

        System.out.println("\n");
        //entrevista

        System.out.println("Entrevista: Solo el futbolista tiene el método para dar una entrevista:");
        System.out.print(iniesta.getNombre() + " " + iniesta.getAppellidos() + " -> ");
        ((Futbolista) iniesta).entrevista();

        System.out.println("\n");
        //masaje

        System.out.println("Masaje: Solo el masajista tiene el método para dar un masaje:");
        System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getAppellidos() + " -> ");
        ((Masajista) raulMartinez).darMasaje();



    }
}
