package site.metacoding.red.domain.team;

import java.sql.Date;
import java.sql.Timestamp;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Team {
	private Integer id;
	private String teamname;
	private String stadiumname;
	private String t_area;
	private Date t_START;
	private Timestamp createDate;
	
	public Team(String teamname, String stadiumname, String t_area, Date t_START) {
		this.teamname = teamname;
		this.stadiumname = stadiumname;
		this.t_area = t_area;
		this.t_START = t_START;
	}
	
	
}
