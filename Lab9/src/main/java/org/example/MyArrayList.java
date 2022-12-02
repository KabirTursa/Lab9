package org.example;
import java.util.*;
import java.util.Comparator;

/**
 * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * Bubble sort, Selection sort, and Insertion sorts are implemented here
 *
 * @author (Kabir Tursa)
 * @version (CSSSKL 143)
 */

public class MyArrayList implements Comparable {

    // instance data
    protected int[] IntList;
    protected char[] CharList;
    protected String[] StringList;

    // constructor will build all 3 arrays here
    public MyArrayList() {
        this.IntList = new int[10];
        this.CharList = new char[10];
        this.StringList = new String[5];

        // fill all 3 arrays with data
        for (int i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random() * 52);
        }

        // Populate char array
        for (int i = 0; i < CharList.length; i++) {

            Random random = new Random();
            CharList[i] = (char) (random.nextInt(26) + 'a');
        }

        // Populate String array
        StringList[0] = "joe";
        StringList[1] = "mark";
        StringList[2] = "abbey";
        StringList[3] = "tony";
        StringList[4] = "kevin";
    }


    public void intBubbleSort() {
        // Implement your sort, call a helper swap method
        for (int i = 0; i < IntList.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < IntList.length - 1; j++) {
                if (IntList[j] > IntList[j + 1]) {
                    swapInts(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }


    public void CharBubbleSort() {
        // Implement your sort, call a helper swap method
        for (int i = 0; i < CharList.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < CharList.length - 1; j++) {
                if (CharList[j] > CharList[j + 1]) {
                    swapChars(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public void swapInts(int ind1, int ind2) {
        int temp = IntList[ind1];
        IntList[ind1] = IntList[ind2];
        IntList[ind2] = temp;
    }

    public void stringBubbleSort() {
        // Implement your sort, call a helper swap method
        for (int i = 0; i < StringList.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < StringList.length - 1; j++) {
                if (StringList[j].compareTo(StringList[j + 1]) > 0) {
                    swapStrings(j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public void swapChars(int i, int j) {
        // code for swapping chars
        char temp = CharList[i];
        CharList[i] = CharList[j];
        CharList[j] = temp;
    }

    public void swapStrings(int i, int j) {
        // code for swapping Strings
        String temp = StringList[j];
        StringList[j] = StringList[i];
        StringList[i] = temp;
    }

    //selection sort for ints
    public void selectionSort() {
        for (int i = 0; i < IntList.length - 1; i++) {
            int smallest = IntList.length - 1;
            for (int j = i; j < IntList.length; j++) {
                if (IntList[j] < IntList[smallest])
                    smallest = j;
            }
            swapInts(smallest, i);
        }
    }
    //The improved algorithm has the same big O as the normal one. In the worst case scenario, you
    //are still going through the nested loop n times, so O(n^2) is the big O for both.

    //selection sort for Strings
    public void stringSelectionSort() {
        for (int i = 0; i < StringList.length - 1; i++) {
            int smallest = StringList.length - 1;
            for (int j = i; j < StringList.length; j++) {
                if (StringList[j].compareTo(StringList[smallest]) < 0)
                    smallest = j;
            }
            swapStrings(smallest, i);
        }
    }


    public int findSmallest(int[] arr, int begin, int end) {
        int minIndex = begin;
        int minValue = arr[begin];
        for (int i = begin + 1; i < end; i++) {
            if (arr[i] < minValue) {
                minIndex = i;
                minValue = arr[i];
            }
        }
        return minIndex;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof MyArrayList))
            return Integer.MAX_VALUE;
        MyArrayList other = (MyArrayList) o;
        if (this.IntList[0] < other.IntList[0])
            return -1; //-1 means the other object (the parameter) is "greater"
        else if (this.IntList[0] > other.IntList[0])
            return 1; //1 means that this instance is "greater" than the parameter
        else return 0; //0 means that both instances of the object are equal
    }


    //Insertion Sort
    public void insertionSort() {

        for (int i = 0; i < IntList.length - 1; i++) {
            int sortedEnd = i;
            int j = i;
            while (j > 0 && IntList[j] < IntList[j - 1]) {
                swapInts(j, j - 1);
                j--;
            }
        }

        int last = IntList.length - 1;
        while (IntList[last] < IntList[last - 1]) {
            swapInts(last, last - 1);
            last--;
        }

    }
}
