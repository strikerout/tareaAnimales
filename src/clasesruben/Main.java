package clasesruben;

import java.util.ArrayList;

public class Main {
    public static ArrayList<AnimalDTO> especies = new ArrayList<AnimalDTO>();
    private static final String CAR="Carnívoro";
    private static final String HER="Herbívoro";
    public static void main(String[] args) {


        AnimalDTO perro = new Perro("Perro", 4, CAR, "Casa");
        perro.habitadDom();
        perro.mostrarDatos();
        System.out.println("\n");

        AnimalDTO gato = new Gato("Gato", 4, CAR, "Casa");
        gato.habitadDom();
        gato.mostrarDatos();
        System.out.println("\n");

        AnimalDTO tiburon = new Tiburon("Tiburon Blanco", 0, CAR,"Océano",8);
        tiburon.habitadSal();
        tiburon.mostrarDatos();
        tiburon.tieneAletas();
        System.out.println("\n");

        AnimalDTO leon = new Leon("León", 4, CAR, "Sabana Africana");
        leon.habitadSal();
        leon.mostrarDatos();
        System.out.println("\n");

        AnimalDTO elefante = new Elefante("Elefante Africano", 4, HER, "Sabana Africana");
        elefante.habitadSal();
        elefante.mostrarDatos();
        System.out.println("\n");
        System.out.println("|||||||||||||||||||||RESULTADOS|||||||||||||||||||||\n\n");

        especies.add(perro);
        especies.add(gato);
        especies.add(tiburon);
        especies.add(leon);
        especies.add(elefante);

        int[] peso = new int[especies.size()];
        float[] tamanio= new float[especies.size()];
        int[] esperanza= new int[especies.size()];
        String[] especie= new String[especies.size()];

        for (int i=0; i<especies.size();i++ ){
            peso[i] = especies.get(i).getPeso();
            tamanio[i] = especies.get(i).getTamanoPromedio();
            esperanza[i] = especies.get(i).getEsperanzaVida();
            especie[i] = especies.get(i).getEspecie();
        }





        //int[] peso = {especies.get(1).getPeso(), gato.getPeso(),tiburon.getPeso(),leon.getPeso(),elefante.getPeso()};
        //float[] tamanio = {perro.getTamanoPromedio(), gato.getTamanoPromedio(),tiburon.getTamanoPromedio(),leon.getTamanoPromedio(),elefante.getTamanoPromedio()};
        //int[] esperanza = {perro.getEsperanzaVida(), gato.getEsperanzaVida(),tiburon.getEsperanzaVida(),leon.getEsperanzaVida(),elefante.getEsperanzaVida()};
        //String[] especie = {perro.getEspecie(), gato.getEspecie(), tiburon.getEspecie(), leon.getEspecie(), elefante.getEspecie()};

        Calculos calculos = new Calculos();
        calculos.pesoMaxMin(peso, especie);
        calculos.tamanioMaxMin(tamanio, especie);
        calculos.esperanzaMaxMin(esperanza, especie);


    }
}
