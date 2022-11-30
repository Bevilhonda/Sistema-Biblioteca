CREATE TABLE IF NOT EXISTS autor (
    idt_autor          INT         NOT NULL AUTO_INCREMENT,
    val_name           VARCHAR(50) NOT NULL,
    val_last_name      VARCHAR(50) NOT NULL,
    dat_birth          DATETIME    NOT NULL,
    PRIMARY KEY (idt_autor)
);