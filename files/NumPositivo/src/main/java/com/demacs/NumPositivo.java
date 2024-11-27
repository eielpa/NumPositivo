package com.demacs;

import java.util.Scanner;

public class NumPositivo {

    public boolean ePositivo(int num){

        if(num > 0){
            System.out.println("Numero positivo");
            return true;
        }
        else{
            if(num==0){
                System.out.println("Zero");
                return false;
            }
            System.out.println("Numero negativo");
            return false;
        }



    }

    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = sc.nextInt();
        ePositivo(num);

    }

}
