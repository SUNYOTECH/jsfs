package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.NotifyInfo
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_1274131736 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_1274131736();
	
	public JSerializer_1274131736() {
		super(1274131736);
	}
	
	public JSerializer_1274131736(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final NotifyInfo obj = (NotifyInfo)obj1;		
		bbuf.putString("error", obj.error);
		bbuf.putString("extraInfo", obj.extraInfo);
		bbuf.putInt("id", obj.id);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final NotifyInfo obj = (NotifyInfo)(obj1 != null ? obj1 : bin.onObjectCreated(new NotifyInfo()));
		
		final BJsonObject js = bin.currentObject;
		obj.error = js.getString("error");
		obj.extraInfo = js.getString("extraInfo");
		obj.id = js.getInt("id");
		
		return obj;
	}
	
}
