package org.fantu.trplan.edutrplan.web;

import org.fantu.trplan.edutrplan.domian.DemoEntity;
import org.fantu.trplan.edutrplan.service.demo.IDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: Created by IntelliJ IDEA.
 * @project_name: edu-trplan
 * @time: 2019-12-20 11:45
 * @email: 17685306043@163.com
 * @author: huangZhongYao
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    IDemoService demoService;


    @GetMapping("/getAll")
    @ResponseBody
    public List<DemoEntity> getAll(){
        return demoService.getAll();
    }
}
