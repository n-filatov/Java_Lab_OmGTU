package ru.omgtu.Labs.Lab_1.Task_9;

import java.util.ArrayList;

/**
 * Created by muffassa on 11.09.15.
 */
public class Text {
    public Text howMuchRetry(String text){
        String[] words = text.split(" ");
        Object[] uniqueWords = deleteDuplicates(words);
        for(int i = 0; i < uniqueWords.length; i++)
        {
            int counter = 0;
            for(int j = 0; j < words.length; j++)
            {
                if (uniqueWords[i].equals(words[j])) counter++;
            }
            System.out.println("Слово "+uniqueWords[i]+" встречается "+ counter+ " раз");
        }
        return null;
    }

    public  Object[] deleteDuplicates(String[] array) {
        ArrayList uniqueWords = new ArrayList ();
        for(int i=0; i< array.length;i++ )
        {
            if(!uniqueWords.contains(array[i]))
                uniqueWords.add(array[i]);
        }
        return uniqueWords.toArray();
    }
}
