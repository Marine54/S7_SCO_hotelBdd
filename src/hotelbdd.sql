-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mer 02 Décembre 2015 à 17:47
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.5.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `hotelbdd`
--

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

CREATE TABLE IF NOT EXISTS `chambre` (
  `num_chambre` int(3) DEFAULT NULL,
  `categorie` int(1) DEFAULT NULL,
  `num_hotel` int(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `chambre`
--

INSERT INTO `chambre` (`num_chambre`, `categorie`, `num_hotel`) VALUES
(1, 1, 1),
(2, 1, 1),
(3, 1, 1),
(4, 1, 1),
(5, 1, 1),
(6, 1, 1),
(7, 1, 1),
(8, 1, 1),
(9, 1, 1),
(10, 1, 1),
(11, 1, 1),
(12, 1, 1),
(13, 1, 1),
(14, 1, 1),
(15, 1, 1),
(16, 1, 1),
(17, 2, 1),
(18, 2, 1),
(19, 2, 1),
(20, 2, 1),
(21, 2, 1),
(22, 2, 1),
(23, 2, 1),
(24, 2, 1),
(25, 2, 1),
(26, 2, 1),
(27, 2, 1),
(28, 2, 1),
(29, 2, 1),
(30, 2, 1),
(31, 2, 1),
(32, 2, 1),
(33, 3, 1),
(34, 3, 1),
(35, 3, 1),
(36, 3, 1),
(37, 3, 1),
(38, 3, 1),
(39, 3, 1),
(40, 3, 1),
(41, 3, 1),
(42, 3, 1),
(43, 3, 1),
(44, 3, 1),
(45, 3, 1),
(46, 3, 1),
(47, 3, 1),
(48, 3, 1),
(49, 4, 1),
(50, 4, 1),
(51, 4, 1),
(52, 4, 1),
(53, 4, 1),
(54, 4, 1),
(55, 4, 1),
(56, 4, 1),
(57, 4, 1),
(58, 4, 1),
(59, 4, 1),
(60, 4, 1),
(61, 4, 1),
(62, 4, 1),
(63, 4, 1),
(64, 4, 1),
(65, 5, 1),
(66, 5, 1),
(67, 5, 1),
(68, 5, 1),
(69, 5, 1),
(70, 5, 1),
(71, 5, 1),
(72, 5, 1),
(73, 5, 1),
(74, 5, 1),
(75, 5, 1),
(76, 5, 1),
(77, 5, 1),
(78, 5, 1),
(79, 5, 1),
(80, 5, 1),
(81, 1, 2),
(82, 1, 2),
(83, 1, 2),
(84, 1, 2),
(85, 1, 2),
(86, 1, 2),
(87, 1, 2),
(88, 1, 2),
(89, 1, 2),
(90, 1, 2),
(91, 1, 2),
(92, 1, 2),
(93, 1, 2),
(94, 2, 2),
(95, 2, 2),
(96, 2, 2),
(97, 2, 2),
(98, 2, 2),
(99, 2, 2),
(100, 2, 2),
(101, 2, 2),
(102, 2, 2),
(103, 2, 2),
(104, 2, 2),
(105, 2, 2),
(106, 3, 2),
(107, 3, 2),
(108, 3, 2),
(109, 3, 2),
(110, 3, 2),
(111, 3, 2),
(112, 3, 2),
(113, 3, 2),
(114, 3, 2),
(115, 3, 2),
(116, 3, 2),
(117, 3, 2),
(118, 4, 2),
(119, 4, 2),
(120, 4, 2),
(121, 4, 2),
(122, 4, 2),
(123, 4, 2),
(124, 4, 2),
(125, 4, 2),
(126, 4, 2),
(127, 4, 2),
(128, 4, 2),
(129, 5, 2),
(130, 5, 2),
(131, 5, 2),
(132, 5, 2),
(133, 5, 2),
(134, 5, 2),
(135, 5, 2),
(136, 5, 2),
(137, 5, 2),
(138, 5, 2),
(139, 5, 2),
(140, 5, 2),
(141, 1, 3),
(142, 1, 3),
(143, 1, 3),
(144, 1, 3),
(145, 1, 3),
(146, 1, 3),
(147, 1, 3),
(148, 2, 3),
(149, 2, 3),
(150, 2, 3),
(151, 2, 3),
(152, 2, 3),
(153, 2, 3),
(154, 2, 3),
(155, 2, 3),
(156, 3, 3),
(157, 3, 3),
(158, 3, 3),
(159, 3, 3),
(160, 3, 3),
(161, 3, 3),
(162, 3, 3),
(163, 4, 3),
(164, 4, 3),
(165, 4, 3),
(166, 4, 3),
(167, 4, 3),
(168, 4, 3),
(169, 4, 3),
(170, 3, 3),
(171, 1, 4),
(172, 1, 4),
(173, 1, 4),
(174, 1, 4),
(175, 1, 4),
(176, 1, 4),
(177, 1, 4),
(178, 1, 4),
(179, 1, 4),
(180, 1, 4),
(181, 1, 4),
(182, 1, 4),
(183, 1, 4),
(184, 1, 4),
(185, 1, 4),
(186, 1, 4),
(187, 1, 4),
(188, 1, 4),
(189, 1, 4),
(190, 1, 4),
(191, 2, 4),
(192, 2, 4),
(193, 2, 4),
(194, 2, 4),
(195, 2, 4),
(196, 2, 4),
(197, 2, 4),
(198, 2, 4),
(199, 2, 4),
(200, 2, 4),
(201, 2, 4),
(202, 2, 4),
(203, 2, 4),
(204, 2, 4),
(205, 2, 4),
(206, 2, 4),
(207, 2, 4),
(208, 3, 4),
(209, 3, 4),
(210, 3, 4),
(211, 3, 4),
(212, 3, 4),
(213, 3, 4),
(214, 3, 4),
(215, 3, 4),
(216, 3, 4),
(217, 3, 4),
(218, 3, 4),
(219, 3, 4),
(220, 3, 4),
(221, 3, 4),
(222, 3, 4),
(223, 3, 4),
(224, 3, 4),
(225, 4, 4),
(226, 4, 4),
(227, 4, 4),
(228, 4, 4),
(229, 4, 4),
(230, 4, 4),
(231, 4, 4),
(232, 4, 4),
(233, 4, 4),
(234, 4, 4),
(235, 4, 4),
(236, 4, 4),
(237, 4, 4),
(238, 4, 4),
(239, 4, 4),
(240, 4, 4),
(241, 1, 5),
(242, 1, 5),
(243, 1, 5),
(244, 1, 5),
(245, 1, 5),
(246, 1, 5),
(247, 1, 5),
(248, 1, 5),
(249, 1, 5),
(250, 1, 5),
(251, 1, 5),
(252, 1, 5),
(253, 1, 5),
(254, 1, 5),
(255, 1, 5),
(256, 1, 5),
(257, 2, 5),
(258, 2, 5),
(259, 2, 5),
(260, 2, 5),
(261, 2, 5),
(262, 2, 5),
(263, 2, 5),
(264, 2, 5),
(265, 2, 5),
(266, 2, 5),
(267, 2, 5),
(268, 2, 5),
(269, 2, 5),
(270, 2, 5),
(271, 2, 5),
(272, 2, 5),
(273, 3, 5),
(274, 3, 5),
(275, 3, 5),
(276, 3, 5),
(277, 3, 5),
(278, 3, 5),
(279, 3, 5),
(280, 3, 5),
(281, 3, 5),
(282, 3, 5),
(283, 3, 5),
(284, 3, 5),
(285, 3, 5),
(286, 3, 5),
(287, 3, 5),
(288, 3, 5),
(289, 4, 5),
(290, 4, 5),
(291, 4, 5),
(292, 4, 5),
(293, 4, 5),
(294, 4, 5),
(295, 4, 5),
(296, 4, 5),
(297, 4, 5),
(298, 4, 5),
(299, 4, 5),
(300, 4, 5),
(301, 4, 5),
(302, 4, 5),
(303, 4, 5),
(304, 4, 5),
(305, 4, 5),
(306, 1, 6),
(307, 1, 6),
(308, 1, 6),
(309, 1, 6),
(310, 1, 6),
(311, 1, 6),
(312, 1, 6),
(313, 1, 6),
(314, 1, 6),
(315, 1, 6),
(316, 2, 6),
(317, 2, 6),
(318, 2, 6),
(319, 2, 6),
(320, 2, 6),
(321, 2, 6),
(322, 2, 6),
(323, 2, 6),
(324, 2, 6),
(325, 2, 6),
(326, 3, 6),
(327, 3, 6),
(328, 3, 6),
(329, 3, 6),
(330, 3, 6),
(331, 3, 6),
(332, 3, 6),
(333, 3, 6),
(334, 3, 6),
(335, 3, 6),
(336, 4, 6),
(337, 4, 6),
(338, 4, 6),
(339, 4, 6),
(340, 4, 6),
(341, 4, 6),
(342, 4, 6),
(343, 4, 6),
(344, 4, 6),
(345, 4, 6),
(346, 5, 6),
(347, 5, 6),
(348, 5, 6),
(349, 5, 6),
(350, 5, 6),
(351, 5, 6),
(352, 5, 6),
(353, 5, 6),
(354, 5, 6),
(355, 5, 6),
(356, 1, 7),
(357, 1, 7),
(358, 1, 7),
(359, 1, 7),
(360, 1, 7),
(361, 1, 7),
(362, 1, 7),
(363, 1, 7),
(364, 1, 7),
(365, 1, 7),
(366, 1, 7),
(367, 1, 7),
(368, 1, 7),
(369, 1, 7),
(370, 1, 7),
(371, 1, 7),
(372, 1, 7),
(373, 1, 7),
(374, 1, 7),
(375, 1, 7),
(376, 1, 7),
(377, 1, 7),
(378, 1, 7),
(379, 1, 7),
(380, 1, 7),
(381, 1, 7),
(382, 1, 7),
(383, 1, 7),
(384, 1, 7),
(385, 1, 7),
(386, 1, 7),
(387, 1, 7),
(388, 1, 7),
(389, 1, 7),
(390, 1, 7),
(391, 1, 7),
(392, 1, 7),
(393, 2, 7),
(394, 2, 7),
(395, 2, 7),
(396, 2, 7),
(397, 2, 7),
(398, 2, 7),
(399, 2, 7),
(400, 2, 7),
(401, 2, 7),
(402, 2, 7),
(403, 2, 7),
(404, 2, 7),
(405, 2, 7),
(406, 2, 7),
(407, 2, 7),
(408, 2, 7),
(409, 2, 7),
(410, 2, 7),
(411, 2, 7),
(412, 2, 7),
(413, 2, 7),
(414, 2, 7),
(415, 2, 7),
(416, 2, 7),
(417, 2, 7),
(418, 2, 7),
(419, 2, 7),
(420, 2, 7),
(421, 2, 7),
(422, 2, 7),
(423, 2, 7),
(424, 2, 7),
(425, 2, 7),
(426, 2, 7),
(427, 2, 7),
(428, 2, 7),
(429, 2, 7),
(430, 2, 7),
(431, 1, 8),
(432, 1, 8),
(433, 1, 8),
(434, 1, 8),
(435, 1, 8),
(436, 1, 8),
(437, 1, 8),
(438, 1, 8),
(439, 1, 8),
(440, 1, 8),
(441, 1, 8),
(442, 1, 8),
(443, 1, 8),
(444, 1, 8),
(445, 1, 8),
(446, 1, 8),
(447, 1, 8),
(448, 1, 8),
(449, 1, 8),
(450, 1, 8),
(451, 1, 8),
(452, 1, 8),
(453, 1, 8),
(454, 1, 8),
(455, 1, 8),
(456, 1, 8),
(457, 1, 8),
(458, 1, 8),
(459, 2, 8),
(460, 2, 8),
(461, 2, 8),
(462, 2, 8),
(463, 2, 8),
(464, 2, 8),
(465, 2, 8),
(466, 2, 8),
(467, 2, 8),
(468, 2, 8),
(469, 2, 8),
(470, 2, 8),
(471, 2, 8),
(472, 2, 8),
(473, 2, 8),
(474, 2, 8),
(475, 2, 8),
(476, 2, 8),
(477, 2, 8),
(478, 2, 8),
(479, 2, 8),
(480, 2, 8),
(481, 2, 8),
(482, 2, 8),
(483, 2, 8),
(484, 2, 8),
(485, 2, 8);

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

CREATE TABLE IF NOT EXISTS `client` (
  `num_client` int(3) DEFAULT NULL,
  `Nom_client` varchar(11) DEFAULT NULL,
  `Prenom_client` varchar(13) DEFAULT NULL,
  `Ville_client` varchar(20) DEFAULT NULL,
  `DateNaissance` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `client`
--

INSERT INTO `client` (`num_client`, `Nom_client`, `Prenom_client`, `Ville_client`, `DateNaissance`) VALUES
(1, 'Jean', 'Marcel', 'Nancy', '30/10/1965'),
(2, 'Luther', 'Thibault', 'Paris', '09/12/1966'),
(3, 'Reed', 'Faustine', 'Lyon', '23/11/1958'),
(4, 'Limare', 'Alex', 'Le havre', '23/11/1959'),
(5, 'Colin', 'Nadia', 'Nantes', '23/11/1960'),
(6, 'Pasteur', 'Manon', 'Metz', '23/11/1961'),
(7, 'Angeloni', 'Germain', 'Strasbourg', '23/11/1962'),
(8, 'Marybrasse', 'Hugo', 'Colmar', '23/11/1963'),
(9, 'Vannet', 'Alice', 'Caen', '23/11/1964'),
(10, 'Burtin', 'Alicia', 'Reims', '23/11/1965'),
(11, 'Briche', 'Emilie', 'Lille', '23/11/1966'),
(12, 'Ebran', 'Yann', 'Carcassonne', '23/11/1967'),
(13, 'Couceiro', 'Miguel', 'Nice', '23/01/1958'),
(14, 'Rebuschi', 'Moises', 'Marseille', '23/02/1958'),
(15, 'Outrequin', 'Morgane', 'Toulouse', '23/03/1958'),
(16, 'Urvois', 'Clement', 'Albi', '23/04/1958'),
(17, 'Nomis', 'Claire', 'Aix-en-provence', '23/05/1958'),
(18, 'Harou', 'Jeremy', 'Foix', '23/06/1958'),
(19, 'Recher', 'Julie', 'Forge-les-eaux', '23/07/1958'),
(20, 'Casse', 'Camille', 'Bayeux', '23/08/1958'),
(21, 'Colbe', 'Matthieu', 'Etretat', '23/09/1958'),
(22, 'Leborgne', 'Eric', 'Fecamp', '23/10/1958'),
(23, 'Baudoin', 'Melanie', 'Dieppe', '23/12/1958'),
(24, 'Ruez', 'Margault', 'Dunkerque', '23/01/1959'),
(25, 'Blanc', 'Margaux', 'Bruxelles', '23/02/1959'),
(26, 'Gonzalez', 'Victor', 'Amiens', '23/03/1959'),
(27, 'Nabet', 'Xavier', 'Bordeaux', '23/04/1959'),
(28, 'Schneider', 'Jean-Baptiste', 'Grenoble', '23/05/1959'),
(29, 'Bridou', 'Justin', 'Rouen', '23/06/1959'),
(30, 'Contenot', 'Lea', 'Epinal', '23/07/1959'),
(31, 'Auguet', 'Chloe', 'Dijon', '23/08/1959'),
(32, 'Vandelle', 'Fanny', 'Tours', '23/10/1959'),
(33, 'LeBris', 'Lucie', 'Montpelliers', '23/12/1959'),
(34, 'Morgano', 'Benoit', 'Limoges', '23/01/1960'),
(35, 'Gravier', 'Simon', 'Rennes', '23/02/1960'),
(36, 'Mustapha', 'Elodie', 'Brest', '23/03/1960'),
(37, 'Aubry', 'Lorraine', 'La rochelle', '23/04/1960'),
(38, 'Simon', 'Caroline', 'Angers', '23/05/1960'),
(39, 'Durner', 'Jimmy', 'Agen', '23/06/1960'),
(40, 'Houvion', 'Thomas', 'Pau', '23/01/1990'),
(41, 'Jacquot', 'Kevin', 'Biarritz', '23/07/1960'),
(42, 'Ries', 'Marion', 'Perrigueux', '23/08/1960'),
(43, 'Finance', 'Cecile', 'Poitiers', '23/09/1960'),
(44, 'Petitgand', 'Damien', 'Bourges', '23/10/1960'),
(45, 'Aubrun', 'Baptiste', 'Avignon', '23/12/1960'),
(46, 'Beurrey', 'Joan', 'N?me', '23/01/1961'),
(47, 'Grosset', 'Leonie', 'S?te', '23/02/1962'),
(48, 'Lepelletier', 'Tatiana', 'Toulon', '23/03/1962'),
(49, 'Comisi', 'Martin', 'Fr?jus', '23/04/1962'),
(50, 'Lacourt', 'Elliot', 'Cannes', '23/05/1962'),
(51, 'Banic', 'Paul', 'Evreux', '23/06/1962'),
(52, 'Lovat', 'Etienne', 'Dreux', '23/07/1962'),
(53, 'Fabries', 'Irene', 'Chartres', '23/08/1962'),
(54, 'Evrard', 'Jacques', 'Mac?n', '23/09/1962'),
(55, 'Margulies', 'Jack', 'Sedan', '23/10/1962'),
(56, 'Louis', 'Floriane', 'Maubeuge', '23/12/1962'),
(57, 'Henrionnet', 'Stephanie', 'Arras', '23/01/1963'),
(58, 'Genvo', 'Maxime', 'Vichy', '23/02/1963'),
(59, 'Siegler', 'Cassandra', 'Calais', '23/03/1963'),
(60, 'Jacquenet', 'Cassandre', 'Le havre', '23/04/1963'),
(61, 'Chretien', 'Elodie', 'Rouen', '23/05/1963'),
(62, 'Lambert', 'Roman', 'Paris', '23/06/1963'),
(63, 'Leonet', 'Johanna', 'Caen', '23/07/1963'),
(64, 'Klinger', 'Clemence', 'Nancy', '23/08/1963'),
(65, 'Corradi', 'Guillaume', 'Strasbourg', '23/09/1963'),
(66, 'Elipot', 'Quentin', 'Colmar', '23/10/1963'),
(67, 'Lefevre', 'David', 'Epinal', '23/12/1963'),
(68, 'Ferdinand', 'Goliath', 'Saint-di?-des-vosges', '23/01/1964'),
(69, 'Schurter', 'Marie', 'Bar le duc', '23/02/1964'),
(70, 'Parisel', 'Isabelle', 'Marseille', '23/03/1964'),
(71, 'Favret', 'Arnaud', 'Reims', '23/04/1964'),
(72, 'Gachenot', 'Andrea', 'Amiens', '23/05/1964'),
(73, 'Gauthier', 'Martin', 'Lille', '23/06/1964'),
(74, 'Liger', 'Mathilde', 'Tours', '23/07/1964'),
(75, 'Crepin', 'Suzanne', 'Bordeaux', '23/08/1964'),
(76, 'Blanc', 'Geraldine', 'Lyon', '23/09/1964'),
(77, 'Godfroy', 'Philipe', 'Grenoble', '23/10/1964'),
(78, 'Montagne', 'Gilbert', 'Chamonix', '23/12/1964'),
(79, 'Docq', 'Marc', 'Dijon', '23/01/1965'),
(80, 'Arthure', 'Jef', 'Poitiers', '23/02/1965'),
(81, 'Geuring', 'Gabin', 'Vittel', '23/03/1965'),
(82, 'Bellussi', 'Arthur', 'Verdun', '23/04/1965'),
(83, 'Trebuchet', 'Lisa', 'Dinan', '23/05/1965'),
(84, 'Louyot', 'Leopold', 'Saint malo', '23/06/1965'),
(85, 'Nodari', 'Leopoldine', 'Lisieux', '23/07/1965'),
(86, 'Fendt', 'Jose', 'Coutances', '23/08/1965'),
(87, 'Pascal', 'Joseph', 'Cherbourg', '23/09/1965'),
(88, 'Tran', 'Thierry', 'Qimper', '23/10/1965'),
(89, 'Robert', 'Gael', 'Lorient', '09/12/1965'),
(90, 'Schmitt', 'Gaelle', 'Vannes', '23/01/1966'),
(91, 'Cordonnier', 'Annabelle', 'Le mans', '23/02/1966'),
(92, 'Brusseaux', 'Anaelle', 'Nevers', '19/11/1966'),
(93, 'Badeau', 'Sarah', 'Narbonne', '23/03/1966'),
(94, 'Mosse', 'Juliette', 'Perpignan', '23/04/1966'),
(95, 'Lartillot', 'Sylvain', 'Bayonne', '23/05/1966'),
(96, 'Najid', 'Albert', 'Tarbes', '23/06/1966'),
(97, 'Bontemps', 'Michel', 'Paris', '23/07/1966'),
(98, 'Noirez', 'Catherine', 'Le havre', '23/08/1966'),
(99, 'Thouillot', 'Laurent', 'Rouen', '23/09/1966'),
(100, 'Peduzzi', 'Sandrine', 'Caen', '23/10/1966');

-- --------------------------------------------------------

--
-- Structure de la table `consommation`
--

CREATE TABLE IF NOT EXISTS `consommation` (
  `num_conso` int(3) DEFAULT NULL,
  `total_conso` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `consommation`
--

INSERT INTO `consommation` (`num_conso`, `total_conso`) VALUES
(1, ''),
(2, ''),
(3, ''),
(4, ''),
(5, ''),
(6, ''),
(7, ''),
(8, ''),
(9, ''),
(10, ''),
(11, ''),
(12, ''),
(13, ''),
(14, ''),
(15, ''),
(16, ''),
(17, ''),
(18, ''),
(19, ''),
(20, ''),
(21, ''),
(22, ''),
(23, ''),
(24, ''),
(25, ''),
(26, ''),
(27, ''),
(28, ''),
(29, ''),
(30, ''),
(31, ''),
(32, ''),
(33, ''),
(34, ''),
(35, ''),
(36, ''),
(37, ''),
(38, ''),
(39, ''),
(40, ''),
(41, ''),
(42, ''),
(43, ''),
(44, ''),
(45, ''),
(46, ''),
(47, ''),
(48, ''),
(49, ''),
(50, ''),
(51, ''),
(52, ''),
(53, ''),
(54, ''),
(55, ''),
(56, ''),
(57, ''),
(58, ''),
(59, ''),
(60, ''),
(61, ''),
(62, ''),
(63, ''),
(64, ''),
(65, ''),
(66, ''),
(67, ''),
(68, ''),
(69, ''),
(70, ''),
(71, ''),
(72, ''),
(73, ''),
(74, ''),
(75, ''),
(76, ''),
(77, ''),
(78, ''),
(79, ''),
(80, ''),
(81, ''),
(82, ''),
(83, ''),
(84, ''),
(85, ''),
(86, ''),
(87, ''),
(88, ''),
(89, ''),
(90, ''),
(91, ''),
(92, ''),
(93, ''),
(94, ''),
(95, ''),
(96, ''),
(97, ''),
(98, ''),
(99, ''),
(100, ''),
(101, ''),
(102, ''),
(103, ''),
(104, ''),
(105, ''),
(106, ''),
(107, ''),
(108, ''),
(109, ''),
(110, ''),
(111, ''),
(112, ''),
(113, ''),
(114, ''),
(115, ''),
(116, ''),
(117, ''),
(118, ''),
(119, ''),
(120, '');

-- --------------------------------------------------------

--
-- Structure de la table `contenir_conso_presta`
--

CREATE TABLE IF NOT EXISTS `contenir_conso_presta` (
  `num_conso` int(3) DEFAULT NULL,
  `num_prestation` int(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `contenir_conso_presta`
--

INSERT INTO `contenir_conso_presta` (`num_conso`, `num_prestation`) VALUES
(3, 5),
(1, 2),
(2, 4),
(4, 2),
(4, 6),
(5, 3),
(6, 1),
(7, 4),
(7, 2),
(8, 5),
(9, 2),
(10, 5),
(10, 6),
(11, 2),
(12, 3),
(13, 4),
(14, 1),
(15, 3),
(15, 4),
(16, 2),
(17, 3),
(18, 4),
(18, 2),
(19, 3),
(20, 2),
(21, 5),
(22, 1),
(23, 6),
(24, 2),
(24, 4),
(25, 6),
(26, 2),
(27, 4),
(28, 3),
(29, 6),
(30, 1),
(30, 3),
(30, 6),
(31, 4),
(32, 3),
(33, 2),
(34, 5),
(35, 2),
(36, 1),
(37, 6),
(38, 5),
(39, 4),
(40, 1),
(41, 5),
(42, 3),
(43, 2),
(44, 6),
(45, 2),
(46, 3),
(46, 5),
(47, 6),
(48, 1),
(49, 3),
(50, 2),
(51, 6),
(52, 4),
(53, 1),
(54, 4),
(55, 2),
(56, 5),
(57, 3),
(58, 2),
(59, 6),
(60, 3),
(61, 5),
(62, 1),
(62, 3),
(62, 6),
(63, 4),
(64, 2),
(65, 6),
(66, 1),
(67, 5),
(68, 2),
(69, 4),
(70, 3),
(71, 6),
(72, 6),
(73, 4),
(74, 2),
(75, 1),
(76, 5),
(77, 2),
(78, 1),
(78, 2),
(78, 3),
(78, 4),
(78, 5),
(78, 6),
(79, 5),
(80, 2),
(81, 3),
(82, 1),
(83, 5),
(83, 6),
(84, 3),
(85, 2),
(86, 6),
(87, 4),
(88, 2),
(89, 3),
(90, 1),
(91, 5),
(92, 3),
(93, 2),
(94, 5),
(95, 3),
(96, 6),
(97, 6),
(98, 2),
(99, 1),
(100, 6),
(101, 2),
(101, 4),
(101, 6),
(102, 3),
(103, 3),
(104, 2),
(105, 6),
(106, 4),
(107, 1),
(108, 5),
(109, 3),
(109, 6),
(110, 2),
(111, 4),
(112, 5),
(113, 2),
(114, 1),
(115, 1),
(116, 3),
(117, 6),
(118, 1),
(119, 4),
(120, 5);

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE IF NOT EXISTS `facture` (
  `Num_facture` int(3) DEFAULT NULL,
  `nb_personne` int(1) DEFAULT NULL,
  `periode` int(1) DEFAULT NULL,
  `montant` varchar(10) DEFAULT NULL,
  `num_conso` int(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `facture`
--

INSERT INTO `facture` (`Num_facture`, `nb_personne`, `periode`, `montant`, `num_conso`) VALUES
(1, 1, 1, '', 100),
(2, 2, 1, '', 99),
(3, 2, 1, '', 98),
(4, 1, 1, '', 97),
(5, 1, 1, '', 96),
(6, 1, 1, '', 95),
(7, 2, 1, '', 94),
(8, 2, 1, '', 93),
(9, 2, 1, '', 92),
(10, 1, 1, '', 91),
(11, 2, 1, '', 90),
(12, 1, 1, '', 89),
(13, 1, 1, '', 88),
(14, 1, 1, '', 87),
(15, 1, 1, '', 86),
(16, 2, 1, '', 85),
(17, 1, 1, '', 84),
(18, 2, 1, '', 83),
(19, 1, 1, '', 82),
(20, 2, 1, '', 81),
(21, 1, 1, '', 80),
(22, 1, 1, '', 79),
(23, 1, 1, '', 78),
(24, 1, 1, '', 77),
(25, 2, 1, '', 76),
(26, 2, 1, '', 75),
(27, 2, 1, '', 74),
(28, 1, 1, '', 73),
(29, 1, 1, '', 72),
(30, 1, 1, '', 71),
(31, 1, 1, '', 70),
(32, 1, 1, '', 69),
(33, 2, 1, '', 68),
(34, 2, 1, '', 67),
(35, 2, 1, '', 66),
(36, 1, 1, '', 65),
(37, 2, 1, '', 64),
(38, 1, 1, '', 63),
(39, 2, 1, '', 62),
(40, 2, 1, '', 61),
(41, 2, 1, '', 60),
(42, 1, 1, '', 59),
(43, 1, 1, '', 58),
(44, 2, 1, '', 57),
(45, 1, 1, '', 56),
(46, 2, 1, '', 55),
(47, 2, 1, '', 54),
(48, 2, 1, '', 53),
(49, 1, 1, '', 52),
(50, 1, 1, '', 51),
(51, 2, 1, '', 50),
(52, 1, 1, '', 49),
(53, 1, 1, '', 48),
(54, 1, 1, '', 47),
(55, 2, 1, '', 46),
(56, 2, 1, '', 45),
(57, 1, 1, '', 44),
(58, 2, 1, '', 43),
(59, 2, 1, '', 42),
(60, 2, 1, '', 41),
(61, 2, 1, '', 40),
(62, 1, 1, '', 39),
(63, 2, 1, '', 38),
(64, 2, 1, '', 37),
(65, 2, 1, '', 36),
(66, 1, 1, '', 35),
(67, 2, 1, '', 34),
(68, 2, 1, '', 33),
(69, 1, 1, '', 32),
(70, 1, 1, '', 31),
(71, 2, 1, '', 30),
(72, 1, 1, '', 29),
(73, 1, 1, '', 28),
(74, 2, 1, '', 27),
(75, 1, 1, '', 26),
(76, 1, 1, '', 25),
(77, 1, 1, '', 24),
(78, 2, 1, '', 23),
(79, 1, 1, '', 22),
(80, 1, 1, '', 21),
(81, 2, 1, '', 20),
(82, 1, 1, '', 19),
(83, 2, 1, '', 18),
(84, 2, 1, '', 17),
(85, 1, 1, '', 16),
(86, 2, 1, '', 15),
(87, 1, 1, '', 14),
(88, 1, 1, '', 13),
(89, 2, 1, '', 12),
(90, 2, 1, '', 11),
(91, 2, 1, '', 10),
(92, 1, 1, '', 9),
(93, 2, 1, '', 8),
(94, 2, 1, '', 7),
(95, 1, 1, '', 6),
(96, 1, 1, '', 5),
(97, 1, 1, '', 4),
(98, 2, 1, '', 3),
(99, 2, 1, '', 2),
(100, 1, 1, '', 1);

-- --------------------------------------------------------

--
-- Structure de la table `fournies_par`
--

CREATE TABLE IF NOT EXISTS `fournies_par` (
  `ID` int(2) DEFAULT NULL,
  `prix` varchar(2) DEFAULT NULL,
  `num_hotel` int(1) DEFAULT NULL,
  `num_prestation` int(1) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `fournies_par`
--

INSERT INTO `fournies_par` (`ID`, `prix`, `num_hotel`, `num_prestation`) VALUES
(1, '0', 1, 1),
(2, '0', 1, 2),
(3, '', 1, 3),
(4, '', 1, 4),
(5, '30', 1, 5),
(6, '20', 1, 6),
(7, '0', 2, 1),
(8, '0', 2, 2),
(9, '', 2, 3),
(10, '', 2, 4),
(11, '30', 2, 5),
(12, '20', 2, 6),
(13, '5', 3, 1),
(14, '2', 3, 2),
(15, '2', 3, 3),
(16, '3', 3, 4),
(17, '5', 4, 1),
(18, '2', 4, 2),
(19, '2', 4, 3),
(20, '3', 4, 4),
(21, '5', 5, 1),
(22, '2', 5, 2),
(23, '2', 5, 3),
(24, '3', 5, 4),
(25, '0', 6, 1),
(26, '0', 6, 2),
(27, '', 6, 3),
(28, '', 6, 4),
(29, '30', 6, 5),
(30, '20', 6, 6),
(31, '5', 7, 1),
(32, '2', 7, 2),
(33, '2', 7, 3),
(34, '3', 7, 4),
(35, '5', 9, 1),
(36, '2', 9, 2),
(37, '2', 9, 3),
(38, '3', 9, 4);

-- --------------------------------------------------------

--
-- Structure de la table `hotel`
--

CREATE TABLE IF NOT EXISTS `hotel` (
  `num_hotel` int(1) DEFAULT NULL,
  `Disponibilite` varchar(3) DEFAULT NULL,
  `Nom` varchar(19) DEFAULT NULL,
  `NombreChambre` int(2) DEFAULT NULL,
  `classe` int(1) DEFAULT NULL,
  `chiffreMensuel` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `hotel`
--

INSERT INTO `hotel` (`num_hotel`, `Disponibilite`, `Nom`, `NombreChambre`, `classe`, `chiffreMensuel`) VALUES
(1, 'oui', 'lEffet_mer', 80, 4, ''),
(2, 'oui', 'Normandy', 60, 4, ''),
(3, 'oui', 'Pullman', 30, 3, ''),
(4, 'oui', 'lHotel_de_la reine', 70, 3, ''),
(5, 'oui', 'La_maison_dAugustin', 65, 3, ''),
(6, 'oui', 'le_clos_de_Gr?ce', 50, 4, ''),
(7, 'oui', 'campagnile', 75, 2, ''),
(9, 'oui', 'ibis', 55, 2, '');

-- --------------------------------------------------------

--
-- Structure de la table `occupe`
--

CREATE TABLE IF NOT EXISTS `occupe` (
  `num_occupation` int(1) DEFAULT NULL,
  `Date_debut_occupation` varchar(10) DEFAULT NULL,
  `Date_fin_occupation` varchar(10) DEFAULT NULL,
  `num_chambre` varchar(10) DEFAULT NULL,
  `num_client` varchar(10) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `occupe`
--

INSERT INTO `occupe` (`num_occupation`, `Date_debut_occupation`, `Date_fin_occupation`, `num_chambre`, `num_client`) VALUES
(2, '', '', '', ''),
(3, '', '', '', ''),
(4, '', '', '', '');

-- --------------------------------------------------------

--
-- Structure de la table `prestation`
--

CREATE TABLE IF NOT EXISTS `prestation` (
  `num_prestation` int(1) DEFAULT NULL,
  `nom_prestation` varchar(16) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `prestation`
--

INSERT INTO `prestation` (`num_prestation`, `nom_prestation`) VALUES
(1, 'wifi'),
(2, 'parking'),
(3, 'coffre fort'),
(4, 'v?lo'),
(5, 'spa'),
(6, 'salle de fitness');

-- --------------------------------------------------------

--
-- Structure de la table `reserve`
--

CREATE TABLE IF NOT EXISTS `reserve` (
  `num_reservation` int(2) DEFAULT NULL,
  `num_client` int(3) DEFAULT NULL,
  `date_debut` varchar(10) DEFAULT NULL,
  `date_fin` varchar(10) DEFAULT NULL,
  `num_chambre` int(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `reserve`
--

INSERT INTO `reserve` (`num_reservation`, `num_client`, `date_debut`, `date_fin`, `num_chambre`) VALUES
(1, 26, '23/01/2016', '25/01/2016', 100),
(2, 76, '21/01/2016', '24/01/2016', 99),
(3, 25, '21/01/2016', '22/01/2016', 98),
(4, 25, '21/01/2016', '22/01/2016', 97),
(5, 89, '19/01/2016', '22/01/2016', 96),
(6, 54, '15/01/2016', '18/01/2016', 95),
(7, 48, '14/01/2016', '18/01/2016', 94),
(8, 1, '12/01/2016', '16/01/2016', 93),
(9, 17, '08/01/2016', '10/01/2016', 92),
(10, 32, '08/01/2016', '12/01/2016', 91),
(11, 68, '07/01/2016', '09/01/2016', 90),
(12, 22, '07/01/2016', '10/01/2016', 89),
(13, 10, '06/01/2016', '10/01/2016', 88),
(14, 41, '04/01/2016', '08/01/2016', 87),
(15, 62, '04/01/2016', '05/01/2016', 86),
(16, 11, '01/01/2016', '02/01/2016', 85),
(17, 99, '01/01/2016', '06/01/2016', 84),
(18, 2, '30/12/2015', '02/01/2016', 83),
(19, 8, '30/12/2015', '03/12/2016', 82),
(20, 21, '30/12/2015', '31/12/2015', 81),
(21, 22, '29/12/2015', '01/01/2016', 80),
(22, 12, '28/12/2015', '30/12/2015', 79),
(23, 41, '27/12/2015', '30/12/2015', 78),
(24, 39, '25/12/2015', '01/01/2016', 77),
(25, 10, '24/12/2015', '27/12/2015', 76),
(26, 44, '24/12/2015', '25/12/2015', 75),
(27, 20, '21/12/2015', '22/12/2015', 74),
(28, 9, '21/12/2015', '23/12/2015', 73),
(29, 83, '20/12/2015', '22/12/2015', 72),
(30, 37, '20/12/2015', '27/12/2015', 71),
(31, 39, '19/12/2015', '20/12/2015', 70),
(32, 12, '18/12/2015', '20/12/2015', 69),
(33, 19, '17/12/2015', '19/12/2015', 68),
(34, 33, '15/12/2015', '16/12/2015', 67),
(35, 100, '14/12/2015', '18/12/2015', 66),
(36, 29, '14/12/2015', '16/12/2015', 65),
(37, 25, '12/12/2015', '14/12/2015', 64),
(38, 4, '11/12/2015', '13/12/2015', 63),
(39, 87, '09/12/2015', '10/12/2015', 62),
(40, 66, '09/12/2015', '11/12/2015', 61),
(41, 2, '05/12/2015', '06/12/2015', 60),
(42, 97, '03/12/2015', '04/12/2015', 59),
(43, 34, '01/12/2015', '03/12/2015', 58),
(44, 7, '01/12/2015', '04/12/2015', 57),
(45, 2, '30/11/2015', '04/12/2015', 56),
(46, 18, '29/11/2015', '30/11/2015', 55),
(47, 98, '29/11/2015', '02/12/2015', 54),
(48, 11, '27/11/2015', '29/11/2015', 53),
(49, 23, '27/11/2015', '29/11/2015', 52),
(50, 49, '26/11/2015', '27/11/2015', 51),
(51, 3, '26/11/2015', '28/11/2015', 50),
(52, 96, '24/11/2015', '26/11/2015', 49),
(53, 94, '23/11/2015', '27/11/2015', 48),
(54, 7, '23/11/2015', '26/11/2015', 47);

-- --------------------------------------------------------

--
-- Structure de la table `sejour`
--

CREATE TABLE IF NOT EXISTS `sejour` (
  `num_sejour` int(3) DEFAULT NULL,
  `num_client` int(3) DEFAULT NULL,
  `date_debut` varchar(10) DEFAULT NULL,
  `date_fin` varchar(10) DEFAULT NULL,
  `periode` int(1) DEFAULT NULL,
  `nb_personnes` int(1) DEFAULT NULL,
  `num_conso` int(3) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `sejour`
--

INSERT INTO `sejour` (`num_sejour`, `num_client`, `date_debut`, `date_fin`, `periode`, `nb_personnes`, `num_conso`) VALUES
(1, 126, '23/01/2016', '25/01/2016', 1, 1, 100),
(2, 76, '21/01/2016', '24/01/2016', 1, 2, 99),
(3, 25, '21/01/2016', '22/01/2016', 1, 2, 98),
(4, 25, '21/01/2016', '22/01/2016', 1, 1, 97),
(5, 89, '19/01/2016', '22/01/2016', 1, 1, 96),
(6, 54, '15/01/2016', '18/01/2016', 1, 1, 95),
(7, 148, '14/01/2016', '18/01/2016', 1, 2, 94),
(8, 1, '12/01/2016', '16/01/2016', 1, 2, 93),
(9, 17, '08/01/2016', '10/01/2016', 1, 2, 92),
(10, 32, '08/01/2016', '12/01/2016', 1, 1, 91),
(11, 68, '07/01/2016', '09/01/2016', 1, 2, 90),
(12, 122, '07/01/2016', '10/01/2016', 1, 1, 89),
(13, 10, '06/01/2016', '10/01/2016', 1, 1, 88),
(14, 41, '04/01/2016', '08/01/2016', 1, 1, 87),
(15, 62, '04/01/2016', '05/01/2016', 1, 1, 86),
(16, 111, '01/01/2016', '02/01/2016', 1, 2, 85),
(17, 99, '01/01/2016', '06/01/2016', 1, 1, 84),
(18, 102, '30/12/2015', '02/01/2016', 1, 2, 83),
(19, 8, '30/12/2015', '03/12/2016', 1, 1, 82),
(20, 21, '30/12/2015', '31/12/2015', 1, 2, 81),
(21, 22, '29/12/2015', '01/01/2016', 1, 1, 80),
(22, 112, '28/12/2015', '30/12/2015', 1, 1, 79),
(23, 141, '27/12/2015', '30/12/2015', 1, 1, 78),
(24, 39, '25/12/2015', '01/01/2016', 1, 1, 77),
(25, 10, '24/12/2015', '27/12/2015', 1, 2, 76),
(26, 44, '24/12/2015', '25/12/2015', 1, 2, 75),
(27, 120, '21/12/2015', '22/12/2015', 1, 2, 74),
(28, 9, '21/12/2015', '23/12/2015', 1, 1, 73),
(29, 83, '20/12/2015', '22/12/2015', 1, 1, 72),
(30, 37, '20/12/2015', '27/12/2015', 1, 1, 71),
(31, 139, '19/12/2015', '20/12/2015', 1, 1, 70),
(32, 12, '18/12/2015', '20/12/2015', 1, 1, 69),
(33, 19, '17/12/2015', '19/12/2015', 1, 2, 68),
(34, 133, '15/12/2015', '16/12/2015', 1, 2, 67),
(35, 100, '14/12/2015', '18/12/2015', 1, 2, 66),
(36, 129, '14/12/2015', '16/12/2015', 1, 1, 65),
(37, 25, '12/12/2015', '14/12/2015', 1, 2, 64),
(38, 4, '11/12/2015', '13/12/2015', 1, 1, 63),
(39, 87, '09/12/2015', '10/12/2015', 1, 2, 62),
(40, 66, '09/12/2015', '11/12/2015', 1, 2, 61),
(41, 102, '05/12/2015', '06/12/2015', 1, 2, 60),
(42, 97, '03/12/2015', '04/12/2015', 1, 1, 59),
(43, 34, '01/12/2015', '03/12/2015', 1, 1, 58),
(44, 7, '01/12/2015', '04/12/2015', 1, 2, 57),
(45, 2, '30/11/2015', '04/12/2015', 1, 1, 56),
(46, 18, '29/11/2015', '30/11/2015', 1, 2, 55),
(47, 98, '29/11/2015', '02/12/2015', 1, 2, 54),
(48, 111, '27/11/2015', '29/11/2015', 1, 2, 53),
(49, 123, '27/11/2015', '29/11/2015', 1, 1, 52),
(50, 149, '26/11/2015', '27/11/2015', 1, 1, 51),
(51, 3, '26/11/2015', '28/11/2015', 1, 2, 50),
(52, 96, '24/11/2015', '26/11/2015', 1, 1, 49),
(53, 94, '23/11/2015', '27/11/2015', 1, 1, 48),
(54, 107, '23/11/2015', '26/11/2015', 1, 1, 47),
(55, 65, '21/11/2015', '22/11/2015', 1, 2, 46),
(56, 86, '20/11/2015', '22/11/2015', 1, 2, 45),
(57, 92, '18/11/2015', '19/11/2015', 1, 1, 44),
(58, 118, '17/11/2015', '20/11/2015', 1, 2, 43),
(59, 77, '16/11/2015', '18/11/2015', 1, 2, 42),
(60, 14, '16/11/2015', '20/11/2015', 1, 2, 41),
(61, 17, '13/11/2015', '15/11/2015', 1, 2, 40),
(62, 135, '13/11/2015', '14/11/2015', 1, 1, 39),
(63, 59, '11/11/2015', '15/11/2015', 1, 2, 38),
(64, 141, '10/11/2015', '11/11/2015', 1, 2, 37),
(65, 140, '09/11/2015', '13/11/2015', 1, 2, 36),
(66, 139, '09/11/2015', '10/11/2015', 1, 1, 35),
(67, 106, '09/11/2015', '11/11/2015', 1, 2, 34),
(68, 88, '08/11/2015', '12/11/2015', 1, 2, 33),
(69, 79, '08/11/2015', '09/11/2015', 1, 1, 32),
(70, 123, '07/11/2015', '08/11/2015', 1, 1, 31),
(71, 9, '07/11/2015', '11/11/2015', 1, 2, 30),
(72, 18, '06/11/2015', '08/11/2015', 1, 1, 29),
(73, 112, '06/11/2015', '08/11/2015', 1, 1, 28),
(74, 117, '06/11/2015', '11/11/2015', 1, 2, 27),
(75, 19, '04/11/2025', '06/11/2015', 1, 1, 26),
(76, 27, '03/11/2015', '02/11/2015', 1, 1, 25),
(77, 44, '02/11/2015', '06/11/2015', 1, 1, 24),
(78, 82, '02/11/2015', '08/11/2015', 1, 2, 23),
(79, 13, '01/11/2015', '02/11/2015', 1, 1, 22),
(80, 138, '31/10/2015', '01/11/2015', 1, 1, 21),
(81, 15, '30/10/2015', '01/11/2015', 1, 2, 20),
(82, 55, '29/10/2015', '30/10/2015', 1, 1, 19),
(83, 76, '29/10/2015', '01/11/2015', 1, 2, 18),
(84, 103, '26/10/2015', '29/10/2015', 1, 2, 17),
(85, 57, '26/10/2025', '30/10/2015', 1, 1, 16),
(86, 16, '25/10/2015', '27/10/2015', 1, 2, 15),
(87, 38, '24/10/2015', '25/10/2015', 1, 1, 14),
(88, 95, '23/10/2015', '25/10/2015', 1, 1, 13),
(89, 46, '22/10/2015', '24/10/2015', 1, 2, 12),
(90, 139, '20/10/2015', '22/10/2015', 1, 2, 11),
(91, 92, '19/10/2015', '21/10/2015', 1, 2, 10),
(92, 29, '18/10/2015', '21/10/2015', 1, 1, 9),
(93, 31, '18/10/2015', '19/10/2015', 1, 2, 8),
(94, 124, '17/10/2015', '18/10/2015', 1, 2, 7),
(95, 131, '15/10/2015', '16/10/2015', 1, 1, 6),
(96, 12, '14/10/2015', '16/10/2015', 1, 1, 5),
(97, 109, '14/10/2015', '15/10/2015', 1, 1, 4),
(98, 47, '12/10/2015', '16/10/2015', 1, 2, 3),
(99, 30, '12/10/2015', '14/10/2015', 1, 2, 2),
(100, 79, '11/10/2015', '12/10/2015', 1, 1, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
