package com.entity.model;

import com.entity.LoufangxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 楼房信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
public class LoufangxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
				
	
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
