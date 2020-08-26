package coco;

import java.sql.Date;

import lombok.Data;

@Data
public class accountBook { 
	// 가계부
	private int abookNum; // 가계부 번호
	private String dealType; // 거래종류
	private int amount; // 변동금액
	private String accounts; // 거래처
	private String caregory; // 카테고리
	private Date regDate; // 날짜
	private String memo; // 메모
	private int accountNum; // fk 계좌번호 
	
}
