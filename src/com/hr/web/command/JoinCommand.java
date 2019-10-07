package com.hr.web.command;

import javax.servlet.http.HttpServletRequest;

import com.hr.web.domains.HrBean;
import com.hr.web.serviceimpls.HrServiceImpl;

public class JoinCommand extends Command{
	public JoinCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(action);
		setDomain(domain);
		execute();
	}
	public void execute() {
		HrBean param = new HrBean();
		
		param.setDeptno(request.getParameter("deptno"));
		param.setEmpno(request.getParameter("empno"));
		param.setEname(request.getParameter("ename"));
		param.setJob(request.getParameter("job"));
		HrServiceImpl.getInstance().join(param);
		super.execute();
	}
}
