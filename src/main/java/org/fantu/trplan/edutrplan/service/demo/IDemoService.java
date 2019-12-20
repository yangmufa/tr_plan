package org.fantu.trplan.edutrplan.service.demo;

import org.fantu.trplan.edutrplan.domian.DemoEntity;

import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @project_name: edu-trplan
 * @time: 2019-12-20 11:45
 * @email: 17685306043@163.com
 * @author: huangZhongYao
 */
public interface IDemoService {

    /**
     * 查询All 数据
     * @return
     */
    List<DemoEntity> getAll();
}
