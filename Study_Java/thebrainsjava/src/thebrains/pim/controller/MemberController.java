package thebrains.pim.controller;

import java.util.*;
import thebrains.pim.model.*;
import thebrains.pim.service.*;
import thebrains.pim.view.*;

public class MemberController {
	/* MVC(Model-View-Controller)
	// : 모델 기반 개인정보 관리(Personal Information System) 개발
	// MVCS (+ Service)
	// CRUD(Create Read Update Delete) : 자료를 처리하는 기본 기능
	   추가 기능 : 정렬, 검색, 페이지 */

	
//	컨트롤러가 받아서 모델을 통해 데이터를 저장하려고 함
//  컨트롤러는 요청을 제어할거야
//	뷰는 저장된 정보를 보여줄거야
//  모델은 데이터를 저장하는 역할
//  서비스는 통계나 데이터처리가 이상해 할 때 보는거
	
//================== 생성자 =======================
	public static Map<String, Member> session = new HashMap<String, Member>();
	public static TUIView tui = new TUIView();
	
//	MemberView memberView = null;
	MemberService<Member> memberService = null;
	final String MemberDB = "memberdb.txt";
//	public MemberController();
	
//================== 메소드 =======================
	// 메소드 1 : 로그인 모드/ 전후로 어떤 모습이 되어야 할까?
	
	public MemberController() {
		memberService = new MemberServiceimpl<Member>() ;
	}
	
	
	public void dispatch() {
		// dispatch라는 것은 시작의 의미가 있음; 명령을 가져옴
//		memberView = new MemberView();
//        memberView = new MemberView();
        Member sessionMember = null; // session에 저장된 객체를 처리하는 데 사용
        Member member = null; // 임시적으로 사용할 목적
        
        boolean isLogin = false;
        boolean isRoot = false;
        
        memberService.readFile();//파일을 읽을게
		
		int menu = 0;
		// 관리자로 로그인 할 수도 있고, 사용자 로그인 할 수 있음
		// 문제 : 관리자 전, 로그인했을 때 일반사용자냐 관리자냐 
		
		// true, true → root 로그인
		// true, false → 사용자 로그인
		// false, * → 끝

		do { 
			sessionMember = session.get("member"); // 로그인 성공 시 null이 아님
			
			if (sessionMember != null) {
                isLogin = true;
                if (sessionMember.getEmail().toString().equals("admin04@induk.ac.kr"))
                    isRoot = true;
            } else {
                isLogin = false;
                isRoot = false;
            }
			
			tui.showMenu(isLogin, isRoot);
			menu = tui.inputMenu();
//			System.out.println("입력시 메뉴  = " + menu);
			switch (menu) {
			case 0:// 종료 : 로그아웃, 파일로 저장
			    memberService.logout();
			    memberService.saveFile();
			    break;
			case 1:
				member = new Member();
			    member.setMno(MemberController.tui.inputMno()); // 1001번 증가되지 않는 오류 해결
			boolean isUnique; // 이메일 중복 확인
			String email = MemberController.tui.inputEmail();
			member.setEmail(email);
			member.setPw(MemberController.tui.inputPw());
			member.setName(MemberController.tui.inputName());
			member.setPhone(MemberController.tui.inputPhone());
			member.setAddress(MemberController.tui.inputAddress());
			//             while (!isValid(member)) //유효성 확인
			//                 ;
			if(memberService.postMember(member) > 0)
			     memberService.applyUpdate();
			else
//				memberView.printFail("등록 ");
				break;
			case 2: // 로그인
				sessionMember = memberService.login(tui.inputEmail(), tui.inputPw());
				break;
			}
		} while(menu != 0);
	}
		
	
}
