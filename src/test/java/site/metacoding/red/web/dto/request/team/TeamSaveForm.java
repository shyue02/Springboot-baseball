package site.metacoding.red.web.dto.request.team;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamSaveForm {
	private String teamname;
	private String stadiumname;
	private String t_area;
	private Date t_START;
}
