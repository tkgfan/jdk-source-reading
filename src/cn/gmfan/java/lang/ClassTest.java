package cn.gmfan.java.lang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author gmfan
 */
public class ClassTest {

    void t(){
        Class clazz;
    }

    @Test
    @DisplayName("(〃'▽'〃)")
    public void testComponentType(){
        ClassTest[] classTests = new ClassTest[0];
        ClassTest[][] classTests1=new ClassTest[0][0];
        ClassTest classTest = new ClassTest();

        assertEquals(classTests.getClass().getComponentType(), ClassTest.class);
        assertEquals(classTests1.getClass().getComponentType(),ClassTest[].class);
        assertEquals(classTest.getClass().getComponentType(),null);
    }
}
