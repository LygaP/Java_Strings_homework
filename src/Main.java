import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //1. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.

        System.out.println("============ Uzd. 1. =============");

        String name = "Keanu";
        String lastName = "Reeves";

        System.out.println(name + " " + lastName);

        System.out.println("Raidziu kiekis varde = " + name.length());

        System.out.println("Raidziu kiekis pavardeje = " + lastName.length());

        if (name.length() < lastName.length()) {
            System.out.println( "Trumpiausias yra vardas, tiktai " + name.length() + " simboliai.");
        }

        if (lastName.length() < name.length() ) {

            System.out.println("Trumpiausias yra vardas, tiktai " + lastName.length() + " simboliai");
        }

        //2. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
        //(LEONARDO dicaprio)

        System.out.println("============ Uzd. 2. =============");

        String name2 = "Matthew";
        String lastName2 = "McConaughey";

        System.out.println(name2.toUpperCase());
        System.out.println( lastName2.toLowerCase());

        //3. Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš pirmų vardo ir
        //pavardės kintamųjų raidžių. Jį atspausdinti.

        System.out.println("============ Uzd. 3. =============");

        String name3 = "Leonardo";
        String lastName3 = "DiCaprio";

        //System.out.println((name3.charAt(0)) + (lastName3.charAt(0))); neveikia, rodo skaicius, kodel?

        System.out.println(name3.charAt(0));
        System.out.println(lastName3.charAt(0));

        //4.Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš trijų paskutinių vardo ir
        //pavardės kintamųjų raidžių. Jį atspausdinti.

        System.out.println("============ Uzd. 4. =============");

        String name4 = "Keanu";
        String lastName4 = "Reeves";

        System.out.println(name4.length());
        System.out.println(lastName4.length());



        //5. Sukurti kintamąjį su stringu: “An American in Paris”. Jame visas “a” (didžiąsias ir
        //mažąsias) pakeisti žvaigždutėm “*”. Rezultatą atspausdinti.

        System.out.println("============ Uzd. 5. =============");

        String txt = "An American in Paris";
        String replaceA = txt.replaceAll("a", "*");
        System.out.println(replaceA.replaceAll("A", "*"));


        //6. Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses. Rezultatą
        //atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”, “2001: A Space
        //Odyssey” ir “It's a Wonderful Life”.

        System.out.println("============ Uzd. 6. =============");

        String txt1 = "An American in Paris";//a, e, i, o, u
        String replaceB = txt1.replace("a", "");




        //7.Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int)
        //(Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New
        //Hope" Surasti ir atspausdinti epizodo numerį.

        System.out.println("============ Uzd. 7. =============");

        String uzdCode = "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope";
        System.out.println(uzdCode);


        //8.Suskaičiuoti kiek stringe “Don't Be a Menace to South Central While Drinking Your Juice
        //in the Hood” yra žodžių trumpesnių arba lygių nei 5 raidės. Pakartokite kodą su stringu
        //“Tik nereikia gąsdinti Pietų Centro, geriant sultis pas save kvartale”.

        System.out.println("============ Uzd. 8. =============");


        //9.Parašyti kodą, kuris generuotų atsitiktinį stringą iš lotyniškų mažųjų raidžių. Stringo ilgis
        //3 simboliai.

        System.out.println("============ Uzd. 9. =============");

        //10.Parašykite kodą, kuris generuotų atsitiktinį stringą su 10 atsitiktine tvarka išdėliotų
        //žodžių, o žodžius generavimui imtų iš 9-me uždavinyje pateiktų dviejų stringų. Žodžiai
        //neturi kartotis. (reikės masyvo)

        System.out.println("============ Uzd. 10. =============");



























    }

}