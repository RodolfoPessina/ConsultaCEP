# Consulta CEP
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/RodolfoPessina/ConsultaCEP/blob/main/LICENSE) 

# Sobre o projeto
Consulta e Armazenamento de Endereço a partir de um CEP

Este projeto tem como objetivo implementar uma aplicação que consulta um endereço a partir de um CEP e salva as informações em um arquivo JSON.

Uma classe para representar um endereço:

A classe Endereco contem os seguintes atributos:

•cep

•uf

•cidade

•bairro

•logradouro

•complemento

A classe ConsultaCep realiza uma consulta à API ViaCEP para buscar informações de um endereço com base no CEP fornecido. A URL da API é: https://viacep.com.br/ws/{cep}/json.

A classe ArquivoJson deve criar e salvar um arquivo JSON contendo os dados do objeto Endereco.

O nome do arquivo deve ser o CEP informado (por exemplo, 04101300.json).

A classe Main deve solicitar ao usuário que informe um CEP.

as classes anteriores são utilizadas para consultar a API ViaCEP e salvar os dados do endereço em um arquivo JSON.

# Tecnologias utilizadas
## Back end
- Java

# Instruções para Execução
## Pré-requisitos:

Java 8 ou superior

Biblioteca Gson (adicione a dependência no seu projeto)

Compilação e Execução:

Compile as classes Java.
Execute a classe Main.

# Autor

Rodolfo Pessina
