package com.ch.mypage.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Member {
	private String memberNum;
	private String email;
	private String password;
	private String name;
	private String nickName;
	private String tel;
	private Date regDate;
	private String del;
}
