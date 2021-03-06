package com.kainos.training.dropwizard.login.frontends.views;

import org.junit.Test;
import com.kainos.training.dropwizard.login.frontends.views.LoginFailureView;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class LoginFailureViewTest {
	
	@Test
	public void checkLoginFailure_returnsExpectedView(){
		LoginFailureView loginFailureView = new LoginFailureView();
		
		assertThat(loginFailureView, is(instanceOf(LoginFailureView.class)));
	}
}
