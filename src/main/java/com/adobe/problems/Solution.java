package com.adobe.problems;





/*
You are running a classroom and suspect that some of your students are passing around the answer to a multiple-choice question disguised as a random note.

Your task is to write a function that, given a list of words and a note, finds and returns the word in the list that is scrambled inside the note, if any exists. If none exist, it returns the result "-" as a string. There will be at most one matching word. The letters don't need to be in order or next to each other. The letters cannot be reused.

Example:
words = ["baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"]
note1 = "ctay"
find(words, note1) => "cat"   (the letters do not have to be in order)

note2 = "bcanihjsrrrferet"
find(words, note2) => "cat"   (the letters do not have to be together)

note3 = "tbaykkjlga"
find(words, note3) => "-"     (the letters cannot be reused)

note4 = "bbbblkkjbaby"
find(words, note4) => "baby"
a-1
b-6
l-1
k-2
y-1

b-2
a-1
y-1
note5 = "dad"
find(words, note5) => "-"

note6 = "breadmaking"
find(words, note6) => "bird"

note7 = "dadaa"
find(words, note7) => "dada"

All Test Cases:
find(words, note1) -> "cat"
find(words, note2) -> "cat"
find(words, note3) -> "-"
find(words, note4) -> "baby"
find(words, note5) -> "-"
find(words, note6) -> "bird"
find(words, note7) -> "dada"

Complexity analysis variables:

W = number of words in `words`
S = maximal length of each word or of the note
*/
import java.io.*;
import java.util.*;

public class Solution {
    static boolean checkifStringPresent(String word,Map<Character,Integer>countNote){
        Map<Character,Integer>countWord= new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(countWord.get(word.charAt(i))==null){
                countWord.put(word.charAt(i),1);
            }else{
                countWord.put(word.charAt(i),countWord.get(word.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer>entryset:countWord.entrySet()){
            Character c=entryset.getKey();
//            System.out.println("Key "+entryset.getKey());
//            System.out.println("Value "+entryset.getValue());
            if(countNote.get(c)!=null){
                if(!(countNote.get(c)>=entryset.getValue())){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
    static String find(String[]words,String note){
        Map<Character,Integer>countNote= new HashMap<>();
        for(int i=0;i<note.length();i++){
            if(countNote.get(note.charAt(i))==null){
                countNote.put(note.charAt(i),1);
            }else{
                //System.out.println("character "+note.charAt(i) + "count "+ countNote.get(note.charAt(i)) );
                countNote.put(note.charAt(i),countNote.get(note.charAt(i)) +1);
            }
        }
        for(String word: words){
            if(checkifStringPresent(word,countNote)){
                return word;
            }
        }


        return "-";
    }

    public static void main(String[] argv) {
        String[] words = {"baby", "referee", "cat", "dada", "dog", "bird", "ax", "baz"};
        String note1 = "ctay";
        String note2 = "bcanihjsrrrferet";
        String note3 = "tbaykkjlga";
        String note4 = "bbbblkkjbaby";
        String note5 = "dad";
        String note6 = "breadmaking";
        String note7 = "dadaa";
        String ans=find(words,note1);
        System.out.println(ans);
        String ans1=find(words,note2);
        System.out.println(ans1);
        String ans3=find(words,note3);
        System.out.println(ans3);
        String ans4=find(words,note4);
        System.out.println(ans4);
        String ans5=find(words,note5);
        System.out.println(ans5);
        String ans6=find(words,note6);
        System.out.println(ans6);

    }
}

