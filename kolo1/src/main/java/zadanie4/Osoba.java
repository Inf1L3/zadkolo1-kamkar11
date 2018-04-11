/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadanie4;

/**
 *
 * @author student
 */
public class Osoba {
    
    private String imie;
    private String nazwisko;
    private int wiek;
    private int wzrost;
    private int waga;

    public Osoba(String imie, String nazwisko, int wiek, int wzrost, int waga) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.wzrost = wzrost;
        this.waga = waga;
    }

    public Osoba() {
    }
    
    

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getWzrost() {
        return wzrost;
    }

    public void setWzrost(int wzrost) {
        this.wzrost = wzrost;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public  void wypDane()
    {
        System.out.println("imię: "+this.imie);
        System.out.println("nazwisko: "+this.nazwisko);
        System.out.println("wiek: "+this.wiek);
        System.out.println("wzrost: "+this.wzrost);
        System.out.println("waga: "+this.waga);
    }
    
    
    
}
