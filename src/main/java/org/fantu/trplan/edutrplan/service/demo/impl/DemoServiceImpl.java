package org.fantu.trplan.edutrplan.service.demo.impl;

import org.fantu.trplan.edutrplan.dao.DemoDao;
import org.fantu.trplan.edutrplan.domian.DemoEntity;
import org.fantu.trplan.edutrplan.service.demo.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @project_name: edu-trplan
 * @time: 2019-12-20 11:46
 * @email: 17685306043@163.com
 * @author: huangZhongYao
 */
@Service
public class DemoServiceImpl implements IDemoService {

    @Autowired
    DemoDao demoDao;

    @Override
    public List<DemoEntity> getAll() {
        return demoDao.queryAll();
    }
}
