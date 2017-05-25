package com.hb.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hb.engine.FrontImp;
import com.hb.model.SampleDao;

public class ListController implements FrontImp {

	public String execute(HttpServletRequest req){
		
		SampleDao dao;
		try {
			dao = new SampleDao();
			List list=dao.selectAll();
			req.setAttribute("alist", list);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "/list.jsp";
	}
}