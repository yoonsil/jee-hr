package com.hr.web.command;

import javax.servlet.http.HttpServletRequest;

import com.hr.web.domains.HrBean;
import com.hr.web.serviceimpls.HrServiceImpl;

public class LoginCommand extends Command{
	public LoginCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(action);
		setDomain(domain);
		execute();
	}
	public void execute() {
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String dname = request.getParameter("dname");
		HrBean hr = new HrBean();
		hr.setEmpno(empno);
		hr.setEname(ename);
		hr.setDname(dname);
		hr = HrServiceImpl.getInstance().login(hr);
		request.setAttribute("facade", hr);
		setPage((hr!=null) ? request.getParameter("page"):"login");
		super.execute();
	}
}
