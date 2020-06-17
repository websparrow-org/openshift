package org.websparrow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String welcome() {

		return "Welcome to Websparrow.org";
	}

	@GetMapping("{name}")
	public String welcomeName(@PathVariable("name") String name) {

		return "Hello " + name;
	}

}