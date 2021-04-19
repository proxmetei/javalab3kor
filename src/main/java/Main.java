import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ListTest test = new ListTest();
        int n =50000;
        List<Double> arrayList = new ArrayList<>();
        List<Double> linkedList = new LinkedList<>();
        System.out.println("      ArrayList    LinkedList");
        System.out.println("add       " + test.testAdd(arrayList,n) + "            " + test.testAdd(linkedList,n));
        System.out.println("add2       " + test.testAddBegin(arrayList,n) + "            " + test.testAddBegin(linkedList,n));
        System.out.println("get       " + test.testGet(arrayList) + "           " + test.testGet(linkedList));
        System.out.println("contains       " + test.testContains(arrayList, (double) 25000) + "           " + test.testContains(linkedList,(double) 25000));
        System.out.println("size       " + test.testSize(arrayList) + "           " + test.testSize(linkedList));
        System.out.println("sort       " + test.testSort(arrayList) + "           " + test.testSort(linkedList));
        System.out.println("delete       " + test.testRemove(arrayList) + "           " + test.testRemove(linkedList));

    }
}