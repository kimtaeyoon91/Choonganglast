package coco;

import lombok.Data;

@Data
public class account {

	private int accountNum; // 계좌번호
	private int total; // 총액
	private int bank; // 은행 
	private int memberNum; // fk 회원번호 

	
	
}
