package com.mycode;
public class EaeOutput {
    public static void main(String [] args){
        escreverString("eae\n");

        System.out.println(escreverNomes("José", "Maria"));
    }
    public static void escreverString(String texto){
        System.out.println(texto);
    }

    public static String escreverNomes(String nome1, String nome2){
        return nome1+" "+nome2;
    }
}
