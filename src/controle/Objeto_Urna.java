package controle;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Objeto_Urna {
    public static void main(String[] args) {
    Urna u = new Urna();
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite 1 para votar em Java ou 2 para votar em C: ");
    u.setVoto(Integer.valueOf(entrada.nextLine())); 
     System.out.print("Total de votas em Java : "+u.qtdjava);
    }
}
