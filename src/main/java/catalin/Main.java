package catalin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Query> catalin =new ArrayList<>();

        Query query1 = new Query(1 , "Catalin");
        Query query2 = new Query(2 , "Cata");
        Query query3 = new Query(3, "Sergiu");
        Query query4 = new Query(1 , "David");

        catalin.add(query1);
        catalin.add(query2);
        catalin.add(query3);
        catalin.add(query4);

        for (int i = 0; i < catalin.size(); i++) {
            System.out.println(catalin.get(i).getKey() + " " + catalin.get(i).getValue());
        }

    }
}
