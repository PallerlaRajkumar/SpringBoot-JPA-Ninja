-- Create products table
CREATE TABLE IF NOT EXISTS products (
                                        product_id BIGINT NOT NULL,
                                        name VARCHAR(255),
                                        price DECIMAL(10, 2),
                                        category_id BIGINT,
                                        description VARCHAR(255),
                                        PRIMARY KEY (product_id)
);

-- Create users table
CREATE TABLE IF NOT EXISTS users (
                                     user_id BIGINT NOT NULL,
                                     name VARCHAR(255),
                                     email VARCHAR(255),
                                     password VARCHAR(255),
                                     PRIMARY KEY (user_id)
);

-- Create wishlist table
CREATE TABLE wishlist (
                          product_id BIGINT NOT NULL,
                          user_id BIGINT NOT NULL,
                          CONSTRAINT pk_wishlist PRIMARY KEY (product_id, user_id)
);

-- Add foreign key constraints
ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_product FOREIGN KEY (product_id) REFERENCES products (product_id);

ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_user FOREIGN KEY (user_id) REFERENCES users (user_id);