package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TousubianhaoDao;
import com.entity.TousubianhaoEntity;
import com.service.TousubianhaoService;
import com.entity.vo.TousubianhaoVO;
import com.entity.view.TousubianhaoView;

@Service("tousubianhaoService")
public class TousubianhaoServiceImpl extends ServiceImpl<TousubianhaoDao, TousubianhaoEntity> implements TousubianhaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TousubianhaoEntity> page = this.selectPage(
                new Query<TousubianhaoEntity>(params).getPage(),
                new EntityWrapper<TousubianhaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TousubianhaoEntity> wrapper) {
		  Page<TousubianhaoView> page =new Query<TousubianhaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TousubianhaoVO> selectListVO(Wrapper<TousubianhaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TousubianhaoVO selectVO(Wrapper<TousubianhaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TousubianhaoView> selectListView(Wrapper<TousubianhaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TousubianhaoView selectView(Wrapper<TousubianhaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
