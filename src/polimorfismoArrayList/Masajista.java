package polimorfismoArrayList;

public class Masajista extends SeleccionFutbol {
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String appellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, appellidos, edad);
        this.titulacion=titulacion;
        this.aniosExperiencia=aniosExperiencia;
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
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }

    @Override
    public void partidoFutbol() {
        super.partidoFutbol();
    }

    public void darMasaje(){
        System.out.println("Da un Masaje");
    }
}
