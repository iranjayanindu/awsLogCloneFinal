package com.aws.assignement.aws.service;

import com.aws.assignement.aws.bean.ResponseBean;
import com.aws.assignement.aws.bean.UserRequestBean;

public interface UserService {
    public ResponseBean signIn(UserRequestBean userRequestBean) throws Exception;
    public ResponseBean createUser(UserRequestBean userRequestBean) throws Exception;
}
