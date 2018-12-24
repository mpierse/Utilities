import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    StringUtils stringUtils = new StringUtils();

    @Test
    public void reverseTest(){
        String actual = stringUtils.reverse("Javarocks");
        Assert.assertEquals("skcoravaJ", actual);
    }

    @Test
    public void isEqualIgnoreCaseTest(){
        Assert.assertTrue(stringUtils.isEqualIgnoreCase("HeLLO", "HElLO"));
    }

    @Test
    public void isEqualIgnoreCaseTest2(){
        Assert.assertFalse(stringUtils.isEqualIgnoreCase("Hello", "HeLLo2"));
    }

    @Test
    public void repeatStringTest(){
        String actual = stringUtils.repeatString("yo", 5);
        String expected = "yoyoyoyoyo";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void replaceNthSubstringTest(){
        String str = "hello world hello world hello world.";
        String expected = "hello world world hello world.";
        String actual = stringUtils.replaceNthSubstring(str, "hello ", 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIndexofNthSubstringTest(){
        String str = "hello world hello world hello world.";
        int actual = stringUtils.getIndexOfNthSubstring(str, "hello", 2);
        Assert.assertEquals(12, actual);
    }

    @Test
    public void getNumberOfOccurancesTest(){
        String str = "foobarfobarfoofizzbuzzfoofoofoofizzfoobar";
        int actual = stringUtils.getNumberOfOccurrences(str, "foo");
        Assert.assertEquals(6, actual);
    }
}
