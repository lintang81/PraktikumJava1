import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String namaDepan = "Muhammad";
        String namaTengah = "Lintamg";
        String namaBelakang = "Herlambang";
        int usia = 21;
        int targetTahunKuliah = 4;
        double ipk = 3.8;
        char nilaiAbjad = 'A';
        boolean tampan = true;

        System.out.println(namaDepan + namaTengah + namaBelakang);

        char[] uniskaChar = {'U','N','I','S','K','A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);




        String namaLengkap = namaDepan + " " + namaTengah + " " + namaBelakang;
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(namaLengkap.substring(5));
        System.out.println(namaLengkap.substring(5,12));
        System.out.println(namaLengkap.replace("Lin", "Tang"));
        System.out.println(namaLengkap.toUpperCase());
        System.out.println(namaLengkap.toLowerCase());
        System.out.println(namaLengkap.charAt(6));

        String[] namaArray = namaLengkap.split(" ");

        for (String nama : namaArray){
            System.out.println(nama);
        }
    }
}
