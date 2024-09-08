package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TousubianhaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TousubianhaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TousubianhaoView;


/**
 * 投诉编号
 *
 * @author 
 * @email 
 * @date 2021-03-22 17:32:52
 */
public interface TousubianhaoService extends IService<TousubianhaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TousubianhaoVO> selectListVO(Wrapper<TousubianhaoEntity> wrapper);
   	
   	TousubianhaoVO selectVO(@Param("ew") Wrapper<TousubianhaoEntity> wrapper);
   	
   	List<TousubianhaoView> selectListView(Wrapper<TousubianhaoEntity> wrapper);
   	
   	TousubianhaoView selectView(@Param("ew") Wrapper<TousubianhaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TousubianhaoEntity> wrapper);
   	
}

