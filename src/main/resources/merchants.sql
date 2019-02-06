CREATE TABLE `merchants`(
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar (64) COLLATE utf8_bin NOT NULL COMMENT 'merchant name',
  `logo_url` varchar (256) COLLATE utf8_bin NOT NULL COMMENT 'merchant logo url',
  `business_license_url` varchar (256) COLLATE utf8_bin NOT NULL COMMENT 'merchant license url',
  `phone` varchar (64) COLLATE utf8_bin NOT NULL ,
  `address` varchar (64) COLLATE utf8_bin NOT NULL ,
  `is_audit` BOOLEAN NOT NULL,
  PRIMARY key (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
