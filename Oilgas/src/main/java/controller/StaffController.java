package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entity.Staff;
import service.StaffService;

import javax.annotation.Resource;

/**
 * Created by bilibili on 2015/10/23.
 */

@RestController
@RequestMapping("/api/staffs")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Staff find(@PathVariable Integer id) {

        return staffService.find(id);
    }
}
