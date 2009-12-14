package com.sinai.gwttwo.client.ui;

import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

@GinModules(PersonGinModule.class)
public interface PersonGinjector extends Ginjector {

	PersonPresenter getPresenter();
}
