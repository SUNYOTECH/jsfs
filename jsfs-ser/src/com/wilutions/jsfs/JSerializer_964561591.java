package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BResult_19
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_964561591 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_964561591();
	
	public JSerializer_964561591() {
		super(964561591);
	}
	
	public JSerializer_964561591(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_19 obj = (BResult_19)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_19()));
		
		final BJsonObject js = bin.currentObject;
		// void result		
		return obj;
	}
	
}
