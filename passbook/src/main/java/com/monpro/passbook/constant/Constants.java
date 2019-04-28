package main.java.com.monpro.passbook.constant;

/**
 * <h1>common constants</h1>
 */
public class Constants {
    /**Kafka Topic for merchants coupons **/
    public static final String TEMPLATE_TOPIC = "merchants-template";

    /** store dir for token file**/
    public static final String TOKEN_DIR = "/tmp/token/";

    /** suffix of used token file**/
    public static final String USED_TOKEN_SUFFIX = "_";

    /**redis key of user count**/
    public static final String USE_COUNT_REDIS_KEY = "monpro-user-count";

    /**
     * <h2>User Hbase Table</h2>
     */
    public class UserTable{
        /**User HBase Table Name**/
        public static final String TABLE_NAME = "pb:user";

        /**column family for basic info**/
        public static final String FAMILY_B = "b";

        /**user name**/
        public static final String NAME = "name";

        /**user age**/
        public static final String AGE = "age";

        /**user gender**/
        public static final String SEX = "sex";

        /**column family for extra info **/
        public static final String FAMILY_O = "o";

        /**Phone Number**/
        public static final String PHONE = "phone";

        /**address for user**/
        public static final String ADDRESS = "address";
    }

    /**
     * PassTemplateTable HBase Table
     */
    public class PassTemplateTable{
        /**PassTemplate HBase Table Name**/
        public static final String TABLE_NAME = "pb:passtemplate";

        /**column family for basic info*/
        public static final String FAMILY_B = "b";

        /** merchants id*/
        public static final String ID = "id";

        /**title for coupons**/
        public static final String TITLE = "title";

        /** summary for coupons*/
        public static final String SUMMARY = "summary";

        /**desc for coupons*/
        public static final String DESC = "desc";

        /**whether coupon has tokens*/
        public static final String HAS_TOKEN = "has_token";

        /**background color for coupons*/
        public static final String BACKGROUND = "background";

        /**column family for constraint*/
        public static final String FAMILY_C = "c";

        /** limit number for coupons*/
        public static final String LIMIT = "limit";

        /** start time for coupons */
        public static final String START = "start";
        /**end time */
        public static final String END = "end";


    }

    /**
     * <h2>Pass HBase Table</h2>
     */
    public class PassTable{
        /**Pass HBase Table Name*/
        public static final String TABLE_NAME = "pb:Pass";
        /**column family for basic info*/
        public static final String FAMILY_I = "i";
        /**user id*/
        public static final String USER_ID = "user_id";
        /**id for coupon*/
        public static final String TEMPLATE_ID = "template_id";
        /**token for coupon*/
        public static final String TOKEN = "token";
        /** assigned date for coupon */
        public static final String ASSIGNED_DATE = "assigned_date";
        /**consumer date for coupon*/
        public static final String CON_DATE = "con_date";

    }

    /**
     * <h2>Feedback Hbase Table</h2>
     */
    public class Feedback{
        /**Feebback Hbase name*/
        public static final String TABLE_NAME = "pb:feedback";

        /**column family for basic info*/
        public static final String FAMILY_I = "i";

        /**user id*/
        public static final String USER_ID = "user_id";

        /**comment type*/
        public static final String TYPE = "type";

        /**PassTemplate RowKey, -1 if it is app comment*/
        public static final String TEMPLATE_ID = "template_id";

        /**comment detail*/
        public static final String COMMENT = "comment";
    }

}
