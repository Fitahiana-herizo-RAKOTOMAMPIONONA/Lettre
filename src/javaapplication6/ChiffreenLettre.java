package javaapplication6;

/**
 *
 * @author Herizo
 */
public class ChiffreenLettre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for (int i=0; i<1000;i++){
            Cent x = new Cent(i);
            System.out.println(x.toLettreAvecChiffre());
        }
    }
    
}
