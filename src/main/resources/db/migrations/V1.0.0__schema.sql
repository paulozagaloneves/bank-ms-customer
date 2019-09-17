DROP TABLE IF EXISTS customer;

CREATE TABLE customer(
  profileId         bigint auto_increment NOT NULL PRIMARY KEY,
  name              VARCHAR(20) NOT NULL,
  emailAddress      VARCHAR(2000) NOT NULL,
  streetAddress     VARCHAR(50) NOT NULL,
  streetAddress2    VARCHAR(50) NULL,
  streetAddress3    VARCHAR(50) NULL,
  city              VARCHAR(50) NOT NULL,
  province          VARCHAR(5) NOT NULL,
  postalCode        VARCHAR(15) NOT NULL,
  country           VARCHAR(2) NOT NULL,
  phoneNumber       VARCHAR(13) NULL,
  createTimestamp				TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updateTimestamp				TIMESTAMP
);

