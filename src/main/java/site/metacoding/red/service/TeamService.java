package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.domain.team.TeamDao;
import site.metacoding.red.web.dto.request.team.TeamRegisterDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;
	
	public void 팀등록(TeamRegisterDto teamRegisterDto) {
		Team team = teamRegisterDto.toEntity();
		teamDao.insert(team);
	}
	
}
