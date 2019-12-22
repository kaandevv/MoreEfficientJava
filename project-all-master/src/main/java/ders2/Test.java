package ders2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Role roleAdmin = Role.ADMIN;
        Role roleGuest = Role.GUEST;
        MyModel myModel = new MyModel();
        myModel.setleId(1);
//        System.out.println(myModel.getirId(roleGuest));
        List list = new ArrayList<>();
        list.add("deneme");
        list.add(1);
        list.add(myModel);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        List<String> list2 = new ArrayList<String>();
        list.add("deneme");
        list.add("1");
        list.add("dadasda");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(3);
        integerList.add(6);
        integerList.add(3);
        integerList.add(2);


        System.out.println(integerList.stream().distinct().count());






      /*  for (Object vars : list) {
            System.out.println(vars);
        }*/

        list2.parallelStream().forEach(deneme ->
                System.out.println(deneme + " yazdi")
        );


    }
}
