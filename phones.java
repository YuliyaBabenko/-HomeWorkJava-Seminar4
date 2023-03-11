import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// HashMap<Login, Список телефонов>
// - добалять телефон
// - удалять телефон
// - находить по логину телефон/список телефонов

public class phones {
    public static void main(String[] args) throws IOException {

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
        pList3.add("+79651963931");

        HashSet<String> pList4 = new HashSet<String>();
        pList4.add("+79195045830");
        pList4.add("+79651932937");
        pList4.add("+79118457791");

        phonesList.put(log1, pList1);
        phonesList.put(log2, pList2);
        phonesList.put(log3, pList3);
        phonesList.put(log4, pList4);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you Login: ");
        String log = bf.readLine();
        System.out.println("Enter action: output, add, delete, exit");
        String act = bf.readLine();

        while(!act.equals("exit")){
            if(act.equals("add")){
                System.out.println("Enter a phone number:");
                String phone = bf.readLine();
                if (log.equals(log1)) {
                    pList1.add(phone);
                }
                else if (log.equals(log2)) {
                    pList2.add(phone);
                }
                else if (log.equals(log3)) {
                    pList3.add(phone);
                }
                else if (log.equals(log4)) {
                    pList4.add(phone);
                }
                else {
                    System.out.println("The Login is not valid");
                }
            }else{
                if(act.equals("delete")){
                    System.out.println("Enter a phone number:");
                    String phone = bf.readLine();
                    if (log.equals(log1)) {
                        pList1.remove(phone);
                    }
                    else if (log.equals(log2)) {
                        pList2.remove(phone);
                    }
                    else if (log.equals(log3)) {
                        pList3.remove(phone);
                    }
                    else if (log.equals(log4)) {
                        pList4.remove(phone);
                    }
                    else {
                        System.out.println("The Login is not valid");
                    }
                }else{
                    if (act.equals("output")){
                        if (log.equals(log1)) {
                            System.out.println(phonesList.get(log1));
                        }
                        else if (log.equals(log2)) {
                            System.out.println(phonesList.get(log2));
                        }
                        else if (log.equals(log3)) {
                            System.out.println(phonesList.get(log3));
                        }
                        else if (log.equals(log4)) {
                            System.out.println(phonesList.get(log4));
                        }
                        else {
                            System.out.println("The Login is not valid");
                        }
                    }
                }
            }
            System.out.println("Enter action: output, add, delete, exit");
            act = bf.readLine();
        }
    }
}
