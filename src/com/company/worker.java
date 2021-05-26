package com.company;

public class worker extends human {
    String posada;
    int zarplata;
    String ustanowa;

    worker() { //  1 конструктор без параметрів
        super(); // виклик 1 конструктора з класу human
        posada = "_";
        ustanowa = "_";
        zarplata = 0;
    }

    worker(String name, String surname, int birth, String Psd, String ust, int zrp) { // "перегружений" 2 конструктор з шістьмома параметрами
        super(name, surname, birth); // виклик 2 конструктора з класу human
        posada = Psd;
        ustanowa = ust;
        zarplata = zrp;
    }

    worker(String name, String surname, int birth, human F, human M, human[] C, String Psd, int zrp, String ust) { // "перегружений" 3 конструктор з дев'ятьма параметрами
        super(name, surname, birth, F, M, C); // виклик 3 конструктора з класу human
        posada = Psd;
        ustanowa = ust;
        zarplata = zrp;
    }

    int getRevenue() {

        return zarplata * 12;
    }

    String Druk() { // перевизначений метод

        return name+" "+surname+" "+birth+" "+posada+" "+ustanowa+" "+zarplata;
    //    System.out.println("Ім'я: " + name + ". Фамілія: " + surname + ". Рік народження: " + birth + ". Посада: " + posada + ". Установа: " + ustanowa + ". Зарплата: " + zarplata+". Річний дохід: "+getRevenue());
    }

    boolean prs(int min) {
        if (zarplata > min) return true;
        else return false;
    }
}