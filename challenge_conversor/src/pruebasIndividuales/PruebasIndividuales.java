package pruebasIndividuales;

import javax.swing.*;

public class PruebasIndividuales {
    public static void main(String[] args) {
        //int option = JOptionPane.YES_NO_OPTION;
        JOptionPane.showInputDialog("Ingrese un numero");
        int result = JOptionPane.showConfirmDialog(null,"¿Deseas continuar ?");
        if (result == JOptionPane.YES_OPTION){
            main(args);

        }else if (result == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Hasta luego");
            System.exit(0);
        }else {

            main(args);
            System.exit(0);

        }
    }
}
