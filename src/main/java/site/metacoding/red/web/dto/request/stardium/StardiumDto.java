package site.metacoding.red.web.dto.request.stardium;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StardiumDto {
	private String stadiumname;
	private String area;
	private Date build;
}
