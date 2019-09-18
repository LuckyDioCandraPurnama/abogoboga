package array;

import javax.swing.JOptionPane;
import static array.Menu.main;
public class Praktikum {

    public static void prak1() {
        int bilangan[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < bilangan.length; i++) {
            int c = bilangan[i];
            System.out.print(bilangan[i]);
        }
        System.out.println(""
                + "\n=================");
        pesanulang();
        JOptionPane.showMessageDialog(null, "Yang ada di jobsheet itu error, karena tidak diberi new int[],"
                + "\n dan perintahnya adalah memanggil array 6 sedangkan jumlahnya hanya 5");
    }

    public static void prak2() {
        int bil[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < bil.length; i++) {
            int c = bil[i];
            System.out.print(bil[i]);
        }
        System.out.println(""
                + "\n===================");
        pesanulang();
        JOptionPane.showMessageDialog(null, "Yang ada di jobsheet itu error, karena arraynya hanya 5, "
                + "\n sedangkan banyak array yang dideklarasi ada 8");
    }

    public static void jop2() {
        String ulang;
        do {
            String tabel = JOptionPane.showInputDialog(null, "Masukkan pilihan : "
                    + "\n 1. Praktikum 1"
                    + "\n 2. Praktikum 2");

            int option = Integer.parseInt(tabel);
            if (option == 1) {
                prak1();
            } else if (option == 2) {
                prak2();
            } else if (option == 3) {
                JOptionPane.showMessageDialog(null, "==MATUR NUWUN==");
                System.exit(0);
            }

            ulang = JOptionPane.showInputDialog(""+
                    "\n Apakah anda ingin mengulang "
                    + "\n 1.ya \n 2. tidak");
        } while ("1".equals(ulang));
        
    }

    public static void pesanulang() {
        JOptionPane.showMessageDialog(null, "==LIHAT HASIL DI PAPAN KONSOL OUTPUT==");
    }

    public static void main(String[] args) {
        jop2();
    }
}
