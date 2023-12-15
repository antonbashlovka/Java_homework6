import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class App {
    public static void main(String[] args) throws Exception {
        

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        addPhone(map, "John", "123456");
        addPhone(map, "John", "545646");
        addPhone(map, "John", "235418");
        addPhone(map, "Alena", "568465");
        addPhone(map, "Igor", "888465");
        addPhone(map, "Igor", "682865");

        ArrayList<String> list = new ArrayList<>();
        for (String s: map.keySet()){
            list.add(s);
        }

        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2){
                return map.get(o1).size() - map.get(o2).size();
            }
        });


        for (int i=0; i < list.size(); i++){
            System.out.println(list.get(i) + map.get(list.get(i)));
        }
              
    }

    private static void addPhone(HashMap<String, ArrayList<String>> map, String name, String phone){
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);
    }




}
