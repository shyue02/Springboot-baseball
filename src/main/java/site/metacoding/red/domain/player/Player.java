package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Player {
	private Integer id;
	private String playername;
	private String teamname;
	private Integer uniformnumber;
	private String POSITION;
	private Timestamp createDate;
	
	
	public Player(String playername, String teamname, Integer uniformnumber, String POSITION) {
		this.playername = playername;
		this.teamname = teamname;
		this.uniformnumber = uniformnumber;
		this.POSITION = POSITION;
	}
	
	
}
