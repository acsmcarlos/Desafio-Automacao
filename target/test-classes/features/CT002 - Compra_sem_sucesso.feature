@CT002
Feature: Realizar uma compra sem sucesso

  Scenario: Realizar compra sem sucesso
    Given que acesso a pagina de login
    When entro com minhas credenciais de usuario e senha diferentes
    And adiciono produto diferente ao carrinho
    And realizo o checkout
    Then devo visualizar mensagem de erro
