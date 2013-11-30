package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.WatchFolderNotifyInfo
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStructJson DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=2

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class JSerializer_9906860 extends com.wilutions.jsfs.JSerializer_1274131736 {
	
	public final static BSerializer instance = new JSerializer_9906860();
	
	public JSerializer_9906860() {
		super(9906860);
	}
	
	public JSerializer_9906860(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void internalWrite(final Object obj1, final BOutputJson bout, final BBufferJson bbuf) throws BException {
		final WatchFolderNotifyInfo obj = (WatchFolderNotifyInfo)obj1;		
		super.internalWrite(obj1, bout, bbuf);		
		bbuf.putInt("kind", obj.kind!=null ? obj.kind.ordinal() : 0);
		bout.writeObj("fileInfo",obj.fileInfo, false, null);
	}
	
	@Override
	public Object internalRead(final Object obj1, final BInputJson bin) throws BException {
		final WatchFolderNotifyInfo obj = (WatchFolderNotifyInfo)(obj1 != null ? obj1 : bin.onObjectCreated(new WatchFolderNotifyInfo()));
		
		// Read base class members
		super.internalRead(obj, bin);
		
		final BJsonObject js = bin.currentObject;
		obj.kind = BEnumHelper.fromOrdinal(com.wilutions.jsfs.EWatchFolderNotifyKind.values(), js.getInt("kind"));
		obj.fileInfo = (com.wilutions.jsfs.FileInfo)bin.readObj("fileInfo", false, null);
		
		return obj;
	}
	
}
