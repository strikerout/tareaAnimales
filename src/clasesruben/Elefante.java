package clasesruben;

public class Elefante extends AnimalSalImpl {

    public Elefante(String especie, int numPatas, String dieta, String habitad) {
        super(especie, numPatas, dieta, habitad);
    }
        public void mostrarDatos(){
        setEsperanzaVida(70);
        setPeso(6000);
        setTamanoPromedio(3.2f);
        System.out.print("Esperanza de vida: "+getEsperanzaVida()+" años"+"\nPeso promedio: "+getPeso()+" Kg"+"\nTamaño promedio: "+getTamanoPromedio()+ " Mts"+
                "\nCantidad de patas: " + numPatas + "\nDieta: " + dieta);
    }
}
