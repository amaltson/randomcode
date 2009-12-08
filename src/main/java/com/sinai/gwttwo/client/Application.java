package com.sinai.gwttwo.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		GwtServiceAsync gwtService = GWT.create(GwtService.class);
		gwtService.getStringList(new AsyncCallback<List<String>>() {

			public void onSuccess(List<String> arg0) {
				Window.alert(arg0.toString());
			}

			public void onFailure(Throwable arg0) {
				Window.alert(arg0.toString());
			}
		});
	}
}
