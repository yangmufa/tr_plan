package org.fantu.trplan.edutrplan.dao;

import org.apache.ibatis.annotations.Param;
import org.fantu.trplan.edutrplan.domian.DemoEntity;

import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @project_name: edu-trplan
 * @time: 2019-12-20 11:46
 * @email: 17685306043@163.com
 * @author: huangZhongYao
 */
public interface DemoDao {

    /**
     * 无条件查询全部
     * @return
     */
    List<DemoEntity> queryAll();
}
