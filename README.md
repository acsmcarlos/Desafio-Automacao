<h1 align="center"> Olah, Seja Bem Vindo(a) <br> ao Repositorio de Automacao!</h1>
<h3>Eu sou Antonio Carlos, este repositorio faz parte do desafio proposto - Vamos lah!</h3>

<div align="center" >
<img alt="QANinja" src="https://repository-images.githubusercontent.com/363723045/7fe86680-ab81-11eb-8662-b80dfb55193a" width="400px" />
<div>
    <br>
<div align="center">
  <a href="https://github.com/acsmcarlos">
  <img height="180em" src="https://github-readme-stats.vercel.app/api?username=acsmcarlos&show_icons=true&theme=dark&include_all_commits=true&count_private=true"/>
  <img height="180em" src="https://github-readme-stats.vercel.app/api/top-langs/?username=acsmcarlos&layout=compact&langs_count=10&theme=dark"/>
</div>

<div style="display: inline_block" align="center"> <h2> Principais Linguagens e Frameworks utilizados neste projeto:</h2> <br>

  <img align="center" alt="Java" height="50" width="50" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-plain.svg">
  <img align="center" alt="Selenium" height="50" width="50" src="https://icon-library.com/images/selenium-icon/selenium-icon-9.jpg">
  <img align="center" alt="Cucumber" height="50" width="50" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSEFmhHvn6WRbl6XiePY_uQHBbVZUzRytIuQA&usqp=CAU">
  <img align="center" alt="Junit" height="50" width="50" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-O247vQTmxt8tpsU3_zTzxzE52VXHMlBYb0jO_ASvqwcFaRAZenItGGJuEhwJjwtFBXI&usqp=CAU">
  <img align="center" alt="Junit" height="50" width="50" src="">
  <!-- <img align="center" alt="Junit" height="50" width="50" src=""> -->
</div>

<div align="center"> <h2> Minhas Redes Sociais </h2> <br>
  <a href="https://https://www.instagram.com/acsmcarlos2" target="_blank"><img src="https://img.shields.io/badge/-Instagram-%23E4405F?style=for-the-badge&logo=instagram&logoColor=white" target="_blank"></a>
  <a href = "mailto:acsmcarlos@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>
  <a href="https://www.linkedin.com/in/antonio-carlos-da-silva-moreira-7ab766189" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a> 
 
   </div>

<div align="left">

# Desafio - Automacao
Esta automacao foi elaborada para atender ao pedido Desafio Profissional, proposto pela Empresa. 
A descricao do desafio consiste em:
    
# Foram identificados os principais cenarios:
# Caso de teste 1: realizar uma compra com sucesso.
1. Acessar o site: https://www.saucedemo.com/
2. Entre o com o usuário "performance_glitch_user"
3. Na tela de produto ordene os produtos "NAME Z TO A"
4. Selecione um produto
5. Adicione no carrinho
6. Realize o checkout
7. Finalize a compra

# Caso de teste 2: Tentar realizar uma compra.
1. Acessar o site: https://www.saucedemo.com/
2. Entre o com o usuario "problem_user"
3. Adicione um produto no carrinho pelo botao "ADD TO CART"
4. Tente realizar o checkout do produto
  
# Tecnologias

  - Linguagem Java
  - Cubumber Framework
  - Selenium

# Instalacao
***
**Criacao do projeto na mao:**
    - Pages.
    - Steps.
    - Features.
    - Runner Test.

***
**Subida do projeto para o github como proposto:**

```sh
https://github.com/acsmcarlos/Desafio-Automacao
```
***

**Todas as dependencias usadas neste projeto foram:**


```sh
junit=4.13.1
selenium-chrome-driver=4.8.0
selenium-firefox-driver=4.8.0
selenium-java=4.8.0
cucumber-java=7.11.1
cucumber-junit=7.11.1
```
***

## Rodando os testes

**Criado e configurado o projeto e suas dependencias, dentro da pasta scr/test/java/br.com.desafioautomacao do projeto DesafioAutomacao, execute:**

 `TestRunner.java` para rodar o teste.

**Observacao:** Caso o teste venha falhar, devido ao adormecimento da API, mas deve passar (PASS) na segunda tentativa com exito.
    
    
## Estrutura do Projeto
    desafioautomacao [1]  
        src/test/java
            br.com.desafioautomacao [2] 
                CompraPage.java
                CompraSteps.java
                TestRunner.java
        src/test/resources[3]
                features
                    CT001 - Compra_com_sucesso.feature
                    CT002 - Compra_sem_sucesso.feature
                    chromedriver.exe
                    geckodriver.exe
    
    1. Project - Pasta raiz do projeto
    2. Pasta test - Pasta que contem as principais classes de testes a serem executadas.
    3. Resources - Pasta que agrega diretorios com recursos a serem usados no projeto pelos testes, como features, drivers, etc...
    

**Desafio implementado conforme as especificoes solicitadas e documentadas**

Foram identificados os principais cenarios:
- Sendo um visitante que deseja realizar uma compra com sucesso.
- Realizando login
- E realizando a compra de determinado produto filtrando por Z a A.
    
    
### Cenario: Realizar compra com sucesso

Feature: Realizar uma compra com sucesso

    Scenario: Realizar compra com sucesso
        Given que acesso a pagina de login
        When entro com minhas credenciais de usuario e senha
        And seleciono um produto
        And adiciono o produto ao carrinho
        And realizo o checkout
        Then devo finalizar a compra


### Cenario: Realizar compra sem sucesso

Feature: Realizar uma compra sem sucesso

    Scenario: Realizar compra sem sucesso
        Given que acesso a pagina de login
        When entro com minhas credenciais de usuario e senha diferentes
        And adiciono produto diferente ao carrinho
        And realizo o checkout
        Then devo visualizar mensagem de erro

    
   

