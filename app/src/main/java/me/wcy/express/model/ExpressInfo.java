package me.wcy.express.model;

import java.io.Serializable;

/**
 * Created by chenyan.wang on 2015/7/31.
 */
public class ExpressInfo implements Serializable {
    String company_name;
    String company_icon;
    String company_param;
    String post_id;
    String is_check;
    RequestType request_type;

    public enum RequestType {
        INPUT,// 手动输入
        HISTORY// 历史记录
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_icon() {
        return company_icon;
    }

    public void setCompany_icon(String company_icon) {
        this.company_icon = company_icon;
    }

    public String getCompany_param() {
        return company_param;
    }

    public void setCompany_param(String company_param) {
        this.company_param = company_param;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getIs_check() {
        return is_check;
    }

    public void setIs_check(String is_check) {
        this.is_check = is_check;
    }

    public RequestType getRequest_type() {
        return request_type;
    }

    public void setRequest_type(RequestType request_type) {
        this.request_type = request_type;
    }
}
