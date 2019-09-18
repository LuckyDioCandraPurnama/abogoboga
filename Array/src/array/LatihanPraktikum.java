package array;

import javax.swing.JOptionPane;

public class LatihanPraktikum {

    public static void single1() {
        System.out.println("ARRAY SINGLE DIMENSI 1");
        int nilai[] = new int[3];
        nilai[0] = 70;
        nilai[1] = 80;
        nilai[2] = 90;
        double ratarata = 0.0;
        for (int i = 0; i < nilai.length; i++) {
            ratarata += nilai[i];
        }
        ratarata /= nilai.length;
        System.out.println("Nilai rata-rata = " + ratarata);
        System.out.println("===========================");
    }

    public static void single2() {
         System.out.println("ARRAY SINGLE DIMENSI 2");
        int[] jumlahhari;
        jumlahhari = new int[7];
        jumlahhari[0] = 31;
        jumlahhari[1] = 28;
        jumlahhari[2] = 31;
        jumlahhari[3] = 30;
        jumlahhari[4] = 31;
        jumlahhari[5] = 30;
        jumlahhari[6] = 31;
        System.out.println("Bulan Januari memiliki " + jumlahhari[2] + " hari.");
        System.out.println("=================================");
    }
//ARRAY NOMOR 2

    public static void multi1() {
        System.out.println("ARRAY MULTI DIMENSI NO 2");
        int nilai[][] = new int[2][3];
        nilai[0][0] = 85;
        nilai[0][1] = 80;
        nilai[0][2] = 75;
        nilai[1][0] = 65;
        nilai[1][1] = 73;
        nilai[1][2] = 72;
        String MP[] = {"RPL", "PBO"};
        double ratarataMP[] = new double[nilai.length];
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                ratarataMP[i] += nilai[i][j];
            }
            ratarataMP[i] /= nilai[0].length;
        }
        System.out.println("Nilai Mata Pelajaran"
                + "\n=============================");
        System.out.println("MK\tMinggu1\tMinggu2\tMinggu3\tRata-Rata");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print(MP[i]);
            System.out.print("\t" + nilai[i][0]);
            System.out.print("\t" + nilai[i][1]);
            System.out.print("\t" + nilai[i][2] + "\t");

            for (int j = 0; j < nilai[0].length; j++) {
            }
            System.out.print(ratarataMP[i] + "\n");

        }
        System.out.println("=============================");
    }

    public static void multi2() {
        //ARRAY NOMOR 3
        System.out.println("ARRAY MULTI DIMENSI NO 3");
        int nis[][] = {{210651}, {210652}, {210653}};
        String nama[][] = {{"Ade"}, {"Galih"}, {"Baihaqi"}};
        System.out.println("Identitas Siswa Angkatan 28");
        for (int i = 0; i < nis.length; i++) {
            for (int k = 0; k < 1; k++) {
                System.out.println(nama[i][k] + " : " + nis[i][k]);
            }
            System.out.println("=================================");
        }
    }

    public static void multi3() {
        System.out.println("ARRAY MULTI DIMENSI NO 4");
        int[][][] nilai = {
            {{51, 89}, {60, 59}, {52, 47}},
            {{39, 58}, {71, 85}, {39, 78}},
            {{81, 32}, {51, 86}, {59, 31}},};
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                for (int k = 0; k < nilai[0][0].length; k++) {
                    System.out.print("nilai[" + 1 + "] [" + k + "] = "
                            + nilai[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println("=========================================");
        }
    }

    public static void jop1() {
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan : "
                    + "\n 1. ARRAY SINGLE DIMENSI 1"
                    + "\n 2. ARRAY SINGLE DIMENSI 2"
                    + "\n 3. ARRAY MULTI DIMENSI NO 2"
                    + "\n 4. ARRAY MULTI DIMENSI NO 3"
                    + "\n 5. ARRAY MULTI DIMENSI NO 4");

            int option = Integer.parseInt(menu);
            if (option == 1) {
                single1();
            } else if (option == 2) {
                single2();
            } else if (option == 3) {
                multi1();
            } else if (option == 4) {
                multi2();
            } else if (option == 5) {
                multi3();
            } else if (option == 6) {
                JOptionPane.showMessageDialog(null, "==MATUR THANK YOU==");
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "==LIHAT HASIL DI PAPAN KONSOL OUTPUT==");
            ulang = JOptionPane.showInputDialog(null,
                    "\n Apakah anda ingin mengulang "
                    + "\n 1.ya \n 2. tidak");
        } while ("1".equals(ulang));
        
    }

    public static void main(String[] args) {
        jop1();
    }
}
