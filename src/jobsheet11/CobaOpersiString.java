/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11;

/**
 *
 * @author LENOVO
 */

import java.util.Locale;
import java.util.Scanner;
public class CobaOpersiString {
    public static void main(String[] args)
    {
       String identitas = "sania tri andani / x rpl 3 / 35";
       System.out.println("Identitas : " + identitas);
       
        String x = "Operasi";
        System.out.println("isi variable x : " + x);
        System.out.println("\""+ x +"\" panjang karakter = "+ x.length());
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        

    }
}
