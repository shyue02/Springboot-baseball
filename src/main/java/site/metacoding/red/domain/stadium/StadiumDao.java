package site.metacoding.red.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public List<Stadium> findAll();
	public Stadium findById(Integer id);
	public void update(Stadium stadium);
	public void deleteById(Integer id);
}
