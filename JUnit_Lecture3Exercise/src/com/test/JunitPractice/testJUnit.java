package com.test.JunitPractice;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class testJUnit {

    /* check two arrays are equal */
    @Test
    public void testNestedStringEqual(){
        String[][] input = {{"Today's"}, {"weather", "is"}, {"nice"}};
        String[][] expected = {{"Today's"},{"weather", "is"}, {"nice"}};

        String[][]  input1 = new String[10][5];
        String[][]  expected1 = new String[10][5];

        for (int i =0; i< 10; i++){
            for (int j=0; j<5;j++){
                input1[i][j] = "s"+ "t";
                expected1[i][j] = "s" + "t";
            }
        }

        /* check what the string is. */
        System.out.println(Arrays.deepToString(input1));

        /* check if the two strings equal. */
        assertArrayEquals(expected1, input1);
        assertArrayEquals(expected, input);

    }

    @Test
    public void testObjectEqual(){
        Dog smallDog1 = new Dog(6,3);
        Dog smallDog2 = new Dog(6,3);
        Dog largeDog = new Dog(20, 30);
        smallDog1.EatFood();
        largeDog.EatFood();

        /* check if two objects can be compared, even if they are defined the same */
        /* answer is no, their address is different. */
        assertEquals(smallDog1, smallDog2);
        /* * output is
        * java.lang.AssertionError:
        * Expected :com.test.JunitPractice.Dog@66d33a
        * Actual   :com.test.JunitPractice.Dog@7cf10a6f
        */
    }
}




