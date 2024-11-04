package ArrayList;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add elements
        list.add(1);
        list.add(1);
        System.out.println(list);
        //access
        int num = list.get(0);
        System.out.println(num);
        //change
        list.set(1,2);
        System.out.println(list);
        //remove
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
    }
}
