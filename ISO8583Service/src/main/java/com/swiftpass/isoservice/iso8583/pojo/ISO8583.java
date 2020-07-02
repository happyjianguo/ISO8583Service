package com.swiftpass.isoservice.iso8583.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ClassName: ISO8583 <br/>
 * Description: <br/>
 * date: 2020/7/2 15:10<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "ISO8583")
public class ISO8583 {
    @XmlElement(name = "body")
    private Body body;
}
