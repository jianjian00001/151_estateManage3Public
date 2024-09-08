package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 投诉编号
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-22 17:32:52
 */
@TableName("tousubianhao")
public class TousubianhaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TousubianhaoEntity() {
		
	}
	
	public TousubianhaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 投诉编号
	 */
					
	private String tousubianhao;
	
	/**
	 * 投诉名称
	 */
					
	private String tousumingcheng;
	
	/**
	 * 投诉内容
	 */
					
	private String tousuneirong;
	
	/**
	 * 投诉日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tousuriqi;
	
	/**
	 * 个人账号
	 */
					
	private String gerenzhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：投诉编号
	 */
	public void setTousubianhao(String tousubianhao) {
		this.tousubianhao = tousubianhao;
	}
	/**
	 * 获取：投诉编号
	 */
	public String getTousubianhao() {
		return tousubianhao;
	}
	/**
	 * 设置：投诉名称
	 */
	public void setTousumingcheng(String tousumingcheng) {
		this.tousumingcheng = tousumingcheng;
	}
	/**
	 * 获取：投诉名称
	 */
	public String getTousumingcheng() {
		return tousumingcheng;
	}
	/**
	 * 设置：投诉内容
	 */
	public void setTousuneirong(String tousuneirong) {
		this.tousuneirong = tousuneirong;
	}
	/**
	 * 获取：投诉内容
	 */
	public String getTousuneirong() {
		return tousuneirong;
	}
	/**
	 * 设置：投诉日期
	 */
	public void setTousuriqi(Date tousuriqi) {
		this.tousuriqi = tousuriqi;
	}
	/**
	 * 获取：投诉日期
	 */
	public Date getTousuriqi() {
		return tousuriqi;
	}
	/**
	 * 设置：个人账号
	 */
	public void setGerenzhanghao(String gerenzhanghao) {
		this.gerenzhanghao = gerenzhanghao;
	}
	/**
	 * 获取：个人账号
	 */
	public String getGerenzhanghao() {
		return gerenzhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
