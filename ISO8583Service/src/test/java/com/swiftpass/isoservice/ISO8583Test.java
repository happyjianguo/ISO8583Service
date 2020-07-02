package com.swiftpass.isoservice;

import com.swiftpass.isoservice.iso8583.pojo.Field;
import com.swiftpass.isoservice.iso8583.pojo.ISO8583;
import com.swiftpass.isoservice.utils.XmlBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * ClassName: ISO8583Test <br/>
 * Description: <br/>
 * date: 2020/7/2 15:44<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
public class ISO8583Test {

    @Test
    public void xmlJAXBTest(){
        Resource resource = new ClassPathResource("iso8583/ISO8583.xml");
        BufferedReader br = null;
        String line = "";
        StringBuffer buffer = null;
        try {
            br = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
            buffer = new StringBuffer();
            while ((line = br.readLine()) !=null) {
                buffer.append(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // XML转为Java对象
        ISO8583 iso8583 = (ISO8583) XmlBuilder.xmlStrToObject(ISO8583.class, buffer.toString());
        System.out.println(iso8583.getBody().getBodyList().size());
        List<Field> list = iso8583.getBody().getBodyList();
        for (Field field : list) {
            System.out.println("index:" + field.getIndex() + ",alias:" + field.getAlias() + ",lengh:" + field.getLength());
        }
    }

}
