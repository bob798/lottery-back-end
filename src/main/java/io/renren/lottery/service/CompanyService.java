package io.renren.lottery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.lottery.entity.CompanyEntity;
import io.renren.common.utils.PageUtils;

import java.util.Map;

/**
 * 
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-12-26 21:21:29
 */
public interface CompanyService extends IService<CompanyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

