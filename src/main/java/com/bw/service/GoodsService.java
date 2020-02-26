package com.bw.service;

import java.util.List;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;
import com.bw.vo.GoodsVO;

/** 
 * @author by WangMaoLin
 * @version 2020骞�2鏈�24鏃� 涓嬪崍2:14:55 
 * 
 */

public interface GoodsService {

	List<Goods> list(GoodsVO gv);

	List<Type> selectType();

	List<Brand> selectBrand();

	void add(Goods goods);

}
