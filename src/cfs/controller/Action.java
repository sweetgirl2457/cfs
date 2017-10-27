package cfs.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ��� Action�� ������ execute �޼ҵ� ����
 * ��� : ������
 */
public interface Action {
	void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}