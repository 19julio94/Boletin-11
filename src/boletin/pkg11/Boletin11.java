
package boletin.pkg11;

import javax.swing.JOptionPane;

/**
 *
 * @author JULIO
 */
public class Boletin11 {

    
    public static void main(String[] args) {
        long tComenzo,tFinal;
        String frase;
        JOptionPane.showMessageDialog(null,"Escribe a frase que se mostrará a continuación :");
        tComenzo=System.currentTimeMillis();
        do{
        frase=JOptionPane.showInputDialog("A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica");
        
        }while(!frase.equalsIgnoreCase("A documentacion e todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicacion informatica"));
         tFinal=System.currentTimeMillis();
         JOptionPane.showMessageDialog(null, " tardaste " + ( tFinal-tComenzo) / 1000 + " segundos");
}
    
}
    

