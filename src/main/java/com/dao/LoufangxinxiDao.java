package com.dao;

import com.entity.LoufangxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoufangxinxiVO;
import com.entity.view.LoufangxinxiView;


/**
 * 楼房信息
 * 
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
public interface LoufangxinxiDao extends BaseMapper<LoufangxinxiEntity> {
	
	List<LoufangxinxiVO> selectListVO(@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);
	
	LoufangxinxiVO selectVO(@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);
	
	List<LoufangxinxiView> selectListView(@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);

	List<LoufangxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);
	
	LoufangxinxiView selectView(@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);
	
}
