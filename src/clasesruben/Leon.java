package clasesruben;

public class Leon extends AnimalSalImpl {

    public Leon(String especie, int numPatas, String dieta, String habitad) {
        super(especie, numPatas, dieta, habitad);
    }

    public void mostrarDatos(){
        setEsperanzaVida(14);
        setPeso(190);
        setTamanoPromedio(1.2f);
        System.out.print("Esperanza de vida: "+getEsperanzaVida()+" años"+"\nPeso promedio: "+getPeso()+" Kg"+"\nTamaño promedio: "+getTamanoPromedio()+ " Mts"+
                "\nCantidad de patas: " + numPatas + "\nDieta: " + dieta);
    }
}
