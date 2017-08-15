-- phpMyAdmin SQL Dump
-- version 4.4.10
-- http://www.phpmyadmin.net
--
-- Host: localhost:8889
-- Generation Time: Aug 15, 2017 at 10:56 PM
-- Server version: 5.5.42
-- PHP Version: 7.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `match_keys`
--

-- --------------------------------------------------------

--
-- Table structure for table `match_key`
--

CREATE TABLE `match_key` (
  `id` int(11) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `mk_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `validity` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `match_key`
--

INSERT INTO `match_key` (`id`, `description`, `mk_id`, `name`, `validity`) VALUES
(1, 'Test description 1', 1, 'Test1 + Dummy1 + Sample1', '17-10-1994'),
(2, 'Test description 2', 2, 'Test2 + Dummy2 + Sample2', '18-10-1994');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `match_key`
--
ALTER TABLE `match_key`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `match_key`
--
ALTER TABLE `match_key`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;