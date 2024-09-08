package com.dao;

import com.entity.BaoxiuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaoxiuxinxiVO;
import com.entity.view.BaoxiuxinxiView;


/**
 * 报修信息
 * 
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
public interface BaoxiuxinxiDao extends BaseMapper<BaoxiuxinxiEntity> {
	
	List<BaoxiuxinxiVO> selectListVO(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
	
	BaoxiuxinxiVO selectVO(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
	
	List<BaoxiuxinxiView> selectListView(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);

	List<BaoxiuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
	
	BaoxiuxinxiView selectView(@Param("ew") Wrapper<BaoxiuxinxiEntity> wrapper);
	
}
