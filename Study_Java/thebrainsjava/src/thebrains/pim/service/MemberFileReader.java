package thebrains.pim.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import thebrains.pim.model.Member;

public class MemberFileReader<T> {
	
	Scanner sc = null;
	
	public MemberFileReader(File f) throws FileNotFoundException {
		sc = new Scanner(f);
		//system.in : 키보드로부터 입력
		// f : 파일로부터 입력 ; 파일이 없을 경우를 대비해 fileException필요
	}
	
	
	public List<T> readMember() {
		List<T> memberList = new ArrayList<T>();
		
		while(sc.hasNext()) { 
			// Scanner로 읽을 게 남았니
			Member m = new Member();
			String strArr[] = sc.nextLine().split("\t"); 
			// 한개의 라인씩 tab 기호를 구분자로 사용하여 6개의 요소로 구분
			m.setMno(Integer.parseInt(strArr[0]));
			// mno는 int형, -20억에서 20억까지 사용가능
			
			// 6개의 자료가 있고 member list에 넣어놨다
			m.setEmail(strArr[1]);
			m.setPw(strArr[2]);
			m.setName(strArr[3]);
			m.setPhone(strArr[4]);
			m.setAddress(strArr[5]);
			memberList.add((T) m);
		}
		return memberList;
	}
}
