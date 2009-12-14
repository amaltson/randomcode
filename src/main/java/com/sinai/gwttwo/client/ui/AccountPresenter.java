package com.sinai.gwttwo.client.ui;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.inject.Inject;

public class AccountPresenter {

	public interface Display {
		HasClickHandlers getButton();
	}

	private AccountPresenter.Display display;

	@Inject
	public AccountPresenter(AccountPresenter.Display display) {
		this.display = display;
	}

	public AccountPresenter.Display getDisplay() {
		return display;
	}
}
