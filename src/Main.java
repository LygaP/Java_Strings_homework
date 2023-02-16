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

        //Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą ir pavardę kaip
        //stringus. Vardą atspausdinti tik didžiosiom raidėm, o pavardę tik mažosioms.
        //(LEONARDO dicaprio)

        System.out.println("============ Uzd. 2. =============");











    }

}