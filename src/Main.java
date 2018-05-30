import java.util.concurrent.ConcurrentHashMap;

public class Main {


    public static void main(String[] args) {
        ConcurrentHashMap hashMap = new ConcurrentHashMap();
        hashMap.put("king",1);
        Object king = hashMap.get("King");
        System.out.println(Integer.valueOf(king.toString()));
    }
}
