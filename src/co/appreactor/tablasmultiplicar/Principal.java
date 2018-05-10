/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.tablasmultiplicar;

/**
 *
 * @author Lord_Nightmare
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            System.out.println("Tabla del "+(i+1)+":");
            for (int j = 0; j < 20; j++) {
                System.out.println((i + 1) + " x " + (j + 1) + " = " + ((i + 1) * (j + 1)));
            }
            System.out.println("\n ------------ \n");
        }
    }

}
