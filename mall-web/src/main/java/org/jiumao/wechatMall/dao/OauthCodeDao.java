package org.jiumao.wechatMall.dao;
import org.jiumao.wechatMall.entity.OauthCode;
import java.util.List;
import org.jiumao.wechatMall.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface OauthCodeDao{
	/**
	 * 获得OauthCode数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getOauthCodeRowCount(Assist assist);
	/**
	 * 获得OauthCode数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<OauthCode> selectOauthCode(Assist assist);
	/**
	 * 获得一个OauthCode对象,以参数OauthCode对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    OauthCode selectOauthCodeByObj(OauthCode obj);
	/**
	 * 通过OauthCode的id获得OauthCode对象
	 * @param id
	 * @return
	 */
    OauthCode selectOauthCodeById(Object id);
	/**
	 * 插入OauthCode到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertOauthCode(OauthCode value);
	/**
	 * 插入OauthCode中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyOauthCode(OauthCode value);
	/**
	 * 通过OauthCode的id删除OauthCode
	 * @param id
	 * @return
	 */
	long deleteOauthCodeById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除OauthCode
	 * @param assist
	 * @return
	 */
	long deleteOauthCode(Assist assist);
	/**
	 * 通过OauthCode的id更新OauthCode中的数据,包括null值
	 * @param enti
	 * @return
	 */
	long updateOauthCodeById(OauthCode enti);
 	/**
	 * 通过辅助工具Assist的条件更新OauthCode中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    long updateOauthCode(@Param("enti") OauthCode value, @Param("assist") Assist assist);
	/**
	 * 通过OauthCode的id更新OauthCode中属性不为null的数据
	 * @param enti
	 * @return
	 */
	long updateNonEmptyOauthCodeById(OauthCode enti);
 	/**
	 * 通过辅助工具Assist的条件更新OauthCode中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
	long updateNonEmptyOauthCode(@Param("enti") OauthCode value, @Param("assist") Assist assist);
}