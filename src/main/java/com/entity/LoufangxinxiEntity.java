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
 * 楼房信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
@TableName("loufangxinxi")
public class LoufangxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoufangxinxiEntity() {
		
	}
	
	public LoufangxinxiEntity(T t) {
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
	 * 信息编号
	 */
					
	private String xinxibianhao;
	
	/**
	 * 楼房名称
	 */
					
	private String loufangmingcheng;
	
	/**
	 * 楼房位置
	 */
					
	private String loufangweizhi;
	
	/**
	 * 楼层数
	 */
					
	private Integer loucengshu;
	
	/**
	 * 户型
	 */
					
	private String huxing;
	
	/**
	 * 户型数量
	 */
					
	private Integer huxingshuliang;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	
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
	 * 设置：信息编号
	 */
	public void setXinxibianhao(String xinxibianhao) {
		this.xinxibianhao = xinxibianhao;
	}
	/**
	 * 获取：信息编号
	 */
	public String getXinxibianhao() {
		return xinxibianhao;
	}
	/**
	 * 设置：楼房名称
	 */
	public void setLoufangmingcheng(String loufangmingcheng) {
		this.loufangmingcheng = loufangmingcheng;
	}
	/**
	 * 获取：楼房名称
	 */
	public String getLoufangmingcheng() {
		return loufangmingcheng;
	}
	/**
	 * 设置：楼房位置
	 */
	public void setLoufangweizhi(String loufangweizhi) {
		this.loufangweizhi = loufangweizhi;
	}
	/**
	 * 获取：楼房位置
	 */
	public String getLoufangweizhi() {
		return loufangweizhi;
	}
	/**
	 * 设置：楼层数
	 */
	public void setLoucengshu(Integer loucengshu) {
		this.loucengshu = loucengshu;
	}
	/**
	 * 获取：楼层数
	 */
	public Integer getLoucengshu() {
		return loucengshu;
	}
	/**
	 * 设置：户型
	 */
	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}
	/**
	 * 获取：户型
	 */
	public String getHuxing() {
		return huxing;
	}
	/**
	 * 设置：户型数量
	 */
	public void setHuxingshuliang(Integer huxingshuliang) {
		this.huxingshuliang = huxingshuliang;
	}
	/**
	 * 获取：户型数量
	 */
	public Integer getHuxingshuliang() {
		return huxingshuliang;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}

}
