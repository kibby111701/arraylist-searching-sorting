import java.util.*;

public class Sorting{
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList <String>();
        fruits.add("cherry");
        fruits.add("lemon");
        fruits.add("watermelon");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("lime");
        fruits.add("strawberry");
        fruits.add("pear");
        fruits.add("mango"); 
        fruits.add("banana"); 
        fruits.add("apple");



        // selectionSort(fruits);
        insertionSort(fruits);
        System.out.println(fruits);


    }

    public static void selectionSort(ArrayList <String> list){
        for (int i = 0; i < list.size(); i++){
            String first = list.get(i);
            int firstLocation = i;
            String current = list.get(i);
            for (int j = i + 1; j < list.size(); j++){
                if (first.compareTo(list.get(j)) >= 0){
                    first = list.get(j);
                    firstLocation = j;
                }
            }
            list.set(i, first);
            list.set(firstLocation, current);
        }
    }

    public static void insertionSort(ArrayList <String> list){
        for (int i = 1; i < list.size(); i++){
            String current = list.get(i);
            for (int j = i - 1; j >= 0; j--){
                String swap = list.get(j);
                if (current.compareTo(swap) < 0){
                    list.set(j + 1, swap);
                    list.set(j, current);
                }
            }
        }
    }
}