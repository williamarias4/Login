
DELIMITER $$

DROP PROCEDURE IF EXISTS sp_insert_user;
DROP PROCEDURE IF EXISTS sp_login;

CREATE PROCEDURE sp_insert_user(IN p_username varchar(45), IN p_pass varchar(45))
BEGIN
INSERT INTO user(username, pass) VALUES (p_username, p_pass);
END $$

CREATE PROCEDURE sp_login(IN p_username varchar(45), IN p_pass varchar(45))
BEGIN
SELECT * FROM user where username = p_username and pass = p_pass;
END $$

DELIMITER ;

