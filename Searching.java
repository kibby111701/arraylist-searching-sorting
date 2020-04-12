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
        System.out.println(binarySearch(fruits, "blueberry"));
        System.out.println(binarySearch(fruits, "cherry"));
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

    public static int binarySearch(ArrayList <String> haystack, String needle){
        int firstSide = 0;
        int lastSide = haystack.size() - 1;

        while (firstSide <= lastSide){  
            int i = firstSide + (lastSide - firstSide)/2;
            if (haystack.get(i).equals(needle)){
                return i;
            }
            else if (haystack.get(i).compareTo(needle) > 0){
                lastSide = i - 1;
            }
            else if (haystack.get(i).compareTo(needle) < 0){
                firstSide = i + 1;
            }


            if (firstSide == lastSide){
                i = -1;
            }
        }

        return -1;
    }

}