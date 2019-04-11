package AbstractFactoryPattern.Enum;

public enum HumanEnum {
    //把世界上所有人类型都定义出来
    YellowMaleHuman("AbstractFactoryPattern.yellowHuman.YellowMaleHuman"),
    YelloFemaleHuman("AbstractFactoryPattern.yellowHuman.YellowFemaleHuman"),
    WhiteFemaleHuman("AbstractFactoryPattern.whiteHuman.WhiteFemaleHuman"),
    WhiteMaleHuman("AbstractFactoryPattern.whiteHuman.WhiteMaleHuman"),
    BlackFemaleHuman("AbstractFactoryPattern.blackHuman.BlackFemaleHuman"),
    BlackMaleHuman("AbstractFactoryPattern.blackHuman.BlackMaleHuman");

    private String value = "";

    //定义构造函数，目的是Data(value)类型的相匹配
    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
        /*
        * java enum类型尽量简单使用，尽量不要使用多态、继承等方法
        * 毕竟用Clas完全可以代替enum
        */
}
