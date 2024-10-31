# Vanguarda Hotelaria API

## Requisitos
  - Spring Boot v4.26.0 RELEASE
  - JavaSE 17
  - Eclipse 4.31.0v20240229-1022

## 1. Instalação Spring Boot
  - Com o Eclipse IDE aberto, procure na barra da parte superior da tela a partição "help". Ao clicar na mesma, uma lista de opções será aberta, clique em "Eclipse Marketplace".
  - Com o Marketplace aberto procure na barra de pesquisa por "Spring Tool Suite" (última versão disponível). 
  - Clique em "Install Now", "Next", aceite os Termos da Licença e "Finish".
  - Clique em instalar.
  - Quando necessário marque a checkbox, e clique em "Trust Selected".
  - Espere a instalação ser concluída.
  - Reinicie o Eclipse IDE.

  OBSERVAÇÂO: O projeto deve ser executado a partir da classe principal "HotelariaApplication", clicando na seta para baixo ao lado do ícone do botão "Run", "Run as..." e selecionando a opção "Spring Boot App". Vale a pena ressaltar que o código atual do Spring Boot não irá funcionar sem a implementação das Classes requisitadas, isto porque as rotas "PUT" e "POST" recebem dados, atrevés do ".json", e convertem seus atributos em uma variável do tipo da classe mencionada.

## Passo a Passo para conectar o Azure com o Mysql Workbench:

- Dentro do Mysql Workbench clice no símbolo "+" na guia de Conexões para adicionar uma nova conexão
- Insira um nome para a conexão no campo Nome da Conexão.
- Selecione Standard (TCP/IP) como Tipo de Conexão.
- Insira bd-hotel.mysql.database.azure.com no campo hostname.
- Insira Adm_BDjv como nome de usuário e insira a senha "Host123@ç".
- Vá para o Guia SSL e atualize o campo "Use SSL" para Require.
- No campo "SSL CA file", insira o local do arquivo DigiCertGlobalRootCA.crt.pem
- CLique em Testar Conexão para testar.
- Se a conexão for bem-sucedida, clique em OK para salvar a conexão.

# Participantes
  - Rafael Rausch Dias
  - Luiz Felipe
  - Lucas Gaiga
  - Brenda Taiane
  - Leonardo Nasser
  - Pedro Gabriel
