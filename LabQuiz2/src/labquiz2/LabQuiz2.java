/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labquiz2;
import java.util.Scanner;

/**
 *
 * @author Duran_PC
 */
public class LabQuiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     int sayi1,sayi2,basamakSayisi=0,kuvvetToplam=0;
     int kuvvet,basamak;
     System.out.println("Bir sayı giriniz");
     sayi1=input.nextInt();
     sayi2=sayi1;
     if(sayi1>=0) //sayının O'a eşit ve büyük olması durumu kontrol edilir 
     {
     do
     {
     sayi1=sayi1/10;
     basamakSayisi++;
     }while(sayi1>0); //bu döngü basamak sayısını bulmak için
     sayi1=sayi2;
     for(int i=1;i<=basamakSayisi;i++)
     {  basamak=sayi1%10; //basamakları rakamlarına ayırır
        kuvvet=(int) Math.pow(basamak,basamakSayisi); //basamakların basamak sayısı ile kuvveti alınır
        kuvvetToplam=kuvvetToplam+kuvvet;
        sayi1=sayi1/10; //int sayı türü olduğundan bir basamak küçülür
     }
     if(kuvvetToplam==sayi2) //Sayının Armstrong sayısı olup olmadığı kontrol edilir
     System.out.println("Sayı Armstrong sayısıdır.");
     else
     System.out.println("Sayı Armstrong sayısı değildir.");    
    }
     else //Sayının negatif olması durumunda uyarı verir
     System.out.println("Sayınız 0'a eşit veya büyük olmalıdır.");    
    }
}
