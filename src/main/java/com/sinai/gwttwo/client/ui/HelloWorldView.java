package com.sinai.gwttwo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

public class HelloWorldView extends Composite implements
		HelloWorldPresenter.Display {

	private static HelloWorldUiBinder uiBinder =
			GWT.create(HelloWorldUiBinder.class);

	interface HelloWorldUiBinder extends UiBinder<Widget, HelloWorldView> {
	}

	@UiField(provided = true)
	WorldPresenter.Display world;
	
	@UiField
	HasText button;

	@Inject
	public HelloWorldView(WorldPresenter.Display world) {
		this.world = world;
		initWidget(uiBinder.createAndBindUi(this));
	}

	public WorldPresenter.Display getWorld() {
		return world;
	}

	public HasText getButton() {
		return button;
	}
}
