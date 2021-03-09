package polimorfismoArrayList;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;
    public Entrenador(int id, String nombre, String appellidos, int edad, int idFederacion) {
        super(id, nombre, appellidos, edad);
        this.idFederacion= idFederacion;
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
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Dirige un Partido (Clase Entrenador)");
    }

    public void planificarEntrenamiento(){
        System.out.println("Planificar un Entrenamiento");
    }
}
