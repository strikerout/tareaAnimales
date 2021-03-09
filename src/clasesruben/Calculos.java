package clasesruben;

public class Calculos{

    private String animalMas = null;
    private String animalMen= null;

        public void pesoMaxMin(int[] peso, String[] especie){
           int pesoMax= -999;
           int pesoMin= 9999;

          try {
              for (int i=0; i<peso.length+1; i++) {

                  if (peso[i]>pesoMax){
                      pesoMax = peso[i];
                      animalMas= especie[i];
                  }
                  if (peso[i]<pesoMin){
                      pesoMin = peso[i];
                      animalMen= especie[i];
                  }
              }
          } catch (IndexOutOfBoundsException e){
              System.out.println("Error: " +e.getMessage());
          } catch (NullPointerException f){
              System.out.println("Error: "+f.getMessage());
          }finally {
            System.out.println("El animal más pesado es: "+ animalMas +"\nCon un peso de: "+pesoMax+" Kgs.");
            System.out.println("El animal menos pesado es: "+animalMen+"\nCon un peso de: "+pesoMin+" Kgs.");
            System.out.println("\n");
          }
        }

        public void tamanioMaxMin(float[] tamanio, String[] especie) {

            float tamanioMax = -999;
            float tamanioMin = 9999;

            for (int i = 0; i < tamanio.length; i++) {

                if (tamanio[i] > tamanioMax) {
                    tamanioMax = tamanio[i];
                    animalMas = especie[i];
                    }
                if (tamanio[i] < tamanioMin) {
                    tamanioMin = tamanio[i];
                    animalMen = especie[i];
                    }
            }

            System.out.println("El animal más grande es: " + animalMas + "\nCon un tamaño de: " + tamanioMax + " Mts.");
            System.out.println("El animal más pequeño es: " + animalMen + "\nCon un tamaño de: " + tamanioMin + " Mts.");
            System.out.println("\n");
        }

         public void esperanzaMaxMin(int[] esperanza, String[] especie) {

            int esperanzaMax = -999;
            int esperanzaMin = 9999;

            for (int i = 0; i < esperanza.length; i++) {

                if (esperanza[i] > esperanzaMax) {
                esperanzaMax = esperanza[i];
                animalMas = especie[i];
                }
                if (esperanza[i] < esperanzaMin) {
                esperanzaMin = esperanza[i];
                animalMen = especie[i];
                }
            }

            System.out.println("El animal más longevo es: " + animalMas + "\nCon una esperanza de vida de: " + esperanzaMax + " Años.");
            System.out.println("El animal menos longevo es: " + animalMen + "\nCon una esperanza de vida de: " + esperanzaMin + " Años.");
            System.out.println("\n");
        }


}
