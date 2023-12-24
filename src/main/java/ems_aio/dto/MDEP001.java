package ems_aio.dto;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class MDEP001 {
	@Id
	@Column(name="dep_id")
	private String id;
	@Column(name="dep_name")
	private String name;
	@Column(name="dep_loc")
	private String loc;
	@Column(name="dep_head")
	private String head;
	@Column(name="dep_create")
	private Timestamp createdate;
	@Column(name="dep_update")
	private Timestamp updatedate;
	@Column(name="dep_status")
	private boolean status;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public Timestamp getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Timestamp createdate) {
		this.createdate = createdate;
	}
	public Timestamp getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(Timestamp updatedate) {
		this.updatedate = updatedate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public MDEP001(String id, String name, String loc, String head, Timestamp createdate, Timestamp updatedate,
			boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
		this.head = head;
		this.createdate = createdate;
		this.updatedate = updatedate;
		this.status = status;
	}
	public MDEP001() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
