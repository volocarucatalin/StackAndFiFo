package catalin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Query> listOfQueries =new ArrayList<>();

        Query query1 = new Query(1 , "Catalin");
        Query query2 = new Query(2 , "Cata");
        Query query3 = new Query(3, "Sergiu");
        Query query4 = new Query(1 , "David");

        listOfQueries.add(query1);
        listOfQueries.add(query2);
        listOfQueries.add(query3);
        listOfQueries.add(query4);

        StackAndFifoSort.fifoSort(listOfQueries);

        StackAndFifoSort.stackSort(listOfQueries);


    }
}
