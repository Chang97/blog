package com.cos.blog.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//ORM -> Java(다른언어) Object -> 테이블로 매핑

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // 빌더 패턴
@Entity //User 클래스가 MySql에 테이블이 생성된다.
//@DynamicInsert //insert시에 null인 필드 제외
public class User {
	
	@Id //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결된 db에 넘버링 전략을 따라감
	private int id;
	
	@Column(nullable = false, length=30, unique = true)
	private String username; //아이디
	
	@Column(nullable = false, length=300)
	private String password; //해쉬로 암호화 하기 떄문에 넉넉하게 작성
	
	@Column(nullable = false, length=50)
	private String email;
	
	//@ColumnDefault("'user'")
	// DB는 RoleType이 없다.
	@Enumerated(EnumType.STRING)
	private RoleType role; //enum 사용하는게 좋음.//admin, user
	
	private String oauth; //kakao, google
	
	@CreationTimestamp //시간이 자동으로 입력
	private Timestamp createDate;
	
	
}
