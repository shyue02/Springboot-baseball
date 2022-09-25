package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import site.metacoding.red.web.dto.request.player.PlayRegisterDto;

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
	
	public void update(PlayRegisterDto playRegisterDto) {
		this.playername = playRegisterDto.getPlayername();
		this.teamname = playRegisterDto.getTeamname();
		this.uniformnumber = playRegisterDto.getUniformnumber();
		this.POSITION = playRegisterDto.getPOSITION();
	}
	
	
}
