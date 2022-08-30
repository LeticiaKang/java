package thebrains.pim.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import thebrains.pim.controller.MemberController;
import thebrains.pim.model.*;
import thebrains.pim.repository.MemberRepository;

public class MemberServiceimpl<T> implements MemberService<T> {
	// impl�� �ٿ���
	// �� Ŭ������ �����͸� DB���� �����ͼ� �����ϰ� �� ��� ������ ��û�ϴ� ����
	
// ====================== ������ ========================
	MemberRepository<T> memberRepository = null; // DB �Ǵ� File ������� ���
	// DB �Ǵ� File ����� �����
	private String memberdb = MemberController.MEMBER_DB;
	
	public MemberServiceImpl() { // ��ü�� ����
	memberRepository = new MemberRepositoryImpl<T>();
		// memberdb = memberDB;
	}


// ====================== ������ ========================
	@Override
	public T login(String email, String pw) {
		boolean isLogin = false;
		T member = (T) new Member();
		((Member) member).setEmail(email);
		((Member) member).setPw(pw);
		T retMember = (T) memberRepository.readByEmail(member);
		if (retMember != null) {
			System.out.println("�α��� ����");
			MemberController.session.put("member", (Member) retMember);
		} else {
			MemberController.session.put("member", (Member) retMember);
			System.out.println("�α��� ����");
		}
		return null;
	}

	@Override
	public void logout() {
		
		
	}

	@Override
	public int postMember(T member) {
		if(memberRepository.create(member) > 0) {
			//ũ�� �޼ҵ带 ó���ؼ� 1�� ��ȯ�Ǹ� ó�����ְڴ�
			System.out.println("ȸ����� ����!!");
/*?*/			return 1;
		}
		else {
			System.out.println("ȸ�� ����!!");
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
        File file = new File(memberdb); // ���� ��ü�� ����
        
        if (file.canRead()) { // �����Ͽ��� ���� �� �ִ� ����
            try {
                MemberFileReader<T> mfr = new MemberFileReader<T>(file);
                //���϶����͸� �̿��� Ŭ���� �ϳ� ����� ������ �޼ҵ� �������
//                memberRepository.setMemberList((List<Member>) mfr.readMember());
//                for (Member m : mfr.readMember()) {
//                	System.out.println(m.getMno());
//                	System.out.println(m.getEmail());
//                	System.out.println(m.getName());
//                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else { // ���� �� ���� ����
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

	@Override
	public void saveFile() { 		   // member list�� ���Ϸ� ����
		
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