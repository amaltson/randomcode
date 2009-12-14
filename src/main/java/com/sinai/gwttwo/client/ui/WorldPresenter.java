package com.sinai.gwttwo.client.ui;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;

public class WorldPresenter {

	public interface Display {
		HasClickHandlers getButton();
	}

	private WorldPresenter.Display display;

	@Inject
	public WorldPresenter(WorldPresenter.Display display) {
		this.display = display;
	}

	public WorldPresenter.Display getDisplay() {
		return display;
	}
}
