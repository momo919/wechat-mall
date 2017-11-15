package org.jiumao.wechatMall.dao;
import org.jiumao.wechatMall.entity.OauthRefreshToken;
import java.util.List;
import org.jiumao.wechatMall.common.Assist;
import org.apache.ibatis.annotations.Param;
public interface OauthRefreshTokenDao{
	/**
	 * 获得OauthRefreshToken数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getOauthRefreshTokenRowCount(Assist assist);
	/**
	 * 获得OauthRefreshToken数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<OauthRefreshToken> selectOauthRefreshToken(Assist assist);
	/**
	 * 获得一个OauthRefreshToken对象,以参数OauthRefreshToken对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    OauthRefreshToken selectOauthRefreshTokenByObj(OauthRefreshToken obj);
	/**
	 * 通过OauthRefreshToken的id获得OauthRefreshToken对象
	 * @param id
	 * @return
	 */
    OauthRefreshToken selectOauthRefreshTokenById(Object id);
	/**
	 * 插入OauthRefreshToken到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertOauthRefreshToken(OauthRefreshToken value);
	/**
	 * 插入OauthRefreshToken中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyOauthRefreshToken(OauthRefreshToken value);
	/**
	 * 通过OauthRefreshToken的id删除OauthRefreshToken
	 * @param id
	 * @return
	 */
    long deleteOauthRefreshTokenById(Object id);
	/**
	 * 通过辅助工具Assist的条件删除OauthRefreshToken
	 * @param assist
	 * @return
	 */
    long deleteOauthRefreshToken(Assist assist);
	/**
	 * 通过OauthRefreshToken的id更新OauthRefreshToken中的数据,包括null值
	 * @param enti
	 * @return
	 */
	long updateOauthRefreshTokenById(OauthRefreshToken enti);
 	/**
	 * 通过辅助工具Assist的条件更新OauthRefreshToken中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
	long updateOauthRefreshToken(@Param("enti") OauthRefreshToken value, @Param("assist") Assist assist);
	/**
	 * 通过OauthRefreshToken的id更新OauthRefreshToken中属性不为null的数据
	 * @param enti
	 * @return
	 */
    long updateNonEmptyOauthRefreshTokenById(OauthRefreshToken enti);
 	/**
	 * 通过辅助工具Assist的条件更新OauthRefreshToken中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    long updateNonEmptyOauthRefreshToken(@Param("enti") OauthRefreshToken value, @Param("assist") Assist assist);
}