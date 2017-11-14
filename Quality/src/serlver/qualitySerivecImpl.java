package serlver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.win.dao.qualityMapper;
import com.win.pojo.quality;
@Service("hm")
public class qualitySerivecImpl implements qualitySerivec {

	@Autowired
	private qualityMapper qm;

	public qualityMapper getQm() {
		return qm;
	}

	public void setQm(qualityMapper qm) {
		this.qm = qm;
	}

	public List<quality> page(int begin, int size) {
		
		return qm.page(begin, size);
	}

	public int count() {
		
		return qm.count();
	}

	public int delete(int id) {
		
		return qm.delete(id);
	}

	public int insert(quality q) {
		// TODO Auto-generated method stub
		return qm.insert(q);
	}
	
	
}
