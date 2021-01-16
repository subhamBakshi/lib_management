package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Members")

public class Members {

	@Id
	private int id;
	private String name;
	private long contact_no;
	private String member_since;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getMember_since() {
		return member_since;
	}
	public void setMember_since(String member_since) {
		this.member_since = member_since;
	}
	public Members(int id, String name, long contact_no, String member_since) {
		super();
		this.id = id;
		this.name = name;
		this.contact_no = contact_no;
		this.member_since = member_since;
	}
	public Members() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
