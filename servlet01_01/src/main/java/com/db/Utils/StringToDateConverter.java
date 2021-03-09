package com.db.Utils;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        Date date=null;
        System.out.println("11111");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
