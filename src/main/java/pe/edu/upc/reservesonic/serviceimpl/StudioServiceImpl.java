package pe.edu.upc.reservesonic.serviceimpl;

import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.reservesonic.dao.IStudioDao;
import pe.edu.upc.reservesonic.models.entities.Studio;
import pe.edu.upc.reservesonic.service.IStudioService;

public class StudioServiceImpl implements IStudioService {
	
	@Inject
	private IStudioDao sDao;
	
	@Override
	public void insert(Studio studio) {	
		sDao.insert(studio);
	}

	@Override
	public List<Studio> list() {
		return sDao.list();
	}

	@Override
	public void delete(Integer id) {
		sDao.delete(id);
	}
	
}
