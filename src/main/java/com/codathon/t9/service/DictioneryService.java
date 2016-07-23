package com.codathon.t9.service;

import com.codathon.t9.dao.DictioneryDao;

/**
 * Created by ankit on 23/7/16.
 */
public class DictioneryService {

    DictioneryDao dao=DictioneryDao.getInstance();

    private int getStringsForNum(int num,String strSequence){
        return dao.getNoOfZerosToAppend( num, strSequence);
    }


}
