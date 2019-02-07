package com.monpro.passbook.ValueObject;


import com.monpro.passbook.constant.ErrorCode;
import com.monpro.passbook.dao.MerchantsDao;
import com.monpro.passbook.entity.Merchants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <h2>Create Merchants Request Object</h2>
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateMerchantsRequest {
    /** merchants name*/
    private String name;

    private String logoUrl;

    private String businessLicenseUrl;

    private String phone;

    private String address;

    /***
     * validate the request
     * @param merchantsDao
     * @return {@link ErrorCode}
     */
    public ErrorCode validate(MerchantsDao merchantsDao){
        if(merchantsDao.findByName(this.name) != null){
            return ErrorCode.DUPLICATE_NAME;
        }

        if(null == this.logoUrl){
            return ErrorCode.EMPTY_LOGO;
        }

        if(null == this.businessLicenseUrl){
            return ErrorCode.EMPTY_BUSINESS_LICENSE;
        }

        if(null == this.address){
            return ErrorCode.EMPTY_ADDRESS;
        }

        if(null == this.phone){
            return ErrorCode.ERROR_PHONE;
        }

        return ErrorCode.SUCCESS;
    }

    /***
     * <h2>turn request object to merchants object</h2>
     * @return {@link Merchants}
     */
    public Merchants toMerchants(){
        Merchants merchants = new Merchants();
        merchants.setName(name);
        merchants.setLogoUrl(logoUrl);
        merchants.setBusinessLicenseUrl(businessLicenseUrl);
        merchants.setPhone(phone);
        merchants.setAddress(address);

        return merchants;
    }
}
