package ru.omgtu.Labs.Lab_2.Task_6;

import java.text.DateFormat;


/*Написать регулярное выражение, определяющее является ли данная строчка датой в формате dd/mm/yyyy.
Начиная с 1600 года до 9999 года.
        – пример правильных выражений: 29/02/2000, 30/04/2003, 01/01/2003.
        – пример неправильных выражений: 29/02/2001, 30-04-2003, 1/1/1899.*/
public class Main {
    public static void main(String[] args) {
        Date date = new Date("29/02/2001");

        if(date.isValid())
        {
            System.out.println("Валидна");
        }
        else
        {
            System.out.println("Не валидна");
        }

    }
}
