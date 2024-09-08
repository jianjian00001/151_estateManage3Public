package com.entity.model;

import com.entity.BumenxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 部门信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 17:32:52
 */
public class BumenxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 创建日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangjianriqi;
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：创建日期
	 */
	 
	public void setChuangjianriqi(Date chuangjianriqi) {
		this.chuangjianriqi = chuangjianriqi;
	}
	
	/**
	 * 获取：创建日期
	 */
	public Date getChuangjianriqi() {
		return chuangjianriqi;
	}
			
}
