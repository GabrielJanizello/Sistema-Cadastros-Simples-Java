# 📘 Sistema de Cadastro Simples em Java

Este é um projeto simples desenvolvido para fins de **estudo** da linguagem **Java**, abordando conceitos de:

- Entrada de dados via teclado  
- Estruturas de decisão  
- Estruturas de repetição  
- Programação Orientada a Objetos (POO)  
- Validação de dados  
- Gerenciamento de listas com `ArrayList`

O sistema permite **cadastrar**, **listar** e **excluir** pessoas utilizando o email como identificador único.

---

## 📌 Funcionalidades

### ✔ Cadastrar Pessoa
O usuário informa:
- Nome  
- Idade  
- Email  

O sistema valida:
- Idade não pode ser negativa  
- Email não pode ser vazio  
- Email deve conter `"@"` e `"."`  
- Não é permitido cadastrar duas pessoas com o **mesmo email**

---

### ✔ Listar Pessoas
Exibe todas as pessoas cadastradas, mostrando:
- Nome  
- Idade  
- Email  

Se não houver cadastros, o sistema informa.

---

### ✔ Excluir Pessoa
O usuário digita o email da pessoa que deseja remover.  
Caso o email exista, o registro é excluído; caso contrário, é exibida uma mensagem de erro.

---

## 🧠 Estrutura do Projeto

├── Main.java → Classe principal com o menu do sistema
├── Pessoa.java → Classe responsável pelos dados de cada pessoa
└── Sistema.java → Classe que gerencia a lista de pessoas


---

## 🎯 Objetivo do Projeto

Este projeto foi desenvolvido **exclusivamente para estudos**, com foco em:

- Praticar fundamentos de Java  
- Entender classes, objetos e encapsulamento  
- Manipular listas com `ArrayList`  
- Treinar entrada de dados pelo console e menus interativos  

---

## 📚 Possíveis Melhorias

- Persistir dados em arquivo (`.txt` ou `.json`)  
- Criar tela de edição de pessoa  
- Implementar interface gráfica com JavaFX  
- Aplicar tratamento de exceções  
- Substituir lista por `HashMap` para acesso mais rápido  


