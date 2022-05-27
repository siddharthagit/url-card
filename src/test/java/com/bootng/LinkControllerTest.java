package com.bootng;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

/*
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
*/

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { LinkController.class, LinkService.class })
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LinkControllerTest {

	@Mock
	LinkService blogService;

	@InjectMocks
	private LinkController controller;

	@BeforeAll
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void test_getBlogStories_success() throws Exception {

		when(blogService.getAllLinks(null)).thenReturn(new ArrayList<String>());

		Object object = controller.getCard(null);

		//Assertions.assertEquals(HttpStatus.OK, object.getStatusCode(), "OK Status");

	}


}
