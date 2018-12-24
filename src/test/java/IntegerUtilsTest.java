import org.junit.Assert;
import org.junit.Test;

public class IntegerUtilsTest {

    IntegerUtils integerUtils = new IntegerUtils();

@Test
    public void getRandomRangeTest(){
    Integer actual = integerUtils.getRandomInRange(0,100);
    Assert.assertNotEquals(actual, null);
}

    @Test
    public void getRandomRangeTest2(){
        Integer actual = integerUtils.getRandomInRange(0,100);
        Assert.assertTrue(actual>=0 && actual<=100);
    }

    @Test
    public void getRandomArrTest(){
    Integer[] actual = integerUtils.getRandomArrInRange(0, 100, 5);
        for (Integer i : actual) {
            Assert.assertTrue(i>=0 && i<=100);
        }
    }

    @Test
    public void getRandomArrTest2(){
        Integer[] actual = integerUtils.getRandomArrInRange(0, 100, 5);
        for (Integer i : actual) {
            Assert.assertNotEquals(i, null);
        }
    }



}
