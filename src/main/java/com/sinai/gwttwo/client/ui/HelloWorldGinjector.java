package com.sinai.gwttwo.client.ui;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(HelloWorldGinModule.class)
public interface HelloWorldGinjector extends Ginjector {

	HelloWorldPresenter getPresenter();
}
