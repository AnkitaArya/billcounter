CREATE TABLE IF NOT EXISTS product (
  product_Id varchar(255) NOT NULL,
  name varchar(255) NOT NULL,
  description varchar(255) DEFAULT NULL,
  tax_category varchar(255) DEFAULT NULL,
  price DECIMAL(11) NOT NULL,
  PRIMARY KEY (product_Id)
);

INSERT INTO product (product_Id, name, description, tax_category, price) VALUES
  ('1','Samsung S10', 'Mobile', 'A', 45000),
  ('2','Apple MacBook Pro', 'Laptop', 'B', 85000),
  ('3','Sony PlayStation 4', 'Gaming Console', 'A', 29000),
  ('4','Venus n95 Masks', 'Face Mask/Respirator', 'C', 800),
  ('5','Dettol Hand Sanitizer', 'Sanitizer', 'C', 250),
  ('6','Oriley Hand Sanitizer', 'Sanitizer', 'C', 300),
  ('7','LG 55UM7290PTD TV', '4K UHD LED TV', 'B', 52999),
  ('8','Loreal Shampoo', 'Protein Shampoo', 'B', 405),
  ('9','Think Like A Monk', 'Book by Jay Shetty', 'A', 250),
  ('10','Nikon D3500', 'DSLR', 'A', 30999);