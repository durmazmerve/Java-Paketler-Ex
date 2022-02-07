/*
BufferedReader sınıfı ile çözüm;    
*/

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader oku = new BufferedReader (new InputStreamReader(System.in));
        String satir;
        double araS1, araS2, finalS;
        double ortalama;

        System.out.print("Birinci ara sınav notunu giriniz: ");
        satir = oku.readLine();
        araS1 = Double.parseDouble(satir); // tip dönüştürme yapılıyor
        System.out.print("Ikinci ara sınav notunu giriniz: ");
        satir = oku.readLine();
        araS2 = Double.parseDouble(satir);   // tip dönüştürme yapılıyor
        System.out.print("Final notunu giriniz: ");
        satir = oku.readLine();
        finalS = Double.parseDouble(satir);    // tip dönüştürme yapılıyor

        ortalama = (araS1*30/100) + (araS2*30/100) + (finalS*40/100) ;

        System.out.println("Ortalama notunuz: " + ortalama);
    }
}

/*
Scanner sınıfı ile çözüm;
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String satir;
        double araS1, araS2, finalS;
        double ortalama;

        System.out.print("Birinci ara sınav notunu giriniz: ");
        araS1 = in.nextDouble();
        System.out.print("Ikinci ara sınav notunu giriniz: ");
        araS2 = in.nextDouble();
        System.out.print("Final notunu giriniz: ");
        finalS = in.nextDouble();

        ortalama = (araS1*30/100) + (araS2*30/100) + (finalS*40/100) ;
        System.out.println("Ortalama notunuz: " + ortalama);
    }
}

/*
JOptionPane sınıfı ile çözüm;
*/

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws Exception {

        String satir;
        double araS1, araS2, finalS;
        double ortalama;

        satir = JOptionPane.showInputDialog("Birinci ara sınav notunu giriniz.");
        araS1 = Double.parseDouble(satir);
        satir = JOptionPane.showInputDialog("Ikinci ara sınav notunu giriniz.");
        araS2 = Double.parseDouble(satir);
        satir = JOptionPane.showInputDialog("Final notunu giriniz.");
        finalS = Double.parseDouble(satir);


        ortalama = (araS1*30/100) + (araS2*30/100) + (finalS*40/100) ;

        JOptionPane.showMessageDialog(null, "Ortalama Notunuz: " + ortalama, "Ortalama Not", JOptionPane.PLAIN_MESSAGE);
    }
}