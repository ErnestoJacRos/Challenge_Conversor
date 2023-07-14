import javax.swing.*;

public class TestDos {
    public static void main(String[] args) {

    convertir();
    }
    public static void convertir(){
        Double resultado = 0.0;
        try{
            Double montoACambiar = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a cambiar"));
            String tipoCambio = JOptionPane.showInputDialog(null, "que tipo de cambio quieres?");
            switch (tipoCambio){
                case "dolar" -> {
                    Double dolar = 17.05;

                    resultado = montoACambiar / dolar;
                    JOptionPane.showMessageDialog(null,"El cambio  en dólares es: " +resultado);
                }
                case "euro" -> {
                    Double euro  = 20.0;
                    resultado = montoACambiar / euro;
                    JOptionPane.showMessageDialog(null,"El cambio a Euro es: " +resultado);

                }
                default -> {
                    JOptionPane.showMessageDialog(null,"Digite una moneda Existente");
                    convertir();
                    System.exit(0);
                }

            }

        }catch (Exception e){

           JOptionPane.showMessageDialog(null, "Digite un numeros");
            convertir();
            System.exit(0);
        }


    }
}
