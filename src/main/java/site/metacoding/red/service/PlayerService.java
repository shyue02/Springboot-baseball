package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.request.player.PlayRegisterDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	private final PlayerDao playerDao;
	
	public void 선수등록(PlayRegisterDto playRegisterDto) {
		Player player = playRegisterDto.toEntity();
		playerDao.insert(player);
	}
}