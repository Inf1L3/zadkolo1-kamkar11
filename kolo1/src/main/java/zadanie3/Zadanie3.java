/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie3;

import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author student
 */
public class Zadanie3 {

    Scanner input = new Scanner(System.in);

    private int[] tab = new int[10];

    public void wprLiczbe() {
        int a = 1;
        while (a == 1) {
            System.out.println("Chcesz wpisać do którego indeksu: [od 0 do 9](wpisz 11 aby zakonczyc wpisywanie");
            int i = input.nextInt();
            if (i == 11) {
                a = 0;
            } else {

                System.out.println("Podaj liczbę do wpisania: ");
                int n = input.nextInt();
                tab[i] = n;
            }
        }
    }

    public void zawTablicy() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public void srZawTablicy() {
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma = suma + tab[i];
        }
        System.out.println("Srednia: " + (suma / tab.length));
    }

}
