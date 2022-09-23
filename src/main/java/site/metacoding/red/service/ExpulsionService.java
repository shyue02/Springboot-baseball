package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.expulsion.Expulsion;
import site.metacoding.red.domain.expulsion.ExpulsionDao;
import site.metacoding.red.web.dto.request.expulsion.ExpulsioinRegisterDto;

@RequiredArgsConstructor
@Service
public class ExpulsionService {

	private final ExpulsionDao expulsionDao;
	
	public void 퇴출선수등록(ExpulsioinRegisterDto expulsionRegisterDto) {
		Expulsion expulsion = expulsionRegisterDto.toEntity();
		expulsionDao.inert(expulsion);
	}
	
}
