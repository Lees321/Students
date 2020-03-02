package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;
import service.UserService;
import service.impl.UserServiceImpl;
//�����û���Ϣ��servlet
@WebServlet("/Add")
public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		//��servlet��ȥ����service�е�����
		UserService us = new UserServiceImpl();
		User user = new User();
		//
		String name = req.getParameter("name");
		int age = Integer.parseInt(req.getParameter("age"));
		user.setName("����");
		//����ʵ�����е�setter����Ϊ˽�е����Ը�ֵ
		user.setAge(age);
		us.save(user);
	}
	
}
