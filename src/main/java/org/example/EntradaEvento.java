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
        if (parseInt(m[fila][1]) >= 18) {
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
        if (parseInt(m[fila][3]) > 2) { //Solo debe aplicar para invitados con entrada VIP
            return false;
        }
        return true;
    }

    public static int aforoVip(String[][] m) {
        int aforoVipUsado = 0;
        for (int fila = 0; fila < m.length; fila++) {
            if ((m[fila][2]).toLowerCase() == "vip") {
                aforoVipUsado += 1;
                aforoVipUsado += Integer.parseInt(m[fila][3]);
            }
        }
        return aforoVipUsado;
    }

    public static int aforoGeneral(String[][] m) {
        int aforoGeneralUsado = 0;
        for (int fila = 0; fila < m.length; fila++) {
            if ((m[fila][2]).toLowerCase() == "general") {
                aforoGeneralUsado += 1;
            }
        }
        return aforoGeneralUsado;
    }

    public static int contarDisponibleGeneral(String[][] m) {
        int restarGeneral = aforoGeneral(m);
        int disponibleGeneral = 30 - restarGeneral;
        if (disponibleGeneral < 0) {
            disponibleGeneral = 0;
        }
        return disponibleGeneral;
    }

    public static int contarDisponibleVip(String[][] m) {
        int restarVip = aforoVip(m);
        int disponibleVip = 50 - restarVip;
        if (disponibleVip < 0) {
            disponibleVip = 0;
        }
        return disponibleVip;
    }

    public static void aforoDisponible(String[][] m) {
        System.out.println("Los aforos disponibles para general y para VIP son, respectivamente: ");
        int aforoGeneral = contarDisponibleGeneral(m);
        int aforoVip = contarDisponibleVip(m);
        System.out.println("El aforo disponible es el siguiente: " +aforoGeneral "personas en la sala general y " +aforoVip "personas en sala VIP");
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

    public static boolean permitirEntrada(String[][] m, int fila) {
        aforoDisponible(m);
        if (parseInt(m[fila][1]) >= 18) {
            if ((m[fila][2]).toLowerCase() == "general") {
                if (contarDisponibleGeneral(m) != 0) {
                    return true;
                }
            } else if ((m[fila][2]).toLowerCase() == "vip") {
                if (contarDisponibleVip(m) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean removerPersona() {

    }
}