/*
    Rental Warnet "Connect"

    Paket :
    Internet = Rp 4000 / jam
    Ketik = Rp 2000 / jam
    Game = 5000 / jam

    Fasilitas :
    Scan = Rp 1000 / file
    Print : Warna = Rp 500 / lembar, hitam-putih = Rp 300 / lembar
    Teh Botol = Rp 3000 / botol
    Tarif dihitung per menit pemakaian, setelah 30 menit pertama.

    Variable = Jenis Pemakaian, Waktu Pemakaian, Lembar Scan, Lembar Print Hitam-Putih, Lembar Print Warna, Jumlah Teh

    1 Jam = 60 Menit
 */

package com.pbo;

import java.util.Scanner;

class PaketWarnet {
    Scanner userInput = new Scanner(System.in);
    Display displayFunc = new Display();
    BoilerWarnet plateWarnet = new BoilerWarnet();

    void pauseRoutine() {
        System.out.println("Tekan Enter untuk melanjutkan program...");
        try {
            System.in.read();
        } catch(Exception e)
        {}
    }

    void Ketik() {
        PaketKetik pKetik = new PaketKetik();
        displayFunc.Bar();
        System.out.println("Paket Ketik");
        displayFunc.Bar();
        System.out.print("Lama Penggunaan (menit) = ");
        pKetik.waktuKetik = userInput.nextDouble();
        displayFunc.Bar();
        System.out.println("Harga Penggunaan = " + pKetik.getHargaKetik());
        plateWarnet.jumlahWaktu = plateWarnet.jumlahWaktu + pKetik.getWaktuKetik();
        plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pKetik.getHargaKetik();
        pauseRoutine();
    }

    void Internet() {
        PaketInternet pInternet = new PaketInternet();
        displayFunc.Bar();
        System.out.println("Paket Internet");
        displayFunc.Bar();
        System.out.print("Lama Penggunaan (menit) = ");
        pInternet.waktuInternet = userInput.nextDouble();
        displayFunc.Bar();
        System.out.println("Harga Penggunaan = " + pInternet.getHargaInternet());
        plateWarnet.jumlahWaktu = plateWarnet.jumlahWaktu + pInternet.getWaktuInternet();
        plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pInternet.getHargaInternet();
        pauseRoutine();
    }

    void Game() {
        PaketGame pGame = new PaketGame();
        displayFunc.Bar();
        System.out.println("Paket Game");
        displayFunc.Bar();
        System.out.print("Lama Penggunaan (menit) = ");
        pGame.waktuGame = userInput.nextDouble();
        displayFunc.Bar();
        System.out.println("Harga Penggunaan = " + pGame.getHargaGame());
        plateWarnet.jumlahWaktu = plateWarnet.jumlahWaktu + pGame.getWaktuGame();
        plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pGame.getHargaGame();
        pauseRoutine();
    }

    void Print() {
        PaketPrint pPrint = new PaketPrint();
        int pilihanPrint = 0;
        displayFunc.Bar();
        System.out.println("Print");
        displayFunc.Bar();
        System.out.print("Pilih jenis print: \n" + displayFunc.MenuBar()
                + "1. Hitam Putih\n"
                + "2. Warna\n" +
                displayFunc.MenuBar() + "Pilihan = ");
        pilihanPrint = userInput.nextInt();
        displayFunc.Bar();
        if (pilihanPrint == 1 ) {
            System.out.print("Banyak lembar = ");
            int banyakPrint = userInput.nextInt();
            pPrint.hitungPrintHP(banyakPrint);
            System.out.println("Harga Print = " + pPrint.getHargaPrintHP());
            plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pPrint.getHargaPrintHP();
            pauseRoutine();
        } if (pilihanPrint == 2) {
            System.out.print("Banyak lembar = ");
            int banyakPrint = userInput.nextInt();
            pPrint.hitungPrintWarna(banyakPrint);
            System.out.println("Harga Print = " + pPrint.getHargaPrintWarna());
            plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pPrint.getHargaPrintWarna();
            pauseRoutine();
        } else {
            System.out.println("Pilihan anda tidak ada!");
        }
    }

    void Scan() {
        PaketScan pScan = new PaketScan();
        int banyakScan;
        displayFunc.Bar();
        System.out.println("Scan");
        displayFunc.Bar();
        System.out.print("Banyak Scan = ");
        banyakScan = userInput.nextInt();
        pScan.hitungHargaScan(banyakScan);
        System.out.println("Harga Scan = " + pScan.getHargaScan());
        plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pScan.getHargaScan();
        pauseRoutine();
    }
    void TehBotol() {
        PaketTehBotol pTehBotol = new PaketTehBotol();
        int banyakTehBotol;
        displayFunc.Bar();
        System.out.println("Teh Botol");
        displayFunc.Bar();
        System.out.print("Banyak Teh Botol = ");
        banyakTehBotol = userInput.nextInt();
        pTehBotol.hitungHargaTehBotol(banyakTehBotol);
        pTehBotol.hitungHargaTehBotol(banyakTehBotol);
        System.out.println("Harga Teh Botol = " + pTehBotol.getHargaTehBotol());
        plateWarnet.jumlahTotal = plateWarnet.jumlahTotal + pTehBotol.getHargaTehBotol();
        pauseRoutine();
    }


    void Total() {
        System.out.println("Total Waktu Penggunaan = " + plateWarnet.getJumlahWaktu());
        System.out.println("Total Harga = " + plateWarnet.getJumlahTotal());
        pauseRoutine();
    }
}

class MenuWarnet {
    Scanner userInput = new Scanner(System.in);
    Display displayFunc = new Display();
    PaketWarnet paket = new PaketWarnet();
    int Selection;
    void Select() {
        while (Selection != 8) {
            System.out.print(displayFunc.MenuBar() +
                    "WARNET \"CONNECT\" \n" + displayFunc.MenuBar() +
                    "Menu: \n" + displayFunc.MenuBar() +
                    "Masukkan seluruh penggunaan, lalu masuk menu Total! \n" +
                    "1. Paket Ketik  \n" +
                    "2. Paket Internet \n" +
                    "3. Paket Game Online \n" +
                    "4. Print \n" +
                    "5. Scan \n" +
                    "6. Teh Botol \n" +
                    "7. Total \n" +
                    "8. Exit \n" + displayFunc.MenuBar() +
                    "Masukkan pilihan anda [1 - 9]: ");
            Selection = userInput.nextInt();
            switch (Selection) {
                case 1:
                    paket.Ketik();
                    break;
                case 2:
                    paket.Internet();
                    break;
                case 3:
                    paket.Game();
                    break;
                case 4:
                    paket.Print();
                    break;
                case 5:
                    paket.Scan();
                    break;
                case 6:
                    paket.TehBotol();
                    break;
                case 7:
                    paket.Total();
                    break;
                case 8:
                    System.out.println("Program Berhenti!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan yang anda masukkan salah!");
            }
        }
    }
}

public class SoalEmpat {
    public void  main() {
        MenuWarnet menuWarnet = new MenuWarnet();
        menuWarnet.Select();
    }
}
