/*!999999\- enable the sandbox mode */ 
-- MariaDB dump 10.19  Distrib 10.11.8-MariaDB, for Linux (aarch64)
--
-- Host: localhost    Database: bookstackapp
-- ------------------------------------------------------
-- Server version	10.11.8-MariaDB-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `activities`
--

DROP TABLE IF EXISTS `activities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `activities` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `type` varchar(191) NOT NULL,
  `detail` text NOT NULL,
  `user_id` int(11) NOT NULL,
  `ip` varchar(45) NOT NULL,
  `loggable_id` int(11) DEFAULT NULL,
  `loggable_type` varchar(191) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `activities_user_id_index` (`user_id`),
  KEY `activities_entity_id_index` (`loggable_id`),
  KEY `activities_key_index` (`type`),
  KEY `activities_created_at_index` (`created_at`),
  KEY `activities_ip_index` (`ip`)
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `activities`
--

LOCK TABLES `activities` WRITE;
/*!40000 ALTER TABLE `activities` DISABLE KEYS */;
INSERT INTO `activities` VALUES
(1,'auth_login','standard; (3) admin',3,'192.168.65.1',NULL,NULL,'2024-08-27 01:46:47','2024-08-27 01:46:47'),
(2,'settings_update','customization',3,'192.168.65.1',NULL,NULL,'2024-08-27 01:47:52','2024-08-27 01:47:52'),
(3,'maintenance_action_run','regenerate-references',3,'192.168.65.1',NULL,NULL,'2024-08-27 03:43:54','2024-08-27 03:43:54'),
(4,'api_token_create','(1) main; User: (1) Admin',3,'192.168.65.1',NULL,NULL,'2024-08-27 03:56:58','2024-08-27 03:56:58'),
(5,'api_token_update','(1) main; User: (1) Admin',3,'192.168.65.1',NULL,NULL,'2024-08-27 03:58:03','2024-08-27 03:58:03'),
(6,'api_token_update','(1) main; User: (1) Admin',3,'192.168.65.1',NULL,NULL,'2024-08-27 03:58:06','2024-08-27 03:58:06'),
(7,'api_token_update','(1) main; User: (1) Admin',3,'192.168.65.1',NULL,NULL,'2024-08-27 04:22:11','2024-08-27 04:22:11'),
(8,'user_create','(7) Shanae Borer',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:13:21','2024-08-27 14:13:21'),
(9,'user_create','(8) Fleta Hegmann',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:13:44','2024-08-27 14:13:44'),
(10,'user_create','(9) Xochitl Abernathy',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:14:14','2024-08-27 14:14:14'),
(11,'user_create','(10) Franklin Borer',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:22:28','2024-08-27 14:22:28'),
(12,'user_create','(11) Sean Tromp',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:24:34','2024-08-27 14:24:34'),
(13,'user_create','(12) Sung Turcotte',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:32:55','2024-08-27 14:32:55'),
(14,'user_create','(13) Greg D\'Amore',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:34:28','2024-08-27 14:34:28'),
(15,'user_create','(14) Noel Rowe',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:36:54','2024-08-27 14:36:54'),
(16,'user_create','(15) Brian Roberts',1,'192.168.65.1',NULL,NULL,'2024-08-27 14:47:54','2024-08-27 14:47:54'),
(17,'auth_login','standard; (3) admin',3,'192.168.65.1',NULL,NULL,'2024-08-27 22:12:20','2024-08-27 22:12:20'),
(18,'user_create','(16) Wilton Skiles',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:17:33','2024-08-27 22:17:33'),
(19,'user_create','(17) Laurene Parker',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:31:00','2024-08-27 22:31:00'),
(20,'user_create','(18) Wilfredo Feeney Jr.',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:31:49','2024-08-27 22:31:49'),
(21,'user_update','(18) Wilfredo Feeney Jr.',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:31:49','2024-08-27 22:31:49'),
(22,'user_create','(19) Mr. Marcelo Kirlin',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:39:11','2024-08-27 22:39:11'),
(23,'user_update','(19) Mr. Marcelo Kirlin',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:39:12','2024-08-27 22:39:12'),
(24,'user_create','(20) Miss Clementine Fahey',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:40:07','2024-08-27 22:40:07'),
(25,'user_update','(20) Miss Clementine Fahey',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:40:08','2024-08-27 22:40:08'),
(26,'user_create','(21) Eboni Nader',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:41:00','2024-08-27 22:41:00'),
(27,'user_update','(21) Mrs. Herbert Denesik',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:41:01','2024-08-27 22:41:01'),
(28,'user_create','(22) Marielle Conn',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:55:01','2024-08-27 22:55:01'),
(29,'user_delete','(22) Marielle Conn',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:55:02','2024-08-27 22:55:02'),
(30,'user_create','(23) Brigida Cartwright',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:55:58','2024-08-27 22:55:58'),
(31,'user_delete','(23) Brigida Cartwright',1,'192.168.65.1',NULL,NULL,'2024-08-27 22:55:59','2024-08-27 22:55:59'),
(32,'user_create','(24) Garth Paucek',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:14:11','2024-08-28 02:14:11'),
(33,'user_create','(25) Homer Jones',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:19:14','2024-08-28 02:19:14'),
(34,'user_create','(26) Kristopher Beier',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:24:10','2024-08-28 02:24:10'),
(35,'user_create','(27) Dr. Velia Wintheiser',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:26:38','2024-08-28 02:26:38'),
(36,'user_update','(27) Adele Dach',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:26:38','2024-08-28 02:26:38'),
(37,'user_create','(28) Eleanor Hermiston',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:33:31','2024-08-28 02:33:31'),
(38,'user_update','(28) Matilde Mraz',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:33:32','2024-08-28 02:33:32'),
(39,'user_create','(29) Kelly Hudson',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:35:33','2024-08-28 02:35:33'),
(40,'user_delete','(29) Kelly Hudson',1,'192.168.65.1',NULL,NULL,'2024-08-28 02:35:34','2024-08-28 02:35:34'),
(41,'user_create','(30) Jone Green',1,'192.168.65.1',NULL,NULL,'2024-08-28 03:08:34','2024-08-28 03:08:34'),
(42,'user_create','(31) Caren Goldner',1,'192.168.65.1',NULL,NULL,'2024-08-28 03:16:04','2024-08-28 03:16:04'),
(43,'user_create','(32) Heidy Jerde DDS',1,'192.168.65.1',NULL,NULL,'2024-08-28 03:28:27','2024-08-28 03:28:27'),
(44,'user_create','(33) Noe Morar',1,'192.168.65.1',NULL,NULL,'2024-08-28 14:12:06','2024-08-28 14:12:06'),
(45,'user_create','(34) Jeanelle Kozey',1,'192.168.65.1',NULL,NULL,'2024-08-28 14:12:33','2024-08-28 14:12:33'),
(46,'user_create','(35) Erinn Willms',1,'192.168.65.1',NULL,NULL,'2024-08-28 14:13:16','2024-08-28 14:13:16'),
(47,'user_create','(36) Sung Heller',1,'192.168.65.1',NULL,NULL,'2024-08-28 14:13:38','2024-08-28 14:13:38'),
(48,'user_create','(37) Lorilee Cruickshank',1,'192.168.65.1',NULL,NULL,'2024-08-29 00:55:24','2024-08-29 00:55:24'),
(49,'user_create','(38) Dr. George Little',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:15:28','2024-08-29 01:15:28'),
(50,'user_update','(38) Yesenia Goodwin DVM',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:15:29','2024-08-29 01:15:29'),
(51,'user_create','(39) Brittanie Heller',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:24:00','2024-08-29 01:24:00'),
(52,'user_delete','(39) Brittanie Heller',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:24:00','2024-08-29 01:24:00'),
(53,'user_create','(40) Hwa Carroll',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:29:14','2024-08-29 01:29:14'),
(54,'user_create','(41) Vita Rempel',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:29:15','2024-08-29 01:29:15'),
(55,'user_update','(41) Rolland Swift',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:29:16','2024-08-29 01:29:16'),
(56,'user_create','(42) Terrence Ortiz',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:29:16','2024-08-29 01:29:16'),
(57,'user_create','(43) Adriane Howell MD',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:29:17','2024-08-29 01:29:17'),
(58,'user_delete','(43) Adriane Howell MD',1,'192.168.65.1',NULL,NULL,'2024-08-29 01:29:18','2024-08-29 01:29:18'),
(59,'user_create','(44) Norberto Krajcik III',1,'192.168.65.1',NULL,NULL,'2024-08-29 03:50:25','2024-08-29 03:50:25'),
(60,'user_create','(45) Alejandro Lind',1,'192.168.65.1',NULL,NULL,'2024-08-29 03:50:26','2024-08-29 03:50:26'),
(61,'user_update','(45) Rick Cartwright',1,'192.168.65.1',NULL,NULL,'2024-08-29 03:50:27','2024-08-29 03:50:27'),
(62,'user_create','(46) Marcell Larson',1,'192.168.65.1',NULL,NULL,'2024-08-29 03:50:28','2024-08-29 03:50:28'),
(63,'user_create','(47) Major Auer',1,'192.168.65.1',NULL,NULL,'2024-08-29 03:50:28','2024-08-29 03:50:28'),
(64,'user_delete','(47) Major Auer',1,'192.168.65.1',NULL,NULL,'2024-08-29 03:50:29','2024-08-29 03:50:29'),
(65,'user_create','(48) Cameron Boyer',1,'192.168.65.1',NULL,NULL,'2024-08-29 04:02:01','2024-08-29 04:02:01'),
(66,'user_create','(49) Carmina Cruickshank DVM',1,'192.168.65.1',NULL,NULL,'2024-08-29 04:02:02','2024-08-29 04:02:02'),
(67,'user_update','(49) Angila Gislason',1,'192.168.65.1',NULL,NULL,'2024-08-29 04:02:03','2024-08-29 04:02:03'),
(68,'user_create','(50) Anissa Gutmann',1,'192.168.65.1',NULL,NULL,'2024-08-29 04:02:04','2024-08-29 04:02:04'),
(69,'user_create','(51) Shandi Batz I',1,'192.168.65.1',NULL,NULL,'2024-08-29 04:02:04','2024-08-29 04:02:04'),
(70,'user_delete','(51) Shandi Batz I',1,'192.168.65.1',NULL,NULL,'2024-08-29 04:02:05','2024-08-29 04:02:05');
/*!40000 ALTER TABLE `activities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `api_tokens`
--

DROP TABLE IF EXISTS `api_tokens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `api_tokens` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) NOT NULL,
  `token_id` varchar(191) NOT NULL,
  `secret` varchar(191) NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `expires_at` date NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `api_tokens_token_id_unique` (`token_id`),
  KEY `api_tokens_user_id_index` (`user_id`),
  KEY `api_tokens_expires_at_index` (`expires_at`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `api_tokens`
--

LOCK TABLES `api_tokens` WRITE;
/*!40000 ALTER TABLE `api_tokens` DISABLE KEYS */;
INSERT INTO `api_tokens` VALUES
(1,'main','qDPmhahcw4L3nifKPv1Ov6cEDdfstbS9','$2y$12$P5w33MjlCP..1Q76G9uSyuZwe3QAOwQeqWo12fHFlcyC90c06g/c2',1,'2030-10-31','2024-08-27 03:56:58','2024-08-27 03:56:58');
/*!40000 ALTER TABLE `api_tokens` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attachments`
--

DROP TABLE IF EXISTS `attachments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attachments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) NOT NULL,
  `path` text NOT NULL,
  `extension` varchar(20) NOT NULL,
  `uploaded_to` int(11) NOT NULL,
  `external` tinyint(1) NOT NULL,
  `order` int(11) NOT NULL,
  `created_by` int(11) NOT NULL,
  `updated_by` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `attachments_uploaded_to_index` (`uploaded_to`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attachments`
--

LOCK TABLES `attachments` WRITE;
/*!40000 ALTER TABLE `attachments` DISABLE KEYS */;
/*!40000 ALTER TABLE `attachments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `books` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) NOT NULL,
  `slug` varchar(191) NOT NULL,
  `description` text NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `updated_by` int(11) NOT NULL,
  `image_id` int(11) DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `owned_by` int(10) unsigned NOT NULL,
  `default_template_id` int(11) DEFAULT NULL,
  `description_html` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `books_slug_index` (`slug`),
  KEY `books_created_by_index` (`created_by`),
  KEY `books_updated_by_index` (`updated_by`),
  KEY `books_owned_by_index` (`owned_by`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookshelves`
--

DROP TABLE IF EXISTS `bookshelves`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookshelves` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(180) NOT NULL,
  `slug` varchar(180) NOT NULL,
  `description` text NOT NULL,
  `created_by` int(11) DEFAULT NULL,
  `updated_by` int(11) DEFAULT NULL,
  `image_id` int(11) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `owned_by` int(10) unsigned NOT NULL,
  `description_html` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `bookshelves_slug_index` (`slug`),
  KEY `bookshelves_created_by_index` (`created_by`),
  KEY `bookshelves_updated_by_index` (`updated_by`),
  KEY `bookshelves_owned_by_index` (`owned_by`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookshelves`
--

LOCK TABLES `bookshelves` WRITE;
/*!40000 ALTER TABLE `bookshelves` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookshelves` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookshelves_books`
--

DROP TABLE IF EXISTS `bookshelves_books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookshelves_books` (
  `bookshelf_id` int(10) unsigned NOT NULL,
  `book_id` int(10) unsigned NOT NULL,
  `order` int(10) unsigned NOT NULL,
  PRIMARY KEY (`bookshelf_id`,`book_id`),
  KEY `bookshelves_books_book_id_foreign` (`book_id`),
  CONSTRAINT `bookshelves_books_book_id_foreign` FOREIGN KEY (`book_id`) REFERENCES `books` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `bookshelves_books_bookshelf_id_foreign` FOREIGN KEY (`bookshelf_id`) REFERENCES `bookshelves` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookshelves_books`
--

LOCK TABLES `bookshelves_books` WRITE;
/*!40000 ALTER TABLE `bookshelves_books` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookshelves_books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cache`
--

DROP TABLE IF EXISTS `cache`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cache` (
  `key` varchar(191) NOT NULL,
  `value` mediumtext NOT NULL,
  `expiration` int(11) NOT NULL,
  UNIQUE KEY `cache_key_unique` (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cache`
--

LOCK TABLES `cache` WRITE;
/*!40000 ALTER TABLE `cache` DISABLE KEYS */;
/*!40000 ALTER TABLE `cache` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chapters`
--

DROP TABLE IF EXISTS `chapters`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chapters` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `book_id` int(11) NOT NULL,
  `slug` varchar(191) NOT NULL,
  `name` text NOT NULL,
  `description` text NOT NULL,
  `priority` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `updated_by` int(11) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `owned_by` int(10) unsigned NOT NULL,
  `description_html` text NOT NULL,
  `default_template_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `chapters_slug_index` (`slug`),
  KEY `chapters_book_id_index` (`book_id`),
  KEY `chapters_priority_index` (`priority`),
  KEY `chapters_created_by_index` (`created_by`),
  KEY `chapters_updated_by_index` (`updated_by`),
  KEY `chapters_owned_by_index` (`owned_by`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chapters`
--

LOCK TABLES `chapters` WRITE;
/*!40000 ALTER TABLE `chapters` DISABLE KEYS */;
/*!40000 ALTER TABLE `chapters` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `entity_id` int(10) unsigned NOT NULL,
  `entity_type` varchar(191) NOT NULL,
  `text` longtext DEFAULT NULL,
  `html` longtext DEFAULT NULL,
  `parent_id` int(10) unsigned DEFAULT NULL,
  `local_id` int(10) unsigned DEFAULT NULL,
  `created_by` int(10) unsigned NOT NULL,
  `updated_by` int(10) unsigned DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `comments_entity_id_entity_type_index` (`entity_id`,`entity_type`),
  KEY `comments_local_id_index` (`local_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comments`
--

LOCK TABLES `comments` WRITE;
/*!40000 ALTER TABLE `comments` DISABLE KEYS */;
/*!40000 ALTER TABLE `comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deletions`
--

DROP TABLE IF EXISTS `deletions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deletions` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `deleted_by` int(11) NOT NULL,
  `deletable_type` varchar(100) NOT NULL,
  `deletable_id` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `deletions_deleted_by_index` (`deleted_by`),
  KEY `deletions_deletable_type_index` (`deletable_type`),
  KEY `deletions_deletable_id_index` (`deletable_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deletions`
--

LOCK TABLES `deletions` WRITE;
/*!40000 ALTER TABLE `deletions` DISABLE KEYS */;
/*!40000 ALTER TABLE `deletions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `email_confirmations`
--

DROP TABLE IF EXISTS `email_confirmations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `email_confirmations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `token` varchar(191) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `email_confirmations_user_id_index` (`user_id`),
  KEY `email_confirmations_token_index` (`token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `email_confirmations`
--

LOCK TABLES `email_confirmations` WRITE;
/*!40000 ALTER TABLE `email_confirmations` DISABLE KEYS */;
/*!40000 ALTER TABLE `email_confirmations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entity_permissions`
--

DROP TABLE IF EXISTS `entity_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entity_permissions` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `entity_id` int(10) unsigned NOT NULL,
  `entity_type` varchar(25) NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  `view` tinyint(1) NOT NULL DEFAULT 0,
  `create` tinyint(1) NOT NULL DEFAULT 0,
  `update` tinyint(1) NOT NULL DEFAULT 0,
  `delete` tinyint(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `new_entity_permissions_entity_id_entity_type_index` (`entity_id`,`entity_type`),
  KEY `new_entity_permissions_role_id_index` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entity_permissions`
--

LOCK TABLES `entity_permissions` WRITE;
/*!40000 ALTER TABLE `entity_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `entity_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `failed_jobs`
--

DROP TABLE IF EXISTS `failed_jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `failed_jobs` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `uuid` varchar(191) NOT NULL,
  `connection` text NOT NULL,
  `queue` text NOT NULL,
  `payload` longtext NOT NULL,
  `exception` longtext NOT NULL,
  `failed_at` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `failed_jobs_uuid_unique` (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `failed_jobs`
--

LOCK TABLES `failed_jobs` WRITE;
/*!40000 ALTER TABLE `failed_jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `failed_jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favourites`
--

DROP TABLE IF EXISTS `favourites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favourites` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `favouritable_id` int(11) NOT NULL,
  `favouritable_type` varchar(100) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `favouritable_index` (`favouritable_id`,`favouritable_type`),
  KEY `favourites_user_id_index` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favourites`
--

LOCK TABLES `favourites` WRITE;
/*!40000 ALTER TABLE `favourites` DISABLE KEYS */;
/*!40000 ALTER TABLE `favourites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `images` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) NOT NULL,
  `url` varchar(191) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `updated_by` int(11) NOT NULL,
  `path` varchar(400) NOT NULL,
  `type` varchar(191) NOT NULL,
  `uploaded_to` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `images_type_index` (`type`),
  KEY `images_uploaded_to_index` (`uploaded_to`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
INSERT INTO `images` VALUES
(1,'Y09eB6vfAk-avatar.png','http://localhost:6875/uploads/images/user/2024-08/y09eb6vfak-avatar.png','2024-08-27 01:46:11','2024-08-27 01:46:11',3,3,'/uploads/images/user/2024-08/y09eb6vfak-avatar.png','user',3);
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jobs`
--

DROP TABLE IF EXISTS `jobs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jobs` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `queue` varchar(191) NOT NULL,
  `payload` longtext NOT NULL,
  `attempts` tinyint(3) unsigned NOT NULL,
  `reserved_at` int(10) unsigned DEFAULT NULL,
  `available_at` int(10) unsigned NOT NULL,
  `created_at` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `jobs_queue_index` (`queue`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jobs`
--

LOCK TABLES `jobs` WRITE;
/*!40000 ALTER TABLE `jobs` DISABLE KEYS */;
/*!40000 ALTER TABLE `jobs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `joint_permissions`
--

DROP TABLE IF EXISTS `joint_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `joint_permissions` (
  `role_id` int(11) NOT NULL,
  `entity_type` varchar(191) NOT NULL,
  `entity_id` int(11) NOT NULL,
  `status` tinyint(3) unsigned NOT NULL,
  `owner_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`role_id`,`entity_type`,`entity_id`),
  KEY `joint_permissions_entity_id_entity_type_index` (`entity_id`,`entity_type`),
  KEY `joint_permissions_role_id_index` (`role_id`),
  KEY `joint_permissions_status_index` (`status`),
  KEY `joint_permissions_owner_id_index` (`owner_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `joint_permissions`
--

LOCK TABLES `joint_permissions` WRITE;
/*!40000 ALTER TABLE `joint_permissions` DISABLE KEYS */;
/*!40000 ALTER TABLE `joint_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mfa_values`
--

DROP TABLE IF EXISTS `mfa_values`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mfa_values` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `method` varchar(20) NOT NULL,
  `value` text NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `mfa_values_user_id_index` (`user_id`),
  KEY `mfa_values_method_index` (`method`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mfa_values`
--

LOCK TABLES `mfa_values` WRITE;
/*!40000 ALTER TABLE `mfa_values` DISABLE KEYS */;
/*!40000 ALTER TABLE `mfa_values` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `migrations`
--

DROP TABLE IF EXISTS `migrations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `migrations` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `migration` varchar(191) NOT NULL,
  `batch` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `migrations`
--

LOCK TABLES `migrations` WRITE;
/*!40000 ALTER TABLE `migrations` DISABLE KEYS */;
INSERT INTO `migrations` VALUES
(1,'2014_10_12_000000_create_users_table',1),
(2,'2014_10_12_100000_create_password_resets_table',1),
(3,'2015_07_12_114933_create_books_table',1),
(4,'2015_07_12_190027_create_pages_table',1),
(5,'2015_07_13_172121_create_images_table',1),
(6,'2015_07_27_172342_create_chapters_table',1),
(7,'2015_08_08_200447_add_users_to_entities',1),
(8,'2015_08_09_093534_create_page_revisions_table',1),
(9,'2015_08_16_142133_create_activities_table',1),
(10,'2015_08_29_105422_add_roles_and_permissions',1),
(11,'2015_08_30_125859_create_settings_table',1),
(12,'2015_08_31_175240_add_search_indexes',1),
(13,'2015_09_04_165821_create_social_accounts_table',1),
(14,'2015_09_05_164707_add_email_confirmation_table',1),
(15,'2015_11_21_145609_create_views_table',1),
(16,'2015_11_26_221857_add_entity_indexes',1),
(17,'2015_12_05_145049_fulltext_weighting',1),
(18,'2015_12_07_195238_add_image_upload_types',1),
(19,'2015_12_09_195748_add_user_avatars',1),
(20,'2016_01_11_210908_add_external_auth_to_users',1),
(21,'2016_02_25_184030_add_slug_to_revisions',1),
(22,'2016_02_27_120329_update_permissions_and_roles',1),
(23,'2016_02_28_084200_add_entity_access_controls',1),
(24,'2016_03_09_203143_add_page_revision_types',1),
(25,'2016_03_13_082138_add_page_drafts',1),
(26,'2016_03_25_123157_add_markdown_support',1),
(27,'2016_04_09_100730_add_view_permissions_to_roles',1),
(28,'2016_04_20_192649_create_joint_permissions_table',1),
(29,'2016_05_06_185215_create_tags_table',1),
(30,'2016_07_07_181521_add_summary_to_page_revisions',1),
(31,'2016_09_29_101449_remove_hidden_roles',1),
(32,'2016_10_09_142037_create_attachments_table',1),
(33,'2017_01_21_163556_create_cache_table',1),
(34,'2017_01_21_163602_create_sessions_table',1),
(35,'2017_03_19_091553_create_search_index_table',1),
(36,'2017_04_20_185112_add_revision_counts',1),
(37,'2017_07_02_152834_update_db_encoding_to_ut8mb4',1),
(38,'2017_08_01_130541_create_comments_table',1),
(39,'2017_08_29_102650_add_cover_image_display',1),
(40,'2018_07_15_173514_add_role_external_auth_id',1),
(41,'2018_08_04_115700_create_bookshelves_table',1),
(42,'2019_07_07_112515_add_template_support',1),
(43,'2019_08_17_140214_add_user_invites_table',1),
(44,'2019_12_29_120917_add_api_auth',1),
(45,'2020_08_04_111754_drop_joint_permissions_id',1),
(46,'2020_08_04_131052_remove_role_name_field',1),
(47,'2020_09_19_094251_add_activity_indexes',1),
(48,'2020_09_27_210059_add_entity_soft_deletes',1),
(49,'2020_09_27_210528_create_deletions_table',1),
(50,'2020_11_07_232321_simplify_activities_table',1),
(51,'2020_12_30_173528_add_owned_by_field_to_entities',1),
(52,'2021_01_30_225441_add_settings_type_column',1),
(53,'2021_03_08_215138_add_user_slug',1),
(54,'2021_05_15_173110_create_favourites_table',1),
(55,'2021_06_30_173111_create_mfa_values_table',1),
(56,'2021_07_03_085038_add_mfa_enforced_to_roles_table',1),
(57,'2021_08_28_161743_add_export_role_permission',1),
(58,'2021_09_26_044614_add_activities_ip_column',1),
(59,'2021_11_26_070438_add_index_for_user_ip',1),
(60,'2021_12_07_111343_create_webhooks_table',1),
(61,'2021_12_13_152024_create_jobs_table',1),
(62,'2021_12_13_152120_create_failed_jobs_table',1),
(63,'2022_01_03_154041_add_webhooks_timeout_error_columns',1),
(64,'2022_04_17_101741_add_editor_change_field_and_permission',1),
(65,'2022_04_25_140741_update_polymorphic_types',1),
(66,'2022_07_16_170051_drop_joint_permission_type',1),
(67,'2022_08_17_092941_create_references_table',1),
(68,'2022_09_02_082910_fix_shelf_cover_image_types',1),
(69,'2022_10_07_091406_flatten_entity_permissions_table',1),
(70,'2022_10_08_104202_drop_entity_restricted_field',1),
(71,'2023_01_24_104625_refactor_joint_permissions_storage',1),
(72,'2023_01_28_141230_copy_color_settings_for_dark_mode',1),
(73,'2023_02_20_093655_increase_attachments_path_length',1),
(74,'2023_02_23_200227_add_updated_at_index_to_pages',1),
(75,'2023_06_10_071823_remove_guest_user_secondary_roles',1),
(76,'2023_06_25_181952_remove_bookshelf_create_entity_permissions',1),
(77,'2023_07_25_124945_add_receive_notifications_role_permissions',1),
(78,'2023_07_31_104430_create_watches_table',1),
(79,'2023_08_21_174248_increase_cache_size',1),
(80,'2023_12_02_104541_add_default_template_to_books',1),
(81,'2023_12_17_140913_add_description_html_to_entities',1),
(82,'2024_01_01_104542_add_default_template_to_chapters',1),
(83,'2024_02_04_141358_add_views_updated_index',1),
(84,'2024_05_04_154409_rename_activity_relation_columns',1);
/*!40000 ALTER TABLE `migrations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `page_revisions`
--

DROP TABLE IF EXISTS `page_revisions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `page_revisions` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `page_id` int(11) NOT NULL,
  `name` varchar(191) NOT NULL,
  `html` longtext NOT NULL,
  `text` longtext NOT NULL,
  `created_by` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `slug` varchar(191) NOT NULL,
  `book_slug` varchar(191) NOT NULL,
  `type` varchar(191) NOT NULL DEFAULT 'version',
  `markdown` longtext NOT NULL DEFAULT '',
  `summary` varchar(191) DEFAULT NULL,
  `revision_number` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `page_revisions_page_id_index` (`page_id`),
  KEY `page_revisions_slug_index` (`slug`),
  KEY `page_revisions_book_slug_index` (`book_slug`),
  KEY `page_revisions_type_index` (`type`),
  KEY `page_revisions_revision_number_index` (`revision_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `page_revisions`
--

LOCK TABLES `page_revisions` WRITE;
/*!40000 ALTER TABLE `page_revisions` DISABLE KEYS */;
/*!40000 ALTER TABLE `page_revisions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pages`
--

DROP TABLE IF EXISTS `pages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pages` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `book_id` int(11) NOT NULL,
  `chapter_id` int(11) NOT NULL,
  `name` varchar(191) NOT NULL,
  `slug` varchar(191) NOT NULL,
  `html` longtext NOT NULL,
  `text` longtext NOT NULL,
  `priority` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `created_by` int(11) NOT NULL,
  `updated_by` int(11) NOT NULL,
  `draft` tinyint(1) NOT NULL DEFAULT 0,
  `markdown` longtext NOT NULL DEFAULT '',
  `revision_count` int(11) NOT NULL,
  `template` tinyint(1) NOT NULL DEFAULT 0,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `owned_by` int(10) unsigned NOT NULL,
  `editor` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`),
  KEY `pages_slug_index` (`slug`),
  KEY `pages_book_id_index` (`book_id`),
  KEY `pages_chapter_id_index` (`chapter_id`),
  KEY `pages_priority_index` (`priority`),
  KEY `pages_created_by_index` (`created_by`),
  KEY `pages_updated_by_index` (`updated_by`),
  KEY `pages_draft_index` (`draft`),
  KEY `pages_template_index` (`template`),
  KEY `pages_owned_by_index` (`owned_by`),
  KEY `pages_updated_at_index` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pages`
--

LOCK TABLES `pages` WRITE;
/*!40000 ALTER TABLE `pages` DISABLE KEYS */;
/*!40000 ALTER TABLE `pages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `password_resets`
--

DROP TABLE IF EXISTS `password_resets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `password_resets` (
  `email` varchar(191) NOT NULL,
  `token` varchar(191) NOT NULL,
  `created_at` timestamp NOT NULL,
  KEY `password_resets_email_index` (`email`),
  KEY `password_resets_token_index` (`token`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `password_resets`
--

LOCK TABLES `password_resets` WRITE;
/*!40000 ALTER TABLE `password_resets` DISABLE KEYS */;
/*!40000 ALTER TABLE `password_resets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `permission_role`
--

DROP TABLE IF EXISTS `permission_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `permission_role` (
  `permission_id` int(10) unsigned NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`permission_id`,`role_id`),
  KEY `permission_role_role_id_foreign` (`role_id`),
  CONSTRAINT `permission_role_permission_id_foreign` FOREIGN KEY (`permission_id`) REFERENCES `role_permissions` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `permission_role_role_id_foreign` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission_role`
--

LOCK TABLES `permission_role` WRITE;
/*!40000 ALTER TABLE `permission_role` DISABLE KEYS */;
INSERT INTO `permission_role` VALUES
(19,1),
(20,1),
(21,1),
(22,1),
(23,1),
(24,1),
(24,2),
(25,1),
(25,2),
(26,1),
(26,2),
(27,1),
(27,2),
(28,1),
(28,2),
(29,1),
(29,2),
(30,1),
(30,2),
(31,1),
(31,2),
(32,1),
(32,2),
(33,1),
(33,2),
(34,1),
(34,2),
(35,1),
(35,2),
(36,1),
(36,2),
(37,1),
(37,2),
(38,1),
(38,2),
(39,1),
(39,2),
(40,1),
(40,2),
(41,1),
(41,2),
(42,1),
(42,2),
(43,1),
(43,2),
(44,1),
(44,2),
(45,1),
(45,2),
(46,1),
(46,2),
(47,1),
(47,2),
(48,1),
(48,2),
(48,3),
(48,4),
(49,1),
(49,2),
(49,3),
(49,4),
(50,1),
(50,2),
(50,3),
(50,4),
(51,1),
(51,2),
(51,3),
(51,4),
(52,1),
(52,2),
(52,3),
(52,4),
(53,1),
(53,2),
(53,3),
(53,4),
(54,1),
(55,1),
(56,1),
(57,1),
(58,1),
(59,1),
(60,1),
(61,1),
(62,1),
(63,1),
(64,1),
(65,1),
(66,1),
(66,2),
(66,3),
(66,4),
(67,1),
(67,2),
(67,3),
(67,4),
(68,1),
(68,2),
(69,1),
(69,2),
(70,1),
(70,2),
(71,1),
(71,2),
(72,1),
(72,2),
(73,1),
(73,2),
(74,1),
(75,1),
(76,1),
(76,2),
(76,3),
(76,4),
(77,1),
(78,1);
/*!40000 ALTER TABLE `permission_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `references`
--

DROP TABLE IF EXISTS `references`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `references` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `from_id` int(10) unsigned NOT NULL,
  `from_type` varchar(25) NOT NULL,
  `to_id` int(10) unsigned NOT NULL,
  `to_type` varchar(25) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `references_from_id_index` (`from_id`),
  KEY `references_from_type_index` (`from_type`),
  KEY `references_to_id_index` (`to_id`),
  KEY `references_to_type_index` (`to_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `references`
--

LOCK TABLES `references` WRITE;
/*!40000 ALTER TABLE `references` DISABLE KEYS */;
/*!40000 ALTER TABLE `references` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_permissions`
--

DROP TABLE IF EXISTS `role_permissions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_permissions` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) NOT NULL,
  `display_name` varchar(191) DEFAULT NULL,
  `description` varchar(191) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `permissions_name_unique` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_permissions`
--

LOCK TABLES `role_permissions` WRITE;
/*!40000 ALTER TABLE `role_permissions` DISABLE KEYS */;
INSERT INTO `role_permissions` VALUES
(19,'settings-manage','Manage Settings',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(20,'users-manage','Manage Users',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(21,'user-roles-manage','Manage Roles & Permissions',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(22,'restrictions-manage-all','Manage All Entity Permissions',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(23,'restrictions-manage-own','Manage Entity Permissions On Own Content',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(24,'book-create-all','Create All Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(25,'book-create-own','Create Own Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(26,'book-update-all','Update All Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(27,'book-update-own','Update Own Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(28,'book-delete-all','Delete All Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(29,'book-delete-own','Delete Own Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(30,'page-create-all','Create All Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(31,'page-create-own','Create Own Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(32,'page-update-all','Update All Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(33,'page-update-own','Update Own Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(34,'page-delete-all','Delete All Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(35,'page-delete-own','Delete Own Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(36,'chapter-create-all','Create All Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(37,'chapter-create-own','Create Own Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(38,'chapter-update-all','Update All Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(39,'chapter-update-own','Update Own Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(40,'chapter-delete-all','Delete All Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(41,'chapter-delete-own','Delete Own Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(42,'image-create-all','Create All Images',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(43,'image-create-own','Create Own Images',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(44,'image-update-all','Update All Images',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(45,'image-update-own','Update Own Images',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(46,'image-delete-all','Delete All Images',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(47,'image-delete-own','Delete Own Images',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(48,'book-view-all','View All Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(49,'book-view-own','View Own Books',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(50,'page-view-all','View All Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(51,'page-view-own','View Own Pages',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(52,'chapter-view-all','View All Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(53,'chapter-view-own','View Own Chapters',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(54,'attachment-create-all','Create All Attachments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(55,'attachment-create-own','Create Own Attachments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(56,'attachment-update-all','Update All Attachments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(57,'attachment-update-own','Update Own Attachments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(58,'attachment-delete-all','Delete All Attachments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(59,'attachment-delete-own','Delete Own Attachments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(60,'comment-create-all','Create All Comments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(61,'comment-create-own','Create Own Comments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(62,'comment-update-all','Update All Comments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(63,'comment-update-own','Update Own Comments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(64,'comment-delete-all','Delete All Comments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(65,'comment-delete-own','Delete Own Comments',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(66,'bookshelf-view-all','View All BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(67,'bookshelf-view-own','View Own BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(68,'bookshelf-create-all','Create All BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(69,'bookshelf-create-own','Create Own BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(70,'bookshelf-update-all','Update All BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(71,'bookshelf-update-own','Update Own BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(72,'bookshelf-delete-all','Delete All BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(73,'bookshelf-delete-own','Delete Own BookShelves',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(74,'templates-manage','Manage Page Templates',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(75,'access-api','Access system API',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(76,'content-export','Export Content',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(77,'editor-change','Change page editor',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05'),
(78,'receive-notifications','Receive & Manage Notifications',NULL,'2024-08-27 01:41:06','2024-08-27 01:41:06');
/*!40000 ALTER TABLE `role_permissions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user`
--

DROP TABLE IF EXISTS `role_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user` (
  `user_id` int(10) unsigned NOT NULL,
  `role_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `role_user_role_id_foreign` (`role_id`),
  CONSTRAINT `role_user_role_id_foreign` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `role_user_user_id_foreign` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user`
--

LOCK TABLES `role_user` WRITE;
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
INSERT INTO `role_user` VALUES
(1,1),
(2,4),
(3,1),
(7,1),
(8,2),
(9,2),
(10,2),
(11,2);
/*!40000 ALTER TABLE `role_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `roles` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `display_name` varchar(191) DEFAULT NULL,
  `description` varchar(191) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `system_name` varchar(191) NOT NULL,
  `external_auth_id` varchar(180) NOT NULL DEFAULT '',
  `mfa_enforced` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `roles_system_name_index` (`system_name`),
  KEY `roles_external_auth_id_index` (`external_auth_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES
(1,'Admin','Administrator of the whole application','2024-08-27 01:41:05','2024-08-27 01:41:05','admin','',0),
(2,'Editor','User can edit Books, Chapters & Pages','2024-08-27 01:41:05','2024-08-27 01:41:05','','',0),
(3,'Viewer','User can view books & their content behind authentication','2024-08-27 01:41:05','2024-08-27 01:41:05','','',0),
(4,'Public','The role given to public visitors if allowed','2024-08-27 01:41:05','2024-08-27 01:41:05','public','',0);
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `search_terms`
--

DROP TABLE IF EXISTS `search_terms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `search_terms` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `term` varchar(180) NOT NULL,
  `entity_type` varchar(100) NOT NULL,
  `entity_id` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `search_terms_term_index` (`term`),
  KEY `search_terms_entity_type_index` (`entity_type`),
  KEY `search_terms_entity_type_entity_id_index` (`entity_type`,`entity_id`),
  KEY `search_terms_score_index` (`score`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `search_terms`
--

LOCK TABLES `search_terms` WRITE;
/*!40000 ALTER TABLE `search_terms` DISABLE KEYS */;
/*!40000 ALTER TABLE `search_terms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sessions`
--

DROP TABLE IF EXISTS `sessions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sessions` (
  `id` varchar(191) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `ip_address` varchar(45) DEFAULT NULL,
  `user_agent` text DEFAULT NULL,
  `payload` text NOT NULL,
  `last_activity` int(11) NOT NULL,
  UNIQUE KEY `sessions_id_unique` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sessions`
--

LOCK TABLES `sessions` WRITE;
/*!40000 ALTER TABLE `sessions` DISABLE KEYS */;
/*!40000 ALTER TABLE `sessions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `settings`
--

DROP TABLE IF EXISTS `settings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `settings` (
  `setting_key` varchar(191) NOT NULL,
  `value` text NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `type` varchar(50) NOT NULL DEFAULT 'string',
  PRIMARY KEY (`setting_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `settings`
--

LOCK TABLES `settings` WRITE;
/*!40000 ALTER TABLE `settings` DISABLE KEYS */;
INSERT INTO `settings` VALUES
('app-color','#206ea7','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-color-dark','#195785','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-color-light','rgba(32,110,167,0.15)','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-color-light-dark','rgba(32,110,167,0.15)','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-custom-head','','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-editor','wysiwyg','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-footer-links','[]','2024-08-27 01:47:52','2024-08-27 01:47:52','array'),
('app-homepage','','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-homepage-type','default','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-name','BookStack1','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('app-name-header','true','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('book-color','#077b70','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('book-color-dark','#389f60','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('bookshelf-color','#a94747','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('bookshelf-color-dark','#ff5454','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('chapter-color','#af4d0d','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('chapter-color-dark','#ee7a2d','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('link-color','#206ea7','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('link-color-dark','#429fe3','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('page-color','#206ea7','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('page-color-dark','#429fe3','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('page-draft-color','#7e50b1','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('page-draft-color-dark','#a66ce8','2024-08-27 01:47:52','2024-08-27 01:47:52','string'),
('user:10:language','En','2024-08-27 14:22:27','2024-08-27 14:22:27','string'),
('user:11:language','En','2024-08-27 14:24:34','2024-08-27 14:24:34','string'),
('user:12:language','En','2024-08-27 14:32:55','2024-08-27 14:32:55','string'),
('user:13:language','En','2024-08-27 14:34:27','2024-08-27 14:34:27','string'),
('user:14:language','En','2024-08-27 14:36:54','2024-08-27 14:36:54','string'),
('user:15:language','En','2024-08-27 14:47:54','2024-08-27 14:47:54','string'),
('user:16:language','En','2024-08-27 22:17:32','2024-08-27 22:17:32','string'),
('user:17:language','En','2024-08-27 22:31:00','2024-08-27 22:31:00','string'),
('user:18:language','En','2024-08-27 22:31:48','2024-08-27 22:31:48','string'),
('user:19:language','En','2024-08-27 22:39:10','2024-08-27 22:39:10','string'),
('user:20:language','En','2024-08-27 22:40:07','2024-08-27 22:40:07','string'),
('user:21:language','En','2024-08-27 22:41:00','2024-08-27 22:41:00','string'),
('user:24:language','Us','2024-08-28 02:14:11','2024-08-28 02:14:11','string'),
('user:25:language','Us','2024-08-28 02:19:14','2024-08-28 02:19:14','string'),
('user:26:language','Us','2024-08-28 02:24:09','2024-08-28 02:24:09','string'),
('user:27:language','Us','2024-08-28 02:26:37','2024-08-28 02:26:37','string'),
('user:28:language','Us','2024-08-28 02:33:31','2024-08-28 02:33:31','string'),
('user:3:dark-mode-enabled','false','2024-08-27 01:51:33','2024-08-27 01:51:37','string'),
('user:3:section_expansion#home-details','false','2024-08-27 01:47:26','2024-08-27 01:47:28','string'),
('user:30:language','Us','2024-08-28 03:08:33','2024-08-28 03:08:33','string'),
('user:31:language','Us','2024-08-28 03:16:04','2024-08-28 03:16:04','string'),
('user:32:language','Us','2024-08-28 03:28:27','2024-08-28 03:28:27','string'),
('user:33:language','Us','2024-08-28 14:12:06','2024-08-28 14:12:06','string'),
('user:34:language','Us','2024-08-28 14:12:32','2024-08-28 14:12:32','string'),
('user:35:language','Us','2024-08-28 14:13:15','2024-08-28 14:13:15','string'),
('user:36:language','Us','2024-08-28 14:13:38','2024-08-28 14:13:38','string'),
('user:37:language','Us','2024-08-29 00:55:24','2024-08-29 00:55:24','string'),
('user:38:language','Us','2024-08-29 01:15:28','2024-08-29 01:15:28','string'),
('user:40:language','Us','2024-08-29 01:29:13','2024-08-29 01:29:13','string'),
('user:41:language','Us','2024-08-29 01:29:15','2024-08-29 01:29:15','string'),
('user:42:language','Us','2024-08-29 01:29:16','2024-08-29 01:29:16','string'),
('user:44:language','Us','2024-08-29 03:50:24','2024-08-29 03:50:24','string'),
('user:45:language','Us','2024-08-29 03:50:26','2024-08-29 03:50:26','string'),
('user:46:language','Us','2024-08-29 03:50:27','2024-08-29 03:50:27','string'),
('user:48:language','Us','2024-08-29 04:02:00','2024-08-29 04:02:00','string'),
('user:49:language','Us','2024-08-29 04:02:02','2024-08-29 04:02:02','string'),
('user:50:language','Us','2024-08-29 04:02:03','2024-08-29 04:02:03','string'),
('user:7:language','En','2024-08-27 14:13:21','2024-08-27 14:13:21','string'),
('user:8:language','En','2024-08-27 14:13:44','2024-08-27 14:13:44','string'),
('user:9:language','En','2024-08-27 14:14:14','2024-08-27 14:14:14','string');
/*!40000 ALTER TABLE `settings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `social_accounts`
--

DROP TABLE IF EXISTS `social_accounts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `social_accounts` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `driver` varchar(191) NOT NULL,
  `driver_id` varchar(191) NOT NULL,
  `avatar` varchar(191) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `social_accounts_user_id_index` (`user_id`),
  KEY `social_accounts_driver_index` (`driver`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `social_accounts`
--

LOCK TABLES `social_accounts` WRITE;
/*!40000 ALTER TABLE `social_accounts` DISABLE KEYS */;
/*!40000 ALTER TABLE `social_accounts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tags`
--

DROP TABLE IF EXISTS `tags`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tags` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `entity_id` int(11) NOT NULL,
  `entity_type` varchar(100) NOT NULL,
  `name` varchar(191) NOT NULL,
  `value` varchar(191) NOT NULL,
  `order` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `tags_name_index` (`name`),
  KEY `tags_value_index` (`value`),
  KEY `tags_order_index` (`order`),
  KEY `tags_entity_id_entity_type_index` (`entity_id`,`entity_type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tags`
--

LOCK TABLES `tags` WRITE;
/*!40000 ALTER TABLE `tags` DISABLE KEYS */;
/*!40000 ALTER TABLE `tags` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_invites`
--

DROP TABLE IF EXISTS `user_invites`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_invites` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `token` varchar(191) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_invites_user_id_index` (`user_id`),
  KEY `user_invites_token_index` (`token`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_invites`
--

LOCK TABLES `user_invites` WRITE;
/*!40000 ALTER TABLE `user_invites` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_invites` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(191) NOT NULL,
  `email` varchar(191) NOT NULL,
  `password` varchar(60) NOT NULL,
  `remember_token` varchar(100) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `email_confirmed` tinyint(1) NOT NULL DEFAULT 1,
  `image_id` int(11) NOT NULL DEFAULT 0,
  `external_auth_id` varchar(191) NOT NULL,
  `system_name` varchar(191) DEFAULT NULL,
  `slug` varchar(180) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `users_email_unique` (`email`),
  UNIQUE KEY `users_slug_unique` (`slug`),
  KEY `users_external_auth_id_index` (`external_auth_id`),
  KEY `users_system_name_index` (`system_name`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES
(1,'Admin','admin@admin.com','$2y$12$WioRUjsz3F/uL/GJ8pG5cOKaEErLhQS.Sr0UrHq7x4fhLTmMAK5Fi',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05',1,0,'',NULL,'admin'),
(2,'Guest','guest@example.com','',NULL,'2024-08-27 01:41:05','2024-08-27 01:41:05',1,0,'','public','guest'),
(3,'admin','admin@a.com','$2y$12$8kuO7pLkTosccYMQtlRlEOR9Fg6.k9XfJjUZ9OXFnExz0IVkVrXdq',NULL,'2024-08-27 01:46:11','2024-08-27 01:46:11',1,1,'',NULL,'admin-YoZ'),
(7,'Shanae Borer','shayna.daugherty@hotmail.com','$2y$12$edqBrr.VDhoQjrcP1X6oV.01xK43pnW4TGYs4ULwhaibYnBsyPsqi',NULL,'2024-08-27 14:13:21','2024-08-27 14:13:21',1,0,'',NULL,'shanae-borer'),
(8,'Fleta Hegmann','harold.howe@gmail.com','$2y$12$b7u9AezMNZADSf6jwFPzP.AyHg.4CuSrmM2qRUWpHA/YmKuGcfoTa',NULL,'2024-08-27 14:13:44','2024-08-27 14:13:44',1,0,'',NULL,'fleta-hegmann'),
(9,'Xochitl Abernathy','shakira.kunze@yahoo.com','$2y$12$.YuO5l.97dRQ9VeIRboRou7/1WOKzYtl7zqs7iqn9WUdjDkg.ZtZe',NULL,'2024-08-27 14:14:14','2024-08-27 14:14:14',1,0,'',NULL,'xochitl-abernathy'),
(10,'Franklin Borer','shin.balistreri@gmail.com','$2y$12$VoT048dvhOL/MbdmvNSxH.6tQ7AgAfKqDZgRx8Kg.Z1EGq57y7Z0S',NULL,'2024-08-27 14:22:27','2024-08-27 14:22:27',1,0,'',NULL,'franklin-borer'),
(11,'Sean Tromp','cyndi.wehner@hotmail.com','$2y$12$ZDWrBnAE2F4bv81eWOtdruJYDht.ZPjL6CRofs.dWphegy3jaRHuK',NULL,'2024-08-27 14:24:34','2024-08-27 14:24:34',1,0,'',NULL,'sean-tromp'),
(12,'Sung Turcotte','jarvis.hickle@gmail.com','$2y$12$GoM8oPq/puS.5tnB67TXyeRALy1BjWU8vEhJmoIfbGeBaZobebgZu',NULL,'2024-08-27 14:32:55','2024-08-27 14:32:55',1,0,'',NULL,'sung-turcotte'),
(13,'Greg D\'Amore','aaron.crooks@yahoo.com','$2y$12$REsqN19z3E.vlpJaKbYvOeyL.u5eGjbm1T2pBNfIziZGiYDGAkYPa',NULL,'2024-08-27 14:34:27','2024-08-27 14:34:27',1,0,'',NULL,'greg-damore'),
(14,'Noel Rowe','korey.klocko@hotmail.com','$2y$12$UR0X65kf47058UwQRl6F0.yuB7.Pe4CKaE0RsoNyvggOWichgDsK6',NULL,'2024-08-27 14:36:54','2024-08-27 14:36:54',1,0,'',NULL,'noel-rowe'),
(15,'Brian Roberts','marin.vonrueden@yahoo.com','$2y$12$XMbmKzaJWDNjMxmBwb4.MOX6mYdDP7gXJRn3N4KA7Z2yKa9S.d/SW',NULL,'2024-08-27 14:47:54','2024-08-27 14:47:54',1,0,'',NULL,'brian-roberts'),
(16,'Wilton Skiles','sueann.bosco@hotmail.com','$2y$12$RfN/YRMHf8wzFoicw75L4uVSBrmwqUURyWUKM.XcxnZT2JK5hX45W',NULL,'2024-08-27 22:17:32','2024-08-27 22:17:32',1,0,'',NULL,'wilton-skiles'),
(17,'Laurene Parker','leatrice.bernhard@yahoo.com','$2y$12$8kZhSYyu6Gp7j64vUP/2HOX/NCd3PQ.wxLJy8Fyn4hCKxUL.1QYTO',NULL,'2024-08-27 22:31:00','2024-08-27 22:31:00',1,0,'',NULL,'laurene-parker'),
(18,'Wilfredo Feeney Jr.','nila.block@yahoo.com','$2y$12$rJjp2AaRUL5JOLk2gFQkHuQzvPRnZv.Q2NAJWoQ9MtmAycSpohTAG',NULL,'2024-08-27 22:31:48','2024-08-27 22:31:49',1,0,'',NULL,'wilfredo-feeney-jr'),
(19,'Mr. Marcelo Kirlin','aurelio.schimmel@yahoo.com','$2y$12$h/Y1nGnhhMSvZtMUJIAOmOLGX0VwwPOEoEuHz78UipLuQv.m05CTi',NULL,'2024-08-27 22:39:10','2024-08-27 22:39:12',1,0,'',NULL,'mr-marcelo-kirlin'),
(20,'Miss Clementine Fahey','mariano.blanda@yahoo.com','$2y$12$5SgRPAY2C5mS4yuAnYAQNejMaX.mwq9h/ecwntVgl9YPUiOwSh2zC',NULL,'2024-08-27 22:40:07','2024-08-27 22:40:08',1,0,'',NULL,'miss-clementine-fahey'),
(21,'Mrs. Herbert Denesik','bret.hansen@gmail.com','$2y$12$Mg86LKtN.YMch3kGOum5o.3.VfchDAH2.WyvjfyILGgp5.6AhllOq',NULL,'2024-08-27 22:41:00','2024-08-27 22:41:01',1,0,'',NULL,'mrs-herbert-denesik'),
(24,'Garth Paucek','keeley.ratke@yahoo.com','$2y$12$RbrPLfv/w7hAmldFDOjrbeMIS4D9VtHwDgQEWG6Fl.itbGh5Zo/g2',NULL,'2024-08-28 02:14:11','2024-08-28 02:14:11',1,0,'',NULL,'garth-paucek'),
(25,'Homer Jones','adrianne.block@hotmail.com','$2y$12$DAWajbWoJMxG70Ue8LFWue3vtnje6D7D7r1AzX//pMvH3YoJ2Aueq',NULL,'2024-08-28 02:19:14','2024-08-28 02:19:14',1,0,'',NULL,'homer-jones'),
(26,'Kristopher Beier','courtney.beier@hotmail.com','$2y$12$4DKcobLKypfXj0Elon6ToeD57Aw1nRNyvRDOkN/O7ksGCP4VYyjH.',NULL,'2024-08-28 02:24:09','2024-08-28 02:24:09',1,0,'',NULL,'kristopher-beier'),
(27,'Adele Dach','ahmad.yundt@hotmail.com','$2y$12$F30YU4N3ZBWhlW5wq1IlgeYG1UjsuOBBFoHeiOqKAye9omz0ZhyyK',NULL,'2024-08-28 02:26:37','2024-08-28 02:26:38',1,0,'',NULL,'adele-dach'),
(28,'Matilde Mraz','ula.kohler@yahoo.com','$2y$12$s0aZOEDA4FJyW5nQCXAq5.HPsHh0C2mUwfqoovq3tIJBrc/aYQZcy',NULL,'2024-08-28 02:33:31','2024-08-28 02:33:32',1,0,'',NULL,'matilde-mraz'),
(30,'Jone Green','coy.crist@gmail.com','$2y$12$hx8P0dh6f5Pk.px//OA08Oy0Bop1kx.KQKORwH3U6RbS/Mv41yzVG',NULL,'2024-08-28 03:08:33','2024-08-28 03:08:33',1,0,'',NULL,'jone-green'),
(31,'Caren Goldner','gema.stanton@gmail.com','$2y$12$5X6p6nQY0p70vpMipp27bexWZOobuGYwRixXZ8lpYMXV1B07.FVm6',NULL,'2024-08-28 03:16:04','2024-08-28 03:16:04',1,0,'',NULL,'caren-goldner'),
(32,'Heidy Jerde DDS','leonel.emmerich@gmail.com','$2y$12$jYiq/lCCm/XNiJwMBJwDZu5GGOQSC3bmq6NlwbDZKRmcPmnVDuy5.',NULL,'2024-08-28 03:28:27','2024-08-28 03:28:27',1,0,'',NULL,'heidy-jerde-dds'),
(33,'Noe Morar','lou.gerlach@yahoo.com','$2y$12$9wiAACkNbFCSyJ4gZYYodOKwcKo4eKwqn..jdgAZ5JkOZmOwKEZ0q',NULL,'2024-08-28 14:12:06','2024-08-28 14:12:06',1,0,'',NULL,'noe-morar'),
(34,'Jeanelle Kozey','damon.robel@hotmail.com','$2y$12$mf4s/35wg9McKL.8/uBVBeUZWJic303M3vErbbaa4g2OmG4Tq68Om',NULL,'2024-08-28 14:12:32','2024-08-28 14:12:32',1,0,'',NULL,'jeanelle-kozey'),
(35,'Erinn Willms','sharmaine.beahan@hotmail.com','$2y$12$.jjBKvHgPA9JyFeghbay4O8fGEoSNwGwHGr6FKbLzwdr3d84sWmyi',NULL,'2024-08-28 14:13:15','2024-08-28 14:13:15',1,0,'',NULL,'erinn-willms'),
(36,'Sung Heller','darrick.reinger@hotmail.com','$2y$12$cXX1Myk8imrgUO663Jj8FOndgZrkoMreEJ.zMkzshsxjqNqIuz1cu',NULL,'2024-08-28 14:13:38','2024-08-28 14:13:38',1,0,'',NULL,'sung-heller'),
(37,'Lorilee Cruickshank','moshe.hilpert@hotmail.com','$2y$12$J.2i6PrfjPUF45atTU0cbuaXJzznwmoiVHa9.mEwpg7v6348Zwmi2',NULL,'2024-08-29 00:55:24','2024-08-29 00:55:24',1,0,'',NULL,'lorilee-cruickshank'),
(38,'Yesenia Goodwin DVM','lorena.moen@gmail.com','$2y$12$SL/8l0vpqzvjkNsgQkwvDO9xIyS.lb2rguv6pBqRqs1.7tCr6kkr.',NULL,'2024-08-29 01:15:28','2024-08-29 01:15:29',1,0,'',NULL,'yesenia-goodwin-dvm'),
(40,'Hwa Carroll','annett.christiansen@yahoo.com','$2y$12$Wg4UsiUAmwhQV8HjMAh4cOB0Ltm.82obftZxytI1gyfukUWxUznqm',NULL,'2024-08-29 01:29:13','2024-08-29 01:29:13',1,0,'',NULL,'hwa-carroll'),
(41,'Rolland Swift','ty.heathcote@hotmail.com','$2y$12$avG8/bGI9pXfh3CH1cMi7.rILAIHTymuCovhnBQEqm71nkMHG1oxy',NULL,'2024-08-29 01:29:15','2024-08-29 01:29:16',1,0,'',NULL,'rolland-swift'),
(42,'Terrence Ortiz','lourdes.towne@yahoo.com','$2y$12$U14TcO8gLN7V395x4tYOVOQgXCGgjrCn21gHsF2l65g25yEgHpaI.',NULL,'2024-08-29 01:29:16','2024-08-29 01:29:16',1,0,'',NULL,'terrence-ortiz'),
(44,'Norberto Krajcik III','edmundo.gusikowski@hotmail.com','$2y$12$M1/RJFb9X5dJD3Q5WWrA..w9uVp5dToQAAggl1PGwOTIS8gAU2uuO',NULL,'2024-08-29 03:50:24','2024-08-29 03:50:24',1,0,'',NULL,'norberto-krajcik-iii'),
(45,'Rick Cartwright','henry.schultz@gmail.com','$2y$12$zUihXbLPLUmEY/8It7bTZOM8SbmePXEvkvoxFSlUIt4ipP0NrE4zy',NULL,'2024-08-29 03:50:26','2024-08-29 03:50:27',1,0,'',NULL,'rick-cartwright'),
(46,'Marcell Larson','buster.collins@yahoo.com','$2y$12$6e7IfpTKkm36BWNeYKVajuS/Xwka/.lTKDUOJ1crdzgjHgRTjgAzi',NULL,'2024-08-29 03:50:27','2024-08-29 03:50:27',1,0,'',NULL,'marcell-larson'),
(48,'Cameron Boyer','louise.spencer@hotmail.com','$2y$12$YR5kuAA59uosQDTtq2bUtuZNwPBclMmKRR8RmfYf6g7dq7acOAX22',NULL,'2024-08-29 04:02:00','2024-08-29 04:02:00',1,0,'',NULL,'cameron-boyer'),
(49,'Angila Gislason','sheridan.hammes@gmail.com','$2y$12$SkrT44sZo.cOmpxP3eHaOuaBuic.e2eCpPTiINMbjhXpPIEx/xsgq',NULL,'2024-08-29 04:02:02','2024-08-29 04:02:03',1,0,'',NULL,'angila-gislason'),
(50,'Anissa Gutmann','pat.johnson@yahoo.com','$2y$12$JDlv.n17i7sQdtVsX6OwEu49zsFqQu5E23KC4eL8Qtd04IpD8Ml56',NULL,'2024-08-29 04:02:03','2024-08-29 04:02:03',1,0,'',NULL,'anissa-gutmann');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `views`
--

DROP TABLE IF EXISTS `views`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `views` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `viewable_id` int(11) NOT NULL,
  `viewable_type` varchar(191) NOT NULL,
  `views` int(11) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `views_user_id_index` (`user_id`),
  KEY `views_viewable_id_index` (`viewable_id`),
  KEY `views_updated_at_index` (`updated_at`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `views`
--

LOCK TABLES `views` WRITE;
/*!40000 ALTER TABLE `views` DISABLE KEYS */;
/*!40000 ALTER TABLE `views` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `watches`
--

DROP TABLE IF EXISTS `watches`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `watches` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `watchable_id` int(11) NOT NULL,
  `watchable_type` varchar(100) NOT NULL,
  `level` tinyint(3) unsigned NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `watchable_index` (`watchable_id`,`watchable_type`),
  KEY `watches_user_id_index` (`user_id`),
  KEY `watches_level_index` (`level`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `watches`
--

LOCK TABLES `watches` WRITE;
/*!40000 ALTER TABLE `watches` DISABLE KEYS */;
/*!40000 ALTER TABLE `watches` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `webhook_tracked_events`
--

DROP TABLE IF EXISTS `webhook_tracked_events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `webhook_tracked_events` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `webhook_id` int(11) NOT NULL,
  `event` varchar(50) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `webhook_tracked_events_event_index` (`event`),
  KEY `webhook_tracked_events_webhook_id_index` (`webhook_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `webhook_tracked_events`
--

LOCK TABLES `webhook_tracked_events` WRITE;
/*!40000 ALTER TABLE `webhook_tracked_events` DISABLE KEYS */;
/*!40000 ALTER TABLE `webhook_tracked_events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `webhooks`
--

DROP TABLE IF EXISTS `webhooks`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `webhooks` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `active` tinyint(1) NOT NULL,
  `endpoint` varchar(500) NOT NULL,
  `created_at` timestamp NULL DEFAULT NULL,
  `updated_at` timestamp NULL DEFAULT NULL,
  `timeout` int(10) unsigned NOT NULL DEFAULT 3,
  `last_error` text NOT NULL DEFAULT '',
  `last_called_at` timestamp NULL DEFAULT NULL,
  `last_errored_at` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `webhooks_name_index` (`name`),
  KEY `webhooks_active_index` (`active`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `webhooks`
--

LOCK TABLES `webhooks` WRITE;
/*!40000 ALTER TABLE `webhooks` DISABLE KEYS */;
/*!40000 ALTER TABLE `webhooks` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-08-29  6:28:39
