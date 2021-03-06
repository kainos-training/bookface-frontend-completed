package com.kainos.training.dropwizard.login.frontends.views;

import org.junit.Test;
import com.kainos.training.dropwizard.login.frontends.views.Index;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class IndexViewTests {
    
	@Test
    public void checkIndex_returnsExpectedView(){
		Index index = new Index();
		
		assertThat(index, is(instanceOf(Index.class)));		
    }
}
