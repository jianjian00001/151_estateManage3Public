package com.dao;

import com.entity.TousubianhaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TousubianhaoVO;
import com.entity.view.TousubianhaoView;


/**
 * 投诉编号
 * 
 * @author 
 * @email 
 * @date 2021-03-22 17:32:52
 */
public interface TousubianhaoDao extends BaseMapper<TousubianhaoEntity> {
	
	List<TousubianhaoVO> selectListVO(@Param("ew") Wrapper<TousubianhaoEntity> wrapper);
	
	TousubianhaoVO selectVO(@Param("ew") Wrapper<TousubianhaoEntity> wrapper);
	
	List<TousubianhaoView> selectListView(@Param("ew") Wrapper<TousubianhaoEntity> wrapper);

	List<TousubianhaoView> selectListView(Pagination page,@Param("ew") Wrapper<TousubianhaoEntity> wrapper);
	
	TousubianhaoView selectView(@Param("ew") Wrapper<TousubianhaoEntity> wrapper);
	
}
