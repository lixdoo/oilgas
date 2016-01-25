package repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import entity.Staff;

/**
 * Created by bilibili on 2015/10/23.
 */
public interface StaffRepository extends PagingAndSortingRepository<Staff, Integer> {
}
