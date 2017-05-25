package com.hb.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.hb.engine.FrontImp;
import com.hb.model.SampleDao;

public class DetailController implements FrontImp {

	public String execute(HttpServletRequest req) {
		try{
		SampleDao dao = new SampleDao();
		Map<String,Object> map=dao.selectOne(Integer.parseInt(req.getParameter("idx")));
		req.setAttribute("bean", map);
		}catch (Exception e) {
		}
		return "/detail.jsp";
	}
}