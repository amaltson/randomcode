package com.sinai.gwttwo.client.ui;

import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;

public class HelloWorldPresenter {

	public interface Display {
		HasText getLabel();

		WorldPresenter.Display getWorld();
	}

	private HelloWorldPresenter.Display display;

	@Inject
	public HelloWorldPresenter(HelloWorldPresenter.Display display) {
		this.display = display;
	}

	public HelloWorldPresenter.Display getDisplay() {
		return display;
	}
}
