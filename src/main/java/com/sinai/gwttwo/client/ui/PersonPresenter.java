package com.sinai.gwttwo.client.ui;

import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;

public class PersonPresenter {

	public interface Display {
		HasText getButton();

		AccountPresenter.Display getWorld();
	}

	private PersonPresenter.Display display;

	@Inject
	public PersonPresenter(PersonPresenter.Display display) {
		this.display = display;
	}

	public PersonPresenter.Display getDisplay() {
		return display;
	}
}
