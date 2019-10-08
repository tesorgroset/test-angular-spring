package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class PrincipalEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@CreatedDate
	@Column(name="create_date")
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date createDate;
	
	@LastModifiedDate
	@Column(name="update_date")
	@Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private Date updateDate;


}
