# language: pt
Funcionalidade: Pesquisar produto
  Como um visitante do site
  Quero pesquisar produtos
  Para entender os detalhes
  E escolher o que comprar

  Cenario: Deve listar os produtos selecionados
    Dado que estou na pagina inicial
    Quando preencho a poesquisa de produto com texto "t-shirt"
    E clico na lupa
    Então lista o produto "Hummingbird Printed T-Shirt"
