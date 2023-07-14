import javax.swing.*;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Icon logo =  new ImageIcon(Main.class.getResource("/divisas.png"));
        Icon logoMoneda =  new ImageIcon(Main.class.getResource("/monedas.png"));
        Object [] conversores = {
                "Conversor de Divisas",
                "Conversor de Temperatura"
        };
        double dolar = 17.06, euro = 18.77, yen = 0.12, won = 0.013, libra = 22.06, resultado = 0, valor;




        String [] tiposCambios ={
                "De Peso MX a Dólares",
                "De Peso Mx a Euros",
                "De Peso Mx Libras Esterlinas",
                "De Peso Mx Yen Japonés",
                "De Peso Mx a Won",
                "De Dólar  a Peso Mx",
                "De Euros a Peso Mx",
                "De Libras Esterlinas a Peso Mx,",
                "De Yen Japonés a Peso Mx",
                "De Won sul-coreano a Peso Mx"
        };
     Object seleccionado = JOptionPane.showInputDialog(null,
               "Seleccione una opción de conversión", "Menú",
               JOptionPane.QUESTION_MESSAGE,logo,
               conversores, conversores[0]);
        if(seleccionado == conversores[0]){

            Object seleccionadoVisas = JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión de divisas", "Menú",
                    JOptionPane.QUESTION_MESSAGE,logoMoneda, tiposCambios, tiposCambios[0]);



                if (seleccionadoVisas.equals("De Peso MX a Dólares")){
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    resultado = valor / dolar;
                    resultado = Math.round(resultado * 100) /100;
                    JOptionPane.showMessageDialog(null, "el total en Dólares es:  " + resultado);
                } else if (seleccionadoVisas.equals("De Peso Mx a Euros")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    resultado =  valor / euro;
                    JOptionPane.showMessageDialog(null, "el total en Euro es:  " + resultado);
                } else if (seleccionadoVisas.equals("De Peso Mx Libras Esterlinas")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    resultado =  valor / libra;
                    JOptionPane.showMessageDialog(null, "el total en Libras esterlinas  es:  " + resultado);
                }else if (seleccionadoVisas.equals("De Peso Mx Yen Japonés")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    resultado =  valor / yen;
                    JOptionPane.showMessageDialog(null, "el total en Yenes  es:  " + resultado);
                }else if (seleccionadoVisas.equals("De Peso Mx a Won")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    resultado =  valor / won;
                    JOptionPane.showMessageDialog(null, "el total en Wons  es:  " + resultado);
                }else if (seleccionadoVisas.equals("De Dólar  a Peso Mx")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de dólares  a convertir "));
                    resultado =  valor * dolar;
                    JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                }else if (seleccionadoVisas.equals("De Euros a Peso Mx")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de euros  a convertir "));
                    resultado =  valor * euro;
                    JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                }else if (seleccionadoVisas.equals("De Libras Esterlinas a Peso Mx")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de libras esterlinas   a convertir "));
                    resultado =  valor * libra;
                    JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                } else if (seleccionadoVisas.equals("De Yen Japonés a Peso Mx")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de yenes  a convertir "));
                    resultado =  valor * yen;
                    JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                }else if (seleccionadoVisas.equals("De Won sul-coreano a Peso Mx")) {
                    valor =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de wons  a convertir "));
                    resultado =  valor * won;
                    JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                }

        }




    }


}