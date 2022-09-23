package site.metacoding.red.domain.stadium;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Stadium {
	private Integer id;
	private String stadiumname;
	private String area;
	private Date build;
	private Timestamp createDate;
	
	public Stadium(String stadiumnaString, String area, Date build ){
		this.stadiumname = stadiumnaString;
		this.area = area;
		this.build =build;
	}
}
