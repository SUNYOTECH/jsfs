package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BResult_336045129
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=true
// isInline=false
// #members=1

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_1815527676 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_1815527676();
	
	public BSerializer_1815527676() {
		super(1815527676);
	}
	
	public BSerializer_1815527676(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final BResult_336045129 obj = (BResult_336045129)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bout.writeObj(obj.result, false, null);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final BResult_336045129 obj = (BResult_336045129)(obj1 != null ? obj1 : bin.onObjectCreated(new BResult_336045129()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.result = (com.wilutions.jsfs.FileSystemService)bin.readObj(false, null);
		
		return obj;
	}
	
}
