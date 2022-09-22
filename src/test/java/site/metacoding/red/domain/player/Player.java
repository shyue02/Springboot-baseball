package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.web.dto.request.player.PlayerSaveForm;

@Setter
@Getter
public class Player {
	private Integer id;
	private String playername;
	private String teamname;
	private Integer uniformnumber;
	private String POSITION;
	private Timestamp createDate;

	
	public void update(PlayerSaveForm updateDto) {
		this.playername=updateDto.getPlayername();
		this.teamname=updateDto.getTeamname();
		this.uniformnumber=updateDto.getUniformnumber();
		this.POSITION=updateDto.getPOSITION();
	}
		
}
