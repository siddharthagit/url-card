package com.bootng;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { LinkService.class })
public class LinkServiceTest {

	@Autowired
	LinkService service;

	@Test
	public void test_getBlogStory() {

		List<String> list;
		try {
			list = service.getAllLinks("google.com");
			Assertions.assertNotNull(list, "list should not be null");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
