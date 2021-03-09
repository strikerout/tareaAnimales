package clasesruben1;

public class Humano implements Interfaz {

    @Override
    public void saltar(){
        System.out.println("Salta Muy Poco");
    }
    @Override
    public int correr(){
        return 35;
    }
}
