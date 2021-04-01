package com.springrest.springrest.Entites;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



public class Account {
	@NotNull(message="name cannot be null")
	private String name;
	
	@NotNull(message="accNo cannot be null")
	@Pattern(regexp="^([0-7]{7})([0-8]{1})",message="Account number should be of 8 digit and must not start with 8")
	private Integer accNo;
	
	@NotNull(message="srcCode cannot be null")
	@Pattern(regexp="^[0-9]{1,6}$",message="srcCode should be of 6 digit")
	private Integer srcCode;
	@NotNull(message="Pan cannot be null")
	private long pan;
	public Account(String name, Integer accNo, Integer srcCode, long pan) {
		super();
		this.name = name;
		this.accNo = accNo;
		this.srcCode = srcCode;
		this.pan = pan;
	}
	public Account() {
		super();
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public Integer getSrcCode() {
		return srcCode;
	}
	public void setSrcCode(Integer srcCode) {
		this.srcCode = srcCode;
	}
	public long getPan() {
		return pan;
	}
	public void setPan(long pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", accNo=" + accNo + ", srcCode=" + srcCode + ", pan=" + pan + "]";
	}

}
