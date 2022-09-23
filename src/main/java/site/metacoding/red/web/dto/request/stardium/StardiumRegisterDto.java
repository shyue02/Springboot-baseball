package site.metacoding.red.web.dto.request.stardium;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Setter
@Getter
public class StardiumRegisterDto {
	private String stadiumname;
	private String area;
	private Date build;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.stadiumname, this.area, this.build);
		return stadium;
	}
}
