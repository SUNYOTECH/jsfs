package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BResult_10
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
public class JSerializer_964561600 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_964561600();
	
	public JSerializer_964561600() {
		super(964561600);
	}
	
	public JSerializer_964561600(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final BResult_10 obj = (BResult_10)obj1;		
		bbuf.putString("result", obj.result);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final BResult_10 obj = (BResult_10)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_10()));
		
		final BJsonObject js = bin.currentObject;
		obj.result = js.getString("result");
		
		return obj;
	}
	
}
