package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import vo.NoticeVo;
import dao.NoticeDao;
import dao.NoticeDaoImpl;
import data.Database;
import data.Session;

public class NoticeServiceImpl implements NoticeService {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	private static NoticeServiceImpl instance;

	private NoticeServiceImpl() {
	}

	public static NoticeServiceImpl getInstance() {
		if (instance == null) {
			instance = new NoticeServiceImpl();
		}
		return instance;

	}

	NoticeDao noticeDao = NoticeDaoImpl.getInstance();
	Database database = Database.getInstance();

	@Override
	public void noticeList() {

		// Scanner s = new Scanner(System.in);
		//
		// boolean isContinue = true;
		//
		// ArrayList<NoticeVo> noticeList = noticeDao.selectNoticeList();
		//
		// NoticeService ns = new NoticeServiceImpl();
		//
		// while (isContinue) {
		// if (Session.loginUser != null) {
		//
		// System.out
		// .println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		// System.out.println("번호\t관리자아이디\t제목\t날짜");
		// System.out
		// .println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		// for (int i = 0; i < Database.tb_notice.size(); i++) {
		// System.out.print(Database.tb_notice.get(i).getNoticeNum()
		// + "\t");
		// // System.out.print(Database.tb_notice.get(i).getId() + "\t");
		// System.out.print(Database.tb_notice.get(i).getTitle()
		// + "\t");
		// System.out.print(Database.tb_notice.get(i).getnDate()
		// + "\t");
		// System.out.println();
		// }
		// System.out
		// .println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		// System.out
		// .println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓게시판 메뉴〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		// System.out.println("1.글내용확인하기");
		// System.out.println("2.<관리자>글쓰기");
		// System.out.println("3.<관리자>글삭제");
		// System.out.println("4.<관리자>글수정");
		// System.out.println("5.게시판종료");
		// System.out.println("시행하고 싶은 번호 입력 ▶");
		// System.out.println();
		// int menu;
		//
		// menu = Integer.parseInt(s.nextLine());
		//
		// switch (menu) {
		//
		// case 1: // 글내용확인
		// ns.noticeContent();
		// break;
		// case 2: // 글쓰기
		// ns.noticeAdd();
		// break;
		// case 3:// 글삭제
		// ns.noticeDelete();
		// break;
		// case 4: // 글수정
		// ns.noticeModify();
		// break;
		// case 5: // 게시판종료
		// System.out.println("종료한다");
		// break;
		//
		// }
		//
		// }
		// }
		// noticeDao.selectNoticeList();

		ArrayList<NoticeVo> noticeList = noticeDao.selectNoticeList();

		System.out.println();
		System.out.println();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println("번호\t작성자\t제목\t\t날짜");
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println();
		for (int i = 0; i < noticeList.size(); i++) {
			NoticeVo no = noticeList.get(i);
			if (database.tb_notice.get(i).getnDate() == null) {
				System.out.println(i + 1 + "\t" + no.getId() + "\t"
						+ no.getTitle() + "\t" + no.getsDate());
			} else {
				System.out.println(i + 1 + "\t" + no.getId() + "\t"
						+ no.getTitle() + "\t" + "\t"
						+ sdf.format(no.getnDate()));
			}
		}
		System.out.println();
		System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		System.out.println();

	}

	@Override
	public void noticeContent() { // 게시글내용확인

		Scanner s = new Scanner(System.in);

		ArrayList<NoticeVo> noticeList = noticeDao.selectNoticeList();

		int a;
		System.out.println();
		System.out.println("확인하고 싶은 내용 번호 입력 >>");
		a = Integer.parseInt(s.nextLine());

		for (int i = 0; i < noticeList.size(); i++) {
			NoticeVo no = noticeList.get(i);

			if (i + 1 == a)
				System.out.println();
			System.out.println(no.getContent());
			System.out.println();

			// for(int i=0; i<noticeList.size();i++){
			// NoticeVo no = noticeList.get(i);
			//
			// System.out.println(no.getContent());

		}

		// NoticeVo no = new NoticeVo();
		// boolean isContinue = true;
		// while (isContinue) {
		// if (Session.loginUser != null) {
		//
		// System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		// System.out.println("번호\t관리자아이디\t제목\t날짜");
		// System.out.println("〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓");
		// for (int i = 0; i < Database.tb_notice.size(); i++) {
		// System.out.print(Database.tb_notice.get(i).getNoticeNum()
		// + "\t");
		// System.out.print(Database.tb_notice.get(i).getId() + "\t");
		// System.out.print(Database.tb_notice.get(i).getTitle()
		// + "\t");
		// System.out.print(Database.tb_notice.get(i).getnDate()
		// + "\t");
		// System.out.println();
		// }
		//
		// }
		// }
		//
		// System.out.println("확인하고 싶은 글 번호를 입력해 주세요 >>>>");
		// int nv = Integer.parseInt(s.nextLine());
		// noticeDao.selecNotice(nv);
		//
	}

	@Override
	public void noticeAdd() { // 게시글추가

		Date today = new Date();
		NoticeVo nvo = new NoticeVo();

		Scanner s = new Scanner(System.in);

		try {
			System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒[글쓰기]▒▒▒▒▒▒▒▒▒▒▒▒▒");
			System.out.println();
			System.out.println("글 제목 입력>>");
			System.out.println();
			String title = s.nextLine();
			System.out.println();
			System.out.println("글 내용 입력>>");
			System.out.println();
			String content = s.nextLine();
			System.out.println();

			ArrayList<NoticeVo> tb_notice = new ArrayList<NoticeVo>();

			if (Database.tb_notice.size() == 0) {
				nvo.setNoticeNum(1);
				nvo.setId(Session.loginUser.getId());
				nvo.setTitle(title);
				nvo.setContent(content);
				nvo.setnDate(today);
				

				noticeDao.insertNotice(nvo);
				System.out.println();
				System.out.println("▶작성완료");
				System.out.println();

			} else {
				int size = Database.tb_notice.size() - 1;
				int num = Database.tb_notice.get(size).getNoticeNum();

				nvo.setNoticeNum(num + 1);
				nvo.setId(Session.loginUser.getId());
				nvo.setTitle(title);
				nvo.setContent(content);
				nvo.setnDate(today);

				noticeDao.insertNotice(nvo);
				System.out.println();
				System.out.println("▶작성완료");
				System.out.println();

			}

			noticeList();
		} catch (NumberFormatException ne) {
			System.out.println();
			System.out.println("▶잘못입력하셨습니다. 다시 입력해주세요.");
			noticeAdd();
		}

	}

	@Override
	public void noticeDelete() { // 게시글삭제
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒[글삭제]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		System.out.println();

		noticeList();

		Scanner s = new Scanner(System.in);
		System.out.println("삭제할 글 번호를 입력>>");
		System.out.println();
		int nv = Integer.parseInt(s.nextLine());

		noticeDao.deleteNotice(nv - 1);
		System.out.println();
		System.out.println("▶수정완료");
		System.out.println();

		noticeList();

	}

	@Override
	public void noticeModify() { // 게시글수정

		// SimpleDateFormat today = new SimpleDateFormat("yyyy-MM-dd");

		Date today = new Date();
		NoticeVo nvo = new NoticeVo();
		System.out.println();
		System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒[글수정]▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
		Scanner s = new Scanner(System.in);
		noticeList();

		try {
			System.out.println();
			System.out.println("글번호입력>>");
			int a = Integer.parseInt(s.nextLine());
			System.out.println();

			System.out.println("글제목입력>>");
			String title = s.nextLine();
			System.out.println();

			System.out.println("내용입력>>");
			String content = s.nextLine();
			System.out.println();

			nvo.setNoticeNum(a);
			nvo.setId(Session.loginUser.getId());
			nvo.setTitle(title);
			nvo.setContent(content);
			nvo.setnDate(today);

			// for (int i = 0; i < Database.tb_notice.size(); i++) {
			// // if (Session.loginUser.getId().equals(
			// // Database.tb_notice.get(i).getId())) {
			// //
			// System.out.println("수정완료");
			// }
			// }

			noticeDao.modifyNotice(nvo);

			noticeList();
		} catch (NumberFormatException ne) {
			System.out.println("▶잘못입력하셨습니다. 다시 입력해주세요.");
			System.out.println();
			noticeModify();
		}
	}

}
