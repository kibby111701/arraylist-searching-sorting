import java.util.*;

public class Searching{
    
    public static void main(String[] args) {
        ArrayList <String> fruits = new ArrayList <String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("lemon");
        fruits.add("lime");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("pear");
        fruits.add("strawberry");
        fruits.add("watermelon");


        System.out.println(simpleSearch(fruits, "cherry"));
        System.out.println(simpleSearch(fruits, "blueberry"));
        // System.out.println(binarySearch(fruits, "cherry"));
        // System.out.println(binarySearch(fruits, "blueberry"));
    }
    
    public static int simpleSearch(ArrayList <String> haystack, String needle){
        for (int i = 0; i < haystack.size(); i++){
            String currentItem = haystack.get(i);
            if (currentItem.equals(needle)){
                return i;
            }
        } 
        return -1;
    }

    // public static int binarySearch(ArrayList <String> haystack, String needle){
    //     int i = haystack.size() / 2;
    //     int firstSide = 0;
    //     int lastSide = haystack.size() - 1;

    //     while (i > 0){  
    //         if (haystack.get(i).compareTo(needle) == 0){
    //             return i;
    //         }
    //         else if (haystack.get(i).compareTo(needle) < 0){
    //             lastSide = i;
    //         }
    //         else if (haystack.get(i).compareTo(needle) > 0){
    //             firstSide = i;
    //         }

    //         i = firstSide + ((lastSide - firstSide)/2);
    //     }

    //     return -1;
    // }

}