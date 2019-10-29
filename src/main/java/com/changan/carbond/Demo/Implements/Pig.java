package com.changan.carbond.Demo.Implements;
import com.changan.carbond.service.impl.CreateObject;
import com.changan.carbond.Demo.Implements.Run;
import com.changan.carbond.Demo.Implements.animal;

public class Pig implements Run, animal {
    public CreateObject Canrun(){
        System.out.println(MAX_SPEED);
        System.out.println("Canrun！");
        return new CreateObject("0", "查询成功", "查询成功", "我是一个返回");
    }
    public void Cansay()
    {
        System.out.println("Cansay！");
    }
}
