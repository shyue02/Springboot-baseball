package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class ExpulsioinController {

	@GetMapping("/expulsion")
	public String player() {
		return "<h1>expulsion</h1>";
	}
}