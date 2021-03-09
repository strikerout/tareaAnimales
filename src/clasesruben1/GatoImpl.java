package clasesruben1;

public class GatoImpl implements Interfaz {

    @Override
    public void saltar(){
        System.out.println("Salta Mucho");
    }
    @Override
    public int correr(){
        return 70;
    }
}
