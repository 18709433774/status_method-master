/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/2915:45
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class concrete_Statu_B extends Statu {

    @Override
    public void handle(Context Context) {
        System.out.println("playerb stop");
        Context.setStatu(this);
    }

    @Override
    public String toString() {
        return "stop";
    }
}
