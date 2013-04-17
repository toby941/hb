/*
 * Copyright 2013 5idea gulf team. All rights reserved.
 */
package com.gulf.web;

import java.io.Serializable;

import com.gulf.domain.Admin;

/**
 * UserContext.java
 * 
 * @author ryenlea
 */
public class UserContext implements Serializable {

	private Admin test;

	public Admin getAdmin() {
		return test;
	}

	public void setAdmin(Admin test) {
		this.test = test;
	}
	
}
