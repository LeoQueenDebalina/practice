
package collection;

import java.util.*;

public class TestJavaCollection {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        System.out.println(arrayList);
        Collections.addAll(arrayList,7,8,89);
        System.out.println(arrayList);


        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("goru");
        linkedList.add("chhagol");
        linkedList.add("vera");
        linkedList.add("gadha");
        linkedList.add("ucche");
        linkedList.add("sosha");
        System.out.println(linkedList);
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.addFirst("ghsefhjhf");
        System.out.println(linkedList);

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Debalina");
        hashMap.put(2,"Dona");
        System.out.println(hashMap.containsValue("Debalina"));
        System.out.println(hashMap);

        Stack<String> str = new Stack<>();
        str.push("dona");
        str.push("dona");
        System.out.println(str);
        str.pop();
        System.out.println(str);


    }
}
