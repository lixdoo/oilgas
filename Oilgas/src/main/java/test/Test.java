package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import controller.StaffController;
import service.StaffService;

/**
 * Created by bilibili on 2015/10/25.
 */
@Service
public class Test {

    @Autowired
    public StaffService staffService;

    public void findStaff() {
        System.out.println(staffService.find(1).getStaffName());
    }
}
