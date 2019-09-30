package com.monkey1024.proxy;

import org.joda.time.DateTime;


public class Test03 {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        DateTime dateTime = new DateTime();
        for(int i = 1; i <= 46; i++) {
            stringBuffer.append("[\"");
            stringBuffer.append(dateTime.plusDays(i).toString("yyyyMMdd"));
            stringBuffer.append("\"]=\"231,2081,2572,4570,6293,6319,6622,7624\" \\\r\n");
        }

        System.out.println(stringBuffer);
    }
}
