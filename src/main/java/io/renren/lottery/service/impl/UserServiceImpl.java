//package io.renren.lottery.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import io.renren.lottery.dao.UserDao;
//import io.renren.lottery.entity.UserEntity;
//import io.renren.lottery.service.UserService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.Query;
//import org.springframework.stereotype.Service;
//
//import java.util.Map;
//
//
//@Service("userService")
//public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {
//
//    @Override
//    public PageUtils queryPage(Map<String, Object> params) {
//        IPage<UserEntity> page = this.page(
//                new Query<UserEntity>().getPage(params),
//                new QueryWrapper<UserEntity>()
//        );
//
//        return new PageUtils(page);
//    }
//
//}