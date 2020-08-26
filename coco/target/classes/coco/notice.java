package coco;

import java.sql.Date;

import lombok.Data;

@Data
public class notice {

	private int noticeNum; // 공지사항 번호
	private String subject; // 제목
	private String content;  // 내용
	private Date regDate; // 날짜 
}
	

