import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        // 1. Deklarasi variabel integer bernama StrukturBaris
        int StrukturBaris = 5;
        System.out.println("Hasil dari struktur baris: " + StrukturBaris);

        // 2. Deklarasi variabel String bernama KataBaru yang berisi kata ‘Deklarasi tipe data String’
        String KataBaru = "Deklarasi tipe data String";
        System.out.println("Hasil dari Kata Baru: " + KataBaru);


        // 3. Deklarasi array satu dimensi bernama empatAngka, tipe data integer, yang berisi angka (07, 10, 20, 23)?
        int[] empatAngka = {7, 10, 20, 23};
        System.out.print("Hasil dari array satu dimensi: ");
        for (int angka : empatAngka){
            System.out.print(angka + " ");
        }
        System.out.println();

        // 4. Deklarasi array dua dimensi bernama Angka ’, tipe data String, yang terdiri dari tiga baris dan tiga kolom, isi baris dan kolom berisi angka berikut (1, 3, 5, 14, 19, 20, 22, 27, 29)
        String[][] Angka = {
            {"1", "3", "5"},
            {"14", "19", "20"},
            {"22", "27", "29"},
        };
        System.out.println("Hasil dari array dua dimensi: ");
        for (int i = 0; i < Angka.length; i++){
            for (int j = 0; j < Angka[i].length; j++){
                System.out.print(Angka[i][j] + " ");
            }
            System.out.println();
        }

        // 5. Deklarasi LinkedList bernama listAngka yang memiliki list (22, 19, 44, 60, 72)
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(22);
        listAngka.add(19);
        listAngka.add(44);
        listAngka.add(60);
        listAngka.add(72);
        System.out.println("Hasil dari List Angka: " + listAngka);
    }
}
