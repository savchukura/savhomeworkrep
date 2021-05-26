package com.company;

public class student extends human {
    String specialty;
    int Course;
    String University;
    int scholarship;
    int averageScore;

    student(){
        super();
        specialty="_";
        Course=0;
        University="_";
        scholarship=0;
        averageScore=0;

    }
    student(String name, String surname, int birth, String spec, String UN,  int Sol,  int CR, int AS){
        super(name,surname, birth );
        specialty=spec;
        University=UN;
        Course=CR;
        scholarship=Sol;
        averageScore=AS;

    }
    double getRevenue (){

        return scholarship*12;
    }

    String Druk (){ // перевизначений метод
        return name+" "+surname+" "+birth+" "+specialty+" "+University+" "+scholarship+" "+Course+" "+averageScore;
      //  System.out.println("Ім'я: "+name+". Фамілія: "+surname+". Рік народження: "+birth+". Спеціальність: "+specialty+". Курс: "+Course+". Університет: "+University+". Стипендія: "+scholarship+". Середній балл: "+averageScore+". Річний дохід: "+getRevenue());
    }
    boolean prs(int min) {
        if (scholarship > min) return true;
        else return false;
    }
}
