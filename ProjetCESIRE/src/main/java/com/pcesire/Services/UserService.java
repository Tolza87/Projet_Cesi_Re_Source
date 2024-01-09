package com.pcesire.Services;

import com.pcesire.DataAccess.IUserRespository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService
{
    @Autowired
    private IUserRespository _userRespository;

    public UserService(IUserRespository _userRespository) {
        this._userRespository = _userRespository;
    }


    @Override
    public List<String> GetAll() {
         var users = _userRespository.GetAll();
         if (users != null && users.stream().count() > 0) {
            return  users;
         }
         return null;
    }
}
