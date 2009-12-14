package com.sinai.gwttwo.client.ui;

import com.google.gwt.inject.client.AbstractGinModule;

public class HelloWorldGinModule extends AbstractGinModule {

	@Override
	protected void configure() {
		bind(HelloWorldPresenter.Display.class).to(HelloWorldView.class);
		bind(WorldPresenter.Display.class).to(World.class);
	}
}
