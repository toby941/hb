package org.nutz.mvc.adaptor.injector;

import java.lang.reflect.Type;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.nutz.mvc.adaptor.ParamInjector;

public class XmlInjector implements ParamInjector {
    private final Type type;
    private final String name;

    public XmlInjector(Type type, String name) {
        this.type = type;
        this.name = name;
    }

    /**
     * <xml> <br/>
     * <ToUserName><![CDATA[toUser]]></ToUserName> <br/>
     * <FromUserName><![CDATA[fromUser]]></FromUserName> <br/>
     * <CreateTime>1348831860</CreateTime> <br/>
     * <MsgType><![CDATA[text]]></MsgType> <br/>
     * <Content><![CDATA[this is a test]]></Content><br/>
     * <MsgId>1234567890123456</MsgId> <br/>
     * </xml>
     */
    @Override
    public Object get(ServletContext sc, HttpServletRequest req, HttpServletResponse resp, Object refer) {
        try {
            SAXBuilder sb = new SAXBuilder();
            Document doc;
            doc = sb.build(IOUtils.toInputStream((String) refer));
            Element e = doc.getRootElement().getChild(name);
            if (e != null) {
                return e.getText();
            }
            else {
                return null;
            }
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return name;
    }
}
