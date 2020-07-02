package com.swiftpass.isoservice.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * ClassName: XmlBuilder <br/>
 * Description: <br/>
 * date: 2020/7/2 15:32<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
public class XmlBuilder {

    public static Object xmlStrToObject(Class clazz,String xmlStr) {
        Object xmlObject = null;
        Reader reader = null;
        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        try {
            context = JAXBContext.newInstance(clazz);
            unmarshaller = context.createUnmarshaller();
            reader = new StringReader(xmlStr);
            xmlObject = unmarshaller.unmarshal(reader);
            if (null != reader) {
                reader.close();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xmlObject;
    }

}
