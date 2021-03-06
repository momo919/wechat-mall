package org.jiumao.common.domain;

/**
 * 接口返回消息格式
 * 
 * @author ppf@jiumao.org
 * @date 2017年10月25日
 */
public class Msg {

    public int code;
    public String msg;


    public Msg(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }


    @Override
    public String toString() {
        return "{code:" + this.code + ",msg:" + this.msg + "}";
    }

}
