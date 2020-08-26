package coco;

import java.sql.Date;

import lombok.Data;

@Data
public class member {
	
	private String memberNum;
	private String email;
	private String password;
	private String name;
	private String nickname;
	private int tel;
	private Date regDate;
	private String del;

}
