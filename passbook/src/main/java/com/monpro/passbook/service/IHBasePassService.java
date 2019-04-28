package main.java.com.monpro.passbook.service;

import com.monpro.passbook.vo.PassTemplate;

/**
 * <H1>Pass Hbase Service</H1>
 */
public interface IHBasePassService {

    /**
     * <h2>write PassTemplate into HBase</h2>
     * @param passTemplate {@link PassTemplate}
     * @return true/false
     */
    boolean dropPassTemplateToHBase(PassTemplate passTemplate);
}
