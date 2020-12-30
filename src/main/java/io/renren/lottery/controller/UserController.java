//package io.renren.lottery.controller;
//
//import io.renren.lottery.entity.UserEntity;
//import io.renren.lottery.service.UserService;
//import io.renren.common.utils.PageUtils;
//import io.renren.common.utils.R;
//import org.apache.shiro.authz.annotation.RequiresPermissions;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Arrays;
//import java.util.Map;
//
//
///**
// *
// *
// * @author chenshun
// * @email sunlightcs@gmail.com
// * @date 2020-12-26 21:21:29
// */
//@RestController
//@RequestMapping("/user")
//public class UserController {
//    @Autowired
//    private UserService userService;
//
//    /**
//     * 列表
//     */
//    @RequestMapping("/list")
//    @RequiresPermissions("generator:user:list")
//    public R list(@RequestParam Map<String, Object> params){
//        PageUtils page = userService.queryPage(params);
//
//        return R.ok().put("page", page);
//    }
//
//
//    /**
//     * 信息
//     */
//    @RequestMapping("/info/{id}")
//    @RequiresPermissions("generator:user:info")
//    public R info(@PathVariable("id") Integer id){
//		UserEntity user = userService.getById(id);
//
//        return R.ok().put("user", user);
//    }
//
//    /**
//     * 保存
//     */
//    @RequestMapping("/save")
//    @RequiresPermissions("generator:user:save")
//    public R save(@RequestBody UserEntity user){
//		userService.save(user);
//
//        return R.ok();
//    }
//
//    /**
//     * 修改
//     */
//    @RequestMapping("/update")
//    @RequiresPermissions("generator:user:update")
//    public R update(@RequestBody UserEntity user){
//		userService.updateById(user);
//
//        return R.ok();
//    }
//
//    /**
//     * 删除
//     */
//    @RequestMapping("/delete")
//    @RequiresPermissions("generator:user:delete")
//    public R delete(@RequestBody Integer[] ids){
//		userService.removeByIds(Arrays.asList(ids));
//
//        return R.ok();
//    }
//
//}
