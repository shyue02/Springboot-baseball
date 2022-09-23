package site.metacoding.red.domain.expulsion;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Expulsion {
	private Integer id;
	private String name;
	private Integer uniformnumber;
	private String POSITION;
	private String reson;
	private Timestamp createDate;
	
	public Expulsion(String name, Integer uniformnumber, String pOSITION, String reson) {
		this.name = name;
		this.uniformnumber = uniformnumber;
		this.POSITION = pOSITION;
		this.reson = reson;
	}
	
	
}
