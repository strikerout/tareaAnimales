package polimorfismoArrayList;

public class Futbolista extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String appellidos, int edad, int dorsal, String demarcacion) {
        super(id, nombre, appellidos, edad);
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;
    }


    @Override
    public void viajar() {
        super.viajar();
    }

    @Override
    public void concentrarse() {
        super.concentrarse();
    }

    @Override
    public void entrenamiento() {
        System.out.println("Realiza un entrenamiento (Clase Futbolista");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega un pPartido (Clase Futbolista)");
    }

    public void entrevista(){
        System.out.println("Da una Entrevista");
    }
}
