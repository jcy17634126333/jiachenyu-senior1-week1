package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bw.entity.Brand;
import com.bw.entity.Goods;
import com.bw.entity.Type;
import com.bw.vo.GoodsVO;




/** 
 * @author by WangMaoLin
 * @version 2020骞�2鏈�24鏃� 涓嬪崍2:14:45 
 * 
 */

public interface GoodsDao {

	List<Goods> list(GoodsVO gv);
	
	List<Type> findType(Integer id);
	
	List<Brand> findBrand(Integer id);

	List<Type> selectType();

	List<Brand> selectBrand();

	void addGoods(Goods goods);

	void addGb(@Param("id")Integer id,@Param("bid") Integer bid);

	void addGt(@Param("id")Integer id,@Param("tid") Integer tid);

}
