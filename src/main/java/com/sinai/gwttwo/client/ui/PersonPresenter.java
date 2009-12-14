package com.sinai.gwttwo.client.ui;

import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;

public class PersonPresenter {

	public interface Display {
		HasText getButton();

		void setAccount(AccountPresenter.Display accountDisplay);
	}

	private PersonPresenter.Display display;

	@Inject
	public PersonPresenter(PersonPresenter.Display display,
			AccountPresenter accountPresenter) {
		display.setAccount(accountPresenter.getDisplay());
		this.display = display;
	}

	public PersonPresenter.Display getDisplay() {
		return display;
	}
}
