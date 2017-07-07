package com.newtouch.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
//    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
/*        // 当前日期
        System.out.println("当前日期：\t" + format(c.getTime()));
 
        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH, 1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));
 
        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));
 
        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));*/
        System.out.println("今天是:" + format( c.getTime()));
        //先翻到下下个月 
        c.add(Calendar.MONTH,2);
        //设置到月初
        c.set(Calendar.DATE,1);
        //再往回翻3天
        c.add(Calendar.DATE,-3);
         Exception e;
        System.out.println("下个月倒数第三天是:" + format(c.getTime()));
        
    }
 
    private static String format(Date time) {
        return sdf.format(time);
    }
}
