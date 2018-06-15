package top.onedream.trendydesigns.model;

import lombok.Data;

/**
 * User Model class
 */
@Data
public class UserModel {
    private String u_id; // '用户id'
    private String u_name;// '用户名',
    private String u_password;// '用户密码',
    private int u_age;// '年龄',
    private int u_sex;// '性别',
    private String u_companyid;// '用户所在公司id',
    private String u_deptid;// '用户所在部门id',
    private int u_mobile;// '用户手机号',
    private String u_email;// '用户邮箱',
    private String u_weixin;// '用户微信',
    private String u_qq;// '用户qq号',
    private String u_weixinimges;// '用户微信二维码',
    private String u_imges;// '用户头像',
    private String u_cardid;// '用户身份证号',
    private String u_address;// '用户住址',
    private String u_status;// '状态',
    private String u_createdate;// '创建时间',
    private String u_modifydate;// '修改时间',
}