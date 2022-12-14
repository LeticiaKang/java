package thebrains.pim.repository;

import java.util.ArrayList;
import java.util.List;

import thebrains.pim.model.*;

public class MemberRepositoryImpl<T> implements MemberRepository<T>{

//1 리스트에 memberList라는 것을 하나 만드시고(생성하는거에여)
	// 아래가 중요해 / 저장할 공간을 만드는 거
		public List<T> memberList = null;
		public MemberRepositoryImpl() {
			memberList = new ArrayList<T>();
			//메모리상에서 회원정보들을 유지해주는 
			// 결국 이 내용이 파일에 저장되는(써지는) 거에요. 그런 객체입니다.
		}
   
	    @Override
	    public int create(T member) {
	        int ret = 0;
	        try {
	            memberList.add(member);
	            return 1;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return 0;
	        }
	    }
	    
	    
		@Override
		public T readByMno(T member) {
			// TODO Auto-generated method stub
			return null;
		}

//2 멤버리스트 반환하면 되구여
		 public T readByEmail(T member) {
		        for(T m : memberList) {
		            if(((Member) m).getEmail().equals(((Member) member).getEmail()))
		                return m; // 첫 번째 email 같은 요소를 반환
		        }
		        return null;
		    }
	
		@Override
		public List<T> readList() {
			return getMemberList();
		}
	
		@Override
		public int update(T member) {
			// TODO Auto-generated method stub
			return 0;
		}
	
		@Override
		public int delete(T member) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public List<T> getMemberList() {
			// TODO Auto-generated method stub
			return memberList;
		}

// 3 그리고 memberList에 대한 접근 권한을 주세요
		@Override
		public void setMemberList(List<T> memberList) {
	        this.memberList = memberList;
    }

	
}
