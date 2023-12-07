import java.util.ArrayList;
import java.util.Collections;

public class selectionsort {
    static void printArrayList(ArrayList<Integer> arrayList) {
        arrayList.forEach(item -> {
            System.out.print(item + " ");
        });
        System.out.println();
    }

    static Integer getMinumumItemIndex(ArrayList<Integer> arrayList, int startIndex) {
        int minumunIndex = 0;
        int minumunValue = 999;
        for (int i = startIndex; i < arrayList.size(); i++) {
            if (minumunValue > arrayList.get(i)) {
                minumunIndex = i;
                minumunValue = arrayList.get(i);
            }
        }
        return minumunIndex;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(7);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(12);
        list.add(11);
        list.add(8);

        printArrayList(list);
        for (int i = 0; i < list.size(); i++) {
            try {
                int minIndex = getMinumumItemIndex(list, i);
                Collections.swap(list, i, minIndex);
            } catch (Exception e) {
                continue;
            }
        }
        printArrayList(list);

    }
}
