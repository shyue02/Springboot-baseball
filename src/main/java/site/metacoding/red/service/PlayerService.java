package site.metacoding.red.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.player.PlayerDao;
import site.metacoding.red.web.dto.request.player.RegisterDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	private final PlayerDao playerDao;
	
	public void 선수등록(RegisterDto registerDto) {
		Player player = registerDto.toEntity();
		playerDao.insert(player);
	}
}