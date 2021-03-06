package com.win.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.win.pojo.quality;

public interface qualityMapper {

	public List<quality> page(@Param("b")int begin,@Param("i")int size);
	
	public int count();
	
	public int delete(int id);
	
	public int insert(quality q);
}
