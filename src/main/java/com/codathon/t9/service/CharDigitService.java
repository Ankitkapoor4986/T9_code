package com.codathon.t9.service;

import com.codathon.t9.model.CharDigitObj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ankit on 23/7/16.
 */
public class CharDigitService {
    private static int ASCII_ZERO = 0x30;

    public Map<Character,Integer> getCharDigitMap() {
        Map<Character,Integer> characterIntegerMap=new HashMap<Character, Integer>();
        characterIntegerMap.put('a',2);
        characterIntegerMap.put('b',2);
        characterIntegerMap.put('c',2);
        characterIntegerMap.put('d',3);
        characterIntegerMap.put('e',3);
        characterIntegerMap.put('f',3);
        characterIntegerMap.put('g',4);
        characterIntegerMap.put('h',4);
        characterIntegerMap.put('i',4);
        characterIntegerMap.put('j',5);
        characterIntegerMap.put('k',5);
        characterIntegerMap.put('l',5);
        characterIntegerMap.put('m',6);
        characterIntegerMap.put('n',6);
        characterIntegerMap.put('o',6);
        characterIntegerMap.put('p',7);
        characterIntegerMap.put('q',7);
        characterIntegerMap.put('r',7);
        characterIntegerMap.put('s',7);
        characterIntegerMap.put('t',8);
        characterIntegerMap.put('u',8);
        characterIntegerMap.put('v',8);
        characterIntegerMap.put('w',9);
        characterIntegerMap.put('x',9);
        characterIntegerMap.put('y',9);
        characterIntegerMap.put('z',9);





        return characterIntegerMap;
    }

    public static void main(String[] args){
        CharDigitService s=new CharDigitService();
        s.getCharDigitMap();
    }

}