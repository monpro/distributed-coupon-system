package com.monpro.passbook.dao;


import com.monpro.passbook.entity.Merchants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/***
 * <h1>Merchants Dao Interface</h1>
 */
public interface MerchantsDao extends JpaRepository<Merchants,Integer> {

    /**
     * <h2>get the merchant object according to its id</h2>
     * @param id
     * @return {@link Merchants}
     */
    Merchants findById(Integer id);

    /**
     * <h2>get the merchant object according to its name</h2>
     * @param name
     * @return {@link Merchants}
     */
    Merchants findByName(String name);

    /**
     * <h2>get merchants objects according to merchant ids</h2>
     * @param ids
     * @return {@link Merchants}
     */
    List<Merchants> findByIdIn(List<Integer> ids);



}