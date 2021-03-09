package clasesruben;

public class AnimalDomImpl extends AnimalDTO implements Interfaz {


    public AnimalDomImpl(String especie, int numPatas, String dieta, String habitad) {
        super(especie, numPatas, dieta, habitad);
    }

    public void habitadDom(){
        System.out.println("La especie: " + especie + " vive de forma doméstica en " + habitad);

    }

    @Override
    public void habitadSal() {

    }

    @Override
    public void mostrarDatos() {

    }

    @Override
    public void tieneAletas() {

    }


}
