package com.sinai.gwttwo.client.ui;

import com.google.gwt.inject.client.AbstractGinModule;

public class PersonGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(PersonPresenter.Display.class).to(PersonView.class);
		bind(AccountPresenter.Display.class).to(AccountView.class);
	}
}
