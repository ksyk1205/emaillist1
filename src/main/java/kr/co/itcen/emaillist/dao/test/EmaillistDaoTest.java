package kr.co.itcen.emaillist.dao.test;

import java.util.List;

import kr.co.itcen.emaillist.dao.EmaillistDao;
import kr.co.itcen.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		insertTest();
		getListTest();
		
		deleteAll();
	}
	
	private static void deleteAll() {
		new EmaillistDao().delate();
	}
	
	private static void insertTest() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("세연");
		vo.setLastName("곽");
		vo.setEmail("seyeon1649@gmail.com");
		
		new EmaillistDao().insert(vo);
	}

	private static void getListTest() {
		List<EmaillistVo> list = new EmaillistDao().getList();
		for(EmaillistVo vo : list) {
			System.out.println(vo);
		}
	}

}