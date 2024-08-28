package org.example;

import java.util.Objects;

class EntradaEvento {

    public static void main (String[] args) {
        crearMatrizInformacion();
        //algo2
        //algo3
    }

    public static void crearMatrizInformacion() {
        String[][] informacion = new String[10][5];
    }

    public static boolean verificarEdad(String[][] m) {
            for (int fila = 0; fila < m.length; fila++) {
                if (Integer.parseInt(m[fila][1]) >= 18) {
                    return true;
                } else {
                    return false;
                }
            }
        return false;
    }

    public static boolean verificarSiEsta(String[][] m, String persona) {
        for (int fila = 0; fila < m.length; fila++) {
            if (Objects.equals(m[fila][0], persona)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

   public static String verificarBoleto(String[][] m, String persona) {
        boolean existe = verificarSiEsta(m, persona);
        if (existe) {
            return m[Integer.parseInt(persona)][2];
        }
   }

    public static boolean validarInvitados(String[][] m, String persona) {
        boolean existe = verificarSiEsta(m, persona);
        if (existe) {
            if ()
        }
    }

    public static int aforoDisponible() {
    }

    public static boolean ingresarPersona() {

    }

    public static boolean permitirEntrada() {

    }

    public static boolean removerPersona() {

    }
}