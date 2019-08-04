package com.monpro.passbook.dao;

import com.monpro.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by monpro.
 */
public interface MerchantsDao extends JpaRepository<Merchants, Integer> {

    /**
     * <h2>find merchants object according to id </h2>
     * @param id merchants id
     * @return {@link Merchants}
     * */
    Merchants findById(Integer id);

    /**
     * <h2>find merchants object according to name</h2>
     * @param name merchants name
     * @return {@link Merchants}
     * */
    Merchants findByName(String name);
}
