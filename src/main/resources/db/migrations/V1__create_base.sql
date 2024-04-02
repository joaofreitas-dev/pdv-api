CREATE TABLE tb_users (
   id UUID PRIMARY KEY NOT NULL,
   username VARCHAR(255) UNIQUE,
   password VARCHAR(255),
   role VARCHAR(255)
);

CREATE TABLE tb_categories (
    id SERIAL PRIMARY KEY,
    description VARCHAR(255)
);

INSERT INTO tb_categories (description) VALUES ('Informática');
INSERT INTO tb_categories (description) VALUES ('Celulares');
INSERT INTO tb_categories (description) VALUES ('Beleza e Perfumaria');
INSERT INTO tb_categories (description) VALUES ('Mercado');
INSERT INTO tb_categories (description) VALUES ('Livros e Papelaria');
INSERT INTO tb_categories (description) VALUES ('Brinquedos');
INSERT INTO tb_categories (description) VALUES ('Moda');
INSERT INTO tb_categories (description) VALUES ('Bebê');
INSERT INTO tb_categories (description) VALUES ('Games');