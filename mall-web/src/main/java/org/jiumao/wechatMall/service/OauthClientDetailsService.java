package org.jiumao.wechatMall.service;
import java.util.List;
import org.jiumao.wechatMall.entity.OauthClientDetails;
import org.jiumao.wechatMall.common.Assist;
public interface OauthClientDetailsService{
	/**
	 * 获得OauthClientDetails数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    long getOauthClientDetailsRowCount(Assist assist);
	/**
	 * 获得OauthClientDetails数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * @param assist
	 * @return
	 */
    List<OauthClientDetails> selectOauthClientDetails(Assist assist);
	/**
	 * 获得一个OauthClientDetails对象,以参数OauthClientDetails对象中不为空的属性作为条件进行查询
	 * @param obj
	 * @return
	 */
    OauthClientDetails selectOauthClientDetailsByObj(OauthClientDetails obj);
	/**
	 * 通过OauthClientDetails的id获得OauthClientDetails对象
	 * @param id
	 * @return
	 */
    OauthClientDetails selectOauthClientDetailsById(String id);
	/**
	 * 插入OauthClientDetails到数据库,包括null值
	 * @param value
	 * @return
	 */
    int insertOauthClientDetails(OauthClientDetails value);
	/**
	 * 插入OauthClientDetails中属性值不为null的数据到数据库
	 * @param value
	 * @return
	 */
    int insertNonEmptyOauthClientDetails(OauthClientDetails value);
	/**
	 * 通过OauthClientDetails的id删除OauthClientDetails
	 * @param id
	 * @return
	 */
    int deleteOauthClientDetailsById(String id);
	/**
	 * 通过辅助工具Assist的条件删除OauthClientDetails
	 * @param assist
	 * @return
	 */
    int deleteOauthClientDetails(Assist assist);
	/**
	 * 通过OauthClientDetails的id更新OauthClientDetails中的数据,包括null值
	 * @param enti
	 * @return
	 */
    int updateOauthClientDetailsById(OauthClientDetails enti);
 	/**
	 * 通过辅助工具Assist的条件更新OauthClientDetails中的数据,包括null值
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateOauthClientDetails(OauthClientDetails value,  Assist assist);
	/**
	 * 通过OauthClientDetails的id更新OauthClientDetails中属性不为null的数据
	 * @param enti
	 * @return
	 */
    int updateNonEmptyOauthClientDetailsById(OauthClientDetails enti);
 	/**
	 * 通过辅助工具Assist的条件更新OauthClientDetails中属性不为null的数据
	 * @param value
	 * @param assist
	 * @return
	 */
    int updateNonEmptyOauthClientDetails(OauthClientDetails value, Assist assist);
}