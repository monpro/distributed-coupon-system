package com.monpro.passbook.log;

/**
 * Constants for logs
 */
public class LogConstants {

    /**
     * <h2>action name for users</h2>
     */
    public class ActionName{

        /**User examine coupon info*/
        public static final String USER_PASS_INFO = "UserPassInfo";

        /** User examine used coupon info */
        public static final String USER_USED_PASS_INFO = "UserUsedPassInfo";

        /**User use coupon*/
        public static final String USER_USE_PASS = "UserUsePass";

        /** User get inventory info*/
        public static final String INVENTORY_INFO = "InventoryInfo";

        /**User gain coupon*/
        public static final String GAIN_PASS_TEMPLATE = "GainPassTemplate";

        /** user create comment */
        public static final String CREATE_FEEDBACK = "CreateFeedback";

        /** user get feedback */
        public static final String GET_FEEDBACK = "GetFeedback";
    }
}
