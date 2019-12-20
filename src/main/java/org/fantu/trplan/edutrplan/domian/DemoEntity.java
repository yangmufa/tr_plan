package org.fantu.trplan.edutrplan.domian;

import java.io.Serializable;

/**
 * @Description: Created by IntelliJ IDEA.
 * @project_name: edu-trplan
 * @time: 2019-12-20 11:46
 * @email: 17685306043@163.com
 * @author: huangZhongYao
 */
public class DemoEntity implements Serializable {

    /**
     * 演示用户名
     */
    private String userName;
    /**
     * 演示密码
     */
    private String password;

    public DemoEntity() {
    }

    public DemoEntity(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
