import javax.xml.transform.Source;

public class Main {
    // Strings werden public festgelegt um mit dem \ Command die Farbe zu ändern
    // Weitere \ Commands:
    //          \n      neue Zeile
    //          \t      Tabulator
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    //01_ue_variablen1.Einstieg.2
    public static final Integer K1 = 111;

    //01_ue_variablen1.Rechnung
    public static final Integer cola =2;
    public static final Integer wasser = 1;
    public static final Integer bier =4;



    public static void main(String[] args) {
        //00_ue_einfuehrung
        // Variables
        String a = "3";
        String b = "+";
        String c = "7";
        String d = "=";
        String e = "10";
        //1.
        //Ausgabe mit verschiedenen Farben
        System.out.println("Hello " + ANSI_RED + "World" + ANSI_RESET + "!");
        //2.
        System.out.println("Benjamin");
        System.out.println("Kranzl");
        //3.+4.
        // Ausgabe einzeln mit tab-Abständen
        System.out.print("Heute \t");
        System.out.print("ist \t");
        System.out.print("Mittwoch \t");
        System.out.print("der \t");
        System.out.print("04. \t");
        System.out.print("Oktober \t");
        System.out.println("2023 \t");
        //5.
        // Ausgabe mit Stringeingabe
        System.out.println(ANSI_RED + "3" + "+" + "7" + "=" + "10" + ANSI_RESET);
        //Ausgabe mit Variablen
        System.out.println(a + b + c + d + e);
        //5.1
        System.out.println(ANSI_CYAN + "Hello" + " " + ANSI_GREEN + "World" + ANSI_RESET + "!");
        //6.
        System.out.println(a);
        //7.
        System.out.println(ANSI_CYAN + "1\t" + ANSI_GREEN + "2\t" + ANSI_RED + "3\t" + ANSI_BLUE + "4\t" + ANSI_PURPLE + "5" + ANSI_RESET);
        System.out.println(3 + 7);
        System.out.println("\n\n");

        System.out.println("=== Arbeiten mit Argumenten ===");

        // Argumente werden oben rechts unter Main->Edit Configurations unter Build and Run
        // eingetragen und im args-Array gespeichert
        //System.out.println("Das erste Arbument ist "+args[0]+" das zweite Arbument ist "+args[1]);


        // testen
        Integer int1 = 1;
        String str1 = "asdf";
        // int+string muss als string gespeichert werden (int wird umgewandelt)
        String test = int1 + str1;
        System.out.println(test);

        Integer i1 = 5;
        Integer i2 = 2;
        Double d1 = 5.0;
        Double d2 = 2.0;
        System.out.println("int / int");
        System.out.println(i1 / i2);
        System.out.println("int % int");
        System.out.println(i1 % i2);
        System.out.println("int/double");
        System.out.println(i1 / d2);
        System.out.println("int%double");
        System.out.println(i1 % d2);

        // Mitschrift

        //Character werden mit einfachen Anführungszeichen eingegeben oder mit Zahlencode
        // addiert man Character so wird der zahlenwert addiert
        Character meinChar = 'a';
        Character meinCharAlsDeciZahl = 97;
        Character meinCharAlsHexZahl = 0x61; //Hexadecimal

        System.out.println(meinChar + " ist das Selbe wie " + meinCharAlsDeciZahl + " und " + meinCharAlsHexZahl + "\n");

        // 01_ue_variablen1
        // Einstieg
        //.1
        Integer a1 = 47;
        //.2 Siehe oben
        //.3
        Integer c1 = a1 + K1;
        //.4
        System.out.println("01_ue_variablen1.Einstieg.4");
        System.out.println((c1));
        //.5
        Double b5 = 101.98;
        //.6
        Double d6;
        //7
        d6 = a1 + b5;
        //.8
        System.out.println("01_ue_variablen1.Einstieg.8");
        System.out.println(d6);
        //.9
        Integer inte = d6.intValue();
        System.out.println("01_ue_variablen1.Einstieg.9");
        System.out.println(inte);
        //.10
        Boolean newBool = false;
        //.11
        newBool = true;
        //.12
        String hello = "Hello";
        //.13
        String name = "Benjamin";
        //.14
        String greeting = hello + " " + name + " !";
        System.out.println("01_ue_variablen1.Einstieg.14");
        System.out.println(greeting);
        //.15
        System.out.println("01_ue_variablen1.Einstieg.15");
        System.out.println("Das Ergebnis von " + a1 + "+" + b5 + "=" + d6);
        Float d62 = a1.floatValue() + b5.floatValue();
        System.out.println(d62);


        System.out.println("\n\n");
        //Kombiniert
        Integer x = 4;
        Integer y = 3;
        Double z = 3.0;
        Integer ergPlus = x + y;
        System.out.println("x+y=" + x + "+" + y + "=" + ergPlus);

        Integer ergMinus = x - y;
        System.out.println("x-y=" + x + "-" + y + "=" + ergMinus);

        Double erg = x / z * 1000;
        Double gerErg = Math.round(erg) / 1000.0;
        System.out.println("x/y=" + x + "/" + y + "=" + gerErg);

        Integer ergModu = x % y;
        System.out.println("x%y=" + x + "%" + y + "=" + ergModu);
        System.out.println("\n");

        //Rechnung:
        System.out.println("Rechnung:");
        //Legen Sie 3 globale Konstanten für Produkte an: cola=2€, wasser=1€, bier=4€.
        // Siehe oben
        //Legen Sie 3 lokale Variablen an für anzCola, anzWasser, anzBier an.

        Integer anzCola = 3;
        Integer anzWasser = 2;
        Integer anBier = 1;
        Integer summe;

        summe = cola * anzCola + wasser * anzWasser + bier * anBier;
        System.out.println("Die Rechnung von " + anzCola + " Cola, " + anzWasser + " Wasser und " + anBier + " Bier ergibt " + summe + "€");

        Double durchschnitt;
        durchschnitt = (cola + wasser + bier) / 3.0;
        // runden
        Double durchschnittGerundet = Math.round(durchschnitt * 100) / 100.0;

        System.out.println("Durchschnittespreis der Getränke: " + durchschnittGerundet + "€\n");

        //Rechteck

        //Legen Sie zwei Variablen für Länge und Breite eines Rechtecks an.
        Integer laenge = 5;
        Integer breite = 2;

        //Berechnen Sie den Umfang des Rechtecks und geben Sie diesen in der Konsole aus: 2*(a+b)
        Integer umfang = 2 * (laenge + breite);
        System.out.println("Rechteck:");
        System.out.println("Umfang = " + umfang);

        //Berechnen Sie die Fläche und geben Sie diese in die Konsole aus: a*b
        Integer flaeche = laenge * breite;
        System.out.println("Flächeninhalt = " + flaeche);

        //Kreis

        //Legen Sie eine Variable für Radius an
        Integer radius = 7;

        //Berechnen Sie den Umfang des Kreises und geben Sie diesen in der Konsole aus: U = 2* pi* r
        Double umfangKreis = 2 * Math.PI * radius;
        System.out.println("Umfang Kreis = " + umfangKreis);

        //Berechnen Sie die Fläche und geben Sie diese in die Konsole aus: A = pi*r^2.
        Double flaecheKreis = Math.PI * Math.pow(radius, 2);
        Double flaecheKreisGerundet = Math.round(flaecheKreis * 100.0) / 100.0;

        System.out.println("Flächeninhalt Kreis = " + flaecheKreisGerundet);

        //Umwandlung von Datentypen
        // 1.Wieviele Bytes benötigt man mindestens, um folgende Dezimalzahlen binär kodiert zu speichern?
        //18    1
        //128   1
        //7635  2
        //897613    3
        //232   2



    }
    //Alle Übungen sollen anschließend auf die Konsole ausgegeben werden.

    public void UE1(){
        //. Deklarieren Sie eine Variable des Datentyps int und weisen Sie ihr einen Wert zu.
        Integer wertInt;
        wertInt = 5;
        System.out.println(wertInt);
    }

    public void UE2 () {
        //. Deklarieren Sie eine Variable des Datentyps double und weisen Sie ihr einen Wert zu.
        Double wertDouble;
        wertDouble = 5.0;
        System.out.println(wertDouble);
    }
    public void UE3 () {
        //. Deklarieren Sie eine Variable des Datentyps char und weisen Sie ihr einen Buchstaben zu.
        Character newChar;
        newChar = 'a';
        System.out.println(newChar);
    }
    public void UE4 () {
        //. Deklarieren Sie eine Variable des Datentyps boolean und weisen Sie ihr den Wert true zu.
        Boolean newBoolean;
        newBoolean = false;
        System.out.println(newBoolean);
    }
    public void UE5 () {
        //. Deklarieren Sie eine Variable des Datentyps long und weisen Sie ihr einen Wert zu.
        Long newLong;
        newLong = 1235483544445697426L;
        System.out.println(newLong);
    }
    public void UE6 () {
        //. Deklarieren Sie eine Variable des Datentyps float und weisen Sie ihr einen Wert zu.
        Float newFloat;
        newFloat = 3.1415926f;
        System.out.println(newFloat);
    }
    public void UE7 () {
        //. Führen Sie eine Addition zweier int-Variablen + speichern in neuer Variable. Geben Sie das Ergebnis
        //auf die Konsole aus.
        Integer intEins = 1;
        Integer intZwei = 2;
        Integer intDrei = intEins + intZwei;
        System.out.println(intDrei);
    }
    public void UE8 () {
        //. Führen Sie eine Subtraktion zweier double-Variablen durch.
        Double doubleEins = 20.194;
        Double doubleZwei = 10.135;
        Double doubleDrei = doubleEins - doubleZwei;
        System.out.println(doubleDrei);
    }
    public void UE9 () {
        //. Multiplizieren Sie zwei int-Variablen.
        Integer intVier = intZwei * intDrei;
        System.out.println(intVier);
        //. Teilen Sie zwei float-Variablen.
        Float floatEins = 12.1235f;
        Float floatZwei = 3.254f;
        Float floatDrei = floatEins / floatZwei;
        System.out.println(floatDrei);
    }
    public void UE10 () {
        //. Erstellen Sie eine Variable vom Typ int und weisen Sie ihr den Wert einer double-Variable nach
        Double doubleSechs = 12.54;
        Integer intSieben;
        intSieben = doubleSechs.intValue();
        System.out.println(intSieben);
    }
    public void UE11 () {
        //Typumwandlung (Casting) zu.
        int intFuenf;
        double doubleVier = 12.254;
        intFuenf = (int) doubleVier;
        System.out.println(intFuenf);
    }
    public void UE12 () {
        //. Erstellen Sie eine Variable vom Typ double und weisen Sie ihr den Wert einer int-Variable nach
        Double doubleFuenf;
        Integer intSechs = 165;
        doubleFuenf = Double.valueOf(intSechs);
        System.out.println(doubleFuenf);
    }
    public void UE13 () {
        //Typumwandlung (Casting) zu.
        doubleFuenf = (double) intSechs;
        System.out.println(doubleFuenf);
        //. Führen Sie eine Division von zwei int-Variablen durch und speichern Sie das Ergebnis in einer doubleVariablen.
        int primInt1 = 17;
        int primInt2 = 3;
        double primDouble1;
        primDouble1 = (double) primInt1 / primInt2;
        System.out.println(primDouble1);
    }
    public void UE14 () {
        //. Führen Sie eine Division von zwei double-Variablen durch und speichern Sie das Ergebnis in einer intVariablen.
        double primDouble2 = 2.25;
        double primDouble3 = 15.41;
        primInt2 = (int) (primDouble3 / primDouble2);
        System.out.println(primInt2);
    }
    public void UE15 () {
        //. Vergleichen Sie, ob zwei int-Variablen gleich sind und speichern Sie das Ergebnis in einer booleanVariablen. (a == b)
        int intA = 3;
        int intB = 5;
        boolean gleich;
        if (intA == intB) {
            gleich = true;
        } else {
            gleich = false;
        }
        System.out.println(intA + "=" + intB + "->" + gleich);
    }
    public void UE16 () {
        //. Vergleichen Sie zwei double-Variablen und speichern Sie das Ergebnis in einer boolean-Variablen.
        double dA = 3.25;
        double dB = 3.25;
        if (dA == dB) {
            gleich = true;
        } else {
            gleich = false;
        }
        System.out.println(dA + "=" + dB + "->" + gleich);
    }
    public void UE17 () {
        //. Deklarieren Sie eine char-Variable und weisen Sie ihr den Wert 'A' zu. Ändern Sie dann den Wert auf
        //'B'.
        char neuerChar = 'A';
        neuerChar = 'B';
        System.out.println(neuerChar);
    }
    public void UE18 () {
        //. Deklarieren Sie eine boolean-Variable und weisen Sie ihr den Wert true zu. Ändern Sie dann den Wert
        //auf false.
        boolean neuerBool = true;
        neuerBool = false;
        System.out.println(neuerBool);
    }
    public void UE19() {
        //. Berechnen Sie den Durchschnitt von drei double-Variablen und speichern Sie das Ergebnis in einer
        //double-Variablen.
        double durch1 = 5.21;
        double durch2 = 14.785;
        double durch3 = 24.1;
        double durchErg = (durch1 + durch2 + durch3) / 3;
        System.out.println(durchErg);
    }
    public void UE20() {
        //. Berechnen Sie die Summe der ersten 10 natürlichen Zahlen (1 + 2 + 3 + ... + 10) und speichern Sie
        //das Ergebnis in einer int-Variablen.
        int summeBisZehn = 0;
        for (int i = 1; i <= 10; i++) {
            summeBisZehn += i;
        }
        System.out.println(summeBisZehn);
    }
    public void UE21() {
        //. Deklarieren Sie eine int-Variable und weisen Sie ihr den Wert 1000 zu. Führen Sie eine
        //Typumwandlung durch, um ihn in eine byte-Variable zu speichern.
        int intZuByte = 1000;
        byte byteValue = (byte) intZuByte;
        System.out.println(byteValue);
    }
    public void UE22() {
        //. Deklarieren Sie eine double-Variable und weisen Sie ihr den Wert 3.14159265359 zu. Führen Sie eine
        //Typumwandlung durch, um ihn in eine float-Variable zu speichern.
        double doubleToFloat = 3.14159265359;
        float floatValueOfDouble = (float) doubleToFloat;
        System.out.println(floatValueOfDouble);
    }
    public void UE23() {
        //. Erstellen Sie eine boolean-Variable und weisen Sie ihr den Wert true zu. Führen Sie eine
        //Typumwandlung durch, um ihn in eine int-Variable zu speichern (1 für true und 0 für false).
        boolean boolToInt = true;
        int intValueOfBool = boolToInt ? 5 : 0;
        System.out.println(intValueOfBool);
    }
    public void UE24() {
        //. Deklarieren Sie eine char-Variable und weisen Sie ihr den Wert 'X' zu. Führen Sie eine
        //Typumwandlung durch, um ihn in eine int-Variable zu speichern.
        char charToInt = 'X';
        int intValueOfChar = (int) charToInt;
        System.out.println(intValueOfChar);
    }
}