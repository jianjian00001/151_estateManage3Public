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
 * 费用信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
@TableName("feiyongxinxi")
public class FeiyongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FeiyongxinxiEntity() {
		
	}
	
	public FeiyongxinxiEntity(T t) {
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
	 * 费用编号
	 */
					
	private String feiyongbianhao;
	
	/**
	 * 费用名称
	 */
					
	private String feiyongmingcheng;
	
	/**
	 * 金额
	 */
					
	private Integer jine;
	
	/**
	 * 个人账号
	 */
					
	private String gerenzhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 门牌号
	 */
					
	private String menpaihao;
	
	/**
	 * 楼房名称
	 */
					
	private String loufangmingcheng;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：费用编号
	 */
	public void setFeiyongbianhao(String feiyongbianhao) {
		this.feiyongbianhao = feiyongbianhao;
	}
	/**
	 * 获取：费用编号
	 */
	public String getFeiyongbianhao() {
		return feiyongbianhao;
	}
	/**
	 * 设置：费用名称
	 */
	public void setFeiyongmingcheng(String feiyongmingcheng) {
		this.feiyongmingcheng = feiyongmingcheng;
	}
	/**
	 * 获取：费用名称
	 */
	public String getFeiyongmingcheng() {
		return feiyongmingcheng;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
