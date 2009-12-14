package com.sinai.gwttwo.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.sinai.gwttwo.client.ui.PersonView;

public class Application implements EntryPoint {

	public void onModuleLoad() {
		
		PersonView personView = new PersonView(new Button());
		RootPanel.get().add(personView);
	}
}
