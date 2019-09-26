package com.example.homeworkweek1day2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> s = new LinkedList<>();
        s.add("Bob");
        s.add("Tom");
        s.add("Bob");

        findDuplicates(s);
        multiplicationTable();

        fizzBuzz(2);
        fizzBuzz(15);
        fizzBuzz(6);
        fizzBuzz(10);

        boolean isPalindrome = checkPalindrome("racecar");
        Log.d("PAL", Boolean.toString(isPalindrome));
        boolean isPalindromeToo = checkPalindrome("Brian");
        Log.d("PAL", Boolean.toString(isPalindromeToo));

        boolean isAnagram = checkAnagrams("redrum", "murder");
        Log.d("ANA", Boolean.toString(isAnagram));
        boolean isAnagramToo = checkAnagrams("Jack", "Jill");
        Log.d("ANA", Boolean.toString(isAnagramToo));
    }

    public void findDuplicates(List<String> strings){
        for(int i = 0; i < strings.size(); i++){
            for(int j = i + 1; j < strings.size(); j++){
                if(strings.get(i).equals(strings.get(j))){
                    Log.d("DUP", strings.get(i));
                }
            }
        }
    }
    public boolean checkPalindrome(String word){
        word = word.replaceAll("[^A-Za-z]+", "").toLowerCase();
        String reverseWord = "";
        for(int i = word.length() - 1; i >= 0; i--){
            reverseWord = reverseWord + word.charAt(i);
        }

        Log.d("PAL", reverseWord);

        if(word.equals(reverseWord)){
            return true;
        }

        return false;
    }

    public void fizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            Log.d("FB", "fizzbuzz");
        } else if(num % 3 == 0){
            Log.d("FB", "fizz");
        } else if(num % 5 == 0){
            Log.d("FB", "buzz");
        }
    }

    public boolean checkAnagrams(String wordOne, String wordTwo){
        wordOne = wordOne.replaceAll("[^A-Za-z]+", "").toLowerCase();
        wordTwo = wordTwo.replaceAll("[^A-Za-z]+", "").toLowerCase();

        if(wordOne.length() == wordTwo.length()){
            char tempArray1[] = wordOne.toCharArray();
            char tempArray2[] = wordTwo.toCharArray();

            Arrays.sort(tempArray1);
            Arrays.sort(tempArray2);

            wordOne = new String(tempArray1);
            wordTwo = new String(tempArray2);

            if(wordOne.equals(wordTwo)){
                return true;
            } else {
                return false;
            }
        }

        return false;
    }

    public void multiplicationTable(){
        Log.d("TAB", "In multiplicationTable");
        int [][] multiTable = new int[10][10];

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                multiTable[i][j] = ((i + 1) * (j + 1));
                Log.d("TAB", Integer.toString(multiTable[i][j]));
            }
        }

        for(int i = 0; i < multiTable.length; i++){
            Log.d("TAB", Arrays.toString(multiTable[i]));
        }
    }

}
