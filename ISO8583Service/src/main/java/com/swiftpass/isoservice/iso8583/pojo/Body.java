package com.swiftpass.isoservice.iso8583.pojo;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * ClassName: Body <br/>
 * Description: <br/>
 * date: 2020/7/2 15:06<br/>
 *
 * @author jinhui.hu<br />
 * @since JDK 1.8
 */
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body {

    @XmlElement(name = "field")
    private List<Field> bodyList;

}
