package site.metacoding.red.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerDto {
	private String playername;
	private String teamname;
	private Integer uniformnumber;
	private String POSITION;
}
