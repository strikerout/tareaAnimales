package clasesruben;

public class Tiburon extends AnimalSalImpl {

    public int numAletas;
    public int getNumAletas() {
        return numAletas;
    }

    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }


    public Tiburon(String especie, int numPatas, String dieta, String habitad, int numAletas) {
        super(especie, numPatas, dieta, habitad);
        this.numAletas=numAletas;
    }



    public void mostrarDatos(){
        setEsperanzaVida(30);
        setPeso(800);
        setTamanoPromedio(6f);
        System.out.print("Esperanza de vida: "+getEsperanzaVida()+" años"+"\nPeso promedio: "+getPeso()+" Kg"+"\nTamaño promedio: "+getTamanoPromedio()+ " Mts"+
                "\nCantidad de patas: " + numPatas + "\nDieta: " + dieta);
    }

    public void tieneAletas(){
        System.out.println("\nEl tiburón no posee piernas al ser un animal marino, en su lugar posee: " + numAletas +" Aletas\n 2 pectorales, 2 dorsales, 2 aletas pélvicas, 1 caudal y 1 anal");
    }
}
