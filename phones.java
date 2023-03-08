import java.util.*;

// HashMap<Login, Список телефонов>
// - добалять телефон
// - удалять телефон
// - находить по логину телефон/список телефонов

public class phones {
    public static void main(String[] args) {
        Map<String, HashSet<String>> phonesList = new HashMap<String, HashSet<String>>();

        String log1 = "Ivanov";
        String log2 = "Petrov";
        String log3 = "Bukhchidze";
        String log4 = "Pupkov";

        HashSet<String> pList1 = new HashSet<String>();
        pList1.add("+79195741830");
        pList1.add("+79651462937");
        pList1.add("+79118457301");
        
        HashSet<String> pList2 = new HashSet<String>();
        pList2.add("+79195745830");
        pList2.add("+79651962937");
        pList2.add("+79118457701");

        HashSet<String> pList3 = new HashSet<String>();
        pList3.add("+79198745830");
        pList3.add("+79651963937");
        pList3.add("+79119457701");
        pList3.remove("+79651963937");
        pList3.add("+79651963931");

        HashSet<String> pList4 = new HashSet<String>();
        pList4.add("+79195045830");
        pList4.add("+79651932937");
        pList4.add("+79118457791");

        phonesList.put(log1, pList1);
        phonesList.put(log2, pList2);
        phonesList.put(log3, pList3);
        phonesList.put(log4, pList4);

        System.out.printf("For " + log3 + " we have the following phone list: " + phonesList.get(log3));
    }
}
