package com.monpro.passbook.constant;

/**
 * <h1>常量定义</h1>
 * Created by monpro.
 */
public class Constants {

    /** passbook Kafka Topic */
    public static final String TEMPLATE_TOPIC = "merchants-template";

    /** token stored dir */
    public static final String TOKEN_DIR = "/tmp/token/";

    public static final String USED_TOKEN_SUFFIX = "_";

    public static final String USE_COUNT_REDIS_KEY = "monpro-user-count";

    /**
     * <h2>User HBase Table</h2>
     * */
    public class UserTable {

        /** User HBase Table Name */
        public static final String TABLE_NAME = "pb:user";

        /** User info family */
        public static final String FAMILY_B = "b";

        /** user name */
        public static final String NAME = "name";

        /** user age */
        public static final String AGE = "age";

        public static final String SEX = "sex";

        /** additional info family */
        public static final String FAMILY_O = "o";

        public static final String PHONE = "phone";

        public static final String ADDRESS = "address";
    }

    /**
     * <h2>PassTemplate HBase Table</h2>
     * */
    public class PassTemplateTable {

        /** PassTemplate HBase table name */
        public static final String TABLE_NAME = "pb:passtemplate";

        /** PassTemplate info family */
        public static final String FAMILY_B = "b";

        /** passTemplate id */
        public static final String ID = "id";

        /** passTemplate title */
        public static final String TITLE = "title";

        public static final String SUMMARY = "summary";

        public static final String DESC = "desc";

        public static final String HAS_TOKEN = "has_token";

        public static final String BACKGROUND = "background";

        /** passTemplate restrict info  */
        public static final String FAMILY_C = "c";

        /** largest limit number of passTemplate */
        public static final String LIMIT = "limit";

        /** start data */
        public static final String START = "start";

        /** end data */
        public static final String END = "end";
    }

    /**
     * <h2>Pass HBase Table</h2>
     * */
    public class PassTable {

        /** Pass Table HBase name */
        public static final String TABLE_NAME = "pb:pass";

        /** Pass Table info family */
        public static final String FAMILY_I = "i";

        /** User id */
        public static final String USER_ID = "user_id";

        /** passBook template id */
        public static final String TEMPLATE_ID = "template_id";

        /** Passbook token id */
        public static final String TOKEN = "token";

        /** PassBook assigned date */
        public static final String ASSIGNED_DATE = "assigned_date";

        /** PassBook consume date */
        public static final String CON_DATE = "con_date";
    }

    /**
     * <h2>Feedback Hbase Table</h2>
     * */
    public class Feedback {

        /** Feedback HBase table name */
        public static final String TABLE_NAME = "pb:feedback";

        /** Feedback Hbase info family */
        public static final String FAMILY_I = "i";

        /** Feedback user id */
        public static final String USER_ID = "user_id";

        /** Feedback type */
        public static final String TYPE = "type";

        /** PassTemplate RowKey, -1 if it is app feedback*/
        public static final String TEMPLATE_ID = "template_id";

        /** feedback comment */
        public static final String COMMENT = "comment";
    }
}
