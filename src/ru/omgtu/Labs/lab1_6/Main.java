package ru.omgtu.Labs.lab1_6;

import java.util.Scanner;

public class Main {

    //Из небольшого текста удалить все символы, кроме пробелов, не являющиеся буквами.
    // Между последовательностями подряд идущих букв оставить хотя бы один пробел.
    public static void main(String[] args) {
        System.out.println("Введите текст");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        text = text.replaceAll("[ \t\n\r]+", " ");


        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", " ");



        for(int i = 0; i < text.length(); i++)
        {
            System.out.print(text.charAt(i)+" ");
        }



    }
}
