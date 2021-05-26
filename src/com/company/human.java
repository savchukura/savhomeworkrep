package com.company;

public class human {

    int Year=2021;

    String name;
    String surname;
    int birth;
    human Father;
    human Mother;
    human[] Children;
    int dohid;

    human() {

        name=" ";
        surname=" ";
        birth=0;
        Father=null;
        Mother=null;
        Children=null;
    }

    human(String nameValue, String surnameValue, int birthValue) {

        name = nameValue;
        surname = surnameValue;
        birth = birthValue;
        Father=null;
        Mother=null;
        Children=null;
    }
        int getYear(){

        return Year-birth;
    }
    human(String nameValue, String surnameValue, int birthValue, human F, human M, human[] C) { // "перегружений" 3 конструктор з шістьмома параметрами
        name = nameValue;
        surname = surnameValue;
        birth = birthValue;
        Father = F;
        Mother = M;
        Children = C;

    }

    String Druk (){
        return name+" "+surname+" "+birth;
      //  System.out.println("Ім'я: "+name+". Фамілія: "+surname+". Рік народження: "+birth+". Вік "+getYear());

    }
    boolean prs(int min) {
        if (dohid > min) return true;
        else return false;

    }
}
