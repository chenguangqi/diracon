package com.cgq.mods.diracon;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * 使用@Mod注解来标示Mod类
 *
 * 使用带有@EventHandler的方法来标示事件处理函数
 *
 */
@Mod(modid = "diracon", name = "Diracon", version = "1.0.0")
public class Diracon {
    // 虽然目前这个Mod什么也没有做, 但是启动Minecraft后, 我们可以
    // 看到该Mod已经加载了. 且名称和版本信息与上面@Mod中定义的一致.

    // 下面是三个初始化的不同阶段
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // 读取配置,创建物品方块,注册相关信息
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {
        // 配置Mod的设置, 添加合成表, Mod间通信
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // Mod间交互
    }
}
