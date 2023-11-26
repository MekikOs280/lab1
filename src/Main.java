import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    private static void Fill(List<Integer> list, int count, String ListType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        for(int i = 0; i < count; i++){
            list.add(random.nextInt(count));
        }
        System.out.printf("Заполнение %s: %s\n", ListType, System.currentTimeMillis() - time);
    }

    private static void randomAccess(List<Integer> list, int count, String ListType){
        long time = System.currentTimeMillis();
        Random random = new Random();

        for(int i = 0; i < count; i++){
            int index = random.nextInt(count);
            int element = list.get(index);
        }
        System.out.printf("Рандомный доступ в  %s: %s\n", ListType, System.currentTimeMillis() - time);
    }

    private static void sequentialAccess(List<Integer> list, String listType) {
        long time = System.currentTimeMillis();
        for (Integer value : list) {
            // Просто перебираем элементы списка
        }
        System.out.printf("Sequential access in %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtStart(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            list.add(0, i);
        }
        System.out.printf("Вставлено в начало %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    private static void insertAtEnd(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            list.add(0, i);
        }
        System.out.printf("Вставлено в конец %s: %s%n\n", listType, System.currentTimeMillis() - time);
    }

    private static void insertInMiddle(List<Integer> list, int count, String listType){
        long time = System.currentTimeMillis();
        for (int i = 0; i < count; i++){
            int index = list.size() / 2;
            list.add(index, i);
        }
        System.out.printf("Вставлено в середину %s: %s\n", listType, System.currentTimeMillis() - time);
    }

    public static void main(String[] args) {
        int size = 100000;
        int insertCount = 1000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList();

        Fill(arrayList, size, "ArrayList");
        randomAccess(arrayList, size, "ArrayList");
        sequentialAccess(arrayList, "ArrayList");
        insertAtStart(arrayList,insertCount, "ArrayList");
        insertInMiddle(arrayList,insertCount, "ArrayList");
        insertAtEnd(arrayList,insertCount, "ArrayList");

        Fill(arrayList, size, "LinkedList");
        randomAccess(arrayList, size, "LinkedList");
        sequentialAccess(arrayList, "LinkedList");
        insertAtStart(linkedList,insertCount, "LinkedList");
        insertInMiddle(linkedList,insertCount, "LinkedList");
        insertAtEnd(linkedList,insertCount, "LinkedList");
    }
}