/*
 * Copyright 2013 5idea gulf team. All rights reserved.
 */
package com.gulf;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.nutz.lang.Files;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

/**
 * Init.java
 * 项目启动时可以load点缓存
 * @author ryenlea
 */
public class Init implements Setup {
	public static Properties p = new Properties();

	@Override
	public void init(NutConfig arg0) {
		InputStream in = null;
        try {        	
        	in=new BufferedInputStream(new FileInputStream(Files.findFile("settings.properties")));         	
            if (in != null) {
                p.load(in);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch(IOException io) {
                	io.printStackTrace();
                }
            }
        }
	}
	
	@Override
	public void destroy(NutConfig arg0) {
	}

}
