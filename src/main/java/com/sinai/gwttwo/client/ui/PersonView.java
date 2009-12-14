package com.sinai.gwttwo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;
import com.sinai.gwttwo.client.ui.AccountPresenter.Display;

public class PersonView extends Composite implements PersonPresenter.Display {

	private static HelloWorldUiBinder uiBinder =
			GWT.create(HelloWorldUiBinder.class);

	interface HelloWorldUiBinder extends UiBinder<Widget, PersonView> {
	}

	@UiField(provided = true)
	AccountPresenter.Display account;

	@UiField
	HasText button;

	public PersonView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public HasText getButton() {
		return button;
	}

	public void setAccount(Display accountDisplay) {
		this.account = accountDisplay;
	}
}
