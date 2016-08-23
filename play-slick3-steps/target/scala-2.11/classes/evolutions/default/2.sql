# User schema

# --- !Ups
create table `comics` (
  `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `name` TEXT NOT NULL,
  `description` TEXT,
  `published_on` DATE NOT NULL,
  `categories` TEXT NOT NULL
)

# --- !Downs
drop table `comics`