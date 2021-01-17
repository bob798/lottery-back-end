package io.renren.lottery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.lottery.entity.EmployeeEntity;
import io.renren.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

/**
 *
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-26 21:21:29
 */
public interface EmployeeService extends IService<EmployeeEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<EmployeeEntity> getUserList(Integer companyId);

}

