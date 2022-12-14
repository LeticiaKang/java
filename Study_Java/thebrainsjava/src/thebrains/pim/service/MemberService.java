package thebrains.pim.service;
import java.util.*;

import thebrains.pim.controller.MemberController;
public interface MemberService<T> {
/* 2-1.인터페이스 왜 만들어?
 * MemberService에 대한 활용법 구현 요청(제한)
 */
	
	String memberdb = MemberController.MEMBER_DB;
	//컨트롤러가 서비서 쓰고 다시 컨트롤러 쓰
	
	T login(String email, String pw); // 로그인 처리
    void logout(); // 로그아웃 처리
    int postMember(T member); // 회원 등록, http에서 post 메소드로 처리 -> repository create
    // 웹에서 하기 때문에 http를 주로 접목시키는데, 그때..
    // Hyper Text Transfer Protocol
    // http method가 있음(post, put, get, delete, patch, head..)
    
    T getMember(T member); // 회원 정보 조회, get 메소드로 처리 ->  repository read one
    List<T> getMemberList(); // 회원 목록 조회, get 메소드로 처리 -> repository read list
    int putMember(T member); // 회원 정보 수정, put 메소드로 처리 -> repository update
    int deleteMember(T member); // 회원 탈퇴(삭제), delete 메소드로 처리 -> repository delete

//    List<T> findMemberByPhone(T member); // 전화번호 뒷 4자로 검색, 여러개가 검색될 수 있음
//    List<T> sortByName(String order); // order가 desc 면 내림차순, asc면 오름차순
//    List<T> paginateByPerPage(int pageNo, int perPage);

    void readFile(); // 파일로 부터 읽어서 멤버 목록 객체 생성
    void saveFile(); // 멤버 목록 객체를 파일에 저장
    void applyUpdate(); // saveFile() -> readFile() 순으로 호출하여 처리함. 등록, 수정 시 발생
	
}
