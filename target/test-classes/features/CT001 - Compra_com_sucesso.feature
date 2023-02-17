@CT001
Feature: Realizar uma compra com sucesso

  Scenario: Realizar compra com sucesso
    Given que acesso a pagina de login
    When entro com minhas credenciais de usuario e senha
    And seleciono um produto
    And adiciono o produto ao carrinho
    And realizo o checkout
    Then devo finalizar a compra
