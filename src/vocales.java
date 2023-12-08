/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class vocales {

    public static void main(String[] args) {
        String palabra = "EL DIA DE AYER MARGARITA JULIA Y JORGE SALIERON DE EXCURCION";
        int aC = 0;
        int eC = 0;
        int iC = 0;
        int oC = 0;
        int uC = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (String.valueOf(palabra.charAt(i)).equalsIgnoreCase("a")) {
                aC++;
            } else if (String.valueOf(palabra.charAt(i)).equalsIgnoreCase("e")) {
                eC++;
            } else if (String.valueOf(palabra.charAt(i)).equalsIgnoreCase("i")) {
                iC++;
            } else if (String.valueOf(palabra.charAt(i)).equalsIgnoreCase("o")) {
                oC++;
            } else if (String.valueOf(palabra.charAt(i)).equalsIgnoreCase("u")) {
                uC++;
            }
        }
        int totalVocales = aC + eC + iC + oC + uC;

        System.out.println("Hay " + aC + " 'A/a' en tu oracion\n"
                + "Hay " + eC + " 'E/e' en tu oracion\n"
                + "Hay " + iC + " 'I/i' en tu oracion\n"
                + "Hay " + oC + " 'O/o' en tu oracion\n"
                + "Hay " + uC + " 'U/u' en tu oracion\n"
                + "En total hay " + totalVocales + " De vocales");

    }
}
