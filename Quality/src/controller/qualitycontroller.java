package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.win.pojo.quality;

import serlver.qualitySerivec;

@Controller
public class qualitycontroller {

	@Autowired
	private qualitySerivec qs;

	public qualitySerivec getQs() {
		return qs;
	}

	public void setQs(qualitySerivec qs) {
		this.qs = qs;
	}
	@RequestMapping("/page")
	public String page(@RequestParam(defaultValue="1")int pageindex ,HttpServletRequest request){
		int count = qs.count();
		int countpage = count%3==0?count/3:count/3+1;
		request.getSession().setAttribute("countpage", countpage);
		if (pageindex<1 || pageindex>countpage) {
			return "index.jsp";
		} else {
		
		int begin = (pageindex-1)*3;
		List<quality> list = qs.page(begin, 3);
		request.getSession().setAttribute("list", list);
		request.getSession().setAttribute("pageindex", pageindex);
		
		}
		return "index.jsp";
	}
	@RequestMapping("delete")
	public String delete(HttpServletRequest request){
		int id = Integer.valueOf(request.getParameter("id"));
		qs.delete(id);
		return "page";
	}
	@RequestMapping("insert")
	public String insert(HttpServletRequest request){
		int did =  Integer.valueOf(request.getParameter("did"));
		String modify = request.getParameter("modify");
		int pm = Integer.valueOf(request.getParameter("pm"));
		int pmm = Integer.valueOf(request.getParameter("pmm"));
		String station = request.getParameter("station");
		quality t = new quality();
		t.setDid(did);
		t.setModify(modify);
		t.setPm(pm);
		t.setPmm(pmm);
		t.setStation(station);
		qs.insert(t);
		return "page";
		
	}
}
