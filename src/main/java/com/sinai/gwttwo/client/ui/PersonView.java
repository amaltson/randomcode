package com.sinai.gwttwo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Widget;

public class PersonView extends Composite {

	private static HelloWorldUiBinder uiBinder =
			GWT.create(HelloWorldUiBinder.class);

	interface HelloWorldUiBinder extends UiBinder<Widget, PersonView> {
	}

	@UiField(provided = true)
	Widget button;

	public PersonView(HasText someText) {
		this.button = (Widget) someText;
		initWidget(uiBinder.createAndBindUi(this));
	}

	public HasText getButton() {
		return (HasText) button;
	}
}
