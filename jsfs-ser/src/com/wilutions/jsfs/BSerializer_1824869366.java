package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BRequest_FileSystemService_executeNotifyExit
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1824869366 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1824869366();
	
	public BSerializer_1824869366() {
		super(1824869366);
	}
	
	public BSerializer_1824869366(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BRequest_FileSystemService_executeNotifyExit obj = (BRequest_FileSystemService_executeNotifyExit)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.args, true, com.wilutions.jsfs.BSerializer_1888107655.instance);
		bout.writeObj(obj.opts, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BRequest_FileSystemService_executeNotifyExit obj = (BRequest_FileSystemService_executeNotifyExit)(obj1 != null ? obj1 : bin.onObjectCreated(new BRequest_FileSystemService_executeNotifyExit()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.args = (java.lang.String[])bin.readObj(true, com.wilutions.jsfs.BSerializer_1888107655.instance);
		obj.opts = (com.wilutions.jsfs.ExecuteOptions)bin.readObj(false, null);
		
		return obj;
	}
	
}
