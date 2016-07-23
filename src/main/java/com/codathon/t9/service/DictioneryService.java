package com.codathon.t9.service;

import com.codathon.t9.dao.DictioneryDao;
import com.codathon.t9.model.Dictionery;

/**
 * Created by ankit on 23/7/16.
 */
public class DictioneryService {

    private DictioneryDao dao=DictioneryDao.getInstance();
    private static DictioneryService service=new DictioneryService();

    public void appendZerosToDictioneryPhoneStr(Dictionery dictionery){
         dao.appendZerosToDictioneryPhoneStr(dictionery);
    }

    public static DictioneryService getInstance(){
        return service;
    }




}
