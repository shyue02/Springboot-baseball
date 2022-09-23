package site.metacoding.red.web.dto.request.expulsion;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.expulsion.Expulsion;
import site.metacoding.red.domain.player.Player;

@Setter
@Getter
public class ExpulsioinRegisterDto {
	private String name;
	private Integer uniformnumber;
	private String POSITION;
	private String reson;
	
	
	public Expulsion toEntity() {
		Expulsion expulsion = new Expulsion(this.name, this.uniformnumber, this.POSITION, this.reson);
		return expulsion;
	}
	
	
}
