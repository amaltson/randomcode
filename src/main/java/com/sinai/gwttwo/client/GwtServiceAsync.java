package com.sinai.gwttwo.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GwtServiceAsync {

	void getStringList(AsyncCallback<List<String>> callback);
}
