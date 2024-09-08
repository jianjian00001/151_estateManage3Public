package com.entity.view;

import com.entity.TousubianhaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 投诉编号
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 17:32:52
 */
@TableName("tousubianhao")
public class TousubianhaoView  extends TousubianhaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TousubianhaoView(){
	}
 
 	public TousubianhaoView(TousubianhaoEntity tousubianhaoEntity){
 	try {
			BeanUtils.copyProperties(this, tousubianhaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
