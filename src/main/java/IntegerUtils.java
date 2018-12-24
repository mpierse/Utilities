public class IntegerUtils {

    public Integer getRandomInRange(Integer lowerLimit, Integer upperLimit){
        return  (int)(Math.random() * (upperLimit - lowerLimit + 1) + lowerLimit);
    }

    public Integer[] getRandomArrInRange(Integer lowerLimit, Integer upperLimit, int length){
        Integer[] randomInts = new Integer[length];
        for (int i = 0; i<randomInts.length; i++) {
            randomInts[i] = getRandomInRange(lowerLimit, upperLimit);
        }
        return randomInts;
    }
}
