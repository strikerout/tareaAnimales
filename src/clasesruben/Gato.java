package clasesruben;

public class Gato extends AnimalDomImpl {

    public Gato(String especie, int numPatas, String dieta, String habitad) {
        super(especie, numPatas, dieta, habitad);
    }

    public void mostrarDatos(){
        setEsperanzaVida(16);
        setPeso(5);
        setTamanoPromedio(0.25f);
        System.out.print("Esperanza de vida: "+getEsperanzaVida()+" años"+"\nPeso promedio: "+getPeso()+" Kg"+"\nTamaño promedio: "+getTamanoPromedio()+ " Mts"+
                "\nCantidad de patas: " + numPatas + "\nDieta: " + dieta);
    }


}
