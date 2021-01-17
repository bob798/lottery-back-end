package io.renren.lottery.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.lottery.dao.EmployeeDao;
import io.renren.lottery.entity.EmployeeEntity;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import io.renren.lottery.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("employeeService")
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, EmployeeEntity> implements EmployeeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<EmployeeEntity> page = this.page(
                new Query<EmployeeEntity>().getPage(params),
                new QueryWrapper<EmployeeEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<EmployeeEntity> getUserList(Integer companyId) {
        QueryWrapper<EmployeeEntity> queryWrapper = new QueryWrapper<EmployeeEntity>();
        queryWrapper.eq("company_id", companyId);
        return this.list(queryWrapper);
    }


}