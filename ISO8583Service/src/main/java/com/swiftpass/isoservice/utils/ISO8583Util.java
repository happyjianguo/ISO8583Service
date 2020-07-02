package com.swiftpass.isoservice.utils;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: ISO8583Util <br/>
 * Description: <br/>
 * date: 2020/6/30 17:10<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
public class ISO8583Util {
    public static String bytesToHexString(byte[] data){
        if (data == null) return "N/A";
        StringBuffer sbReturn = new StringBuffer(data.length);
        for (int i = 0; i < data.length; i++) {
            String sTemp = Integer.toHexString(0xFF & data[i]);
            if (sTemp.length() < 2)
                sbReturn.append(0);
            sbReturn.append(sTemp.toUpperCase());
        }
        return sbReturn.toString();
    }


    public static String bytesToString(byte[] data){
        String result = null;
        try {
            result = new String(data,"gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }finally {
            return result;
        }
    }
}
