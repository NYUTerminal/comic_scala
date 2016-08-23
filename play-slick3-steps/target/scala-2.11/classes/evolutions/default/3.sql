# User schema change

# --- !Ups
create table `user_comics_subscription` (
  `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `user_id` BIGINT NOT NULL,
  `published_on` DATE,
  `heroes` TEXT,
  `authors` TEXT,
  `comic_types` TEXT
)

# --- !Downs
drop table `user_comics_subscription`