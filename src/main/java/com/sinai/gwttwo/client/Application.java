package com.sinai.gwttwo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.sinai.gwttwo.client.ui.HelloWorld;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		HelloWorld helloWorld = new HelloWorld("world", "hi", "hey");
		RootPanel.get().add(helloWorld);
	}
}
