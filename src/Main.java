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

















    }

}