package EffectiveJava;

import java.util.HashMap;
import java.util.Map;

//四大组成之一：服务接口
interface LoginService {
    //这是一个登录服务
    void login();
}

//四大组成之二：服务提供者接口
interface Provider {
    //登录服务的提供者。通俗点说就是：通过这个newLoginService()可以获得一个服务。
    LoginService newLoginService();
}


/**
 * 5.返回方法的对象所属的类在编写包含该静态工厂方法的类时可以不存在
 * 这是一个服务管理器，里面包含了四大组成中的三和四
 * 解释：通过注册将 服务提供者 加入map，然后通过一个静态工厂方法 getService(String name) 返回不同的服务。
 */
public class ServiceManager {
    //map，保存了注册的服务
    private static final Map<String, Provider> providers = new HashMap<String, Provider>();

    private ServiceManager() {
    }

    //四大组成之三：提供者注册API  (其实很简单，就是注册一下服务提供者)
    public static void registerProvider(String name, Provider provider) {
        providers.put(name, provider);
    }

    //四大组成之四：服务访问API   (客户端只需要传递一个name参数，系统会去匹配服务提供者，然后提供服务)  (静态工厂方法)
    public static LoginService getService(String name) {
        Provider provider = providers.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("No provider registered with name=" + name);
        }
        return provider.newLoginService();
    }
}
