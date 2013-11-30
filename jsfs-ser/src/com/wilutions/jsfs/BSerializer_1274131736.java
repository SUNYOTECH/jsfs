package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.NotifyInfo
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1274131736 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1274131736();
	
	public BSerializer_1274131736() {
		super(1274131736);
	}
	
	public BSerializer_1274131736(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final NotifyInfo obj = (NotifyInfo)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.error);
		bbuf.putString(obj.extraInfo);
		bbuf.putInt(obj.id);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final NotifyInfo obj = (NotifyInfo)(obj1 != null ? obj1 : bin.onObjectCreated(new NotifyInfo()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.error = bbuf.getString();
		obj.extraInfo = bbuf.getString();
		obj.id = bbuf.getInt();
		
		return obj;
	}
	
}
