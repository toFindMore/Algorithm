package sorting;

import org.junit.Test;
import org.junit.runner.RunWith;

import javax.swing.plaf.synth.SynthStyle;

import static java.lang.Float.NEGATIVE_INFINITY;
import static java.lang.Float.NaN;
import static java.lang.Float.POSITIVE_INFINITY;
import static org.junit.Assert.*;

public class SortingBladeTest {
    @Test
    public void NumTest() {
        String[] a = {"1","2","0","4"};
        SortingBlade sortingBlade = new SortingBlade();
        sortingBlade.sort(a);
        sortingBlade.show(a);



        String s0 = "hello";
        String s1 = "hello";
        String s2 = "he" + "llo";
        s1= "dd";
        System.out.println( s0 == s1 );
        System.out.println( s0 == s2 );

        System.out.println(3%2.5);

        dd:
        for(int i=0;i<100;i++)
        {
            for (int j = 0; j < 100; j++) {
                System.out.println("OK");
                break dd;
            }
        }
    }
}
