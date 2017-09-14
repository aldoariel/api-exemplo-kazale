INSERT INTO `empresa` (`id`, `cnpj`, `data_atualizacao`, `data_criacao`, `razao_social`) 
VALUES (NULL, '82198127000121', CURRENT_DATE(), CURRENT_DATE(), 'Admin');

INSERT INTO `usuario` (`id`, `email`, `perfil`, `senha`) 
VALUES (NULL, 'teste@gmail.com', 'ROLE_ADMIN', '$2a$06$xIvBeNRfS65L1N17I7JzgefzxEuLAL0Xk0wFAgIkoNqu9WD6rmp4m');