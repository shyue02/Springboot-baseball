package site.metacoding.red.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter
public class RegisterDto {
	private String playername;
	private String teamname;
	private Integer uniformnumber;
	private String POSITION;
	
	public Player toEntity() {
		Player player = new Player(this.playername, this.teamname, this.uniformnumber, this.POSITION);
		return player;
	}
}
