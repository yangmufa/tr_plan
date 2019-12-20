package org.fantu.trplan.edutrplan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: Created by IntelliJ IDEA.
 * @project_name: edu-trPlan
 * @time: 2019-12-20 11:42
 * @email: 17685306043@163.com
 * @author: huangZhongYao
 */
@MapperScan("org.fantu.trplan.edutrplan.dao")
@SpringBootApplication
public class EduTrPlanApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(EduTrPlanApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("======================= Start Success! =================" );
    }
}
