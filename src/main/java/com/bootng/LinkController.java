package com.bootng;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootng.model.PageCard;

/**
 * A simple Spring Boot Controller
 */
@Controller
public class LinkController {

	private static final Logger log = LoggerFactory.getLogger(SpringBootLinkApplication.class);

	@Autowired
	LinkService service;

	@RequestMapping(value = { "/" }, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object getHome() {
		log.info("inside getHome ");

		return "GoTo \\links to see all the links \n";
	}

	public @ResponseBody PageCard getCard(@RequestParam String sourceLink) {
		log.info("inside GET getCard method");
		PageCard card = new PageCard();
		List<String> links = service.getAllLinks(sourceLink);

		StringBuilder result = new StringBuilder();

		for (String link : links) {
			result.append(link).append("\n");
		}

		return card;
	}

}
