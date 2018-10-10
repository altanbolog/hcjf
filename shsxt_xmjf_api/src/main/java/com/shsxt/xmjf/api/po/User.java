package com.shsxt.xmjf.api.po;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable{
    private static final long serialVersionUID = 1242644232464803057L;
    private Integer id;
    private String userName;
    private String userPwd;
}
