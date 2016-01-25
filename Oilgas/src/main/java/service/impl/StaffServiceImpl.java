package service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import entity.Staff;
import repository.StaffRepository;
import service.StaffService;

import javax.annotation.Resource;

/**
 * Created by bilibili on 2015/10/23.
 */
@Component("staffService")
@Scope("prototype")
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffRepository staffRepository;

    
    public Staff find(Integer id) {
        return staffRepository.findOne(id);
    }

    
    public Staff create(Staff staff) {
        return staffRepository.save(staff);
    }
}
