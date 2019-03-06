import java.util.HashMap;
import java.util.Set;

public class Music{
    public HashMap<String, String> compactDisc(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Amy Winehouse","Tears Dry On Their Own");
        trackList.put("Lady Gaga","Scheisse");
        trackList.put("Fiona Apple","Criminal");
        trackList.put("Alanis Morisette","Hand in my Pocket");

        String name = trackList.get("Amy Winehouse");
        System.out.println("The artist name is " + name);

        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
        return trackList;
    }
}