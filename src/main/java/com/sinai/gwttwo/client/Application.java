package com.sinai.gwttwo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sinai.gwttwo.client.ui.HelloWorldGinjector;
import com.sinai.gwttwo.client.ui.HelloWorldPresenter;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		HelloWorldGinjector injector = GWT.create(HelloWorldGinjector.class);
		HelloWorldPresenter presenter = injector.getPresenter();

		RootPanel.get().add((Widget) presenter.getDisplay());
	}
}
