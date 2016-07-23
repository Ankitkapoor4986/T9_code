package com.codathon.t9;

import com.codathon.t9.model.Dictionery;
import com.codathon.t9.service.CharDigitService;
import com.codathon.t9.service.DictioneryService;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankit on 23/7/16.
 */

public class Tester {

    @Test
    public void shdWorkProperly() {
        String input = "the tie";
        DictioneryService dictioneryService = DictioneryService.getInstance();
        CharDigitService charDigitService = CharDigitService.getInstance();
        String phoneKeyStrForString = charDigitService.getPhoneKeyStrForString(input);
        String[] phoneKeyStrSplittedOnHash = charDigitService
                .splitStrOnCharacterGiven(phoneKeyStrForString, "#");
        String[] inputStrSplittedOnSpace = charDigitService.
                splitStrOnCharacterGiven(input, " ");
        List<Dictionery> dictioneryList = new ArrayList<>();
        for (int i = 0; i < inputStrSplittedOnSpace.length; i++) {
            Dictionery dictionery = new Dictionery();
            dictionery.setStringSequence(inputStrSplittedOnSpace[i]);
            dictionery.setPhoneKey(phoneKeyStrSplittedOnHash[i]);
            dictionery.setHashString("#");
            dictioneryService.appendZerosToDictioneryPhoneStr(dictionery);
            dictioneryList.add(dictionery);
        }
        StringBuilder finalStr = new StringBuilder();
        for (int iter = 0; iter < dictioneryList.size(); iter++) {
            Dictionery dictionery = dictioneryList.get(iter);
            finalStr.append(dictionery.getPhoneKey()).append(dictionery.getHashString());
        }
        System.out.println(finalStr);

    }


    @Test
    public void shdWorkProperlyForDiffStr() {

        System.out.println("#######################shdWorkProperlyForDiffStr##########################33");
        String input = "abc acb bac bca cab cba";
        DictioneryService dictioneryService = DictioneryService.getInstance();
        CharDigitService charDigitService = CharDigitService.getInstance();
        String phoneKeyStrForString = charDigitService.getPhoneKeyStrForString(input);
        String[] phoneKeyStrSplittedOnHash = charDigitService
                .splitStrOnCharacterGiven(phoneKeyStrForString, "#");
        String[] inputStrSplittedOnSpace = charDigitService.
                splitStrOnCharacterGiven(input, " ");
        List<Dictionery> dictioneryList = new ArrayList<>();
        for (int i = 0; i < inputStrSplittedOnSpace.length; i++) {
            Dictionery dictionery = new Dictionery();
            dictionery.setStringSequence(inputStrSplittedOnSpace[i]);
            dictionery.setPhoneKey(phoneKeyStrSplittedOnHash[i]);
            dictionery.setHashString("#");
            dictioneryService.appendZerosToDictioneryPhoneStr(dictionery);
            dictioneryList.add(dictionery);
        }
        StringBuilder finalStr = new StringBuilder();
        for (int iter = 0; iter < dictioneryList.size(); iter++) {
            Dictionery dictionery = dictioneryList.get(iter);
            finalStr.append(dictionery.getPhoneKey()).append(dictionery.getHashString());
        }
        System.out.println(finalStr);

    }

    @Test
    public void shdWorkProperlyForAnotherDiffStr() {

        System.out.println("########################shdWorkProperlyForAnotherDiffStr#######################3");
        String[] inputArray = {"the longest case for t nine is probably when"
                , "you enter seven two letter sequence from the"
                , "same key and then repeat the alphabetically"};
        for (String input :
                inputArray) {


            DictioneryService dictioneryService = DictioneryService.getInstance();
            CharDigitService charDigitService = CharDigitService.getInstance();
            String phoneKeyStrForString = charDigitService.getPhoneKeyStrForString(input);
            String[] phoneKeyStrSplittedOnHash = charDigitService
                    .splitStrOnCharacterGiven(phoneKeyStrForString, "#");
            String[] inputStrSplittedOnSpace = charDigitService.
                    splitStrOnCharacterGiven(input, " ");
            List<Dictionery> dictioneryList = new ArrayList<>();
            for (int i = 0; i < inputStrSplittedOnSpace.length; i++) {
                Dictionery dictionery = new Dictionery();
                dictionery.setStringSequence(inputStrSplittedOnSpace[i]);
                dictionery.setPhoneKey(phoneKeyStrSplittedOnHash[i]);
                dictionery.setHashString("#");
                dictioneryService.appendZerosToDictioneryPhoneStr(dictionery);
                dictioneryList.add(dictionery);
            }
            StringBuilder finalStr = new StringBuilder();
            for (int iter = 0; iter < dictioneryList.size(); iter++) {
                Dictionery dictionery = dictioneryList.get(iter);
                finalStr.append(dictionery.getPhoneKey()).append(dictionery.getHashString());
            }
            System.out.println(finalStr);
        }
    }
}
