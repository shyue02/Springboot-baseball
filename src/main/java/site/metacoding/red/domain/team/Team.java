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
}
