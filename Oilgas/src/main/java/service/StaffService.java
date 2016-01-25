package service;

import entity.Staff;

/**
 * Created by bilibili on 2015/10/23.
 */
public interface StaffService {
    public Staff find(Integer id);
    Staff create(Staff staff);
}
