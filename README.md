# 📋 Cadastro de Usuário

Sistema de cadastro de usuários via terminal, desenvolvido em Java. Permite criar, listar, editar e remover usuários através de um menu interativo.

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow?style=flat-square)
![Licença](https://img.shields.io/badge/licença-MIT-green?style=flat-square)

---

## 📌 Funcionalidades

- [x] Criar usuário
- [x] Listar usuários cadastrados
- [X] Editar usuário (por posição)
- [x] Remover usuário (por posição)
- [x] Sair

---

## 🖥️ Pré-requisitos

Antes de rodar o projeto, você precisa ter instalado:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

Verifique sua versão com:

```bash
java -version
```

---

## 🚀 Como rodar

1. Clone o repositório:

```bash
git clone https://github.com/YasminBarbosa/cadastro-usuario-java.git
```

2. Acesse a pasta do projeto:

```bash
cd cadastro-usuario-java
```

3. Compile o arquivo:

```bash
javac cad_usuario.java
```

4. Execute:

```bash
java cad_usuario
```

---

## 📂 Estrutura do projeto

```
cadastro-usuario-java/
├── cad_usuario.java    # Código-fonte principal
├── cad_usuario.class   # Bytecode gerado após compilação
└── README.md
```

---

## 🧠 Como funciona

O programa exibe um menu no terminal com as seguintes opções:

```
Cadastro de Usuário
1 - Criar Usuário
2 - Listar Usuários
3 - Editar Usuário
4 - Remover Usuário
0 - Sair
```

Os usuários são armazenados em memória (via `ArrayList<String>`) durante a execução. Ao encerrar o programa, os dados são perdidos.

> ⚠️ **Atenção:** A edição de usuário usa índice baseado em zero. Informe a posição correta para evitar erros.

---

## 🔧 Melhorias planejadas

- Adicionar validação para entradas inválidas
- Implementar persistência dos dados em arquivo `.txt` ou banco de dados
- Armazenar objetos `Usuario` com mais atributos (email, senha, etc.)
- Melhorar tratamento de exceções

---

## 👩‍💻 Autora

Feito por [Yasmin Barbosa](https://github.com/YasminBarbosa).

---

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
