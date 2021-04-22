/*
 * Nama : Della Novia Ramadhan
 * NIM : 11200930000018
 * Kelas : 2A Sistem Informasi
 */
package MatematikaCanggih;

/**
 *
 * Kamis, 22 April 2021
 */
public class MatematikaCanggihBanget extends MatematikaCanggih{
    int jumlahEmpat;
    void penjumlahanEmpat(int a, int b, int c, int d){
        jumlahEmpat = a+b+c+d;
        System.out.println("a + b + c + d = "+jumlahEmpat);
    }
    int getJumlahEmpat(){
    return jumlahEmpat;
    }
}