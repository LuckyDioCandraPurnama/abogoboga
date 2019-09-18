/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import static array.LatihanPraktikum.jop1;
import static array.Praktikum.jop2;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
class Menu {

    public static void main(String[] args) {
        String menu;
        do {
            String set = JOptionPane.showInputDialog(null, "Masukkan pilihan : "
                    + "\n 1. Latihan Praktikum "
                    + "\n 2. Tugas Praktikum ");

            int option = Integer.parseInt(set);
            if (option == 1) {
                jop1();
            } else if (option == 2) {
                jop2();
            } else if (option == 3) {
                JOptionPane.showMessageDialog(null, "==MATUR NUWUN==");
                System.exit(0);
            }
             menu = JOptionPane.showInputDialog(null,
                    "\n Apakah anda ingin keluar "
                    + "\n 1.ya \n 2. tidak");
            } while ("2".equals(menu));
        JOptionPane.showMessageDialog(null, "==TERIMA KASIH==");
        }
    }

