package org.nutz.mvc.adaptor;

import java.lang.reflect.Type;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.nutz.lang.Lang;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.adaptor.injector.XmlInjector;
import org.nutz.mvc.annotation.Param;

public class XmlAdaptor extends PairAdaptor {
    private static final Log log = Logs.getLog(PairAdaptor.class);

    @Override
    protected ParamInjector evalInjector(Type type, Param param) {
        return new XmlInjector(type, param.value());
    }

    @Override
    public Object getReferObject(ServletContext sc, HttpServletRequest req, HttpServletResponse resp, String[] pathArgs) {
        // Read all as String
        try {
            String value = IOUtils.toString(req.getInputStream());
            log.error("request xml: " + value);
            System.err.println("request xml: " + value);
            return value;
        }
        catch (Exception e) {
            throw Lang.wrapThrow(e);
        }
    }
}
