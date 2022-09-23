package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.request.stardium.StardiumRegisterDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	
	private final StadiumDao stadiumDao;
	
	public void 야구장등록(StardiumRegisterDto stadiumeRegisterDto) {
		 Stadium stadium = stadiumeRegisterDto.toEntity();
		 stadiumDao.insert(stadium);

	}
}	
