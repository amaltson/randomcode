package com.sinai.gwttwo.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class AccountView extends Composite implements AccountPresenter.Display {

	private static WorldUiBinder uiBinder = GWT.create(WorldUiBinder.class);

	interface WorldUiBinder extends UiBinder<Widget, AccountView> {
	}

	@UiField
	Button button;

	public AccountView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

	public HasClickHandlers getButton() {
		return button;
	}
}
