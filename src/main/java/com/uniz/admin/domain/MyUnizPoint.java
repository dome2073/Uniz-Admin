package com.uniz.admin.domain;

import java.util.Date;

import javax.xml.ws.BindingType;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyUnizPoint {
	
	private Long userSN;
	private Long unizSN;
	private Integer point;
	private String userID;
	private String unizKeyword;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	Date createDateTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
	Date updateDateTime;
}
