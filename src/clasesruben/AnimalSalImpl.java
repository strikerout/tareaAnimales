package clasesruben;

public class AnimalSalImpl extends AnimalDTO implements Interfaz{


    public AnimalSalImpl(String especie, int numPatas, String dieta, String habitad) {
        super(especie, numPatas, dieta, habitad);
    }

    public void habitadSal(){
        System.out.println("La especie: " + especie + " vive de forma salvaje en " + habitad);

    }

    @Override
    public void habitadDom() {

    }


    @Override
    public void mostrarDatos() {

    }

    @Override
    public void tieneAletas() {

    }
}
