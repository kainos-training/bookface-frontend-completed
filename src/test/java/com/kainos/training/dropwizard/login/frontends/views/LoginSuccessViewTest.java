package com.kainos.training.dropwizard.login.frontends.views;

import org.junit.Test;
import com.kainos.training.dropwizard.login.frontends.views.LoginSuccessView;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class LoginSuccessViewTest {
	
	@Test
	public void checkLoginSuccessViewTest_returnsExpectedView(){
		LoginSuccessView loginSuccessView = new LoginSuccessView();
		
		assertThat(loginSuccessView, is(instanceOf(LoginSuccessView.class)));
	}
}
