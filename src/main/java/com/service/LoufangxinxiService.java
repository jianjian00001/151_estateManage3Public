package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoufangxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoufangxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoufangxinxiView;


/**
 * 楼房信息
 *
 * @author 
 * @email 
 * @date 2021-03-22 17:32:51
 */
public interface LoufangxinxiService extends IService<LoufangxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoufangxinxiVO> selectListVO(Wrapper<LoufangxinxiEntity> wrapper);
   	
   	LoufangxinxiVO selectVO(@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);
   	
   	List<LoufangxinxiView> selectListView(Wrapper<LoufangxinxiEntity> wrapper);
   	
   	LoufangxinxiView selectView(@Param("ew") Wrapper<LoufangxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoufangxinxiEntity> wrapper);
   	
}

