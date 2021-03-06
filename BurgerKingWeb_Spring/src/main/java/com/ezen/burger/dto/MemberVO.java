package com.ezen.burger.dto;

import java.sql.Timestamp;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class MemberVO {
	private int mseq;
	@NotNull(message="아이디를 입력해주세요.")
	@NotEmpty(message="아이디를 입력해주세요.")
	private String id;
	@NotNull(message="비밀번호를 입력해주세요.")
	@NotEmpty(message="비밀번호를 입력해주세요.")
	private String pwd;
	@NotNull(message="핸드폰번호를 입력해주세요.")
	@NotEmpty(message="핸드폰번호를 입력해주세요.")
	private String phone;
	private Timestamp indate;
	private Timestamp lastdate;
	@NotNull(message="이름을 입력해주세요.")
	@NotEmpty(message="이름을 입력해주세요.")
	private String name;
	private int memberkind;
}
