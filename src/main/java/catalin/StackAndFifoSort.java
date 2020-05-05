package catalin;

import java.util.ArrayList;
import java.util.List;

public class StackAndFifoSort {

    public static void fifoSort(List<Query> queryList){
        for (int i = 0; i < queryList.size(); i++) {
            System.out.println(queryList.get(i).getKey() + " " +queryList.get(i).getValue());
        }
   }

   public static void stackSort(List<Query> queryList){
       for (int i = queryList.size() - 1; i >= 0 ; i--) {
           System.out.println(queryList.get(i).getKey() + " " +queryList.get(i).getValue());
       }
    }

}
