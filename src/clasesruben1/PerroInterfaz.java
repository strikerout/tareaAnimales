package clasesruben1;

public class PerroInterfaz implements Interfaz {

    @Override
    public void saltar(){
        System.out.println("Salta Poco");
    }
    @Override
    public int correr(){
        return 100;
    }
}
