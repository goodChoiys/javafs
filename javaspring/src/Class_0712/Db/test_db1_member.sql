-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: test_db1
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `member` (
  `num` int NOT NULL AUTO_INCREMENT,
  `id` char(20) NOT NULL,
  `name` char(20) NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `post_num` char(8) DEFAULT NULL,
  `address` char(80) DEFAULT NULL,
  `tel` char(20) DEFAULT NULL,
  `age` int DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'yjhwang','황영주','M','100-011','서울시 중구 충무로1가','234-8879',35),(2,'khshul','설기형','M','607-010','부산시 동래구 명륜동','764-3784',33),(3,'chpark','박철호','M','503-200','광주시 남구 지석동','298-9730',34),(4,'shlee','이상훈','M','503-201','광주시남구 도금동','838-4347',32),(5,'jyjang','장영숙','W','606-065','부산시 영도구 봉래동5가','399-9809',24),(6,'yjbae','배용진','M','122-014','서울시 은평구 응암4동','857-5683',30),(7,'hbpark','박혜빈','W','427-760','경기도 과천시 중앙동','234-7677',22),(8,'mskim','김문수','M','429-020','경기도 시흥시 신천동','370-6003',63),(9,'shlee','이상훈','M','503-201','광주시 남구 도금동','838-4347',32),(10,'jyjang','장영숙','W','606-065','부산시 영도구 봉래동5가','399-9809',24),(11,'yjbae','배용진','M','122-014','서울시 은평구 응암4동','857-5683',30),(12,'hbpark','박혜빈','W','427-760','경기도 과천시 중앙동','234-7677',22),(13,'mskim','김문수','M','429-020','경기도 시흥시 신천동','370-6003',63),(15,'kskim','김길수','M','440-747','경기도 수원시 장안구 파장동','324-5875',54),(17,'shlee','이성현','M','441-081','경기도 수원시 권선구 매산로1가','243-6844',36),(18,'hnjang','정한나','W','502-763','광주시 서구 화정4동','845-4547',37),(19,'mylee','이명연','W','502-791','광주시 서구 쌍촌동','837-9432',33),(20,'yskim','김영숙','W','429-010','경기도 시흥시 대야동','374-8438',53),(21,'jekim','김정은','W','503-202','광주시 남구 원산동','347-8873',29),(22,'yjko','고영주','W','122-020','서울시 은평구 녹번동','479-3874',32),(23,'cyahn','안철영','M','122-030','서울시 은평구 대조동','347-4687',34),(24,'jmkim','김진모','M','530-140','전라남도 목포시 항동','379-8349',28),(26,'jjko','고재진','M','100-013','서울시 중구 충무로3가','836-4655',28),(27,'hwlee','이현우','M','606-071','부산시 영도구 청학1동','346-8892',32),(28,'cskang','강찬숙','W','668-890','경상남도 남해군 설천면','377-6879',21),(29,'ypji','지영필','M','122-040','서울시 은평구 불광동','366-3747',52),(31,'jepark','박지은','W','670-800','경상남도 거창군 거창읍','328-8743',26),(32,'jhlee','이지현','W','704-702','대구시 달서구 월성동','386-7988',27),(33,'bykang','강부영','M','302-120','대전시 서구 둔산동','798-3243',62),(34,'jymoon','문진영','W','302-122','대전시 서구 둔산2동','987-3248',18),(35,'jyjun','전지연','W','100-012','서울시 중구 충무로2가','347-2236',28),(36,'jkko','고진길','M','122-013','서울시 은평구 응암3동','234-7466',27),(39,'dsshin','신달성','W','530-145','전라남도 신안군 장산면','399-8789',53);
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-12 11:50:58
