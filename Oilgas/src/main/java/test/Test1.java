package test;

import entity.Staff;
import utils.ServiceUtil;

/**
 * Created by csw on 2015/10/28.
 */
public class Test1 {

    public void add() {
        Staff staff = new Staff("csw");
        System.out.println(staff);
        Staff staff1 = (Staff) ServiceUtil.publicService().create(staff);
        System.out.println(staff1);
    }

    public static void main(String[] args) {
        new Test1().add();
    }
}
