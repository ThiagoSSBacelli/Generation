CREATE DATABASE `db_generation_game_online`;

USE `db_generation_game_online`;

CREATE TABLE  `tb_classe`(
	`id_class` INT NOT NULL auto_increment primary key,
    `nome` VARCHAR(30) ,
    `defesa` INT NOT NULL,
    `ataque` INT NOT NULL
);


CREATE table `tb_personagem`(
	`id_char` INT NOT NULL auto_increment primary key,
	`nivel` INT NOT NULL,
	`equipamento` VARCHAR(30),
    `nome` VARCHAR(30),
    `inventario` VARCHAR(200),
    `tb_classe_id` int NOT NULL, 
    FOREIGN KEY(`tb_classe_id`) REFERENCES `tb_classe` (`id_class`)
);

INSERT INTO `db_generation_game_online`.`tb_classe` (`nome`, `defesa`, `ataque`) VALUES ('arqueiro', '500', '3500');
INSERT INTO `db_generation_game_online`.`tb_classe` (`nome`, `defesa`, `ataque`) VALUES ('mago', '-1', '9001');
INSERT INTO `db_generation_game_online`.`tb_classe` (`nome`, `defesa`, `ataque`) VALUES ('guerreiro', '3000', '2000');
INSERT INTO `db_generation_game_online`.`tb_classe` (`nome`, `defesa`, `ataque`) VALUES ('bardo', '1500', '1500');
INSERT INTO `db_generation_game_online`.`tb_classe` (`nome`, `defesa`, `ataque`) VALUES ('barbaro', '1800', '3000');

INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('1', 'espada', 'Ferrari', 'camisa', '1');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('2', 'arco', 'Valar', 'calça', '2');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('3', 'cajado', 'Marcao', 'cigarro', '3');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('2', 'machado', 'luiz', 'escudo', '4');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('3', 'laco', 'jabitu', 'pocao', '5');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('1', 'chicote', 'frojola', 'comida', '4');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('2', 'adaga', 'dudu', 'tenda', '3');
INSERT INTO `db_generation_game_online`.`tb_personagem` (`nivel`, `equipamento`, `nome`, `inventario`, `tb_classe_id`) VALUES ('5000', 'banhammer', 'Trolarin', 'canhaoantidatabase', '2');

SELECT `p`.`nome` FROM `tb_personagem` AS `p` JOIN `tb_classe` AS `c` ON `p`.`tb_classe_id`=`c`.`id_class` WHERE `c`.`ataque` >2000;

SELECT `p`.`nome` FROM `tb_personagem` AS `p` JOIN `tb_classe` AS `c` ON `p`.`tb_classe_id`=`c`.`id_class` WHERE `c`.`defesa` <2000 AND `c`.`defesa` >1000;

SELECT `p`.`nome` FROM `tb_personagem` AS `p` WHERE `p`.`nome` LIKE '%c%';

SELECT `p`.`nome` FROM `tb_personagem` AS `p` INNER JOIN `tb_classe` AS `c` ON `p`.`tb_classe_id`=`c`.`id_class` WHERE `c`.`defesa` <2000 AND `c`.`defesa` >1000;

SELECT `p`.`nome`,`c`.`nome` FROM `tb_personagem` AS `p` JOIN `tb_classe` AS `c` ON `p`.`tb_classe_id`=`c`.`id_class` WHERE `c`.`nome` LIKE 'mago';