package ems_aio.model;

import java.sql.Timestamp;
import java.util.Date;

import ems_aio.dto.MDEP001;
import ems_aio.dto.MPOS001;
import ems_aio.dto.StaffDto;

public class SalaryBean {

	private String id;
	private StaffDto sid;
	private String name;
	private MPOS001 salpos;
	private String salposname;
	private MDEP001 saldep;
	private String saldepname;
	private Double salary;
	private String saldate;
	private Timestamp create;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public StaffDto getSid() {
		return sid;
	}
	public void setSid(StaffDto sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MPOS001 getSalpos() {
		return salpos;
	}
	public void setSalpos(MPOS001 salpos) {
		this.salpos = salpos;
	}
	public String getSalposname() {
		return salposname;
	}
	public void setSalposname(String salposname) {
		this.salposname = salposname;
	}
	public MDEP001 getSaldep() {
		return saldep;
	}
	public void setSaldep(MDEP001 saldep) {
		this.saldep = saldep;
	}
	public String getSaldepname() {
		return saldepname;
	}
	public void setSaldepname(String saldepname) {
		this.saldepname = saldepname;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getSaldate() {
		return saldate;
	}
	public void setSaldate(String saldate) {
		this.saldate = saldate;
	}
	public Timestamp getCreate() {
		return create;
	}
	public void setCreate(Timestamp create) {
		this.create = create;
	}
	
	
	
}
