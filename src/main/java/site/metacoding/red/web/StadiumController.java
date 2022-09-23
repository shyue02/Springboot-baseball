package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.StadiumService;
import site.metacoding.red.web.dto.request.stardium.StardiumRegisterDto;


@RequiredArgsConstructor
@RestController
public class StadiumController {

	private final StadiumService stadiumService;
	
	@PostMapping("/stadiumregister")
	public String stadiumregister(StardiumRegisterDto stadiumeRegisterDto)	{
		stadiumService.야구장등록(stadiumeRegisterDto);
		return "야구장등록완료";
	}
	
	//테스트
	@GetMapping("/stadium")
	public String player() {
		return "<h1>stadium</h1>";
	}
}