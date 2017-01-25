package org.xuxiaoxiao.mychat.live;


import org.xuxiaoxiao.mychat.infrastructure.MyChatApplication;

public class Module {

    public static void Register(MyChatApplication application) {
        new LiveAccountServices(application);
//        new LiveShoppingListService(application);
//        new LiveItemService(application);
//        new LiveUsersService(application);
//    }
    }
}
