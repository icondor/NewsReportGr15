import java.util.Map;

public class Report {

    public void printReport(Map<String, Integer> map) {

        for(Map.Entry<String, Integer> current:map.entrySet()) {
            System.out.println(current.getKey()+":"+current.getValue());
        }

    }
}
