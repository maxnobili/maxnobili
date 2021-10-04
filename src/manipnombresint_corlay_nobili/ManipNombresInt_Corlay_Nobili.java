/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipnombresint_corlay_nobili;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author maxim
 */
public class ManipNombresInt_Corlay_Nobili {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        int entier1 ;
        int entier2 ;
        System.out.println("saisissez un entier");
        entier1 = sc.nextInt() ;
        System.out.println("saisissez un entier");
        entier2 = sc.nextInt() ;
        int somme = entier1+entier2 ;
        int difference = entier1-entier2;
        int produit = entier1*entier2;
        System.out.println("somme= " + somme);
        System.out.println("difference= " + difference);
        System.out.println("produit= " + produit);
        int quotient = entier1/entier2 ;
        int reste = entier1%entier2 ;
        System.out.println("quotient= " + quotient);
        System.out.println("reste= " + reste);
        
    }
    
}

