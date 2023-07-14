import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ChallengeConversor {
    public static void main(String[] args) {
        Icon logo = new ImageIcon(ChallengeConversor.class.getResource("/divisas.png"));
        Icon logoMoneda = new ImageIcon(ChallengeConversor.class.getResource("/monedas.png"));
        Icon logoTemperatura = new ImageIcon(ChallengeConversor.class.getResource("/temperatura.jpg"));
        Object[] conversores = {
                "Conversor de Divisas",
                "Conversor de Temperatura"
        };
        BigDecimal dolar, euro, yen, won, libra, resultado;
        Double valor, valorTemperatura;

        dolar = new BigDecimal("17.06");
        euro = new BigDecimal("18.77");
        yen = new BigDecimal("0.12");
        won = new BigDecimal("0.013");
        libra = new BigDecimal("22.06");


        String[] tiposCambios = {
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
        String[] tipoDeTemperatura = {"De Grados Fahrenheit  a Celsius ", "De Grados Celsius a Fahrenheit "};
        Object seleccionado = JOptionPane.showInputDialog(null,
                "Seleccione una opción de conversión", "Menú Conversor",
                JOptionPane.QUESTION_MESSAGE, logo,
                conversores, conversores[0]);
        if (seleccionado == conversores[0]) {

            Object seleccionadoVisas = JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión de divisas", "Menú",
                    JOptionPane.QUESTION_MESSAGE, logoMoneda, tiposCambios, tiposCambios[0]);


            if (seleccionadoVisas == tiposCambios[0]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));

                    if (valor >= 0) {

                        resultado = BigDecimal.valueOf(valor).divide(dolar, 3, RoundingMode.HALF_UP);
                        JOptionPane.showMessageDialog(null, "el total en Dólares es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo cantidades positivas");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números ");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }


            } else if (seleccionadoVisas == tiposCambios[1]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).divide(euro, 3, RoundingMode.HALF_UP);
                        JOptionPane.showMessageDialog(null, "el total en Euro es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite cantidades positivas");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[2]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).divide(libra, 3, RoundingMode.HALF_UP);
                        JOptionPane.showMessageDialog(null, "el total en Libras esterlinas  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite cantidades positivas");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[3]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    if (valor >= 0) {


                        resultado = BigDecimal.valueOf(valor).divide(yen, 3, RoundingMode.HALF_UP);
                        JOptionPane.showMessageDialog(null, "el total en Yenes  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite cantidades positiva");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números ");
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[4]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de pesos a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).divide(won, 3, RoundingMode.HALF_UP);
                        JOptionPane.showMessageDialog(null, "el total en Wons  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite números");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[5]) {
                try {

                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de dólares  a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).multiply(dolar);
                        JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite números");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[6]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de euros  a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).multiply(euro);
                        JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite números");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[7]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de libras esterlinas   a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).multiply(libra);
                        JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite números");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[8]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de yenes  a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).multiply(yen);
                        JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite números");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else if (seleccionadoVisas == tiposCambios[9]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la cantidad de wons  a convertir "));
                    if (valor >= 0) {
                        resultado = BigDecimal.valueOf(valor).multiply(won);
                        JOptionPane.showMessageDialog(null, "el total en pesos  es:  " + resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Solo admite números");
                        main(args);
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
                int result = JOptionPane.showConfirmDialog(null, "¿Deseas continuar ?");
                if (result == JOptionPane.YES_OPTION) {
                    main(args);

                } else if (result == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Hasta luego");
                    System.exit(0);
                } else {

                    main(args);
                    System.exit(0);

                }
            } else {
                main(args);
                System.exit(0);
            }


        } else if (seleccionado == conversores[1]) {

            Object seleccionadoTemperatura = JOptionPane.showInputDialog(null,
                    "Seleccione una opción de conversión de Temperatura", "Menú",
                    JOptionPane.QUESTION_MESSAGE, logoTemperatura, tipoDeTemperatura, tipoDeTemperatura[0]);
            if (seleccionadoTemperatura == tipoDeTemperatura[0]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en grados fahrenheit a convertir  "));
                    valorTemperatura = (valor - 32) / 1.8;
                    JOptionPane.showMessageDialog(null, "la temperatura en grados celsius es: " + valorTemperatura);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Solo admite números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }
            } else if (seleccionadoTemperatura == tipoDeTemperatura[1]) {
                try {
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a en grados Celsius "));
                    valorTemperatura = valor * 1.8 + 32;
                    JOptionPane.showMessageDialog(null, "La temperatura en grados fahrenheit es: " + valorTemperatura);
                }catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Solo acepta números");
                    main(args);
                    System.exit(0);
                }catch (NullPointerException e){
                    main(args);
                    System.exit(0);
                }


            }else {
                main(args);
                System.exit(0);
            }

        } else {
            int result = JOptionPane.showConfirmDialog(null, "¿Quiere Salir  ?");
            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null,"Hasta Luego");
                System.exit(0);

            } else if (result == JOptionPane.NO_OPTION) {
                main(args);
                System.exit(0);
            } else {

                main(args);
                System.exit(0);

            }


        }


    }
}