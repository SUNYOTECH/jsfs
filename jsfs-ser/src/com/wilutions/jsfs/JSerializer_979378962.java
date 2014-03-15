package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.FormItem
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
public class JSerializer_979378962 extends JSerializer_Object {
	
	public final static BSerializer instance = new JSerializer_979378962();
	
	public JSerializer_979378962() {
		super(979378962);
	}
	
	public JSerializer_979378962(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final FormItem obj = (FormItem)obj1;		
		bbuf.putString("name", obj.name);
		bbuf.putString("type", obj.type);
		bbuf.putString("value", obj.value);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final FormItem obj = (FormItem)(obj1 != null ? obj1 : bin.onObjectCreated(new FormItem()));
		
		final BJsonObject js = bin.currentObject;
		obj.name = js.getString("name");
		obj.type = js.getString("type");
		obj.value = js.getString("value");
		
		return obj;
	}
	
}