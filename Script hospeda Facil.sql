CREATE DATABASE  IF NOT EXISTS `hospedagem` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `hospedagem`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: hospedagem
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acomodacoes`
--

DROP TABLE IF EXISTS `acomodacoes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acomodacoes` (
  `id_acomodacao` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_quarto` varchar(20) DEFAULT NULL,
  `capacidade` int(11) DEFAULT NULL,
  `nome_acomodacao` varchar(40) DEFAULT NULL,
  `comodidade_wifi` tinyint(1) DEFAULT NULL,
  `comodidade_arcondicionado` tinyint(1) DEFAULT NULL,
  `comodidade_tv` tinyint(1) DEFAULT NULL,
  `comodidade_frigobar` tinyint(1) DEFAULT NULL,
  `comodidade_acessibilidade` tinyint(1) DEFAULT NULL,
  `descricao` varchar(40) DEFAULT NULL,
  `bloqueio_acomodacao` tinyint(1) DEFAULT NULL,
  `periodo_bloqueio_inicio` date DEFAULT NULL,
  `periodo_bloqueio_fim` date DEFAULT NULL,
  `motivo_bloqueio` varchar(200) DEFAULT NULL,
  `status_quarto` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_acomodacao`),
  UNIQUE KEY `id_acomodacao` (`id_acomodacao`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acomodacoes`
--

LOCK TABLES `acomodacoes` WRITE;
/*!40000 ALTER TABLE `acomodacoes` DISABLE KEYS */;
INSERT INTO `acomodacoes` VALUES (1,'Duplo',2,'onibus',1,1,1,1,1,'onibus amarelo',0,NULL,NULL,' ','Disponivel'),(2,'Triplo',3,'Cabana',1,1,1,1,1,'Cabana de frente para o mar',0,NULL,NULL,' ','Reservado');
/*!40000 ALTER TABLE `acomodacoes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionarios`
--

DROP TABLE IF EXISTS `funcionarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `funcionarios` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome_funcionario` varchar(40) DEFAULT NULL,
  `rg` varchar(7) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `celular` varchar(13) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `cep` varchar(9) DEFAULT NULL,
  `Estado` varchar(40) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `bairro` varchar(40) DEFAULT NULL,
  `rua` varchar(40) DEFAULT NULL,
  `complemento` varchar(40) DEFAULT NULL,
  `cargo` varchar(20) DEFAULT NULL,
  `data_admissao` date DEFAULT NULL,
  `data_emissao_carteira` date DEFAULT NULL,
  `banco` varchar(40) DEFAULT NULL,
  `agencia` int(11) DEFAULT NULL,
  `conta` int(11) DEFAULT NULL,
  `status_funcionario` tinyint(1) DEFAULT NULL,
  `observacoes` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_funcionario`),
  UNIQUE KEY `id_funcionario` (`id_funcionario`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionarios`
--

LOCK TABLES `funcionarios` WRITE;
/*!40000 ALTER TABLE `funcionarios` DISABLE KEYS */;
INSERT INTO `funcionarios` VALUES (1,'Ney Schunk','2333012','14319902726','1992-05-28','Masculino','27998402372','neyschunk@gmail.com','29047170','Espirito Santo','Vitoria','Da Penha','Engenheiro Rubens Bley','Apartament0 101','Gerente','2024-06-01','2010-06-20','Brasil',123,321,1,'em experiência'),(2,'Mateus Barbosa','7654321','50125883129','2000-10-20','Masculino','27998999666','MateusBarbosa@gmail.com','25631000','Espirito Santo','Cariacica','Santana','beco 666','casa fim do beco','recepicionista','2024-06-01','2010-01-01','bradesco',246,654321,1,'em experiência');
/*!40000 ALTER TABLE `funcionarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospedes`
--

DROP TABLE IF EXISTS `hospedes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospedes` (
  `id_hospede` int(11) NOT NULL AUTO_INCREMENT,
  `nome_hospede` varchar(40) DEFAULT NULL,
  `rg` varchar(7) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `data_nascimento` date DEFAULT NULL,
  `sexo` char(20) DEFAULT NULL,
  `celular` varchar(13) DEFAULT NULL,
  `email` varchar(40) DEFAULT NULL,
  `CEP` varchar(9) DEFAULT NULL,
  `Estado` char(50) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `bairro` varchar(40) DEFAULT NULL,
  `rua` varchar(40) DEFAULT NULL,
  `complemento` varchar(40) DEFAULT NULL,
  `observacoes` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`id_hospede`),
  UNIQUE KEY `id_hospede` (`id_hospede`),
  UNIQUE KEY `cpf` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospedes`
--

LOCK TABLES `hospedes` WRITE;
/*!40000 ALTER TABLE `hospedes` DISABLE KEYS */;
INSERT INTO `hospedes` VALUES (1,'João Jose','1234567','12345678909','1990-01-20','Masculino','27999999999','JoãoJose@gamil.com','29255000','Minas Gerais','Ouro Preto','Centro','Das dores','casa 170','Proximo a uma igreja'),(2,'Maria Jose','1234567','53664663934','1980-10-25','Feminino','28999999999','MariaJose@gmail.com','25266999','Rio de Janeiro','Rio de Janeiro','centro','praia ','apartamento 666','Proximo a praia');
/*!40000 ALTER TABLE `hospedes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservas`
--

DROP TABLE IF EXISTS `reservas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reservas` (
  `id_reserva` int(11) NOT NULL AUTO_INCREMENT,
  `fk_hospede` int(11) DEFAULT NULL,
  `fk_acomodacao` int(11) DEFAULT NULL,
  `data_checkin` date DEFAULT NULL,
  `data_checkout` date DEFAULT NULL,
  `valor_diaria` float DEFAULT NULL,
  `numero_adulto` int(11) DEFAULT NULL,
  `numero_crianca` int(11) DEFAULT NULL,
  `observacoes` varchar(200) DEFAULT NULL,
  `status_reserva` varchar(40) DEFAULT NULL,
  `data_criacao_reserva` timestamp NOT NULL DEFAULT current_timestamp(),
  UNIQUE KEY `id_reserva` (`id_reserva`),
  KEY `fk_hospede` (`fk_hospede`),
  KEY `fk_acomodacao` (`fk_acomodacao`),
  CONSTRAINT `reservas_ibfk_1` FOREIGN KEY (`fk_hospede`) REFERENCES `hospedes` (`id_hospede`),
  CONSTRAINT `reservas_ibfk_2` FOREIGN KEY (`fk_acomodacao`) REFERENCES `acomodacoes` (`id_acomodacao`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservas`
--

LOCK TABLES `reservas` WRITE;
/*!40000 ALTER TABLE `reservas` DISABLE KEYS */;
INSERT INTO `reservas` VALUES (1,2,2,'2024-06-10','2024-06-15',100,2,1,'criança de colo','Reservado','2024-06-10 18:01:59');
/*!40000 ALTER TABLE `reservas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `fk_funcionario` int(11) DEFAULT NULL,
  `login` varchar(40) DEFAULT NULL,
  `senha` varchar(8) DEFAULT NULL,
  KEY `fk_funcionario` (`fk_funcionario`),
  CONSTRAINT `usuarios_ibfk_1` FOREIGN KEY (`fk_funcionario`) REFERENCES `funcionarios` (`id_funcionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Temporary view structure for view `view_informações_reserva`
--

DROP TABLE IF EXISTS `view_informações_reserva`;
/*!50001 DROP VIEW IF EXISTS `view_informações_reserva`*/;
SET @saved_cs_client     = @@character_set_client;
/*!50503 SET character_set_client = utf8mb4 */;
/*!50001 CREATE VIEW `view_informações_reserva` AS SELECT 
 1 AS `id_reserva`,
 1 AS `fk_hospede`,
 1 AS `nome_hospede`,
 1 AS `cpf`,
 1 AS `data_criacao_reserva`,
 1 AS `data_checkin`,
 1 AS `data_checkout`,
 1 AS `valor_diaria`,
 1 AS `numero_adulto`,
 1 AS `numero_crianca`,
 1 AS `observacoes`,
 1 AS `status_reserva`,
 1 AS `fk_acomodacao`,
 1 AS `nome_acomodacao`,
 1 AS `tipo_quarto`*/;
SET character_set_client = @saved_cs_client;

--
-- Final view structure for view `view_informações_reserva`
--

/*!50001 DROP VIEW IF EXISTS `view_informações_reserva`*/;
/*!50001 SET @saved_cs_client          = @@character_set_client */;
/*!50001 SET @saved_cs_results         = @@character_set_results */;
/*!50001 SET @saved_col_connection     = @@collation_connection */;
/*!50001 SET character_set_client      = utf8mb4 */;
/*!50001 SET character_set_results     = utf8mb4 */;
/*!50001 SET collation_connection      = utf8mb4_general_ci */;
/*!50001 CREATE ALGORITHM=UNDEFINED */
/*!50013 DEFINER=`root`@`localhost` SQL SECURITY DEFINER */
/*!50001 VIEW `view_informações_reserva` AS select `r`.`id_reserva` AS `id_reserva`,`r`.`fk_hospede` AS `fk_hospede`,`h`.`nome_hospede` AS `nome_hospede`,`h`.`cpf` AS `cpf`,`r`.`data_criacao_reserva` AS `data_criacao_reserva`,`r`.`data_checkin` AS `data_checkin`,`r`.`data_checkout` AS `data_checkout`,`r`.`valor_diaria` AS `valor_diaria`,`r`.`numero_adulto` AS `numero_adulto`,`r`.`numero_crianca` AS `numero_crianca`,`r`.`observacoes` AS `observacoes`,`r`.`status_reserva` AS `status_reserva`,`r`.`fk_acomodacao` AS `fk_acomodacao`,`a`.`nome_acomodacao` AS `nome_acomodacao`,`a`.`tipo_quarto` AS `tipo_quarto` from ((`reservas` `r` join `hospedes` `h` on(`r`.`fk_hospede` = `h`.`id_hospede`)) join `acomodacoes` `a` on(`r`.`fk_acomodacao` = `a`.`id_acomodacao`)) */;
/*!50001 SET character_set_client      = @saved_cs_client */;
/*!50001 SET character_set_results     = @saved_cs_results */;
/*!50001 SET collation_connection      = @saved_col_connection */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-10 15:23:09
