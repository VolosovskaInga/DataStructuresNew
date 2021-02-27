package com.company;


import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;


public class Main {
    static void assignment1() {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Computer");
        words.add("Plate");
        words.add("Chair");
        words.add("Girl");
        words.add("Boy");
        words.add("Cat");
        words.add("Dog");
        words.add("Shirt");
        words.add("Determination");
        System.out.println(words);

        // for (int i = 0; i < words.size(); i++) {
        // System.out.println(words.get(i));
        //System.out.println();

        int startsWithA = 0;
        int endE = 0;
        int containE = 0;
        int containTe = 0;
        int consist5 = 0;
        for (String name : words) {
            if (name.startsWith("C")) {
                startsWithA++;
            }
            if (name.endsWith("e")) {
                endE++;
            }
            if (name.contains("e")) {
                containE++;
            }
            if (name.matches("te")) {
                containTe++;
            }
            if (name.length() == 5) ;
            consist5++;
        }
        System.out.println("There are " + startsWithA + " words that start with C!");
        System.out.println("There are " + endE + " word that end with letter 'e'!");
        System.out.println("There are " + containE + " word that end contain letter 'e'!");
        System.out.println("There are " + containTe + " words that contain substring 'te'!");
        System.out.println("There are " + consist5 + " words that consist of 5 letters!");

        //Calculate a histogram of values related to length of value.
        System.out.println();
        System.out.println("HISTOGRAM");
        int[] blankArr = new int[20];
        for (int i = 0; i < words.size(); i++) {
            int howManyLetters = 0;
            for (String word : words) {
                if (i == word.length()) {
                    howManyLetters++;
                }
            }
            blankArr[i] = howManyLetters;
            if (howManyLetters != 0) {
                System.out.println(howManyLetters + " word/words with " + i + " letters");
            }
        }

        System.out.println();
        System.out.println("Found that it is possible to print Sting alphabetically without using algorithm!");
        Collections.sort(words);
        for (String i : words) {
            System.out.println(i);
        }
    }
    //Assignment2

    //static String palindrome = "Mom";
    //static String palindrome = "Was it a car or a cat I saw";
    static String palindrome = "Madam, in Eden, I’m Adam";
    //static String palindrome = "Yo, banana boy";
    //static String palindrome = "ana ana";

    static void assignment2Stack() {
        palindrome = palindrome.toLowerCase();
        String stringToCheck = new String(palindrome);
        String palindromeString = "";
        System.out.println(palindrome);

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < stringToCheck.length(); i++) {
            char character = stringToCheck.charAt(i);
            stack.push(character);
        }

        while (!stack.isEmpty()) {
            palindromeString = palindromeString + stack.pop();
        }

        if (stringToCheck.equals(palindromeString)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    static void assignment2Queue() {
        palindrome = palindrome.toLowerCase();
        String reverseString = "";
        Queue stack = new LinkedList();

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            stack.add(palindrome.charAt(i));
        }
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.remove();
        }
        if (palindrome.equals(reverseString))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not a palindrome.");
    }

    static void assignment2ArrayBlockingQueue() {
        palindrome = palindrome.toLowerCase();
        String reverseString = "";
        ArrayBlockingQueue<Character> queue = new ArrayBlockingQueue<Character>(palindrome.length());

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            queue.add(palindrome.charAt(i));
        }
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (palindrome.equals(reverseString))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not a palindrome.");
    }

    static void assignment2ArrayDeque() {
        palindrome = palindrome.toLowerCase();
        String reverseString = "";
        Deque<Character> deque = new ArrayDeque<Character>(palindrome.length());

        for (int i = palindrome.length() - 1; i >= 0; i--) {
            deque.add(palindrome.charAt(i));
        }
        while (!deque.isEmpty()) {
            reverseString = reverseString + deque.remove();
        }
        if (palindrome.equals(reverseString))
            System.out.println("String is a palindrome.");
        else
            System.out.println("String is not a palindrome.");
    }

    static void assignment3HashMap() {


        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("Blouse", 39.99);
        priceList.put("Trousers", 50.99);
        priceList.put("T-shirt", 15.99);
        priceList.put("Skirt", 25.99);
        priceList.put("Shoes", 69.99);
        priceList.put("Boots", 120.99);
        priceList.put("Coat", 100.99);
        priceList.put("Gloves", 20.99);
        priceList.put("Dress", 57.99);
        priceList.put("Jeans", 40.99);

        //priceList.forEach((key, value) -> System.out.println(key + " " + value));
        //Iam calculating prices less than 50 eur
        int count = 0;
        for (double price : priceList.values()) {
            if (price < 50.00) {
                count++;
            }
        }
        System.out.println("There are  " + count + " products with the price under 50 eur");
        //Find out which product price is the lowest.
        double minPrice = Collections.min(priceList.values());
        System.out.println("Lowest price is : " + minPrice + " eur");
        //Find out which product price is the largest.
        double maxPrice = Collections.max(priceList.values());
        System.out.println("Largest price is : " + maxPrice + " eur");
        //Create a new HashMap with other products. Merge both HashMaps and print
        HashMap<String, Double> priceListAdd = new HashMap<>();
        priceList.put("Socks", 9.99);
        priceList.put("Scarf", 5.99);
        priceList.put("Shirt", 7.99);

        priceList.putAll(priceListAdd);
        System.out.println("The size of price list is: " + priceList.size() + " items");
        System.out.println("\n");
        //Sorted values in ascending order.
        TreeMap<String, Double> sorted = new TreeMap<>();
        sorted.putAll(priceList);
        System.out.println("The sorted Hashmap:");
        System.out.println(sorted);

    }

    static void assignment3HashTable() {
        Hashtable<String, Double> priceListSet = new Hashtable<>();
        priceListSet.put("Blouse", 9.99);
        priceListSet.put("Trousers", 5.99);
        priceListSet.put("T-shirt", 15.99);
        priceListSet.put("Skirt", 2.99);
        priceListSet.put("Shoes", 6.99);
        priceListSet.put("Boots", 12.99);
        priceListSet.put("Coat", 10.99);
        priceListSet.put("Gloves", 20.99);
        priceListSet.put("Dress", 5.99);
        priceListSet.put("Jeans", 4.99);

        //priceListSet.forEach((key, value) -> System.out.println(key + " " + value));
        //Iam calculating prices less than 10 eur
        int count = 0;
        for (double price : priceListSet.values()) {
            if (price < 10.00) {
                count++;
            }
        }
        System.out.println("There are " + count + " products with the price under 50 eur");
        //Find out which product price is the lowest.
        double minPrice = Collections.min(priceListSet.values());
        System.out.println("Lowest price is : " + minPrice + " eur");
        //Find out which product price is the largest.
        double maxPrice = Collections.max(priceListSet.values());
        System.out.println("Largest price is : " + maxPrice + " eur");
        //Create a new HashMap with other products. Merge both HashMaps and print
        HashMap<String, Double> priceListAdd = new HashMap<>();
        priceListSet.put("Socks", 9.99);
        priceListSet.put("Scarf", 5.99);
        priceListSet.put("Shirt", 7.99);

        priceListSet.putAll(priceListAdd);
        System.out.println("The size of price list is: " + priceListSet.size() + " items");
        System.out.println("\n");
        //Sorted values in ascending order.
        TreeMap<String, Double> sorted = new TreeMap<>();
        sorted.putAll(priceListSet);
        System.out.println("The sorted Hashmap:");
        System.out.println(sorted);


    }


    public static void main(String[] args) {
        //assignment1();
        //assignment2Stack();
        //assignment2Queue();
        //assignment2ArrayBlockingQueue();
        //assignment2ArrayDeque();
        //assignment3HashMap();
        assignment3HashTable();


    }
}
