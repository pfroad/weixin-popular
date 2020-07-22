package weixin.popular.bean.message.message;

import weixin.popular.bean.message.templatemessage.TemplateMessage;
import weixin.popular.bean.message.templatemessage.WxopenTemplateMessage;

/**
 * Author ryan
 * Date 7/22/20
 */
public class UniformMessage {
    private String touser;
    /**
     * 小程序模板消息相关的信息，可以参考小程序模板消息接口; 有此节点则优先发送小程序模板消息
     */
    private WxopenTemplateMessage weapp_template_msg;
    /**
     * 公众号模板消息相关的信息，可以参考公众号模板消息接口；有此节点并且没有weapp_template_msg节点时，发送公众号模板消息
     */
    private TemplateMessage mp_template_msg;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public WxopenTemplateMessage getWeapp_template_msg() {
        return weapp_template_msg;
    }

    public void setWeapp_template_msg(WxopenTemplateMessage weapp_template_msg) {
        this.weapp_template_msg = weapp_template_msg;
    }

    public TemplateMessage getMp_template_msg() {
        return mp_template_msg;
    }

    public void setMp_template_msg(TemplateMessage mp_template_msg) {
        this.mp_template_msg = mp_template_msg;
    }
}
