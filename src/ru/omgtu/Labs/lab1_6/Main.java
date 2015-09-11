package ru.omgtu.Labs.lab1_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        text = text.replaceAll("[ \t\n\r]+", " ");


        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", " ");

        String[] newText = text.split("");

        for(int i = 0; i < text.length(); i++)
        {
            System.out.println(newText[i]);
        }

    }
}
