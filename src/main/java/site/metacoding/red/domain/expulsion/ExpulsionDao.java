package site.metacoding.red.domain.expulsion;

import java.util.List;

public interface ExpulsionDao {
	public void inert(Expulsion expulsion);
	public List<Expulsion> findAll();
	public Expulsion findById(Integer id);
	public void update(Expulsion expulsion);
	public void delete(Integer id);
}
