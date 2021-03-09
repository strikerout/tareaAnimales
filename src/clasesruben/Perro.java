package clasesruben;

public class Perro extends AnimalDomImpl {

    public Perro(String especie, int numPatas, String dieta, String habitad) {
        super(especie, numPatas, dieta, habitad);
    }

    public void mostrarDatos(){
        setEsperanzaVida(12);
        setPeso(30);
        setTamanoPromedio(0.40f);

        System.out.print("Esperanza de vida: "+getEsperanzaVida()+" años"+"\nPeso promedio: "+getPeso()+" Kg"+"\nTamaño promedio: "+getTamanoPromedio()+ " Mts"+
                "\nCantidad de patas: " + numPatas + "\nDieta: " + dieta);
    }

    public void habitadDom(){
        System.out.println("La especie: " + especie + " vive de forma doméstica en " + habitad);

    }

}

