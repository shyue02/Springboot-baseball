package site.metacoding.red.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.request.team.TeamRegisterDto;


@RequiredArgsConstructor
@RestController
public class TeamController {

	private final TeamService teamService;
	
	@PostMapping("/teamregister")
	public String teamregister(TeamRegisterDto teamRegisterDto) {
		teamService.팀등록(teamRegisterDto);
		return "팀등록";
	}
	
	//테스트
	@GetMapping("/team")
	public String player() {
		return "<h1>team</h1>";
	}
}