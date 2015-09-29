package ru.omgtu.Tests.Lab_1_Test.Lab_1_9_Test;

import org.junit.Assert;
import org.junit.Test;
import ru.omgtu.Labs.Lab_1.Task_9.Text;

import java.lang.Object;

/**
 * Created by muffassa on 11.09.15.
 */
public class TextTest {

    @Test
    public void noDuplicates(){
        String[] text = new String[]{"Text", "without", "duplicates"};
        Object[] pattern = new Object[]{"Text", "without", "duplicates"};
        Text resultText = new Text();
        Object[] result = resultText.deleteDuplicates(text);
        Assert.assertArrayEquals(pattern, result);

    }

    @Test
    public void twoDuplicates(){
        String[] text = new String[]{"Text", "with", "two duplicates", "first", "duplicate", "second", "duplicate"};
        Object[] pattern = new Object[]{"Text", "with", "two duplicates", "first", "duplicate", "second"};
        Text resultText = new Text();
        Object[] result = resultText.deleteDuplicates(text);
        Assert.assertArrayEquals(pattern, result);
    }

    @Test
    public void duplicatesWithManyWords(){
        String[] text = new String[]{"One", "One", "One", "Two", "Three", "Three", "Four"};
        Object[] pattern = new Object[]{"One","Two", "Three", "Four"};
        Text resultText = new Text();
        Object[] result = resultText.deleteDuplicates(text);
        Assert.assertArrayEquals(pattern, result);
    }
}
