package com.ibeifeng.dubbo.service;

import com.ibeifeng.dubbo.model.Peron;

public interface IPersonService {

    public String sayHello(String name);
    
    public Peron findUserById(Integer id);
    
}
