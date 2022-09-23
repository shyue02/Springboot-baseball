package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.ExpulsionService;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.web.dto.request.expulsion.ExpulsioinRegisterDto;
import site.metacoding.red.web.dto.request.player.PlayRegisterDto;


@RequiredArgsConstructor
@RestController
public class ExpulsioinController {

	private final ExpulsionService expulsionService;
	
	@PostMapping("/expulsionregister")
	public String expulsionregister(ExpulsioinRegisterDto expulsionRegisterDto) {
		expulsionService.퇴출선수등록(expulsionRegisterDto);
		return "퇴출선수등록완료";
	}
	
	//테스트
	@GetMapping("/expulsion")
	public String player() {
		return "<h1>expulsion</h1>";
	}
}