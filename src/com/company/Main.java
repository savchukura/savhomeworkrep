package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//public class Main {
    public class Main { static  int Year=2021;

    public static void main(String[] args) throws IOException {


        human[] person = {new human("Vasya", "Nykolaychyk", 1993),
                new human("Antonio", "Banderas", 1960),
                new human("Yura", "Savchuk", 1994),
                new human("Avrora", "Kanningem", 2012),
                new worker("Nikolas", "Anderson", 2000, "Engineer", "Dataviz", 3000),
                new student("Dolph", "Lundgren", 1957, "Auditor", "Fedkovycha", 1200, 2, 8),
               };


        //   String sn="_";
        // String S="_";   // змінна, куда запишемо введене слово
        //      System.out.println("Що хочете зробити?");
        //      Scanner c = new Scanner(System.in);
        //      if (c.hasNext())    // якщо у введеному рядку спочатку є слово
        //          S=c.next();     // то записати його в S
        //    if (S.equals("avr"))       // порівнюємо слова методом equals з класу String, якщо це слово = avr
        //          avarage(person); // то викликати метод для сортування масиву по алфавіту
        //      if (S.equals("res"))
        //         reshuffle(person);
//    bubbleSort(person);
        //   System.out.println(arrayToString(human));
        //  System.out.println(searchLinear(human, Avrora));

  /*  int min=1000;

        for(int i=0;i<6;i++){
            if(person[i].prs(min))

            person[i].Druk();}*/
        FileWriter fw = new FileWriter("a.txt");
        for (human l : person) {
            fw.write(l.Druk());
            fw.write("\n");
        }
        fw.close();
        System.out.println("Масив людей person записано в файл а.txt");

        ArrayList<human> mas = new ArrayList<>();
        FileReader fr = new FileReader("a.txt");
        String name, surname, ryadok, Psd, spec, University, ust;
        int birth = 0;
        int zrp = 0;
        int Course = 0;
        int scholarship = 0;
        int averageScore = 0;

        Scanner scf = new Scanner(fr);
        Scanner scr;

        while (scf.hasNext()) {
            ryadok = scf.nextLine();
            scr = new Scanner(ryadok);
            if (scr.hasNext())
                name = scr.next();
            else continue;
            if (scr.hasNext())
                surname = scr.next();
            else continue;
            if (scr.hasNextInt())
                birth = scr.nextInt();
            else {mas.add(new human(name, surname, birth));continue;}

           if (scr.hasNext())
                Psd = scr.next();
            else continue;
            if (scr.hasNext())
                ust = scr.next();
            else continue;
            if (scr.hasNextInt())
                zrp = scr.nextInt();
            else {mas.add(new worker(name, surname, birth, Psd, ust, zrp));continue;}


            if (scr.hasNextInt())
                Course = scr.nextInt();
            else continue;
            if (scr.hasNextInt())
                averageScore = scr.nextInt();
         else continue;
           // else {mas.add(new student(name, surname, birth, Psd, ust, zrp, Course, averageScore));continue;}

            scr.close();
            mas.add(new human(name, surname, birth));
            mas.add(new worker(name, surname, birth, Psd, ust, zrp));
           mas.add(new student(name, surname, birth, Psd, ust, zrp, Course, averageScore));

        }
        scf.close();
        fr.close();
        System.out.println("Масив людей зчитано з файлу а.txt:");
        for (human l:mas)       // цикл, що проведе змінну l по всіх елементах масиву людей mas
            System.out.println(l.Druk());   // і роздрукує кожну людину
    }


////////////////////////////////////////////////////////////////////////////////////////////////
    static void avarage(human[] M){    //метод знаходження середнього значення
        int x = 0;

        for ( human d : M)
        {
            x += d.getYear();
        }
        System.out.println("Середнє значення рік народження" +x /M.length);
    }
///////////////////////////////////////////////////////////////////////////////////////
    static void reshuffle(int[] M) {
        int PMaxnumber=M[0];
        for (int i=1;i<5;i++)
            if (M[i]>PMaxnumber) {
                PMaxnumber=M[i];
            }
        System.out.println("Найбільше значення -" + PMaxnumber); }

////////////////////////////////////            ///////////////////////////////////////////////////////
    static void reshuffle(human[] M){
        System.out.println("Відсортовано по алфавіту ");
        human Temp=new human();
        for (int j=0;j<5;j++){
            int iMaxQ=j;
            for (int i=j+1;i<5;i++)
                if (M[i].surname.compareTo(M[iMaxQ].surname)<0)   // перевіряємо чи назва поточниого продукту пізніше в алфавіті від найпізнішої на цей момент
                    iMaxQ=i;
            Temp=M[j];
            M[j]=M[iMaxQ];
            M[iMaxQ]=Temp;}
    }
//////////////////////////////////////////// Пошук /////////////////////////////////////////////////////
    public static int searchLinear(human[] person, String ElementToFind){
        for (int i=0; i< person.length; i++){
            if (person[i].name.equals(ElementToFind)){
                return i;
            }
        }

        return -1;
    }


}
