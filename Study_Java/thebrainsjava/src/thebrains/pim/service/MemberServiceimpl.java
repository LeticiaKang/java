package thebrains.pim.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import thebrains.pim.controller.MemberController;
import thebrains.pim.model.*;
import thebrains.pim.repository.MemberRepository;

public class MemberServiceimpl<T> implements MemberService<T> {
	// impl을 붙여줘
	// 이 클래스는 데이터를 DB에서 가져와서 가공하고 그 결과 저장을 요청하는 역할
	
// ====================== 생성자 ========================
	MemberRepository<T> memberRepository = null; // DB 또는 File 입출력을 담당
	// DB 또는 File 입출력 담당함
	private String memberdb = MemberController.MEMBER_DB;
	
	public MemberServiceImpl() { // 실체를 생성
	memberRepository = new MemberRepositoryImpl<T>();
		// memberdb = memberDB;
	}


// ====================== 재정의 ========================
	@Override
	public T login(String email, String pw) {
		boolean isLogin = false;
		T member = (T) new Member();
		((Member) member).setEmail(email);
		((Member) member).setPw(pw);
		T retMember = (T) memberRepository.readByEmail(member);
		if (retMember != null) {
			System.out.println("로그인 성공");
			MemberController.session.put("member", (Member) retMember);
		} else {
			MemberController.session.put("member", (Member) retMember);
			System.out.println("로그인 실패");
		}
		return null;
	}

	@Override
	public void logout() {
		
		
	}

	@Override
	public int postMember(T member) {
		if(memberRepository.create(member) > 0) {
			//크리 메소드를 처리해서 1이 반환되면 처리해주겠다
			System.out.println("회원등록 성공!!");
/*?*/			return 1;
		}
		else {
			System.out.println("회워 삭제!!");
			return 0;
		}
	}

	@Override
	public T getMember(T member) {
		
		return null;
	}

	@Override
	public List<T> getMemberList() {
		
		return null;
	}

	@Override
	public int putMember(T member) {
		
		return 0;
	}

	@Override
	public int deleteMember(T member) {
		
		return 0;
	}

	@Override
	 public void readFile() {
        File file = new File(memberdb); // 파일 객체를 생성
        
        if (file.canRead()) { // 존재하여서 읽을 수 있는 상태
            try {
                MemberFileReader<T> mfr = new MemberFileReader<T>(file);
                //파일라이터를 이용해 클래스 하나 만들고 리드라는 메소드 만들었어
//                memberRepository.setMemberList((List<Member>) mfr.readMember());
//                for (Member m : mfr.readMember()) {
//                	System.out.println(m.getMno());
//                	System.out.println(m.getEmail());
//                	System.out.println(m.getName());
//                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else { // 읽을 수 없는 상태
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void saveFile() { 		   // member list를 파일로 저장
		
        File file = new File(memberdb);
        

        try {
            MemberFileWriter<T> mfw = new MemberFileWriter<T>(file);
            mfw.saveMember((List<T>) memberRepository.readList());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void applyUpdate() {
		
		
	}

	
	
	
}
