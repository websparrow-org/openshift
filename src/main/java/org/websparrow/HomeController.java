package org.websparrow;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private EmpRepo repo;

	@GetMapping
	public String welcome() {

		return "Welcome to Websparrow.org";
	}

	@GetMapping("/{name}")
	public String welcomeName(@PathVariable("name") String name) {

		return "Hello " + name;
	}

	@GetMapping("/emp/load")
	public List<Emp> load() {

		List<Emp> list = Arrays.asList(new Emp("Atul", 10000),

				new Emp("Manish", 100), new Emp("Tendulkar", 1000)

		);

		return repo.saveAll(list);

	}

	@GetMapping("/emp/all")
	public List<Emp> getAllEmp() {

		return repo.findAll();

	}

}