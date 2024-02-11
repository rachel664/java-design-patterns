package com.zhh.v1;

/**
 * @description 手机工厂接口
 */
public class PhoneFactory {

    public void call(String phoneType){
        Phone phone;
        switch (phoneType){
            case "IPhone":
                phone = new IPhone();
                break;
            case "MiPhone":
                phone = new MiPhone();
                break;
            default:
                throw new IllegalArgumentException("Unknown phoneType "+phoneType);
        }
        phone.call();
    }
}
