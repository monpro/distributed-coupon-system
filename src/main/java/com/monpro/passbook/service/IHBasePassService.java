package com.monpro.passbook.service;

import com.monpro.passbook.vo.PassTemplate;

/**
 * <h1>Pass Hbase service</h1>
 * Created by monpro.
 */
public interface IHBasePassService {

    /**
     * @param passTemplate {@link PassTemplate}
     * @return true/false
     * */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);
}
