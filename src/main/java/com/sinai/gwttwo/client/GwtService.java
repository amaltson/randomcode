package com.sinai.gwttwo.client;

import java.util.List;

import com.google.gwt.rpc.client.RpcService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("../gwt-rpc/com.sinai.gwttwo.client.GwtService")
public interface GwtService extends RpcService {

	public List<String> getStringList();
}
