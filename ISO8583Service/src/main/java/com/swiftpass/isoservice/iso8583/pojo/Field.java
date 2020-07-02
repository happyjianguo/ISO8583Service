package com.swiftpass.isoservice.iso8583.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * ClassName: Field <br/>
 * Description: <br/>
 * date: 2020/7/2 15:03<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="field")
public class Field {

    @XmlAttribute(name = "index")
    private String index;
    @XmlAttribute(name = "alias")
    private String alias;
    @XmlAttribute(name = "length")
    private String length;
}
