package org.lyflexi.debug_jdk.design_partens.proxy;

import org.junit.jupiter.api.Test;
import org.lyflexi.debug_jdk.design_partens.proxy.static_proxy.dao.IUserDao;
import org.lyflexi.debug_jdk.design_partens.proxy.static_proxy.dao.impl.UserDaoImpl;
import org.lyflexi.debug_jdk.design_partens.proxy.static_proxy.proxy.UserDaoProxy;

public class StaticProxyTest {

    @Test
    public void testDelete() {
        //目标对象
        IUserDao target = (IUserDao) new UserDaoImpl();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.delete(1);
    }
}
