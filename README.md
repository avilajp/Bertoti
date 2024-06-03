Backend - Spring Boot
Estrutura de Pastas

    src/main/java/com/example/lab3/controller
        CarroController.java: Este é o controlador da minha API. Ele define os endpoints que manipulam as requisições HTTP.

    src/main/java/com/example/lab3/entitties
        Carro.java: Esta é a classe que representa a entidade Carro. Ela contém os atributos id, modelo, marca e preço, e usa as anotações do Lombok para gerar getters e setters automaticamente.

    src/main/java/com/example/lab3/
        Lab3Application.java: Esta é a classe principal que inicia a aplicação Spring Boot.

    src/test/java/com/example/lab3
        Lab3ApplicationTests.java: Classe de teste para verificar se o contexto da aplicação carrega corretamente.

No controlador, tem quatro endpoints:

    GET /Carros: Retorna a lista de todos os carros.
    GET /Carros/{id}: Retorna um carro específico pelo ID.
    POST /Carros: Adiciona um novo carro à lista.
    DELETE /Carros/{id}: Remove um carro pelo ID.

Frontend - React
Estrutura de Pastas

    src/axios/config.js: Configuração do Axios para fazer requisições à minha API.

    src/components
        navebar.jsx e navebar.css: Componente de navegação.

    src/routes
        delete.jsx e Delete.css: Página para deletar carros.
        home.jsx e Home.css: Página principal que lista os carros.
        newpost.jsx e newpost.css: Página para adicionar novos carros.

    src/app.css: Estilos globais da aplicação.

    src/app.jsx: Componente principal da aplicação que renderiza o Navebar e o conteúdo das rotas.

    src/index.css: Estilos globais.

    src/main.jsx: Arquivo principal que configura o roteamento da aplicação.

Conclusão

O meu projeto está demonstrando uma aplicação completa de gerenciamento de carros, 
utilizando um backend em Spring Boot para fornecer uma API REST
e um frontend em React para interagir com essa API. Eu implementei as operações 
CRUD básicas e mostrei aqui como fazer requisições HTTP para manipular os dados no servidor.
Como foi aprendido em sala de aula, é isso!

