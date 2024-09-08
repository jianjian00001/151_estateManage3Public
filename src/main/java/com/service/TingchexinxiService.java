package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchexinxiView;


/**
 * 停车信息
 *
 * @author 
 * @email 
 * @date 2021-03-22 17:32:52
 */
public interface TingchexinxiService extends IService<TingchexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchexinxiVO> selectListVO(Wrapper<TingchexinxiEntity> wrapper);
   	
   	TingchexinxiVO selectVO(@Param("ew") Wrapper<TingchexinxiEntity> wrapper);
   	
   	List<TingchexinxiView> selectListView(Wrapper<TingchexinxiEntity> wrapper);
   	
   	TingchexinxiView selectView(@Param("ew") Wrapper<TingchexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchexinxiEntity> wrapper);
   	
}

