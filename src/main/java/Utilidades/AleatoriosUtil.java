/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.util.Random;

/**
 *
 * @author alanm
 */
public class AleatoriosUtil {

   

    private static char letraCorrespondiente(long l) {
        if (l == 0) {
            return 'A';
        }
        if (l == 1) {
            return 'B';
        }
        if (l == 2) {
            return 'C';
        }
        if (l == 3) {
            return 'D';
        }
        if (l == 4) {
            return 'E';
        }
        if (l == 5) {
            return 'F';
        }
        if (l == 6) {
            return 'G';
        }
        if (l == 7) {
            return 'H';
        }
        if (l == 8) {
            return 'I';
        }
        if (l == 9) {
            return 'J';
        }
        if (l == 10) {
            return 'K';
        }
        if (l == 11) {
            return 'L';
        }
        if (l == 12) {
            return 'M';
        }
        if (l == 13) {
            return 'N';
        }
        if (l == 14) {
            return 'O';
        }
        if (l == 15) {
            return 'P';
        }
        if (l == 16) {
            return 'Q';
        }
        if (l == 17) {
            return 'R';
        }
        if (l == 18) {
            return 'S';
        }
        if (l == 19) {
            return 'T';
        }
        if (l == 20) {
            return 'U';
        }
        if (l == 21) {
            return 'V';
        }
        if (l == 22) {
            return 'W';
        }
        if (l == 23) {
            return 'X';
        }
        if (l == 24) {
            return 'Y';
        }
        if (l == 25) {
            return 'Z';
        }
        return '.';
    }

    

    public static char letraAleatoria() {
        return letraCorrespondiente(numeroAleatorio(0, 25));
    }

    public static int numeroAleatorio(int inicio, int fin) {
        Random rand = new Random();
        return (inicio + rand.nextInt((fin - inicio) + 1));
    }

  

    private int letraAInt(char actual) {
        switch (actual) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
            case 'K':
                return 11;
            case 'L':
                return 12;
            case 'M':
                return 13;
            case 'N':
                return 14;
            case 'O':
                return 15;
            case 'P':
                return 16;
            case 'Q':
                return 17;
            case 'R':
                return 18;
            case 'S':
                return 19;
            case 'T':
                return 20;
            case 'U':
                return 21;
            case 'V':
                return 22;
            case 'W':
                return 23;
            case 'X':
                return 24;
            case 'Y':
                return 25;
            case 'Z':
                return 26;
            default:
                return 30;
        }
    }

}
