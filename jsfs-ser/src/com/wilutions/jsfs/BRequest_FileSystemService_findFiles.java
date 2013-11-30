package com.wilutions.jsfs;

/*
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenApiClass DO NOT MODIFY.
 */

import byps.*;
import java.io.Serializable;

/**
*/
@SuppressWarnings("all")
public final class BRequest_FileSystemService_findFiles extends BMethodRequest implements Serializable {

	public java.lang.String path;
	public FindOptions findOptions;
	
	public final static long serialVersionUID = 1131301080L;
	
	public int getRemoteId() { return 336045129; }
	
	public void execute(BRemote __byps__remote, BAsyncResult<Object> __byps__asyncResult) throws Throwable {
		try {
			final FileSystemServiceAsync __byps__remoteT = (FileSystemServiceAsync)__byps__remote;			
			BAsyncResultSendMethod<java.util.List<FileInfo>> __byps__outerResult = new BAsyncResultSendMethod<java.util.List<FileInfo>>(__byps__asyncResult, new BResult_1439246415());			
			__byps__remoteT.findFiles(path, findOptions, __byps__outerResult);
		} catch (Throwable e) {
			__byps__asyncResult.setAsyncResult(null, e);
			throw e;
		}
	}	
	
}
