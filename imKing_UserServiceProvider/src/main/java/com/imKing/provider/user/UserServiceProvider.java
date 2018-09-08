package com.imKing.provider.user;

import com.imKing.common.result.R;
import com.imKing.common.util.ResultUtil;
import com.imKing.domain.User;
import com.imKing.mapper.user.UserMapper;
import com.imKing.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceProvider implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public R save(User user) {
        return ResultUtil.createResult(userMapper.insert(user));
    }
}
