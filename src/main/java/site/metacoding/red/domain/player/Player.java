package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.web.dto.request.player.PlayerDto;

@Setter
@Getter
public class Player {
	private Integer id;
	private String playername;
	private String teamname;
	private Integer uniformnumber;
	private String POSITION;
	private Timestamp createDate;
		
}
