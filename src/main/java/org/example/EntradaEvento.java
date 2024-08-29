package org.example;

import java.util.Objects;

import static java.lang.Integer.parseInt;

class EntradaEvento {

    public static void main (String[] args) {
        crearMatrizInformacion();
        //algo2
        //algo3
    }

    public static void crearMatrizInformacion() {
        String[][] informacion = new String[10][5]; /*En esta matriz estará almacenada toda la
        información de los asistentes*/
    }

    public static boolean verificarEdad(String[][] m, int fila) { /* Este método debe devolver true si la
    persona en la fila especificada tiene 18 años o más, y false en caso contrario*/
        if (Integer.parseInt(m[fila][1]) >= 18) {
            return true;
        }
        return false;
    }

   public static String verificarBoleto(String[][] m, int fila) {
        if (m[fila][2] == null) {
            return "False";
        }
        return m[fila][2];
   }

    public static boolean validarInvitados(String[][] m, int fila) {
        if (Integer.parseInt(m[fila][3]) > 2) { //Solo debe aplicar para invitados con entrada VIP
            return false;
        }
        return true;
    }

    public static int aforoDisponible(String[][] m) {
        int aforoVipUsado = 0;
        int aforoGeneralUsado = 0;
        for (int fila = 0; fila < m.length; fila++) {
            if ((m[fila][2]).toLowerCase() == "general") {
                aforoGeneralUsado += 1;
            } else-if ((m[fila][2]).toLowerCase() == "vip") {
                aforoVipUsado += 1;
            }
        }
        System.out.println("Los aforos disponibles para general y para VIP son, respectivamente: ");
        return 30 - aforoGeneralUsado;
        return 50 - aforoVipUsado;
    }

    public static void ingresarPersona(String[][] m, int fila) {
        if ((m[fila][4]).toLowerCase() == "true") {
            m[fila][4] = "False";
        } else if ((m[fila][4]).toLowerCase() == "false") {
            m[fila][4] = "true";
        } else {
            System.out.println("Información no válida");
        }

    }

    public static boolean permitirEntrada() {

    }

    public static boolean removerPersona() {

    }
}