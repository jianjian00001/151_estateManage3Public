package com.entity.vo;

import com.entity.YezhuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 业主信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
public class YezhuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
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
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
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
