package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for (JumaKundory kundor:JumaKundory.values()) {
            if (kundor.name().equals(a)){
                System.out.println(kundor);
            }
        }

    }
}
