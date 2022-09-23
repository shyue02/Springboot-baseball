package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.web.dto.request.player.RegisterDto;


@RequiredArgsConstructor
@RestController
public class PlayerController {

	private final PlayerService playerService;
	
	@PostMapping("/register")
	public String register(RegisterDto registerDto) {
		playerService.선수등록(registerDto);
		return "선수등록완료";
	}
	
	
	//테스트
	@GetMapping("/player")
	public String player() {
		return "<h1>player</h1>";
	}
}