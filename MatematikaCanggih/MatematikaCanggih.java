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
public class MatematikaCanggih{
    int jumlah;
    int kali;
    int modulus;
    
    void penjumlahan(int a, int b){
        jumlah = a + b;
        System.out.println("a + b = "+jumlah);
    }
    
    int getJumlah(){
        return jumlah;
    }
    
    void perkalian(int a, int b){
        kali = a * b;
        System.out.println("a * b = "+kali);
    }
    
     int getKali(){
        return kali;
    }
     
     void modulus(int a, int b){
         modulus = a % b;
         System.out.println("a % b = "+modulus);
    }
     
     int getModulus(){
         return modulus;
     }
}