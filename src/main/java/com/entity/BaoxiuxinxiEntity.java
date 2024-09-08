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
 * 报修信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
@TableName("baoxiuxinxi")
public class BaoxiuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaoxiuxinxiEntity() {
		
	}
	
	public BaoxiuxinxiEntity(T t) {
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
	 * 报修编号
	 */
					
	private String baoxiubianhao;
	
	/**
	 * 个人账号
	 */
					
	private String gerenzhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 门牌号
	 */
					
	private String menpaihao;
	
	/**
	 * 楼房名称
	 */
					
	private String loufangmingcheng;
	
	/**
	 * 楼房位置
	 */
					
	private String loufangweizhi;
	
	/**
	 * 报修类型
	 */
					
	private String baoxiuleixing;
	
	/**
	 * 报修内容
	 */
					
	private String baoxiuneirong;
	
	/**
	 * 申请日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shenqingriqi;
	
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
	 * 设置：报修编号
	 */
	public void setBaoxiubianhao(String baoxiubianhao) {
		this.baoxiubianhao = baoxiubianhao;
	}
	/**
	 * 获取：报修编号
	 */
	public String getBaoxiubianhao() {
		return baoxiubianhao;
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
	 * 设置：门牌号
	 */
	public void setMenpaihao(String menpaihao) {
		this.menpaihao = menpaihao;
	}
	/**
	 * 获取：门牌号
	 */
	public String getMenpaihao() {
		return menpaihao;
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
	 * 设置：报修类型
	 */
	public void setBaoxiuleixing(String baoxiuleixing) {
		this.baoxiuleixing = baoxiuleixing;
	}
	/**
	 * 获取：报修类型
	 */
	public String getBaoxiuleixing() {
		return baoxiuleixing;
	}
	/**
	 * 设置：报修内容
	 */
	public void setBaoxiuneirong(String baoxiuneirong) {
		this.baoxiuneirong = baoxiuneirong;
	}
	/**
	 * 获取：报修内容
	 */
	public String getBaoxiuneirong() {
		return baoxiuneirong;
	}
	/**
	 * 设置：申请日期
	 */
	public void setShenqingriqi(Date shenqingriqi) {
		this.shenqingriqi = shenqingriqi;
	}
	/**
	 * 获取：申请日期
	 */
	public Date getShenqingriqi() {
		return shenqingriqi;
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
