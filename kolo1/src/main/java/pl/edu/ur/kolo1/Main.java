package pl.edu.ur.kolo1;

import zadanie3.Zadanie3;
import zadanie1.Zadanie1;
import zadanie2.Fib;
import zadanie4.Osoba;


/**
 *
 * @author Kamil Machański
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
        
        Zadanie1 z1 = new Zadanie1();
        
        z1.zadanie_1();
        
        Fib f = new Fib();
        
        f.fibReku(12);
        
        Zadanie3 z3 = new Zadanie3();
        
        z3.wprLiczbe();
        z3.zawTablicy();
        z3.srZawTablicy();
        
        Osoba o = new Osoba("Jan", "Kowalski", 21, 177, 70);
        
        o.wypDane();
    }
    
}
