package polimorfismoArrayList;

public abstract class SeleccionFutbol {

    protected int id;
    protected String nombre;
    protected String appellidos;
    protected int edad;

    //consturctores, getter & setters


    public SeleccionFutbol(int id, String nombre, String appellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.appellidos = appellidos;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getAppellidos() {
        return appellidos;
    }


    public void viajar(){
        System.out.println("Viajar (Clase Padre)");
    }
    public void concentrarse(){
        System.out.println("Concentrarse (Clase Padre)");
    }

    //METODO ABSTRACTO = NO SE IMPLEMENTA EN LA CLASE ABSTRACTA PERO SI EN LAS HIJAS

    public abstract void entrenamiento();

    public void partidoFutbol(){
        System.out.println("Asiste al partido de Fútbol (Clase Padre");
    }

}
