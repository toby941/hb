/*
 * Copyright 2013 5idea gulf team
 */
package com.gulf;

import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * MainModule.java
 * 
 * @author ryenlea
 */
@Modules(scanPackage = true)
@Encoding(input = "UTF-8", output = "UTF-8")
@Fail("json")
@SetupBy(Init.class)
@IocBy(type = ComboIocProvider.class, args = {"*org.nutz.ioc.loader.json.JsonLoader", "config/",
        "*org.nutz.ioc.loader.annotation.AnnotationIocLoader", "com.gulf"})
public class MainModule {
}
