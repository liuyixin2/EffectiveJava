package innerClass;

/**
 * Created by Administrator on 2017\9\5 0005.
 */
public class Outer {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Inner inner = outer.getInner("Inner", "gz");
        System.out.println(inner.getName());
        System.out.println(inner.getProvince());
    }

    public Inner getInner(final String name, final String city) {
        /**
         * 如果形参要给局部匿名内部类使用的时候，必须要使用final修饰
         */
        return new Inner() {
            private String nameStr = name;
            private String province;

            // 实例初始化
            {
                if (city.equals("gz")) {
                    province = "gd";
                }else {
                    province = "";
                }
            }

            public String getName() {
                return nameStr;
            }

            public String getProvince() {
                return province;
            }
        };
    }
}
interface Inner {
    String getName();
    String getProvince();
}