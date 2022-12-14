package thebrains.pim.model;

import java.util.Objects;

public class Member { // Model객체에서 Set,Getter 제일 많이 생성됨
	// 왜? 자료를 넣고 빼는 게 이 아이의 역할이라서 그래
	
//================= 1. 필드 생성 ===================
	
	private int mno; //멤버 고유 번호(Member Number) - unique, primary
	private String email; //이메일을 아이디로 사용할거야, 길이 20 - unique
	private String pw;      //길이 15
	private String name;    //길이 15
	private String phone;   //길이 20
	private String address; //길이 50
	 
//========== 2. Getter, Setter를 만들어 ==========	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
//========== 3. toString 객체를  toString화 해서 확인용도로 사용 ==========	
	
	@Override
	public String toString() {
		return "Member [mno=" + mno + ", email=" + email + ", pw=" + pw + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + "]";
	}
	
//========== 4. hashCode 는 유일함을 확인하려고 만들어 ==========	
	/* 해시함수 : 제한된 정보로 식별자를 만드는 함수
	 * 많은 데이터를 적은 정보로 식별할 수 있는 알고리즘을 가진거야
	 * 100개를 어떻게 하면 50개 공간에 넣을 수 있을까 해서 만든..
	 * 첫글자로 경우의 수를 줄여...
	 * 100%로 다른게 나오는 건 아니야 같은 값이 나올수 있지만 드물다...
	 */
	
	@Override 
	public int hashCode() {
		return Objects.hash(email, mno, name);
	}
	
	@Override // 두 객체가 동일한지에 대한 기준
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		
		return Objects.equals(email, other.email)
				&& mno == other.mno
				&& Objects.equals(name, other.name);
	}
	
//========== 5. hashCode 는 유일함을 확인하려고 만들어 ==========	
	
	
	
	
}
