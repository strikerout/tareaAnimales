package clasesruben;

public class AnimalDTO implements Interfaz {

    protected String especie;
    protected int numPatas;
    protected int peso;
    protected float tamanoPromedio;
    protected int esperanzaVida;
    protected String habitad;
    protected String dieta;

    public AnimalDTO(String especie, int numPatas, String dieta, String habitad){
        this.especie=especie;
        this.numPatas=numPatas;
        this.dieta=dieta;
        this.habitad=habitad;
    }


    public String getEspecie(){return  especie;}

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getTamanoPromedio() {
        return tamanoPromedio;
    }

    public void setTamanoPromedio(float tamanoPromedio) {
        this.tamanoPromedio = tamanoPromedio;
    }

    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }

    @Override
    public void habitadDom() {

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
