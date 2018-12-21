public class IntegerUtils {

    public Integer getRandomInRange(Integer lowerLimit, Integer upperLimit){
        return  (int)(Math.random() * upperLimit + lowerLimit);
    }

}
