프로시저 생성문

SELECT * FROM board.board;

DELIMITER $$
USE board;

CREATE PROCEDURE testDataInsert()

BEGIN
	DECLARE i INT DEFAULT 1;

    WHILE i <= 120
		DO
		INSERT INTO board(title, content)
        VALUES(concat('제목', i), concat('내용', i));
        SET i = i + 1;
	END WHILE;
END $$

DELIMITER ;

CALL testDataInsert();