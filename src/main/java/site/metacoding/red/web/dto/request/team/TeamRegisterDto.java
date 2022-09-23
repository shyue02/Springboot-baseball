package site.metacoding.red.web.dto.request.team;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.team.Team;

@Setter
@Getter
public class TeamRegisterDto {
	private String teamname;
	private String stadiumname;
	private String t_area;
	private Date t_START;
	
	public Team toEntity() {
		Team team = new Team(this.teamname, this.stadiumname, this.t_area, this.t_START);
		return team;
	}
}
