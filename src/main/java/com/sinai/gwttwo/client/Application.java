package com.sinai.gwttwo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;
import com.sinai.gwttwo.client.ui.PersonGinjector;
import com.sinai.gwttwo.client.ui.PersonPresenter;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		PersonGinjector injector = GWT.create(PersonGinjector.class);
		PersonPresenter presenter = injector.getPresenter();

		RootPanel.get().add((Widget) presenter.getDisplay());
	}
}
